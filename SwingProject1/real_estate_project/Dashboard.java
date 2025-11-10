package SwingProject1.real_estate_project;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    private JPanel contentPanel;

    public Dashboard() {
        setTitle("Real Estate Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        JLabel title = new JLabel("Real Estate Management System", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);

        JPanel sidebar = new JPanel();
        sidebar.setLayout(new GridLayout(5, 1, 10, 10));
        sidebar.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        JButton sellerBtn = new JButton("Sellers");
        JButton buyerBtn = new JButton("Buyers");
        JButton propertyBtn = new JButton("Properties");
        JButton transactionBtn = new JButton("Transactions");
        JButton historyBtn = new JButton("History");
        JButton logoutBtn = new JButton("Logout");

        sidebar.add(sellerBtn);
        sidebar.add(buyerBtn);
        sidebar.add(propertyBtn);
        sidebar.add(transactionBtn);
        sidebar.add(historyBtn);
        sidebar.add(logoutBtn);

        add(sidebar, BorderLayout.WEST);
        contentPanel = new JPanel(new BorderLayout());
        add(contentPanel, BorderLayout.CENTER);

 
       sellerBtn.addActionListener(e -> showPanel(new SellerPanel()));
        buyerBtn.addActionListener(e -> showPanel(new BuyerPanel()));
        propertyBtn.addActionListener(e -> showPanel(new PropertyPanel()));
        transactionBtn.addActionListener(e -> showPanel(new TransactionPanel()));
        historyBtn.addActionListener(e -> showPanel(new HistoryPanel()));
        logoutBtn.addActionListener(e -> {
            dispose();
            new LoginPage();
        });

        setVisible(true);
    }
    private void showPanel(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}
