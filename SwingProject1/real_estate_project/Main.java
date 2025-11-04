
package SwingProject1.real_estate_project;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/realestate?useSSL=false&serverTimezone=UTC";
    public static final String DB_USER = "root"; 
    public static final String DB_PASS = "root@123"; 

    // Shared DB connection helper
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    // Tables models
    private DefaultTableModel sellerModel = new DefaultTableModel();
    private DefaultTableModel buyerModel = new DefaultTableModel();
    private DefaultTableModel propertyModel = new DefaultTableModel();
    private DefaultTableModel transactionModel = new DefaultTableModel();
    private DefaultTableModel historyModel = new DefaultTableModel();

    public static void main(String[] args) {
        // Load JDBC driver (optional for modern drivers but safe)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // ignore - user will get SQLException if driver missing
        }

        SwingUtilities.invokeLater(() -> {
            try {
                Main window = new Main();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error starting app: " + e.getMessage());
            }
        });
    }

    public Main() {
        initialize();
        refreshAllTables();
    }

    private void initialize() {
        frame = new JFrame("Real Estate Property Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(Color.WHITE);
        frame.setContentPane(root);

        // Top bar
        JPanel top = new JPanel(new BorderLayout());
        top.setBorder(new EmptyBorder(10, 10, 10, 10));
        top.setBackground(new Color(22, 160, 133));
        JLabel title = new JLabel("Real Estate Property Management System");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Segoe UI", Font.BOLD, 20));
        top.add(title, BorderLayout.WEST);
        root.add(top, BorderLayout.NORTH);

        // Left navigation
        JPanel nav = new JPanel();
        nav.setLayout(new BoxLayout(nav, BoxLayout.Y_AXIS));
        nav.setBackground(new Color(236, 240, 241));
        nav.setBorder(new EmptyBorder(10, 10, 10, 10));
        String[] buttons = {"Dashboard", "Sellers", "Buyers", "Properties", "Transactions", "History", "Exit"};
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.setAlignmentX(Component.LEFT_ALIGNMENT);
            btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
            btn.setFocusPainted(false);
            btn.setBackground(Color.WHITE);
            btn.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            btn.addActionListener(e -> {
                if (b.equals("Exit")) System.exit(0);
                cardLayout.show(mainPanel, b);
            });
            nav.add(btn);
            nav.add(Box.createVerticalStrut(8));
        }

        root.add(nav, BorderLayout.WEST);

        // Panels
        mainPanel.add(buildDashboardPanel(), "Dashboard");
        mainPanel.add(buildSellersPanel(), "Sellers");
        mainPanel.add(buildBuyersPanel(), "Buyers");
        mainPanel.add(buildPropertiesPanel(), "Properties");
        mainPanel.add(buildTransactionsPanel(), "Transactions");
        mainPanel.add(buildHistoryPanel(), "History");

        root.add(mainPanel, BorderLayout.CENTER);
    }

    private JPanel buildDashboardPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBackground(Color.WHITE);
        JPanel cards = new JPanel(new GridLayout(1, 3, 12, 12));
        cards.setBorder(new EmptyBorder(20, 20, 20, 20));

        cards.add(summaryCard("Total Sellers", () -> getCount("sellers")));
        cards.add(summaryCard("Total Properties", () -> getCount("properties")));
        cards.add(summaryCard("Total Transactions", () -> getCount("transactions")));

        p.add(cards, BorderLayout.NORTH);

        JTextArea help = new JTextArea("Use the left menu to manage sellers, buyers, properties and record transactions.\n\nMake sure your MySQL is running and the DB/schema is created before use.");
        help.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        help.setEditable(false);
        help.setBackground(Color.WHITE);
        help.setBorder(new EmptyBorder(10, 10, 10, 10));
        p.add(help, BorderLayout.CENTER);
        return p;
    }

    private JPanel summaryCard(String title, CountProvider provider) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBorder(BorderFactory.createLineBorder(new Color(189, 195, 199), 1));
        card.setBackground(new Color(255, 255, 255));
        card.setPreferredSize(new Dimension(200, 120));
        JLabel t = new JLabel(title);
        t.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        t.setBorder(new EmptyBorder(10, 10, 0, 10));
        JLabel count = new JLabel(String.valueOf(provider.get()));
        count.setFont(new Font("Segoe UI", Font.BOLD, 36));
        count.setBorder(new EmptyBorder(0, 10, 10, 10));
        card.add(t, BorderLayout.NORTH);
        card.add(count, BorderLayout.CENTER);
        // refresh on click
        card.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                count.setText(String.valueOf(provider.get()));
            }
        });
        return card;
    }

    private int getCount(String table) {
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("SELECT COUNT(*) FROM " + table)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1);
        } catch (Exception ex) {
            // ignore
        }
        return 0;
    }

    // --------------------------- SELLERS ------------------------------
    private JPanel buildSellersPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(12, 12, 12, 12));
        p.setBackground(Color.WHITE);

        sellerModel.setColumnIdentifiers(new Object[]{"ID", "Name", "Phone", "Email", "Address"});
        JTable table = new JTable(sellerModel);
        JScrollPane sp = new JScrollPane(table);

        JPanel form = new JPanel(new GridLayout(6, 2, 8, 8));
        form.setBorder(new EmptyBorder(10, 10, 10, 10));
        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JTextField email = new JTextField();
        JTextField address = new JTextField();
        form.add(new JLabel("Name:")); form.add(name);
        form.add(new JLabel("Phone:")); form.add(phone);
        form.add(new JLabel("Email:")); form.add(email);
        form.add(new JLabel("Address:")); form.add(address);

        JButton add = new JButton("Add Seller");
        JButton update = new JButton("Update Seller");
        JButton delete = new JButton("Delete Seller");
        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btns.add(add); btns.add(update); btns.add(delete);

        form.add(new JLabel()); form.add(btns);

        p.add(sp, BorderLayout.CENTER);
        p.add(form, BorderLayout.EAST);

        add.addActionListener(e -> {
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("INSERT INTO sellers(name,phone,email,address) VALUES(?,?,?,?)")) {
                ps.setString(1, name.getText());
                ps.setString(2, phone.getText());
                ps.setString(3, email.getText());
                ps.setString(4, address.getText());
                ps.executeUpdate();
                logAction("Added seller: " + name.getText());
                refreshSellers();
                clearFields(name, phone, email, address);
            } catch (Exception ex) { showErr(ex); }
        });

        update.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) return;
            int id = Integer.parseInt(sellerModel.getValueAt(r, 0).toString());
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("UPDATE sellers SET name=?,phone=?,email=?,address=? WHERE id=?")) {
                ps.setString(1, name.getText());
                ps.setString(2, phone.getText());
                ps.setString(3, email.getText());
                ps.setString(4, address.getText());
                ps.setInt(5, id);
                ps.executeUpdate();
                logAction("Updated seller id:" + id);
                refreshSellers();
            } catch (Exception ex) { showErr(ex); }
        });

        delete.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) return;
            int id = Integer.parseInt(sellerModel.getValueAt(r, 0).toString());
            if (JOptionPane.showConfirmDialog(frame, "Delete seller id " + id + "?") != JOptionPane.YES_OPTION) return;
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("DELETE FROM sellers WHERE id=?")) {
                ps.setInt(1, id); ps.executeUpdate();
                logAction("Deleted seller id:" + id);
                refreshSellers();
            } catch (Exception ex) { showErr(ex); }
        });

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                if (r == -1) return;
                name.setText(sellerModel.getValueAt(r,1).toString());
                phone.setText(sellerModel.getValueAt(r,2).toString());
                email.setText(sellerModel.getValueAt(r,3).toString());
                address.setText(sellerModel.getValueAt(r,4).toString());
            }
        });

        return p;
    }

    // --------------------------- BUYERS ------------------------------
    private JPanel buildBuyersPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(12, 12, 12, 12));
        p.setBackground(Color.WHITE);

        buyerModel.setColumnIdentifiers(new Object[]{"ID", "Name", "Phone", "Email"});
        JTable table = new JTable(buyerModel);
        JScrollPane sp = new JScrollPane(table);

        JPanel form = new JPanel(new GridLayout(5, 2, 8, 8));
        form.setBorder(new EmptyBorder(10, 10, 10, 10));
        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JTextField email = new JTextField();
        form.add(new JLabel("Name:")); form.add(name);
        form.add(new JLabel("Phone:")); form.add(phone);
        form.add(new JLabel("Email:")); form.add(email);

        JButton add = new JButton("Add Buyer");
        JButton update = new JButton("Update Buyer");
        JButton delete = new JButton("Delete Buyer");
        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btns.add(add); btns.add(update); btns.add(delete);

        form.add(new JLabel()); form.add(btns);

        p.add(sp, BorderLayout.CENTER);
        p.add(form, BorderLayout.EAST);

        add.addActionListener(e -> {
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("INSERT INTO buyers(name,phone,email) VALUES(?,?,?)")) {
                ps.setString(1, name.getText());
                ps.setString(2, phone.getText());
                ps.setString(3, email.getText());
                ps.executeUpdate();
                logAction("Added buyer: " + name.getText());
                refreshBuyers();
                clearFields(name, phone, email);
            } catch (Exception ex) { showErr(ex); }
        });

        update.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) return;
            int id = Integer.parseInt(buyerModel.getValueAt(r, 0).toString());
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("UPDATE buyers SET name=?,phone=?,email=? WHERE id=?")) {
                ps.setString(1, name.getText());
                ps.setString(2, phone.getText());
                ps.setString(3, email.getText());
                ps.setInt(4, id);
                ps.executeUpdate();
                logAction("Updated buyer id:" + id);
                refreshBuyers();
            } catch (Exception ex) { showErr(ex); }
        });

        delete.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) return;
            int id = Integer.parseInt(buyerModel.getValueAt(r, 0).toString());
            if (JOptionPane.showConfirmDialog(frame, "Delete buyer id " + id + "?") != JOptionPane.YES_OPTION) return;
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("DELETE FROM buyers WHERE id=?")) {
                ps.setInt(1, id); ps.executeUpdate();
                logAction("Deleted buyer id:" + id);
                refreshBuyers();
            } catch (Exception ex) { showErr(ex); }
        });

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                if (r == -1) return;
                name.setText(buyerModel.getValueAt(r,1).toString());
                phone.setText(buyerModel.getValueAt(r,2).toString());
                email.setText(buyerModel.getValueAt(r,3).toString());
            }
        });

        return p;
    }

    // --------------------------- PROPERTIES ------------------------------
    private JPanel buildPropertiesPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(12, 12, 12, 12));
        p.setBackground(Color.WHITE);

        propertyModel.setColumnIdentifiers(new Object[]{"ID", "Title", "Location", "Price", "Type", "Status", "Seller ID"});
        JTable table = new JTable(propertyModel);
        JScrollPane sp = new JScrollPane(table);

        JPanel form = new JPanel(new GridLayout(8, 2, 8, 8));
        form.setBorder(new EmptyBorder(10, 10, 10, 10));
        JTextField title = new JTextField();
        JTextField location = new JTextField();
        JTextField price = new JTextField();
        JTextField type = new JTextField();
        JTextField status = new JTextField("available");
        JTextField sellerId = new JTextField();

        form.add(new JLabel("Title:")); form.add(title);
        form.add(new JLabel("Location:")); form.add(location);
        form.add(new JLabel("Price:")); form.add(price);
        form.add(new JLabel("Type (e.g. Apartment):")); form.add(type);
        form.add(new JLabel("Status (available/sold):")); form.add(status);
        form.add(new JLabel("Seller ID:")); form.add(sellerId);

        JButton add = new JButton("Add Property");
        JButton update = new JButton("Update Property");
        JButton delete = new JButton("Delete Property");
        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btns.add(add); btns.add(update); btns.add(delete);
        form.add(new JLabel()); form.add(btns);

        p.add(sp, BorderLayout.CENTER);
        p.add(form, BorderLayout.EAST);

        add.addActionListener(e -> {
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("INSERT INTO properties(title,location,price,type,status,seller_id) VALUES(?,?,?,?,?,?)")) {
                ps.setString(1, title.getText());
                ps.setString(2, location.getText());
                ps.setDouble(3, Double.parseDouble(price.getText()));
                ps.setString(4, type.getText());
                ps.setString(5, status.getText());
                ps.setInt(6, Integer.parseInt(sellerId.getText()));
                ps.executeUpdate();
                logAction("Added property: " + title.getText());
                refreshProperties();
                clearFields(title, location, price, type, status, sellerId);
            } catch (Exception ex) { showErr(ex); }
        });

        update.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) return;
            int id = Integer.parseInt(propertyModel.getValueAt(r, 0).toString());
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("UPDATE properties SET title=?,location=?,price=?,type=?,status=?,seller_id=? WHERE id=?")) {
                ps.setString(1, title.getText());
                ps.setString(2, location.getText());
                ps.setDouble(3, Double.parseDouble(price.getText()));
                ps.setString(4, type.getText());
                ps.setString(5, status.getText());
                ps.setInt(6, Integer.parseInt(sellerId.getText()));
                ps.setInt(7, id);
                ps.executeUpdate();
                logAction("Updated property id:" + id);
                refreshProperties();
            } catch (Exception ex) { showErr(ex); }
        });

        delete.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) return;
            int id = Integer.parseInt(propertyModel.getValueAt(r, 0).toString());
            if (JOptionPane.showConfirmDialog(frame, "Delete property id " + id + "?") != JOptionPane.YES_OPTION) return;
            try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("DELETE FROM properties WHERE id=?")) {
                ps.setInt(1, id); ps.executeUpdate();
                logAction("Deleted property id:" + id);
                refreshProperties();
            } catch (Exception ex) { showErr(ex); }
        });

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                if (r == -1) return;
                title.setText(propertyModel.getValueAt(r,1).toString());
                location.setText(propertyModel.getValueAt(r,2).toString());
                price.setText(propertyModel.getValueAt(r,3).toString());
                type.setText(propertyModel.getValueAt(r,4).toString());
                status.setText(propertyModel.getValueAt(r,5).toString());
                sellerId.setText(propertyModel.getValueAt(r,6)==null?"":propertyModel.getValueAt(r,6).toString());
            }
        });

        return p;
    }

    // --------------------------- TRANSACTIONS ------------------------------
    private JPanel buildTransactionsPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(12, 12, 12, 12));
        p.setBackground(Color.WHITE);

        transactionModel.setColumnIdentifiers(new Object[]{"ID","Property ID","Buyer ID","Seller ID","Price","Date"});
        JTable table = new JTable(transactionModel);
        JScrollPane sp = new JScrollPane(table);

        JPanel form = new JPanel(new GridLayout(6, 2, 8, 8));
        form.setBorder(new EmptyBorder(10, 10, 10, 10));
        JTextField propertyId = new JTextField();
        JTextField buyerId = new JTextField();
        JTextField sellerId = new JTextField();
        JTextField price = new JTextField();
        JTextField date = new JTextField(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));

        form.add(new JLabel("Property ID:")); form.add(propertyId);
        form.add(new JLabel("Buyer ID:")); form.add(buyerId);
        form.add(new JLabel("Seller ID:")); form.add(sellerId);
        form.add(new JLabel("Price:")); form.add(price);
        form.add(new JLabel("Date (YYYY-MM-DD):")); form.add(date);

        JButton add = new JButton("Record Transaction");
        JButton refreshProps = new JButton("Refresh Properties Status");
        JPanel btns = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btns.add(add); btns.add(refreshProps);
        form.add(new JLabel()); form.add(btns);

        p.add(sp, BorderLayout.CENTER);
        p.add(form, BorderLayout.EAST);

        add.addActionListener(e -> {
            try (Connection c = getConnection()) {
                c.setAutoCommit(false);
                PreparedStatement ps = c.prepareStatement("INSERT INTO transactions(property_id,buyer_id,seller_id,price,date_of_transaction) VALUES(?,?,?,?,?)");
                ps.setInt(1, Integer.parseInt(propertyId.getText()));
                ps.setInt(2, Integer.parseInt(buyerId.getText()));
                ps.setInt(3, Integer.parseInt(sellerId.getText()));
                ps.setDouble(4, Double.parseDouble(price.getText()));
                ps.setDate(5, Date.valueOf(date.getText()));
                ps.executeUpdate();

                // mark property sold
                PreparedStatement ps2 = c.prepareStatement("UPDATE properties SET status='sold' WHERE id=?");
                ps2.setInt(1, Integer.parseInt(propertyId.getText()));
                ps2.executeUpdate();

                c.commit();
                logAction("Transaction recorded for property " + propertyId.getText());
                refreshTransactions();
                refreshProperties();
            } catch (Exception ex) { showErr(ex); }
        });

        refreshProps.addActionListener(e -> refreshProperties());

        return p;
    }

    // --------------------------- HISTORY ------------------------------
    private JPanel buildHistoryPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new EmptyBorder(12, 12, 12, 12));
        p.setBackground(Color.WHITE);

        historyModel.setColumnIdentifiers(new Object[]{"ID","Action","Action Date"});
        JTable table = new JTable(historyModel);
        JScrollPane sp = new JScrollPane(table);
        p.add(sp, BorderLayout.CENTER);

        JButton refresh = new JButton("Refresh History");
        refresh.addActionListener(e -> refreshHistory());
        p.add(refresh, BorderLayout.SOUTH);

        return p;
    }

    // --------------------------- HELPERS ------------------------------
    private void refreshAllTables() {
        refreshSellers();
        refreshBuyers();
        refreshProperties();
        refreshTransactions();
        refreshHistory();
    }

    private void refreshSellers() {
        clearModel(sellerModel);
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("SELECT id,name,phone,email,address FROM sellers")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sellerModel.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (Exception ex) { showErr(ex); }
    }

    private void refreshBuyers() {
        clearModel(buyerModel);
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("SELECT id,name,phone,email FROM buyers")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                buyerModel.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
        } catch (Exception ex) { showErr(ex); }
    }

    private void refreshProperties() {
        clearModel(propertyModel);
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("SELECT id,title,location,price,type,status,seller_id FROM properties")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                propertyModel.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getObject(7)});
            }
        } catch (Exception ex) { showErr(ex); }
    }

    private void refreshTransactions() {
        clearModel(transactionModel);
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("SELECT id,property_id,buyer_id,seller_id,price,date_of_transaction FROM transactions")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                transactionModel.addRow(new Object[]{rs.getInt(1), rs.getObject(2), rs.getObject(3), rs.getObject(4), rs.getDouble(5), rs.getDate(6)});
            }
        } catch (Exception ex) { showErr(ex); }
    }

    private void refreshHistory() {
        clearModel(historyModel);
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("SELECT id,action,action_date FROM history ORDER BY action_date DESC")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                historyModel.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getTimestamp(3)});
            }
        } catch (Exception ex) { showErr(ex); }
    }

    private void logAction(String action) {
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement("INSERT INTO history(action) VALUES(?)")) {
            ps.setString(1, action);
            ps.executeUpdate();
        } catch (Exception ex) {
            // ignore logging failures
        }
    }

    private void clearModel(DefaultTableModel m) {
        m.setRowCount(0);
    }

    private void clearFields(JTextField... fields) {
        for (JTextField f : fields) f.setText("");
    }

    private void showErr(Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    // small functional interface
    private interface CountProvider { int get(); }
}
