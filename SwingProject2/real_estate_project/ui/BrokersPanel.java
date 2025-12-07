package SwingProject2.real_estate_project.ui;

import SwingProject2.real_estate_project.dao.BrokerDAO;
import SwingProject2.real_estate_project.model.Broker;
import SwingProject2.real_estate_project.util.ValidationUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class BrokersPanel extends JPanel {

  private final BrokerDAO dao = new BrokerDAO();
  private final DefaultTableModel model =
      new DefaultTableModel(
          new String[]{"ID","Name","Phone","Email","Commission %","Total Commission"},
          0
      );
  private final JTable table = new JTable(model);

  private final JTextField name = new JTextField();
  private final JTextField phone = new JTextField();
  private final JTextField email = new JTextField();
  private final JTextField rate = new JTextField("2.50");

  public BrokersPanel() {
    // Orange theme
    Color bg = new Color(255, 244, 229);
    Color header = new Color(255, 216, 177);

    setLayout(new BorderLayout(10,10));
    setBackground(bg);

    // Center text fields
    centerField(name);
    centerField(phone);
    centerField(email);
    centerField(rate);

    JPanel form = new JPanel(new GridLayout(2,4,8,8));
    form.setBackground(bg);
    form.add(new JLabel("Name"));
    form.add(name);
    form.add(new JLabel("Phone"));
    form.add(phone);
    form.add(new JLabel("Email"));
    form.add(email);
    form.add(new JLabel("Commission %"));
    form.add(rate);

    JPanel actions = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    actions.setBackground(bg);
    JButton save = new JButton("Save/Update");
    JButton delete = new JButton("Delete");
    actions.add(save);
    actions.add(delete);

    add(UI.titled("Broker Details", form), BorderLayout.NORTH);
    add(new JScrollPane(table), BorderLayout.CENTER);
    add(actions, BorderLayout.SOUTH);

    table.getTableHeader().setBackground(header);
    table.getTableHeader().setForeground(Color.DARK_GRAY);

    // Center cells
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    for (int i = 0; i < table.getColumnCount(); i++) {
      table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }

    load();

    table.getSelectionModel().addListSelectionListener(e -> {
      int r = table.getSelectedRow();
      if (r >= 0) {
        name.setText(String.valueOf(model.getValueAt(r,1)));
        phone.setText(String.valueOf(model.getValueAt(r,2)));
        email.setText(String.valueOf(model.getValueAt(r,3)));
        rate.setText(String.valueOf(model.getValueAt(r,4)));
      }
    });

    save.addActionListener(a -> {
      try {
        Broker b = new Broker();
        ValidationUtil.name(name.getText().trim());
        ValidationUtil.phone(phone.getText().trim());
        ValidationUtil.email(email.getText().trim());
        ValidationUtil.commission(rate.getText().trim());

        b.name = name.getText().trim();
        b.phone = phone.getText().trim();
        b.email = email.getText().trim();
        b.commissionRate = Double.parseDouble(rate.getText().trim());

        int r = table.getSelectedRow();
        if (r < 0) {
          dao.insert(b);
        } else {
          b.id = Integer.parseInt(model.getValueAt(r,0).toString());
          dao.update(b);
        }
        clear();
        load();
      } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(
            this, ex.getMessage(), "Validation",
            JOptionPane.WARNING_MESSAGE
        );
      }
    });

    delete.addActionListener(a -> {
      int r = table.getSelectedRow();
      if (r >= 0) {
        int id = Integer.parseInt(model.getValueAt(r,0).toString());
        dao.delete(id);
        clear();
        load();
      }
    });
  }

  private void centerField(JTextField f) {
    f.setHorizontalAlignment(JTextField.CENTER);
  }

  private void clear() {
    name.setText("");
    phone.setText("");
    email.setText("");
    rate.setText("2.50");
    table.clearSelection();
  }

  private void load() {
    model.setRowCount(0);
    for (Broker b : dao.listAll()) {
      model.addRow(new Object[]{
          b.id, b.name, b.phone, b.email,
          b.commissionRate,
          b.totalCommission   // auto-calculated from commissions table
      });
    }
  }
}
