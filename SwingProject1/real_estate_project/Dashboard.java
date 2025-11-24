package SwingProject1.real_estate_project;
import SwingProject1.real_estate_project.ui.*;
import javax.swing.*; import java.awt.*;

public class Dashboard extends JFrame {
  public Dashboard(){
    super("Real Estate Property Management");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1100,700); setLocationRelativeTo(null);
    setLayout(new BorderLayout(10,10));
    JLabel title=new JLabel("Real Estate Property Management System", SwingConstants.CENTER);
    title.setFont(title.getFont().deriveFont(Font.BOLD,20f));
    add(title, BorderLayout.NORTH);
    JTabbedPane tabs=new JTabbedPane();
    tabs.addTab("Buyers", new BuyersPanel());
    tabs.addTab("Sellers", new SellersPanel());
    tabs.addTab("Properties", new PropertiesPanel());
    tabs.addTab("Brokers", new BrokersPanel());
    tabs.addTab("Transactions", new TransactionsPanel());
    tabs.addTab("History", new HistoryPanel());
    add(tabs, BorderLayout.CENTER);
  }
  public static void main(String[] args){ SwingUtilities.invokeLater(() -> new Dashboard().setVisible(true)); }
}
