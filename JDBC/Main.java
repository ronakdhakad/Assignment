package JDBC;

/* Main.java
   Real Estate Property Management System (single-file)
   - Java 8+
   - Requires MySQL JDBC driver in classpath
   - Edit DB_URL, DB_USER, DB_PASS below
*/

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import java.text.SimpleDateFormat;

public class Main {
    // --- CONFIGURE THESE ---
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root@123";
    // ------------------------

    private JFrame frame;
    private Connection conn;

    // For login
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    // Tabbed panes and table models
    private JTabbedPane tabbedPane;
    private DefaultTableModel modelSellers, modelBuyers, modelProperties, modelTransactions, modelHistory;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Use Nimbus look & feel if available for a modern look
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception e) {
                // ignore - fallback to default
            }

            new Main().start();
        });
    }

    private void start() {
        // Initialize DB connection
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException ex) {
            showError("Database connection failed: " + ex.getMessage());
            ex.printStackTrace();
            return;
        }

        buildLoginUI();
    }

    private void buildLoginUI() {
        frame = new JFrame("Real Estate Property Management - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 250);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10,10));
        panel.setBorder(new EmptyBorder(15,15,15,15));

        JLabel title = new JLabel("Admin Login", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        panel.add(title, BorderLayout.NORTH);

        JPanel center = new JPanel(new GridLayout(2,2,10,10));
        center.setBorder(new EmptyBorder(10,10,10,10));
        center.add(new JLabel("Username:"));
        txtUsername = new JTextField("admin");
        center.add(txtUsername);
        center.add(new JLabel("Password:"));
        txtPassword = new JPasswordField("admin");
        center.add(txtPassword);
        panel.add(center, BorderLayout.CENTER);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnLogin = new JButton("Login");
        JButton btnExit = new JButton("Exit");
        buttons.add(btnLogin);
        buttons.add(btnExit);
        panel.add(buttons, BorderLayout.SOUTH);

        frame.setContentPane(panel);
        frame.setVisible(true);

        btnLogin.addActionListener(e -> attemptLogin());
        btnExit.addActionListener(e -> {
            closeConnection();
            System.exit(0);
        });

        // Enter key triggers login
        txtPassword.addActionListener(e -> attemptLogin());
    }

    private void attemptLogin() {
        String user = txtUsername.getText().trim();
        String pass = new String(txtPassword.getPassword());

        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter username and password.", "Missing", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // successful login
                frame.dispose();
                buildMainUI(user);
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            showError("Login error: " + ex.getMessage());
        }
    }

    private void buildMainUI(String adminName) {
        JFrame main = new JFrame("Real Estate Property Management System - Admin: " + adminName);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(1000, 700);
        main.setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Dashboard", createDashboardPanel());
        tabbedPane.addTab("Sellers", createSellersPanel());
        tabbedPane.addTab("Buyers", createBuyersPanel());
        tabbedPane.addTab("Properties", createPropertiesPanel());
        tabbedPane.addTab("Transactions", createTransactionsPanel());
        tabbedPane.addTab("History", createHistoryPanel());

        main.setContentPane(tabbedPane);
        main.setVisible(true);

        // Initial load
        refreshAllTables();
    }

    // ------------------ Dashboard ------------------
    private JPanel createDashboardPanel() {
        JPanel p = new JPanel(new BorderLayout(10,10));
        p.setBorder(new EmptyBorder(15,15,15,15));

        JLabel title = new JLabel("Dashboard", SwingConstants.LEFT);
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        p.add(title, BorderLayout.NORTH);

        JPanel stats = new JPanel(new GridLayout(2,3,10,10));
        stats.setBorder(new EmptyBorder(10,10,10,10));

        JLabel lblSellers = new JLabel("Sellers: 0");
        JLabel lblBuyers = new JLabel("Buyers: 0");
        JLabel lblProperties = new JLabel("Properties: 0");
        JLabel lblTransactions = new JLabel("Transactions: 0");
        JLabel lblAvailable = new JLabel("Available: 0");
        JLabel lblSold = new JLabel("Sold: 0");

        stats.add(lblSellers); stats.add(lblBuyers); stats.add(lblProperties);
        stats.add(lblTransactions); stats.add(lblAvailable); stats.add(lblSold);

        p.add(stats, BorderLayout.CENTER);

        JButton btnRefresh = new JButton("Refresh Stats");
        p.add(btnRefresh, BorderLayout.SOUTH);

        btnRefresh.addActionListener(e -> {
            try {
                lblSellers.setText("Sellers: " + countRows("sellers"));
                lblBuyers.setText("Buyers: " + countRows("buyers"));
                lblProperties.setText("Properties: " + countRows("properties"));
                lblTransactions.setText("Transactions: " + countRows("transactions"));
                lblAvailable.setText("Available: " + countWhere("properties", "status='Available'"));
                lblSold.setText("Sold: " + countWhere("properties", "status='Sold'"));
            } catch (SQLException ex) {
                showError("Stats error: " + ex.getMessage());
            }
        });

        // run once on open
        btnRefresh.doClick();
        return p;
    }

    private int countRows(String table) throws SQLException {
        String sql = "SELECT COUNT(*) FROM " + table;
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            rs.next();
            return rs.getInt(1);
        }
    }
    private int countWhere(String table, String where) throws SQLException {
        String sql = "SELECT COUNT(*) FROM " + table + " WHERE " + where;
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            rs.next();
            return rs.getInt(1);
        }
    }

    // ------------------ Sellers Panel ------------------
    private JPanel createSellersPanel() {
        JPanel p = new JPanel(new BorderLayout(10,10));
        p.setBorder(new EmptyBorder(10,10,10,10));

        modelSellers = new DefaultTableModel(new String[]{"ID","Name","Phone","Email","Address"}, 0) {
            public boolean isCellEditable(int row, int column) { return false; }
        };
        JTable table = new JTable(modelSellers);
        JScrollPane sp = new JScrollPane(table);

        JPanel form = new JPanel(new GridLayout(5,2,8,8));
        JTextField fName = new JTextField();
        JTextField fPhone = new JTextField();
        JTextField fEmail = new JTextField();
        JTextField fAddress = new JTextField();

        form.add(new JLabel("Name:")); form.add(fName);
        form.add(new JLabel("Phone:")); form.add(fPhone);
        form.add(new JLabel("Email:")); form.add(fEmail);
        form.add(new JLabel("Address:")); form.add(fAddress);

        JButton btnAdd = new JButton("Add Seller");
        JButton btnUpdate = new JButton("Update Selected");
        JButton btnDelete = new JButton("Delete Selected");
        JButton btnRefresh = new JButton("Refresh");

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controls.add(btnAdd); controls.add(btnUpdate); controls.add(btnDelete); controls.add(btnRefresh);

        p.add(sp, BorderLayout.CENTER);
        p.add(form, BorderLayout.NORTH);
        p.add(controls, BorderLayout.SOUTH);

        btnAdd.addActionListener(e -> {
            String name = fName.getText().trim();
            if (name.isEmpty()) { showError("Name required."); return; }
            String sql = "INSERT INTO sellers (name,phone,email,address) VALUES (?,?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.setString(2, fPhone.getText().trim());
                ps.setString(3, fEmail.getText().trim());
                ps.setString(4, fAddress.getText().trim());
                ps.executeUpdate();
                insertHistory("seller", getLastInsertId(conn), "Added seller", "Name="+name);
                JOptionPane.showMessageDialog(p, "Seller added.");
                clearFields(fName,fPhone,fEmail,fAddress);
                refreshSellers();
            } catch (SQLException ex) { showError("Add seller failed: " + ex.getMessage()); }
        });

        btnUpdate.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) { showError("Select a seller to update."); return; }
            int id = Integer.parseInt(modelSellers.getValueAt(r,0).toString());
            String name = fName.getText().trim();
            if (name.isEmpty()) { showError("Name required."); return; }
            String sql = "UPDATE sellers SET name=?,phone=?,email=?,address=? WHERE seller_id=?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.setString(2, fPhone.getText().trim());
                ps.setString(3, fEmail.getText().trim());
                ps.setString(4, fAddress.getText().trim());
                ps.setInt(5, id);
                ps.executeUpdate();
                insertHistory("seller", id, "Updated seller", "Name="+name);
                JOptionPane.showMessageDialog(p, "Seller updated.");
                refreshSellers();
            } catch (SQLException ex) { showError("Update seller failed: " + ex.getMessage()); }
        });

        btnDelete.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) { showError("Select a seller to delete."); return; }
            int id = Integer.parseInt(modelSellers.getValueAt(r,0).toString());
            int confirm = JOptionPane.showConfirmDialog(p, "Delete seller id="+id+"?","Confirm",JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) return;
            String sql = "DELETE FROM sellers WHERE seller_id=?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
                insertHistory("seller", id, "Deleted seller", "");
                JOptionPane.showMessageDialog(p, "Seller deleted.");
                refreshSellers();
            } catch (SQLException ex) { showError("Delete seller failed: " + ex.getMessage()); }
        });

        btnRefresh.addActionListener(e -> refreshSellers());

        // Clicking a row fills form for edit
        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                if (r == -1) return;
                fName.setText(modelSellers.getValueAt(r,1).toString());
                fPhone.setText(modelSellers.getValueAt(r,2).toString());
                fEmail.setText(modelSellers.getValueAt(r,3).toString());
                fAddress.setText(modelSellers.getValueAt(r,4).toString());
            }
        });

        return p;
    }

    // ------------------ Buyers Panel ------------------
    private JPanel createBuyersPanel() {
        JPanel p = new JPanel(new BorderLayout(10,10));
        p.setBorder(new EmptyBorder(10,10,10,10));

        modelBuyers = new DefaultTableModel(new String[]{"ID","Name","Phone","Email","Address"}, 0) {
            public boolean isCellEditable(int row, int column) { return false; }
        };
        JTable table = new JTable(modelBuyers);
        JScrollPane sp = new JScrollPane(table);

        JPanel form = new JPanel(new GridLayout(5,2,8,8));
        JTextField fName = new JTextField();
        JTextField fPhone = new JTextField();
        JTextField fEmail = new JTextField();
        JTextField fAddress = new JTextField();

        form.add(new JLabel("Name:")); form.add(fName);
        form.add(new JLabel("Phone:")); form.add(fPhone);
        form.add(new JLabel("Email:")); form.add(fEmail);
        form.add(new JLabel("Address:")); form.add(fAddress);

        JButton btnAdd = new JButton("Add Buyer");
        JButton btnUpdate = new JButton("Update Selected");
        JButton btnDelete = new JButton("Delete Selected");
        JButton btnRefresh = new JButton("Refresh");

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controls.add(btnAdd); controls.add(btnUpdate); controls.add(btnDelete); controls.add(btnRefresh);

        p.add(sp, BorderLayout.CENTER);
        p.add(form, BorderLayout.NORTH);
        p.add(controls, BorderLayout.SOUTH);

        btnAdd.addActionListener(e -> {
            String name = fName.getText().trim();
            if (name.isEmpty()) { showError("Name required."); return; }
            String sql = "INSERT INTO buyers (name,phone,email,address) VALUES (?,?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.setString(2, fPhone.getText().trim());
                ps.setString(3, fEmail.getText().trim());
                ps.setString(4, fAddress.getText().trim());
                ps.executeUpdate();
                insertHistory("buyer", getLastInsertId(conn), "Added buyer", "Name="+name);
                JOptionPane.showMessageDialog(p, "Buyer added.");
                clearFields(fName,fPhone,fEmail,fAddress);
                refreshBuyers();
            } catch (SQLException ex) { showError("Add buyer failed: " + ex.getMessage()); }
        });

        btnUpdate.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) { showError("Select a buyer to update."); return; }
            int id = Integer.parseInt(modelBuyers.getValueAt(r,0).toString());
            String name = fName.getText().trim();
            if (name.isEmpty()) { showError("Name required."); return; }
            String sql = "UPDATE buyers SET name=?,phone=?,email=?,address=? WHERE buyer_id=?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.setString(2, fPhone.getText().trim());
                ps.setString(3, fEmail.getText().trim());
                ps.setString(4, fAddress.getText().trim());
                ps.setInt(5, id);
                ps.executeUpdate();
                insertHistory("buyer", id, "Updated buyer", "Name="+name);
                JOptionPane.showMessageDialog(p, "Buyer updated.");
                refreshBuyers();
            } catch (SQLException ex) { showError("Update buyer failed: " + ex.getMessage()); }
        });

        btnDelete.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) { showError("Select a buyer to delete."); return; }
            int id = Integer.parseInt(modelBuyers.getValueAt(r,0).toString());
            int confirm = JOptionPane.showConfirmDialog(p, "Delete buyer id="+id+"?","Confirm",JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) return;
            String sql = "DELETE FROM buyers WHERE buyer_id=?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
                insertHistory("buyer", id, "Deleted buyer", "");
                JOptionPane.showMessageDialog(p, "Buyer deleted.");
                refreshBuyers();
            } catch (SQLException ex) { showError("Delete buyer failed: " + ex.getMessage()); }
        });

        btnRefresh.addActionListener(e -> refreshBuyers());

        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                if (r == -1) return;
                fName.setText(modelBuyers.getValueAt(r,1).toString());
                fPhone.setText(modelBuyers.getValueAt(r,2).toString());
                fEmail.setText(modelBuyers.getValueAt(r,3).toString());
                fAddress.setText(modelBuyers.getValueAt(r,4).toString());
            }
        });

        return p;
    }

    // ------------------ Properties Panel ------------------
    private JPanel createPropertiesPanel() {
        JPanel p = new JPanel(new BorderLayout(10,10));
        p.setBorder(new EmptyBorder(10,10,10,10));

        modelProperties = new DefaultTableModel(new String[]{"ID","Title","Description","Price","SellerID","Status"}, 0) {
            public boolean isCellEditable(int row, int column) { return false; }
        };
        JTable table = new JTable(modelProperties);
        JScrollPane sp = new JScrollPane(table);

        JPanel form = new JPanel(new GridLayout(6,2,8,8));
        JTextField fTitle = new JTextField();
        JTextField fDesc = new JTextField();
        JTextField fPrice = new JTextField();
        JTextField fSellerId = new JTextField();
        JComboBox<String> cbStatus = new JComboBox<>(new String[]{"Available","Sold","Pending"});

        form.add(new JLabel("Title:")); form.add(fTitle);
        form.add(new JLabel("Short Desc:")); form.add(fDesc);
        form.add(new JLabel("Price:")); form.add(fPrice);
        form.add(new JLabel("Seller ID:")); form.add(fSellerId);
        form.add(new JLabel("Status:")); form.add(cbStatus);

        JButton btnAdd = new JButton("Add Property");
        JButton btnUpdate = new JButton("Update Selected");
        JButton btnDelete = new JButton("Delete Selected");
        JButton btnRefresh = new JButton("Refresh");

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controls.add(btnAdd); controls.add(btnUpdate); controls.add(btnDelete); controls.add(btnRefresh);

        p.add(sp, BorderLayout.CENTER);
        p.add(form, BorderLayout.NORTH);
        p.add(controls, BorderLayout.SOUTH);

        btnAdd.addActionListener(e -> {
            String title = fTitle.getText().trim();
            if (title.isEmpty()) { showError("Title required."); return; }
            String sql = "INSERT INTO properties (title,description,price,seller_id,status) VALUES (?,?,?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, title);
                ps.setString(2, fDesc.getText().trim());
                ps.setBigDecimal(3, parseBigDecimalOrNull(fPrice.getText().trim()));
                ps.setObject(4, parseIntOrNull(fSellerId.getText().trim()));
                ps.setString(5, cbStatus.getSelectedItem().toString());
                ps.executeUpdate();
                int pid = getLastInsertId(conn);
                insertHistory("property", pid, "Added property", "Title="+title);
                JOptionPane.showMessageDialog(p, "Property added.");
                clearFields(fTitle, fDesc, fPrice, fSellerId);
                refreshProperties();
            } catch (SQLException ex) { showError("Add property failed: " + ex.getMessage()); }
        });

        btnUpdate.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) { showError("Select a property to update."); return; }
            int id = Integer.parseInt(modelProperties.getValueAt(r,0).toString());
            String title = fTitle.getText().trim();
            if (title.isEmpty()) { showError("Title required."); return; }
            String sql = "UPDATE properties SET title=?,description=?,price=?,seller_id=?,status=? WHERE property_id=?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, title);
                ps.setString(2, fDesc.getText().trim());
                ps.setBigDecimal(3, parseBigDecimalOrNull(fPrice.getText().trim()));
                ps.setObject(4, parseIntOrNull(fSellerId.getText().trim()));
                ps.setString(5, cbStatus.getSelectedItem().toString());
                ps.setInt(6, id);
                ps.executeUpdate();
                insertHistory("property", id, "Updated property", "Title="+title);
                JOptionPane.showMessageDialog(p, "Property updated.");
                refreshProperties();
            } catch (SQLException ex) { showError("Update property failed: " + ex.getMessage()); }
        });

        btnDelete.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) { showError("Select a property to delete."); return; }
            int id = Integer.parseInt(modelProperties.getValueAt(r,0).toString());
            int confirm = JOptionPane.showConfirmDialog(p, "Delete property id="+id+"?","Confirm",JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) return;
            String sql = "DELETE FROM properties WHERE property_id=?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ps.executeUpdate();
                insertHistory("property", id, "Deleted property", "");
                JOptionPane.showMessageDialog(p, "Property deleted.");
                refreshProperties();
            } catch (SQLException ex) { showError("Delete property failed: " + ex.getMessage()); }
        });

        btnRefresh.addActionListener(e -> refreshProperties());

        table.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                if (r == -1) return;
                fTitle.setText(modelProperties.getValueAt(r,1).toString());
                fDesc.setText(modelProperties.getValueAt(r,2).toString());
                fPrice.setText(modelProperties.getValueAt(r,3).toString());
                fSellerId.setText(modelProperties.getValueAt(r,4)==null ? "" : modelProperties.getValueAt(r,4).toString());
                cbStatus.setSelectedItem(modelProperties.getValueAt(r,5).toString());
            }
        });

        return p;
    }

    // ------------------ Transactions Panel ------------------
    private JPanel createTransactionsPanel() {
        JPanel p = new JPanel(new BorderLayout(10,10));
        p.setBorder(new EmptyBorder(10,10,10,10));

        modelTransactions = new DefaultTableModel(new String[]{"ID","PropertyID","BuyerID","SellerID","Price","Date"}, 0) {
            public boolean isCellEditable(int row, int column) { return false; }
        };
        JTable table = new JTable(modelTransactions);
        JScrollPane sp = new JScrollPane(table);

        JPanel form = new JPanel(new GridLayout(6,2,8,8));
        JTextField fPropertyId = new JTextField();
        JTextField fBuyerId = new JTextField();
        JTextField fSellerId = new JTextField();
        JTextField fPrice = new JTextField();
        JTextField fDate = new JTextField(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));

        form.add(new JLabel("Property ID:")); form.add(fPropertyId);
        form.add(new JLabel("Buyer ID:")); form.add(fBuyerId);
        form.add(new JLabel("Seller ID:")); form.add(fSellerId);
        form.add(new JLabel("Sale Price:")); form.add(fPrice);
        form.add(new JLabel("Sale Date (YYYY-MM-DD):")); form.add(fDate);

        JButton btnAdd = new JButton("Add Transaction");
        JButton btnDelete = new JButton("Delete Selected");
        JButton btnRefresh = new JButton("Refresh");

        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controls.add(btnAdd); controls.add(btnDelete); controls.add(btnRefresh);

        p.add(sp, BorderLayout.CENTER);
        p.add(form, BorderLayout.NORTH);
        p.add(controls, BorderLayout.SOUTH);

        btnAdd.addActionListener(e -> {
            Integer pid = parseIntOrNull(fPropertyId.getText().trim());
            Integer bid = parseIntOrNull(fBuyerId.getText().trim());
            Integer sid = parseIntOrNull(fSellerId.getText().trim());
            if (pid==null || bid==null) { showError("Property ID and Buyer ID required."); return; }
            String sql = "INSERT INTO transactions (property_id,buyer_id,seller_id,sale_price,sale_date) VALUES (?,?,?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, pid);
                ps.setInt(2, bid);
                if (sid==null) ps.setNull(3, Types.INTEGER); else ps.setInt(3, sid);
                ps.setBigDecimal(4, parseBigDecimalOrNull(fPrice.getText().trim()));
                ps.setDate(5, java.sql.Date.valueOf(fDate.getText().trim()));
                ps.executeUpdate();
                int tid = getLastInsertId(conn);
                insertHistory("transaction", tid, "Added transaction", "property="+pid+" buyer="+bid);
                // mark property status as Sold
                try (PreparedStatement upd = conn.prepareStatement("UPDATE properties SET status='Sold' WHERE property_id=?")) {
                    upd.setInt(1, pid); upd.executeUpdate();
                }
                JOptionPane.showMessageDialog(p, "Transaction added. Property marked Sold.");
                refreshTransactions();
                refreshProperties();
            } catch (SQLException ex) { showError("Add transaction failed: " + ex.getMessage()); }
        });

        btnDelete.addActionListener(e -> {
            int r = table.getSelectedRow();
            if (r == -1) { showError("Select a transaction to delete."); return; }
            int id = Integer.parseInt(modelTransactions.getValueAt(r,0).toString());
            int confirm = JOptionPane.showConfirmDialog(p, "Delete transaction id="+id+"?","Confirm",JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) return;
            try (PreparedStatement ps = conn.prepareStatement("DELETE FROM transactions WHERE transaction_id=?")) {
                ps.setInt(1, id);
                ps.executeUpdate();
                insertHistory("transaction", id, "Deleted transaction", "");
                JOptionPane.showMessageDialog(p, "Transaction deleted.");
                refreshTransactions();
            } catch (SQLException ex) { showError("Delete transaction failed: " + ex.getMessage()); }
        });

        btnRefresh.addActionListener(e -> refreshTransactions());

        return p;
    }

    // ------------------ History Panel ------------------
    private JPanel createHistoryPanel() {
        JPanel p = new JPanel(new BorderLayout(8,8));
        p.setBorder(new EmptyBorder(10,10,10,10));

        modelHistory = new DefaultTableModel(new String[]{"ID","Entity","EntityID","Action","Time","Details"}, 0) {
            public boolean isCellEditable(int row, int column) { return false; }
        };
        JTable table = new JTable(modelHistory);
        JScrollPane sp = new JScrollPane(table);

        JButton btnRefresh = new JButton("Refresh");
        JButton btnClear = new JButton("Clear History (delete all)");
        JPanel controls = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controls.add(btnRefresh); controls.add(btnClear);

        p.add(sp, BorderLayout.CENTER);
        p.add(controls, BorderLayout.SOUTH);

        btnRefresh.addActionListener(e -> refreshHistory());
        btnClear.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(p, "Delete all history? This is irreversible.", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) return;
            try (Statement st = conn.createStatement()) {
                st.executeUpdate("DELETE FROM history");
                JOptionPane.showMessageDialog(p, "History cleared.");
                refreshHistory();
            } catch (SQLException ex) { showError("Clear history failed: " + ex.getMessage()); }
        });

        return p;
    }

    // ------------------ Utility Methods ------------------

    private void refreshAllTables() {
        refreshSellers();
        refreshBuyers();
        refreshProperties();
        refreshTransactions();
        refreshHistory();
    }

    private void refreshSellers() {
        modelSellers.setRowCount(0);
        String sql = "SELECT seller_id,name,phone,email,address FROM sellers";
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                modelSellers.addRow(new Object[]{
                    rs.getInt("seller_id"),
                    rs.getString("name"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getString("address")
                });
            }
        } catch (SQLException ex) { showError("Load sellers failed: " + ex.getMessage()); }
    }

    private void refreshBuyers() {
        modelBuyers.setRowCount(0);
        String sql = "SELECT buyer_id,name,phone,email,address FROM buyers";
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                modelBuyers.addRow(new Object[]{
                    rs.getInt("buyer_id"),
                    rs.getString("name"),
                    rs.getString("phone"),
                    rs.getString("email"),
                    rs.getString("address")
                });
            }
        } catch (SQLException ex) { showError("Load buyers failed: " + ex.getMessage()); }
    }

    private void refreshProperties() {
        modelProperties.setRowCount(0);
        String sql = "SELECT property_id,title,description,price,seller_id,status FROM properties";
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                modelProperties.addRow(new Object[]{
                    rs.getInt("property_id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getBigDecimal("price"),
                    rs.getObject("seller_id"),
                    rs.getString("status")
                });
            }
        } catch (SQLException ex) { showError("Load properties failed: " + ex.getMessage()); }
    }

    private void refreshTransactions() {
        modelTransactions.setRowCount(0);
        String sql = "SELECT transaction_id,property_id,buyer_id,seller_id,sale_price,sale_date FROM transactions";
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                modelTransactions.addRow(new Object[]{
                    rs.getInt("transaction_id"),
                    rs.getObject("property_id"),
                    rs.getObject("buyer_id"),
                    rs.getObject("seller_id"),
                    rs.getBigDecimal("sale_price"),
                    rs.getDate("sale_date")
                });
            }
        } catch (SQLException ex) { showError("Load transactions failed: " + ex.getMessage()); }
    }

    private void refreshHistory() {
        modelHistory.setRowCount(0);
        String sql = "SELECT history_id,entity,entity_id,action,action_time,details FROM history ORDER BY action_time DESC";
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                modelHistory.addRow(new Object[]{
                    rs.getInt("history_id"),
                    rs.getString("entity"),
                    rs.getObject("entity_id"),
                    rs.getString("action"),
                    rs.getTimestamp("action_time"),
                    rs.getString("details")
                });
            }
        } catch (SQLException ex) { showError("Load history failed: " + ex.getMessage()); }
    }

    private void insertHistory(String entity, Integer entityId, String action, String details) {
        String sql = "INSERT INTO history (entity, entity_id, action, details) VALUES (?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, entity);
            if (entityId == null) ps.setNull(2, Types.INTEGER); else ps.setInt(2, entityId);
            ps.setString(3, action);
            ps.setString(4, details);
            ps.executeUpdate();
        } catch (SQLException ex) {
            // non-fatal; log to console
            System.err.println("History insert failed: " + ex.getMessage());
        }
    }

    private static void clearFields(JTextField... fields) {
        for (JTextField f : fields) f.setText("");
    }

    private static Integer parseIntOrNull(String s) {
        if (s == null || s.isEmpty()) return null;
        try { return Integer.parseInt(s); } catch (NumberFormatException e) { return null; }
    }

    private static java.math.BigDecimal parseBigDecimalOrNull(String s) {
        if (s == null || s.isEmpty()) return null;
        try { return new java.math.BigDecimal(s); } catch (Exception e) { return null; }
    }

    private int getLastInsertId(Connection c) {
        // Works with MySQL session function
        try (Statement st = c.createStatement(); ResultSet rs = st.executeQuery("SELECT LAST_INSERT_ID()")) {
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) { System.err.println("last id error: " + e.getMessage()); }
        return -1;
    }

    private void showError(String msg) {
        JOptionPane.showMessageDialog(frame == null ? new JFrame() : frame, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void closeConnection() {
        try { if (conn != null && !conn.isClosed()) conn.close(); } catch (SQLException e) { /* ignore */ }
    }
}

