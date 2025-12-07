package SwingProject2.real_estate_project.ui;

import SwingProject2.real_estate_project.dao.BuyerDAO;
import SwingProject2.real_estate_project.model.Buyer;
import SwingProject2.real_estate_project.util.ValidationUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class BuyersPanel extends JPanel {

    private final BuyerDAO dao = new BuyerDAO();

    private final DefaultTableModel model =
            new DefaultTableModel(
                    new String[]{
                            "ID", "Name", "Email", "Phone",
                            "Preferred Location", "Requirements",
                            "Min Budget", "Max Budget"
                    },
                    0
            );
    private final JTable table = new JTable(model);

    private final JTextField name = new JTextField();
    private final JTextField email = new JTextField();
    private final JTextField phone = new JTextField();
    private final JTextField preferredLocation = new JTextField();
    private final JTextArea requirements = new JTextArea(3, 20);
    private final JTextField minBudget = new JTextField();
    private final JTextField maxBudget = new JTextField();

    public BuyersPanel() {
        // Theme colors
        Color bg = new Color(232, 246, 239);
        Color header = new Color(191, 230, 203);

        setLayout(new BorderLayout(10, 10));
        setBackground(bg);

        // Make text boxes smaller (width) & centered text
        name.setColumns(15);
        email.setColumns(15);
        phone.setColumns(15);
        preferredLocation.setColumns(15);
        minBudget.setColumns(10);
        maxBudget.setColumns(10);

        centerField(name);
        centerField(email);
        centerField(phone);
        centerField(preferredLocation);
        centerField(minBudget);
        centerField(maxBudget);

        // === Form Panel with labels directly in front of boxes ===
        JPanel form = new JPanel(new GridBagLayout());
        form.setBackground(bg);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);

        // Simple rows: label | field
        addRow(form, gbc, 0, "Name", name);
        addRow(form, gbc, 1, "Email", email);
        addRow(form, gbc, 2, "Phone", phone);
        addRow(form, gbc, 3, "Preferred Location", preferredLocation);

        // Budget row: Min & Max on the same line, small boxes
        gbc.gridy = 4;

        // Min label
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.LINE_END;
        form.add(new JLabel("Min Budget"), gbc);

        // Min field
        gbc.gridx = 1;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        form.add(minBudget, gbc);

        // Max label
        gbc.gridx = 2;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        form.add(new JLabel("Max Budget"), gbc);

        // Max field
        gbc.gridx = 3;
        gbc.weightx = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        form.add(maxBudget, gbc);

        // Requirements (multi-line, bigger area)
        gbc.gridy = 5;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        form.add(new JLabel("Requirements"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        requirements.setLineWrap(true);
        requirements.setWrapStyleWord(true);
        JScrollPane reqScroll = new JScrollPane(requirements);
        form.add(reqScroll, gbc);

        // Wrap form in a titled panel
        JPanel north = new JPanel(new BorderLayout());
        north.setBackground(bg);
        north.add(UI.titled("Buyer Details & Requirements", form), BorderLayout.CENTER);

        // Action buttons
        JPanel actions = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        actions.setBackground(bg);
        JButton save = new JButton("Save/Update");
        JButton delete = new JButton("Delete");
        actions.add(save);
        actions.add(delete);

        add(north, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(actions, BorderLayout.SOUTH);

        // Table header & cell alignment
        table.getTableHeader().setBackground(header);
        table.getTableHeader().setForeground(Color.DARK_GRAY);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        load();

        // When row selected → fill form
        table.getSelectionModel().addListSelectionListener(e -> {
            int r = table.getSelectedRow();
            if (r >= 0) {
                name.setText(String.valueOf(model.getValueAt(r, 1)));
                email.setText(String.valueOf(model.getValueAt(r, 2)));
                phone.setText(String.valueOf(model.getValueAt(r, 3)));
                preferredLocation.setText(String.valueOf(model.getValueAt(r, 4)));
                requirements.setText(String.valueOf(model.getValueAt(r, 5)));

                Object minVal = model.getValueAt(r, 6);
                Object maxVal = model.getValueAt(r, 7);
                minBudget.setText(minVal == null ? "" : minVal.toString());
                maxBudget.setText(maxVal == null ? "" : maxVal.toString());
            }
        });

        // Save / Update
        save.addActionListener(a -> {
            try {
                Buyer b = new Buyer();
                ValidationUtil.name(name.getText().trim());
                ValidationUtil.email(email.getText().trim());
                ValidationUtil.phone(phone.getText().trim());

                String minStr = minBudget.getText().trim();
                String maxStr = maxBudget.getText().trim();
                if (!minStr.isEmpty()) ValidationUtil.amount(minStr);
                if (!maxStr.isEmpty()) ValidationUtil.amount(maxStr);

                Double min = minStr.isEmpty() ? null : Double.parseDouble(minStr);
                Double max = maxStr.isEmpty() ? null : Double.parseDouble(maxStr);
                if (min != null && max != null && min > max) {
                    throw new IllegalArgumentException("Min budget cannot be greater than max budget.");
                }

                b.name = name.getText().trim();
                b.email = email.getText().trim();
                b.phone = phone.getText().trim();
                b.preferredLocation = preferredLocation.getText().trim();
                b.requirements = requirements.getText().trim();
                b.minBudget = min;
                b.maxBudget = max;

                int r = table.getSelectedRow();
                if (r < 0) {
                    dao.insert(b);
                } else {
                    b.id = Integer.parseInt(model.getValueAt(r, 0).toString());
                    dao.update(b);
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

        // Delete
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
        preferredLocation.setText("");
        requirements.setText("");
        minBudget.setText("");
        maxBudget.setText("");
        table.clearSelection();
    }

    private void load() {
        model.setRowCount(0);
        for (Buyer b : dao.listAll()) {
            model.addRow(new Object[]{
                    b.id,
                    b.name,
                    b.email,
                    b.phone,
                    b.preferredLocation,
                    b.requirements,
                    b.minBudget,
                    b.maxBudget
            });
        }
    }
}
