// Project: RealEstate_Property_Management_System
// Package: com.realestate

// -----------------------------
// File: src/com/realestate/DBConnection.java
// -----------------------------
//package com.realestate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/realestate?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root@123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


// -----------------------------
// File: src/com/realestate/models/Seller.java
// -----------------------------
package com.realestate.models;

public class Seller {
    public int sellerId;
    public String name;
    public String contact;
    public String propertyType; // House, Plot, Flat
    public String propertySize; // for Plot
    public Integer flatBhk; // for Flat
    public String propertyLocation;
    public String priceRange;

    public Seller() {}
}

// -----------------------------
// File: src/com/realestate/models/Buyer.java
// -----------------------------
package com.realestate.models;

public class Buyer {
    public int buyerId;
    public String name;
    public String contact;
    public String propertyType;
    public String preferredSize;
    public Integer preferredBhk;
    public String interestedLocation;
    public String priceRange;

    public Buyer() {}
}

// -----------------------------
// File: src/com/realestate/models/Property.java
// -----------------------------
//package com.realestate.models;

public class Property {
    public int propertyId;
    public int sellerId;
    public String location;
    public String type;
    public String size;
    public Integer bhk;
    public double price;
    public String status; // Available, Sold
}

// -----------------------------
// File: src/com/realestate/models/TransactionModel.java
// -----------------------------
package com.realestate.models;

import java.sql.Date;

public class TransactionModel {
    public int transactionId;
    public int sellerId;
    public int buyerId;
    public int propertyId;
    public double price;
    public Date date;
}

// -----------------------------
// File: src/com/realestate/Main.java
// -----------------------------
package com.realestate;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Set look and feel to system
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception e) {}

        SwingUtilities.invokeLater(() -> {
            LoginPage login = new LoginPage();
            login.setVisible(true);
        });
    }
}

// -----------------------------
// File: src/com/realestate/LoginPage.java
// -----------------------------
//package com.realestate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginPage extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;

    public LoginPage() {
        setTitle("Broker Login - RealEstate");
        setSize(420, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        JLabel lblTitle = new JLabel("Broker Login");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setBounds(140, 10, 200, 30);
        panel.add(lblTitle);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(40, 60, 80, 25);
        panel.add(lblEmail);

        emailField = new JTextField();
        emailField.setBounds(140, 60, 220, 25);
        panel.add(emailField);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(40, 100, 80, 25);
        panel.add(lblPass);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 100, 220, 25);
        panel.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(140, 150, 100, 30);
        panel.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doLogin();
            }
        });

        add(panel);
    }

    private void doLogin() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter email and password.");
            return;
        }

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM broker WHERE email = ? AND password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                // open dashboard
                Dashboard dash = new Dashboard(email);
                dash.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email or password.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "DB Error: " + ex.getMessage());
        }
    }
}

// -----------------------------
// File: src/com/realestate/Dashboard.java
// -----------------------------
package com.realestate;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    private CardLayout cardLayout;
    private JPanel cards;

    public Dashboard(String brokerEmail) {
        setTitle("RealEstate - Broker Dashboard");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initUI(brokerEmail);
    }

    private void initUI(String brokerEmail) {
        JPanel sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(200, 0));
        sidebar.setBackground(new Color(230, 255, 230)); // light green
        sidebar.setLayout(new GridLayout(8,1,5,5));

        JButton btnSellers = new JButton("Sellers");
        JButton btnBuyers = new JButton("Buyers");
        JButton btnProperties = new JButton("Properties");
        JButton btnTransactions = new JButton("Transactions");
        JButton btnHistory = new JButton("History");
        JButton btnLogout = new JButton("Logout");

        sidebar.add(new JLabel("  Welcome, " + brokerEmail));
        sidebar.add(btnSellers);
        sidebar.add(btnBuyers);
        sidebar.add(btnProperties);
        sidebar.add(btnTransactions);
        sidebar.add(btnHistory);
        sidebar.add(new JLabel());
        sidebar.add(btnLogout);

        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);

        // panels
        SellersPanel sellersPanel = new SellersPanel();
        BuyersPanel buyersPanel = new BuyersPanel();
        PropertiesPanel propertiesPanel = new PropertiesPanel();
        TransactionsPanel transactionsPanel = new TransactionsPanel();
        HistoryPanel historyPanel = new HistoryPanel();

        cards.add(sellersPanel, "sellers");
        cards.add(buyersPanel, "buyers");
        cards.add(propertiesPanel, "properties");
        cards.add(transactionsPanel, "transactions");
        cards.add(historyPanel, "history");

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(sidebar, BorderLayout.WEST);
        getContentPane().add(cards, BorderLayout.CENTER);

        btnSellers.addActionListener(e -> cardLayout.show(cards, "sellers"));
        btnBuyers.addActionListener(e -> cardLayout.show(cards, "buyers"));
        btnProperties.addActionListener(e -> cardLayout.show(cards, "properties"));
        btnTransactions.addActionListener(e -> cardLayout.show(cards, "transactions"));
        btnHistory.addActionListener(e -> cardLayout.show(cards, "history"));
        btnLogout.addActionListener(e -> { dispose(); new LoginPage().setVisible(true); });
    }
}

// -----------------------------
// File: src/com/realestate/SellersPanel.java
// -----------------------------
package com.realestate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class SellersPanel extends JPanel {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField txtName, txtContact, txtLocation, txtPriceRange, txtPlotSize, txtSearch;
    private JComboBox<String> cmbType, cmbBhk;

    public SellersPanel() {
        setLayout(new BorderLayout());
        initUI();
        loadSellers();
    }

    private void initUI() {
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        top.setBackground(Color.WHITE);
        txtSearch = new JTextField(20);
        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(e -> loadSellers(txtSearch.getText().trim()));

        top.add(new JLabel("Search by name/location:"));
        top.add(txtSearch);
        top.add(btnSearch);

        add(top, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new Object[]{"ID","Name","Contact","Type","Size","BHK","Location","Price Range"},0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel form = new JPanel(new GridLayout(0,2,8,8));
        form.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        txtName = new JTextField();
        txtContact = new JTextField();
        cmbType = new JComboBox<>(new String[]{"House","Plot","Flat"});
        txtPlotSize = new JTextField();
        cmbBhk = new JComboBox<>(new String[]{"", "1","2","3","4"});
        txtLocation = new JTextField();
        txtPriceRange = new JTextField();

        form.add(new JLabel("Name:")); form.add(txtName);
        form.add(new JLabel("Contact:")); form.add(txtContact);
        form.add(new JLabel("Property Type:")); form.add(cmbType);
        form.add(new JLabel("Plot Size (if Plot):")); form.add(txtPlotSize);
        form.add(new JLabel("Flat BHK (if Flat):")); form.add(cmbBhk);
        form.add(new JLabel("Location:")); form.add(txtLocation);
        form.add(new JLabel("Price Range:")); form.add(txtPriceRange);

        JButton btnAdd = new JButton("Add Seller");
        JButton btnUpdate = new JButton("Update Selected");
        JButton btnDelete = new JButton("Delete Selected");

        btnAdd.addActionListener(e -> addSeller());
        btnUpdate.addActionListener(e -> updateSeller());
        btnDelete.addActionListener(e -> deleteSeller());

        JPanel south = new JPanel();
        south.add(btnAdd); south.add(btnUpdate); south.add(btnDelete);

        JPanel rightWrapper = new JPanel(new BorderLayout());
        rightWrapper.add(form, BorderLayout.NORTH);
        rightWrapper.add(south, BorderLayout.SOUTH);

        add(rightWrapper, BorderLayout.SOUTH);
    }

    private void loadSellers() { loadSellers(""); }

    private void loadSellers(String filter) {
        tableModel.setRowCount(0);
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM seller ";
            if (!filter.isEmpty()) sql += " WHERE name LIKE ? OR property_location LIKE ? ";
            PreparedStatement pst = conn.prepareStatement(sql);
            if (!filter.isEmpty()) { pst.setString(1, "%" + filter + "%"); pst.setString(2, "%" + filter + "%"); }
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("seller_id"),
                        rs.getString("name"),
                        rs.getString("contact"),
                        rs.getString("property_type"),
                        rs.getString("property_size"),
                        rs.getObject("flat_bhk"),
                        rs.getString("property_location"),
                        rs.getString("price_range")
                });
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addSeller() {
        String name = txtName.getText().trim();
        String contact = txtContact.getText().trim();
        String type = (String)cmbType.getSelectedItem();
        String size = txtPlotSize.getText().trim();
        String bhk = (String)cmbBhk.getSelectedItem();
        String location = txtLocation.getText().trim();
        String price = txtPriceRange.getText().trim();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO seller(name,contact,property_type,property_size,flat_bhk,property_location,price_range) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, type);
            pst.setString(4, size.isEmpty()?null:size);
            if (bhk==null || bhk.isEmpty()) pst.setNull(5, Types.INTEGER); else pst.setInt(5, Integer.parseInt(bhk));
            pst.setString(6, location);
            pst.setString(7, price);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller added.");
            loadSellers();
        } catch (Exception ex) { ex.printStackTrace(); JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage()); }
    }

    private void updateSeller() {
        int sel = table.getSelectedRow();
        if (sel < 0) { JOptionPane.showMessageDialog(this, "Select a row to update."); return; }
        int id = (int)tableModel.getValueAt(sel,0);
        String name = txtName.getText().trim();
        String contact = txtContact.getText().trim();
        String type = (String)cmbType.getSelectedItem();
        String size = txtPlotSize.getText().trim();
        String bhk = (String)cmbBhk.getSelectedItem();
        String location = txtLocation.getText().trim();
        String price = txtPriceRange.getText().trim();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE seller SET name=?, contact=?, property_type=?, property_size=?, flat_bhk=?, property_location=?, price_range=? WHERE seller_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, type);
            pst.setString(4, size.isEmpty()?null:size);
            if (bhk==null || bhk.isEmpty()) pst.setNull(5, Types.INTEGER); else pst.setInt(5, Integer.parseInt(bhk));
            pst.setString(6, location);
            pst.setString(7, price);
            pst.setInt(8, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller updated.");
            loadSellers();
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    private void deleteSeller() {
        int sel = table.getSelectedRow();
        if (sel < 0) { JOptionPane.showMessageDialog(this, "Select a row to delete."); return; }
        int id = (int)tableModel.getValueAt(sel,0);
        int confirm = JOptionPane.showConfirmDialog(this, "Delete selected seller?","Confirm",JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM seller WHERE seller_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller deleted.");
            loadSellers();
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}

// -----------------------------
// File: src/com/realestate/BuyersPanel.java
// -----------------------------
package com.realestate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class BuyersPanel extends JPanel {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField txtName, txtContact, txtPrefSize, txtSearch, txtLocation, txtPriceRange;
    private JComboBox<String> cmbType, cmbBhk;

    public BuyersPanel() {
        setLayout(new BorderLayout());
        initUI();
        loadBuyers();
    }

    private void initUI() {
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        top.setBackground(Color.WHITE);
        txtSearch = new JTextField(20);
        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(e -> loadBuyers(txtSearch.getText().trim()));

        top.add(new JLabel("Search by name/location:"));
        top.add(txtSearch);
        top.add(btnSearch);

        add(top, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new Object[]{"ID","Name","Contact","Type","Pref Size","BHK","Location","Price Range"},0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel form = new JPanel(new GridLayout(0,2,8,8));
        form.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        txtName = new JTextField();
        txtContact = new JTextField();
        cmbType = new JComboBox<>(new String[]{"House","Plot","Flat"});
        txtPrefSize = new JTextField();
        cmbBhk = new JComboBox<>(new String[]{"", "1","2","3","4"});
        txtLocation = new JTextField();
        txtPriceRange = new JTextField();

        form.add(new JLabel("Name:")); form.add(txtName);
        form.add(new JLabel("Contact:")); form.add(txtContact);
        form.add(new JLabel("Property Type:")); form.add(cmbType);
        form.add(new JLabel("Preferred Plot Size:")); form.add(txtPrefSize);
        form.add(new JLabel("Preferred BHK:")); form.add(cmbBhk);
        form.add(new JLabel("Location:")); form.add(txtLocation);
        form.add(new JLabel("Price Range:")); form.add(txtPriceRange);

        JButton btnAdd = new JButton("Add Buyer");
        JButton btnUpdate = new JButton("Update Selected");
        JButton btnDelete = new JButton("Delete Selected");

        btnAdd.addActionListener(e -> addBuyer());
        btnUpdate.addActionListener(e -> updateBuyer());
        btnDelete.addActionListener(e -> deleteBuyer());

        JPanel south = new JPanel();
        south.add(btnAdd); south.add(btnUpdate); south.add(btnDelete);

        JPanel rightWrapper = new JPanel(new BorderLayout());
        rightWrapper.add(form, BorderLayout.NORTH);
        rightWrapper.add(south, BorderLayout.SOUTH);

        add(rightWrapper, BorderLayout.SOUTH);
    }

    private void loadBuyers() { loadBuyers(""); }

    private void loadBuyers(String filter) {
        tableModel.setRowCount(0);
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM buyer ";
            if (!filter.isEmpty()) sql += " WHERE name LIKE ? OR interested_location LIKE ? ";
            PreparedStatement pst = conn.prepareStatement(sql);
            if (!filter.isEmpty()) { pst.setString(1, "%" + filter + "%"); pst.setString(2, "%" + filter + "%"); }
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("buyer_id"),
                        rs.getString("name"),
                        rs.getString("contact"),
                        rs.getString("property_type"),
                        rs.getString("preferred_size"),
                        rs.getObject("preferred_bhk"),
                        rs.getString("interested_location"),
                        rs.getString("price_range")
                });
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    private void addBuyer() {
        String name = txtName.getText().trim();
        String contact = txtContact.getText().trim();
        String type = (String)cmbType.getSelectedItem();
        String size = txtPrefSize.getText().trim();
        String bhk = (String)cmbBhk.getSelectedItem();
        String location = txtLocation.getText().trim();
        String price = txtPriceRange.getText().trim();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO buyer(name,contact,property_type,preferred_size,preferred_bhk,interested_location,price_range) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, type);
            pst.setString(4, size.isEmpty()?null:size);
            if (bhk==null || bhk.isEmpty()) pst.setNull(5, Types.INTEGER); else pst.setInt(5, Integer.parseInt(bhk));
            pst.setString(6, location);
            pst.setString(7, price);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Buyer added.");
            loadBuyers();
        } catch (Exception ex) { ex.printStackTrace(); JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage()); }
    }

    private void updateBuyer() {
        int sel = table.getSelectedRow();
        if (sel < 0) { JOptionPane.showMessageDialog(this, "Select a row to update."); return; }
        int id = (int)tableModel.getValueAt(sel,0);
        String name = txtName.getText().trim();
        String contact = txtContact.getText().trim();
        String type = (String)cmbType.getSelectedItem();
        String size = txtPrefSize.getText().trim();
        String bhk = (String)cmbBhk.getSelectedItem();
        String location = txtLocation.getText().trim();
        String price = txtPriceRange.getText().trim();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE buyer SET name=?, contact=?, property_type=?, preferred_size=?, preferred_bhk=?, interested_location=?, price_range=? WHERE buyer_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, contact);
            pst.setString(3, type);
            pst.setString(4, size.isEmpty()?null:size);
            if (bhk==null || bhk.isEmpty()) pst.setNull(5, Types.INTEGER); else pst.setInt(5, Integer.parseInt(bhk));
            pst.setString(6, location);
            pst.setString(7, price);
            pst.setInt(8, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Buyer updated.");
            loadBuyers();
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    private void deleteBuyer() {
        int sel = table.getSelectedRow();
        if (sel < 0) { JOptionPane.showMessageDialog(this, "Select a row to delete."); return; }
        int id = (int)tableModel.getValueAt(sel,0);
        int confirm = JOptionPane.showConfirmDialog(this, "Delete selected buyer?","Confirm",JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM buyer WHERE buyer_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Buyer deleted.");
            loadBuyers();
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}

// -----------------------------
// File: src/com/realestate/PropertiesPanel.java
// -----------------------------
package com.realestate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class PropertiesPanel extends JPanel {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField txtLocation, txtPrice, txtSize, txtSearch;
    private JComboBox<String> cmbType, cmbBhk, cmbSeller;

    public PropertiesPanel() {
        setLayout(new BorderLayout());
        initUI();
        loadProperties();
        loadSellersToCombo();
    }

    private void initUI() {
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtSearch = new JTextField(20);
        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(e -> loadProperties(txtSearch.getText().trim()));
        top.add(new JLabel("Search by location/owner:")); top.add(txtSearch); top.add(btnSearch);
        add(top, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new Object[]{"ID","Seller","Location","Type","Size","BHK","Price","Status"},0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel form = new JPanel(new GridLayout(0,2,8,8));
        form.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        cmbSeller = new JComboBox<>();
        txtLocation = new JTextField();
        cmbType = new JComboBox<>(new String[]{"House","Plot","Flat"});
        txtSize = new JTextField();
        cmbBhk = new JComboBox<>(new String[]{"","1","2","3","4"});
        txtPrice = new JTextField();

        form.add(new JLabel("Seller:")); form.add(cmbSeller);
        form.add(new JLabel("Location:")); form.add(txtLocation);
        form.add(new JLabel("Type:")); form.add(cmbType);
        form.add(new JLabel("Size:")); form.add(txtSize);
        form.add(new JLabel("BHK:")); form.add(cmbBhk);
        form.add(new JLabel("Price:")); form.add(txtPrice);

        JButton btnAdd = new JButton("Add Property");
        JButton btnUpdate = new JButton("Update Selected");
        JButton btnDelete = new JButton("Delete Selected");

        btnAdd.addActionListener(e -> addProperty());
        btnUpdate.addActionListener(e -> updateProperty());
        btnDelete.addActionListener(e -> deleteProperty());

        JPanel south = new JPanel(); south.add(btnAdd); south.add(btnUpdate); south.add(btnDelete);

        JPanel rightWrapper = new JPanel(new BorderLayout()); rightWrapper.add(form, BorderLayout.NORTH); rightWrapper.add(south, BorderLayout.SOUTH);
        add(rightWrapper, BorderLayout.SOUTH);
    }

    private void loadSellersToCombo() {
        cmbSeller.removeAllItems();
        try (Connection conn = DBConnection.getConnection()) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT seller_id, name FROM seller");
            while (rs.next()) {
                cmbSeller.addItem(rs.getInt("seller_id") + " - " + rs.getString("name"));
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    private void loadProperties() { loadProperties(""); }

    private void loadProperties(String filter) {
        tableModel.setRowCount(0);
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT p.property_id, s.name AS seller_name, p.location, p.type, p.size, p.bhk, p.price, p.status FROM property p LEFT JOIN seller s ON p.seller_id=s.seller_id";
            if (!filter.isEmpty()) sql += " WHERE p.location LIKE ? OR s.name LIKE ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            if (!filter.isEmpty()) { pst.setString(1, "%" + filter + "%"); pst.setString(2, "%" + filter + "%"); }
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("property_id"),
                        rs.getString("seller_name"),
                        rs.getString("location"),
                        rs.getString("type"),
                        rs.getString("size"),
                        rs.getObject("bhk"),
                        rs.getDouble("price"),
                        rs.getString("status")
                });
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    private void addProperty() {
        if (cmbSeller.getItemCount() == 0) { JOptionPane.showMessageDialog(this, "No sellers found. Add sellers first."); return; }
        String sellerStr = (String)cmbSeller.getSelectedItem();
        int sellerId = Integer.parseInt(sellerStr.split(" - ")[0]);
        String location = txtLocation.getText().trim();
        String type = (String)cmbType.getSelectedItem();
        String size = txtSize.getText().trim();
        String bhk = (String)cmbBhk.getSelectedItem();
        String price = txtPrice.getText().trim();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO property(seller_id, location, type, size, bhk, price, status) VALUES(?,?,?,?,?,?, 'Available')";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, sellerId);
            pst.setString(2, location);
            pst.setString(3, type);
            pst.setString(4, size.isEmpty()?null:size);
            if (bhk==null || bhk.isEmpty()) pst.setNull(5, Types.INTEGER); else pst.setInt(5, Integer.parseInt(bhk));
            pst.setDouble(6, Double.parseDouble(price));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Property added.");
            loadProperties();
            loadSellersToCombo();
        } catch (Exception ex) { ex.printStackTrace(); JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage()); }
    }

    private void updateProperty() {
        int sel = table.getSelectedRow();
        if (sel < 0) { JOptionPane.showMessageDialog(this, "Select a row to update."); return; }
        int id = (int)tableModel.getValueAt(sel,0);
        String sellerStr = (String)cmbSeller.getSelectedItem();
        int sellerId = Integer.parseInt(sellerStr.split(" - ")[0]);
        String location = txtLocation.getText().trim();
        String type = (String)cmbType.getSelectedItem();
        String size = txtSize.getText().trim();
        String bhk = (String)cmbBhk.getSelectedItem();
        String price = txtPrice.getText().trim();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE property SET seller_id=?, location=?, type=?, size=?, bhk=?, price=? WHERE property_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, sellerId);
            pst.setString(2, location);
            pst.setString(3, type);
            pst.setString(4, size.isEmpty()?null:size);
            if (bhk==null || bhk.isEmpty()) pst.setNull(5, Types.INTEGER); else pst.setInt(5, Integer.parseInt(bhk));
            pst.setDouble(6, Double.parseDouble(price));
            pst.setInt(7, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Property updated.");
            loadProperties();
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    private void deleteProperty() {
        int sel = table.getSelectedRow();
        if (sel < 0) { JOptionPane.showMessageDialog(this, "Select a row to delete."); return; }
        int id = (int)tableModel.getValueAt(sel,0);
        int confirm = JOptionPane.showConfirmDialog(this, "Delete selected property?","Confirm",JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM property WHERE property_id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Property deleted.");
            loadProperties();
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}

// -----------------------------
// File: src/com/realestate/TransactionsPanel.java
// -----------------------------
package com.realestate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;

public class TransactionsPanel extends JPanel {
    private JComboBox<String> cmbSeller, cmbBuyer, cmbProperty;
    private JTextField txtPrice;
    private DefaultTableModel tableModel;
    private JTable table;

    public TransactionsPanel() {
        setLayout(new BorderLayout());
        initUI();
        loadTransactions();
        loadDropdowns();
    }

    private void initUI() {
        JPanel top = new JPanel(new GridLayout(2,1));

        JPanel form = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cmbSeller = new JComboBox<>(); cmbBuyer = new JComboBox<>(); cmbProperty = new JComboBox<>(); txtPrice = new JTextField(8);
        form.add(new JLabel("Seller:")); form.add(cmbSeller);
        form.add(new JLabel("Buyer:")); form.add(cmbBuyer);
        form.add(new JLabel("Property:")); form.add(cmbProperty);
        form.add(new JLabel("Price:")); form.add(txtPrice);
        JButton btnRecord = new JButton("Record Transaction");
        btnRecord.addActionListener(e -> recordTransaction());
        form.add(btnRecord);

        top.add(form);
        add(top, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new Object[]{"ID","Seller","Buyer","Property","Price","Date"},0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void loadDropdowns() {
        cmbSeller.removeAllItems(); cmbBuyer.removeAllItems(); cmbProperty.removeAllItems();
        try (Connection conn = DBConnection.getConnection()) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT seller_id, name FROM seller");
            while (rs.next()) cmbSeller.addItem(rs.getInt("seller_id")+" - "+rs.getString("name"));

            rs = conn.createStatement().executeQuery("SELECT buyer_id, name FROM buyer");
            while (rs.next()) cmbBuyer.addItem(rs.getInt("buyer_id")+" - "+rs.getString("name"));

            rs = conn.createStatement().executeQuery("SELECT property_id, location FROM property WHERE status='Available'");
            while (rs.next()) cmbProperty.addItem(rs.getInt("property_id")+" - "+rs.getString("location"));
        } catch (Exception ex) { ex.printStackTrace(); }
    }

    private void recordTransaction() {
        if (cmbSeller.getItemCount()==0 || cmbBuyer.getItemCount()==0 || cmbProperty.getItemCount()==0) { JOptionPane.showMessageDialog(this, "Ensure seller/buyer/property selected."); return; }
        int sellerId = Integer.parseInt(((String)cmbSeller.getSelectedItem()).split(" - ")[0]);
        int buyerId = Integer.parseInt(((String)cmbBuyer.getSelectedItem()).split(" - ")[0]);
        int propertyId = Integer.parseInt(((String)cmbProperty.getSelectedItem()).split(" - ")[0]);
        double price = Double.parseDouble(txtPrice.getText().trim());

        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false);
            String ins = "INSERT INTO transaction(seller_id,buyer_id,property_id,price,date) VALUES(?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(ins);
            pst.setInt(1, sellerId); pst.setInt(2, buyerId); pst.setInt(3, propertyId); pst.setDouble(4, price); pst.setDate(5, Date.valueOf(LocalDate.now()));
            pst.executeUpdate();

            String upd = "UPDATE property SET status='Sold' WHERE property_id=?";
            PreparedStatement pst2 = conn.prepareStatement(upd); pst2.setInt(1, propertyId); pst2.executeUpdate();

            String hist = "INSERT INTO history(property_id, old_owner, new_owner, date, price) VALUES(?,?,?,?,?)";
            PreparedStatement pst3 = conn.prepareStatement(hist); pst3.setInt(1, propertyId); pst3.setInt(2, sellerId); pst3.setInt(3, buyerId); pst3.setDate(4, Date.valueOf(LocalDate.now())); pst3.setDouble(5, price); pst3.executeUpdate();

            conn.commit();
            JOptionPane.showMessageDialog(this, "Transaction recorded and property marked Sold.");
            loadTransactions(); loadDropdowns();
        } catch (Exception ex) { ex.printStackTrace(); JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage()); }
    }

    private void loadTransactions() {
        tableModel.setRowCount(0);
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT t.transaction_id, s.name AS seller, b.name AS buyer, p.location AS property, t.price, t.date FROM transaction t " +
                    "LEFT JOIN seller s ON t.seller_id=s.seller_id LEFT JOIN buyer b ON t.buyer_id=b.buyer_id LEFT JOIN property p ON t.property_id=p.property_id ORDER BY t.date DESC";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getInt("transaction_id"), rs.getString("seller"), rs.getString("buyer"), rs.getString("property"), rs.getDouble("price"), rs.getDate("date")});
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}

// -----------------------------
// File: src/com/realestate/HistoryPanel.java
// -----------------------------
package com.realestate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class HistoryPanel extends JPanel {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField txtSearch;

    public HistoryPanel() {
        setLayout(new BorderLayout());
        initUI();
        loadHistory();
    }

    private void initUI() {
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtSearch = new JTextField(20);
        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(e -> loadHistory(txtSearch.getText().trim()));
        top.add(new JLabel("Search by location/owner:")); top.add(txtSearch); top.add(btnSearch);
        add(top, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new Object[]{"ID","Property","Old Owner","New Owner","Price","Date"},0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    private void loadHistory() { loadHistory(""); }

    private void loadHistory(String filter) {
        tableModel.setRowCount(0);
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT h.history_id, p.location AS property, so.name AS old_owner, bn.name AS new_owner, h.price, h.date FROM history h " +
                    "LEFT JOIN property p ON h.property_id=p.property_id LEFT JOIN seller so ON h.old_owner=so.seller_id LEFT JOIN buyer bn ON h.new_owner=bn.buyer_id";
            if (!filter.isEmpty()) sql += " WHERE p.location LIKE ? OR so.name LIKE ? OR bn.name LIKE ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            if (!filter.isEmpty()) { pst.setString(1, "%"+filter+"%"); pst.setString(2, "%"+filter+"%"); pst.setString(3, "%"+filter+"%"); }
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getInt("history_id"), rs.getString("property"), rs.getString("old_owner"), rs.getString("new_owner"), rs.getDouble("price"), rs.getDate("date")});
            }
        } catch (Exception ex) { ex.printStackTrace(); }
    }
}
//
//
//// -----------------------------
//// File: sql/realestate.sql
//// -----------------------------
//-- Run this SQL script in your MySQL server to create the database and tables with sample data
//
//CREATE DATABASE IF NOT EXISTS realestate CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
//USE realestate;
//
//-- Broker table (login by email)
//CREATE TABLE IF NOT EXISTS broker (
//  broker_id INT AUTO_INCREMENT PRIMARY KEY,
//  name VARCHAR(100),
//  email VARCHAR(150) UNIQUE,
//  password VARCHAR(100)
//);
//
//INSERT INTO broker(name,email,password) VALUES
//('Admin','admin@example.com','admin123')
//ON DUPLICATE KEY UPDATE email=email;
//
//-- Seller
//CREATE TABLE IF NOT EXISTS seller (
//  seller_id INT AUTO_INCREMENT PRIMARY KEY,
//  name VARCHAR(150),
//  contact VARCHAR(50),
//  property_type ENUM('House','Plot','Flat') DEFAULT 'House',
//  property_size VARCHAR(100),
//  flat_bhk INT,
//  property_location VARCHAR(200),
//  price_range VARCHAR(100)
//);
//
//-- Buyer
//CREATE TABLE IF NOT EXISTS buyer (
//  buyer_id INT AUTO_INCREMENT PRIMARY KEY,
//  name VARCHAR(150),
//  contact VARCHAR(50),
//  property_type ENUM('House','Plot','Flat') DEFAULT 'House',
//  preferred_size VARCHAR(100),
//  preferred_bhk INT,
//  interested_location VARCHAR(200),
//  price_range VARCHAR(100)
//);
//
//-- Property
//CREATE TABLE IF NOT EXISTS property (
//  property_id INT AUTO_INCREMENT PRIMARY KEY,
//  seller_id INT,
//  location VARCHAR(200),
//  type ENUM('House','Plot','Flat') DEFAULT 'House',
//  size VARCHAR(100),
//  bhk INT,
//  price DOUBLE,
//  status ENUM('Available','Sold') DEFAULT 'Available',
//  FOREIGN KEY (seller_id) REFERENCES seller(seller_id) ON DELETE SET NULL
//);
//
//-- Transaction
//CREATE TABLE IF NOT EXISTS transaction (
//  transaction_id INT AUTO_INCREMENT PRIMARY KEY,
//  seller_id INT,
//  buyer_id INT,
//  property_id INT,
//  price DOUBLE,
//  date DATE,
//  FOREIGN KEY (seller_id) REFERENCES seller(seller_id) ON DELETE SET NULL,
//  FOREIGN KEY (buyer_id) REFERENCES buyer(buyer_id) ON DELETE SET NULL,
//  FOREIGN KEY (property_id) REFERENCES property(property_id) ON DELETE SET NULL
//);
//
//-- History
//CREATE TABLE IF NOT EXISTS history (
//  history_id INT AUTO_INCREMENT PRIMARY KEY,
//  property_id INT,
//  old_owner INT,
//  new_owner INT,
//  date DATE,
//  price DOUBLE,
//  FOREIGN KEY (property_id) REFERENCES property(property_id) ON DELETE SET NULL,
//  FOREIGN KEY (old_owner) REFERENCES seller(seller_id) ON DELETE SET NULL,
//  FOREIGN KEY (new_owner) REFERENCES buyer(buyer_id) ON DELETE SET NULL
//);
//
//-- Sample data
//INSERT INTO seller(name,contact,property_type,property_size,flat_bhk,property_location,price_range) VALUES
//('Rajesh Sharma','9876543210','Plot','2500 sqft',NULL,'Indore','15-20 Lakh'),
//('Sunita Verma','8765432109','Flat',NULL,2,'Panchwati, Indore','35-40 Lakh')
//;
//
//INSERT INTO buyer(name,contact,property_type,preferred_size,preferred_bhk,interested_location,price_range) VALUES
//('Aman Gupta','9123456780','Flat',NULL,2,'Panchwati','30-45 Lakh'),
//('Neha Singh','9234567890','Plot','2000 sqft',NULL,'Indore','10-18 Lakh')
//;
//
//INSERT INTO property(seller_id,location,type,size,bhk,price,status) VALUES
//(1,'Vijay Nagar, Indore','Plot','2500 sqft',NULL,1700000,'Available'),
//(2,'Panchwati, Indore','Flat',NULL,2,3600000,'Available')
//;
//
//-- End of SQL
