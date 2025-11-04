
package SwingProject1.real_estate_project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main2 {
    JFrame frame;
    CardLayout cardLayout;
    JPanel mainPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main2::new);
    }

    public Main2() {
        frame = new JFrame("Simple Real Estate Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add pages
        mainPanel.add(dashboardPanel(), "Dashboard");
        mainPanel.add(sellerPanel(), "Sellers");
        mainPanel.add(buyerPanel(), "Buyers");
        mainPanel.add(propertyPanel(), "Properties");

        // Left side navigation
        JPanel side = new JPanel();
        side.setLayout(new GridLayout(5, 1, 10, 10));
        side.setBackground(new Color(44, 62, 80));
        side.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        String[] btnNames = {"Dashboard", "Sellers", "Buyers", "Properties"};
        for (String name : btnNames) {
            JButton btn = new JButton(name);
            btn.setBackground(new Color(236, 240, 241));
            btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
            btn.addActionListener(e -> cardLayout.show(mainPanel, name));
            side.add(btn);
        }

        frame.setLayout(new BorderLayout());
        frame.add(side, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private JPanel dashboardPanel() {
        JPanel p = new JPanel();
        p.setBackground(new Color(52, 152, 219));
        p.setLayout(new BorderLayout());
        JLabel label = new JLabel("🏡 Welcome to Real Estate Management", SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, 22));
        label.setForeground(Color.WHITE);
        p.add(label, BorderLayout.CENTER);
        return p;
    }

    private JPanel sellerPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBackground(new Color(230, 240, 250));
        JLabel title = new JLabel("👤 Seller Management", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        p.add(title, BorderLayout.NORTH);

        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JButton addBtn = new JButton("Add Seller");
        JTextArea output = new JTextArea();
        output.setEditable(false);

        addBtn.addActionListener(e -> {
            String s = "Seller: " + name.getText() + " | Phone: " + phone.getText();
            output.append(s + "\n");
            name.setText("");
            phone.setText("");
        });

        JPanel form = new JPanel(new GridLayout(3, 2, 10, 10));
        form.add(new JLabel("Name:")); form.add(name);
        form.add(new JLabel("Phone:")); form.add(phone);
        form.add(new JLabel()); form.add(addBtn);

        p.add(form, BorderLayout.CENTER);
        p.add(new JScrollPane(output), BorderLayout.SOUTH);
        return p;
    }

    private JPanel buyerPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBackground(new Color(241, 196, 15));
        JLabel title = new JLabel("🧍 Buyer Management", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        p.add(title, BorderLayout.NORTH);

        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JButton addBtn = new JButton("Add Buyer");
        JTextArea output = new JTextArea();
        output.setEditable(false);

        addBtn.addActionListener(e -> {
            String b = "Buyer: " + name.getText() + " | Phone: " + phone.getText();
            output.append(b + "\n");
            name.setText("");
            phone.setText("");
        });

        JPanel form = new JPanel(new GridLayout(3, 2, 10, 10));
        form.add(new JLabel("Name:")); form.add(name);
        form.add(new JLabel("Phone:")); form.add(phone);
        form.add(new JLabel()); form.add(addBtn);

        p.add(form, BorderLayout.CENTER);
        p.add(new JScrollPane(output), BorderLayout.SOUTH);
        return p;
    }

    private JPanel propertyPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setBackground(new Color(155, 89, 182));
        JLabel title = new JLabel("🏘 Property Management", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 18));
        title.setForeground(Color.WHITE);
        p.add(title, BorderLayout.NORTH);

        JTextField name = new JTextField();
        JTextField price = new JTextField();
        JButton addBtn = new JButton("Add Property");
        JTextArea output = new JTextArea();
        output.setEditable(false);

        addBtn.addActionListener(e -> {
            String prop = "Property: " + name.getText() + " | Price: " + price.getText();
            output.append(prop + "\n");
            name.setText("");
            price.setText("");
        });

        JPanel form = new JPanel(new GridLayout(3, 2, 10, 10));
        form.setBackground(new Color(200, 180, 230));
        form.add(new JLabel("Property Name:")); form.add(name);
        form.add(new JLabel("Price:")); form.add(price);
        form.add(new JLabel()); form.add(addBtn);

        p.add(form, BorderLayout.CENTER);
        p.add(new JScrollPane(output), BorderLayout.SOUTH);
        return p;
    }
}
