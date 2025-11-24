package SwingProject1.real_estate_project.ui;
import SwingProject1.real_estate_project.dao.*; import SwingProject1.real_estate_project.model.*;
import SwingProject1.real_estate_project.util.HistoryLogger; import SwingProject1.real_estate_project.util.ValidationUtil;
import javax.swing.*; import javax.swing.table.DefaultTableModel; import java.awt.*; import java.text.SimpleDateFormat; import java.util.Date;

public class TransactionsPanel extends JPanel {
  private final TransactionDAO txnDAO=new TransactionDAO();
  private final PropertyDAO propertyDAO=new PropertyDAO();
  private final BuyerDAO buyerDAO=new BuyerDAO();
  private final SellerDAO sellerDAO=new SellerDAO();
  private final BrokerDAO brokerDAO=new BrokerDAO();

  private final DefaultTableModel model=new DefaultTableModel(new String[]{"ID","PropertyId","BuyerId","SellerId","BrokerId","Date","Amount","Method","Notes"},0);
  private final JTable table=new JTable(model);
  private final JComboBox<String> property=new JComboBox<>(), buyer=new JComboBox<>(), seller=new JComboBox<>(), broker=new JComboBox<>();
  private final JTextField date=new JTextField(new SimpleDateFormat("yyyy-MM-dd").format(new Date())), amount=new JTextField(), notes=new JTextField();
  private final JComboBox<String> method=new JComboBox<>(new String[]{"CASH","TRANSFER","CHEQUE","FINANCE"});

  public TransactionsPanel(){
    setLayout(new BorderLayout(10,10));
    JPanel form=new JPanel(new GridLayout(3,4,8,8));
    form.add(new JLabel("Property")); form.add(property);
    form.add(new JLabel("Buyer")); form.add(buyer);
    form.add(new JLabel("Seller")); form.add(seller);
    form.add(new JLabel("Broker")); form.add(broker);
    form.add(new JLabel("Date (yyyy-MM-dd)")); form.add(date);
    form.add(new JLabel("Amount")); form.add(amount);
    form.add(new JLabel("Method")); form.add(method);
    form.add(new JLabel("Notes")); form.add(notes);

    JButton save=new JButton("Create Transaction");
    JPanel south=new JPanel(new FlowLayout(FlowLayout.RIGHT)); south.add(save);
    add(UI.titled("Transaction Details", form), BorderLayout.NORTH);
    add(new JScrollPane(table), BorderLayout.CENTER);
    add(south, BorderLayout.SOUTH);

    reloadCombos();
    load();

    save.addActionListener(a->{
      try{
        ValidationUtil.date(date.getText().trim());
        ValidationUtil.amount(amount.getText().trim());

        Transaction t=new Transaction();
        t.propertyId=parseComboId(property); t.buyerId=parseComboId(buyer); t.sellerId=parseComboId(seller);
        Integer broId=parseComboIdNullable(broker); t.brokerId=broId;
        t.txnDate=new SimpleDateFormat("yyyy-MM-dd").parse(date.getText().trim());
        t.amount=Double.parseDouble(amount.getText().trim());
        t.paymentMethod=method.getSelectedItem().toString();
        t.notes=notes.getText().trim();

        double rate=0.0;
        if(broId!=null){ for(Broker b: brokerDAO.listAll()){ if(b.id.equals(broId)){ rate=b.commissionRate; break; } } }

        txnDAO.insert(t, rate);
        HistoryLogger.log("transactions", null, "TRANSACT", "Transaction created via UI");
        clear(); load();
      } catch(IllegalArgumentException ex){ JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation", JOptionPane.WARNING_MESSAGE);
      } catch(Exception ex){ JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); }
    });
  }

  private Integer parseComboId(JComboBox<String> cb){ String s=cb.getSelectedItem().toString(); return Integer.parseInt(s.substring(0,s.indexOf(':'))); }
  private Integer parseComboIdNullable(JComboBox<String> cb){ if(cb.getSelectedItem()==null) return null; String s=cb.getSelectedItem().toString(); if(!s.contains(":")) return null; return Integer.parseInt(s.substring(0,s.indexOf(':'))); }
  private void clear(){ amount.setText(""); notes.setText(""); method.setSelectedIndex(0); table.clearSelection(); }
  private void reloadCombos(){
    property.removeAllItems(); for(Property p: propertyDAO.listAll()){ property.addItem(p.id+":"+p.propertyNo+" ("+p.status+")"); }
    buyer.removeAllItems(); for(Buyer b: buyerDAO.listAll()){ buyer.addItem(b.id+":"+b.name); }
    seller.removeAllItems(); for(Seller s: sellerDAO.listAll()){ seller.addItem(s.id+":"+s.name); }
    broker.removeAllItems(); for(Broker br: brokerDAO.listAll()){ broker.addItem(br.id+":"+br.name+" ("+br.commissionRate+"%)"); }
  }
  private void load(){ model.setRowCount(0); for(Transaction t: txnDAO.listAll()){ String dt=new SimpleDateFormat("yyyy-MM-dd").format(t.txnDate); model.addRow(new Object[]{t.id,t.propertyId,t.buyerId,t.sellerId,t.brokerId,dt,t.amount,t.paymentMethod,t.notes}); } }
}
