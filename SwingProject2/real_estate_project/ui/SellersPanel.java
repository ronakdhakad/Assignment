package SwingProject2.real_estate_project.ui;

import SwingProject2.real_estate_project.dao.SellerDAO;
import SwingProject2.real_estate_project.model.Seller;
import SwingProject2.real_estate_project.util.ValidationUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class SellersPanel extends JPanel {

    private final SellerDAO dao = new SellerDAO();

    private final DefaultTableModel model =
            new DefaultTableModel(
                    new String[]{
                            "ID","Name","Email","Phone",
                            "Notes","Demand Min","Demand Max"
                    },
                    0
            );
    private final JTable table = new JTable(model);

    private final JTextField name = new JTextField();
    private final JTextField email = new JTextField();
    private final JTextField phone = new JTextField();
    private final JTextArea notes = new JTextArea(3, 20);
    private final JTextField demandMin = new JTextField();
    private final JTextField demandMax = new JTextField();

    public SellersPanel() {
        // Soft pink theme
        Color bg = new Color(252, 240, 246);
        Color header = new Color(241, 202, 224);

        setLayout(new BorderLayout(10, 10));
        setBackground(bg);

        // Make text boxes smaller & centered
        name.setColumns(15);
        email.setColumns(15);
        phone.setColumns(15);
        demandMin.setColumns(10);
        demandMax.setColumns(10);

        centerField(name);
        centerField(email);
        centerField(phone);
        centerField(demandMin);
        centerField(demandMax);

        // === Form Panel with clean alignment ===
        JPanel form = new JPanel(new GridBagLayout());
        form.setBackground(bg);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);

        addRow(form, gbc, 0, "Name", name);
        addRow(form, gbc, 1, "Email", email);
        addRow(form, gbc, 2, "Phone", phone);

        // Demand Min / Max row
        gbc.gridy = 3;

        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_END;
        form.add(new JLabel("Demand Min"), gbc);

        gbc.gridx = 1;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        form.add(demandMin, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        form.add(new JLabel("Demand Max"), gbc);

        gbc.gridx = 3;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        form.add(demandMax, gbc);

        // Notes (multi-line)
        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        form.add(new JLabel("Notes"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        notes.setLineWrap(true);
        notes.setWrapStyleWord(true);
        JScrollPane notesScroll = new JScrollPane(notes);
        form.add(notesScroll, gbc);

        JPanel north = new JPanel(new BorderLayout());
        north.setBackground(bg);
        north.add(UI.titled("Seller Details & Demand", form), BorderLayout.CENTER);

        JPanel actions = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        actions.setBackground(bg);
        JButton save = new JButton("Save/Update");
        JButton delete = new JButton("Delete");
        actions.add(save);
        actions.add(delete);

        add(north, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(actions, BorderLayout.SOUTH);

        table.getTableHeader().setBackground(header);
        table.getTableHeader().setForeground(Color.DARK_GRAY);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        load();

        table.getSelectionModel().addListSelectionListener(e -> {
            int r = table.getSelectedRow();
            if (r >= 0) {
                name.setText(String.valueOf(model.getValueAt(r, 1)));
                email.setText(String.valueOf(model.getValueAt(r, 2)));
                phone.setText(String.valueOf(model.getValueAt(r, 3)));
                notes.setText(String.valueOf(model.getValueAt(r, 4)));

                Object dmin = model.getValueAt(r, 5);
                Object dmax = model.getValueAt(r, 6);
                demandMin.setText(dmin == null ? "" : dmin.toString());
                demandMax.setText(dmax == null ? "" : dmax.toString());
            }
        });

        save.addActionListener(a -> {
            try {
                Seller s = new Seller();
                ValidationUtil.name(name.getText().trim());
                ValidationUtil.email(email.getText().trim());
                ValidationUtil.phone(phone.getText().trim());

                String dminStr = demandMin.getText().trim();
                String dmaxStr = demandMax.getText().trim();
                if (!dminStr.isEmpty()) ValidationUtil.amount(dminStr);
                if (!dmaxStr.isEmpty()) ValidationUtil.amount(dmaxStr);

                Double dmin = dminStr.isEmpty() ? null : Double.parseDouble(dminStr);
                Double dmax = dmaxStr.isEmpty() ? null : Double.parseDouble(dmaxStr);
                if (dmin != null && dmax != null && dmin > dmax) {
                    throw new IllegalArgumentException("Demand Min cannot be greater than Demand Max.");
                }

                s.name = name.getText().trim();
                s.email = email.getText().trim();
                s.phone = phone.getText().trim();
                s.notes = notes.getText().trim();
                s.demandMin = dmin;
                s.demandMax = dmax;

                int r = table.getSelectedRow();
                if (r < 0) {
                    dao.insert(s);
                } else {
                    s.id = Integer.parseInt(model.getValueAt(r, 0).toString());
                    dao.update(s);
                }
                clear();
                load();
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                        this, ex.getMessage(),
                        "Validation", JOptionPane.WARNING_MESSAGE
                );
            }
        });

        delete.addActionListener(a -> {
            int r = table.getSelectedRow();
            if (r >= 0) {
                int id = Integer.parseInt(model.getValueAt(r, 0).toString());
                dao.delete(id);
                clear();
                load();
            }
        });
    }

    private void addRow(JPanel panel, GridBagConstraints gbc, int row, String label, JComponent field) {
        // label
        gbc.gridy = row;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(new JLabel(label), gbc);

        // field (small text box)
        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(field, gbc);
    }

    private void centerField(JTextField f) {
        f.setHorizontalAlignment(JTextField.CENTER);
    }

    private void clear() {
        name.setText("");
        email.setText("");
        phone.setText("");
        notes.setText("");
        demandMin.setText("");
        demandMax.setText("");
        table.clearSelection();
    }

    private void load() {
        model.setRowCount(0);
        for (Seller s : dao.listAll()) {
            model.addRow(new Object[]{
                    s.id,
                    s.name,
                    s.email,
                    s.phone,
                    s.notes,
                    s.demandMin,
                    s.demandMax
            });
        }
    }
}
