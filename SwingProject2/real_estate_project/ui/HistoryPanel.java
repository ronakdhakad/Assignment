package SwingProject2.real_estate_project.ui;

import SwingProject2.real_estate_project.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class HistoryPanel extends JPanel {

  private final DefaultTableModel model =
      new DefaultTableModel(
          new String[]{"ID","Entity","EntityId","Action","Description","At"},
          0
      );
  private final JTable table = new JTable(model);

  public HistoryPanel() {
    // Blue-gray theme
    Color bg = new Color(236, 241, 248);
    Color header = new Color(205, 214, 232);

    setLayout(new BorderLayout(10,10));
    setBackground(bg);

    add(UI.titled("System History (Audit Log)", new JScrollPane(table)), BorderLayout.CENTER);

    table.getTableHeader().setBackground(header);
    table.getTableHeader().setForeground(Color.DARK_GRAY);

    load();
  }

  private void load() {
    model.setRowCount(0);
    String sql = "SELECT id, entity, entity_id, action, description, created_at FROM history ORDER BY id DESC";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

      while (rs.next()) {
        model.addRow(new Object[]{
            rs.getInt("id"),
            rs.getString("entity"),
            rs.getObject("entity_id"),
            rs.getString("action"),
            rs.getString("description"),
            rs.getTimestamp("created_at")
        });
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
