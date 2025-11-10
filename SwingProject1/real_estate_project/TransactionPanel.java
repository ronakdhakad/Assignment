package SwingProject1.real_estate_project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class TransactionPanel extends JPanel {

    private JTextField propertyIdField, buyerIdField, sellerIdField, dateField, amountField;
    private JTable table;
    private DefaultTableModel model;

    public TransactionPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setBackground(Color.WHITE);

        JPanel formPanel = new JPanel(new GridLayout(2, 5, 10, 10));
        formPanel.setBorder(BorderFactory.createTitledBorder("Transaction Details"));

        formPanel.add(new JLabel("Property ID:"));
        propertyIdField = new JTextField();
        formPanel.add(propertyIdField);

        formPanel.add(new JLabel("Buyer ID:"));
        buyerIdField = new JTextField();
        formPanel.add(buyerIdField);

        formPanel.add(new JLabel("Seller ID:"));
        sellerIdField = new JTextField();
        formPanel.add(sellerIdField);

        formPanel.add(new JLabel("Date (YYYY-MM-DD):"));
        dateField = new JTextField();
        formPanel.add(dateField);

        formPanel.add(new JLabel("Amount:"));
        amountField = new JTextField();
        formPanel.add(amountField);

        JButton addBtn = new JButton("Add");
        JButton deleteBtn = new JButton("Delete");
        JButton refreshBtn = new JButton("Refresh");

        formPanel.add(addBtn);
        formPanel.add(deleteBtn);
        formPanel.add(refreshBtn);

        add(formPanel, BorderLayout.NORTH);

        model = new DefaultTableModel(new String[]{"ID", "PropertyID", "BuyerID", "SellerID", "Date", "Amount"}, 0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        loadTransactions();

        addBtn.addActionListener(e -> addTransaction());
        deleteBtn.addActionListener(e -> deleteTransaction());
        refreshBtn.addActionListener(e -> loadTransactions());
    }

    private void loadTransactions() {
        model.setRowCount(0);
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM transactions");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getInt("property_id"),
                        rs.getInt("buyer_id"),
                        rs.getInt("seller_id"),
                        rs.getDate("date"),
                        rs.getDouble("amount")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addTransaction() {
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO transactions (property_id, buyer_id, seller_id, date, amount) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, Integer.parseInt(propertyIdField.getText()));
            ps.setInt(2, Integer.parseInt(buyerIdField.getText()));
            ps.setInt(3, Integer.parseInt(sellerIdField.getText()));
            ps.setString(4, dateField.getText());
            ps.setDouble(5, Double.parseDouble(amountField.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Transaction added successfully!");
            loadTransactions();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void deleteTransaction() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Select a transaction to delete!");
            return;
        }
        int id = (int) model.getValueAt(row, 0);
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM transactions WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Transaction deleted successfully!");
            loadTransactions();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
