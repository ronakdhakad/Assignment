package SwingProject1.real_estate_project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class HistoryPanel extends JPanel {

    private JTable table;
    private DefaultTableModel model;

    public HistoryPanel() {

        model = new DefaultTableModel(new String[]{"ID", "Action", "Action Date"}, 0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        loadHistory();
    }

    private void loadHistory() {
        model.setRowCount(0);
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM history ORDER BY action_date DESC");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("action"),
                        rs.getTimestamp("action_date")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}