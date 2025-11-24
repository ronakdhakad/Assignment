package SwingProject1.real_estate_project.ui;
import SwingProject1.real_estate_project.dao.BrokerDAO;
import SwingProject1.real_estate_project.model.Broker;
import SwingProject1.real_estate_project.util.ValidationUtil;
import javax.swing.*; import javax.swing.table.DefaultTableModel; import java.awt.*;

public class BrokersPanel extends JPanel {
  private final BrokerDAO dao=new BrokerDAO();
  private final DefaultTableModel model=new DefaultTableModel(new String[]{"ID","Name","Phone","Email","Commission %"},0);
  private final JTable table=new JTable(model);
  private final JTextField name=new JTextField(), phone=new JTextField(), email=new JTextField(), rate=new JTextField("2.50");

  public BrokersPanel(){
    setLayout(new BorderLayout(10,10));
    JPanel form=new JPanel(new GridLayout(2,5,8,8));
    form.add(new JLabel("Name")); form.add(name);
    form.add(new JLabel("Phone")); form.add(phone);
    form.add(new JLabel("Email")); form.add(email);
    form.add(new JLabel("Commission %")); form.add(rate);
    JButton save=new JButton("Save/Update"), delete=new JButton("Delete");
    form.add(save); form.add(delete);
    add(UI.titled("Broker Details", form), BorderLayout.NORTH);
    add(new JScrollPane(table), BorderLayout.CENTER);
    load();

    table.getSelectionModel().addListSelectionListener(e->{
      int r=table.getSelectedRow(); if(r>=0){
        name.setText(model.getValueAt(r,1).toString());
        phone.setText(model.getValueAt(r,2).toString());
        email.setText(model.getValueAt(r,3).toString());
        rate.setText(model.getValueAt(r,4).toString());
      }
    });

    save.addActionListener(a->{
      try{
        Broker b=new Broker();
        ValidationUtil.name(name.getText().trim());
        ValidationUtil.phone(phone.getText().trim());
        ValidationUtil.email(email.getText().trim());
        ValidationUtil.commission(rate.getText().trim());
        b.name=name.getText().trim(); b.phone=phone.getText().trim(); b.email=email.getText().trim(); b.commissionRate=Double.parseDouble(rate.getText().trim());
        int r=table.getSelectedRow();
        if(r<0) dao.insert(b); else { b.id=Integer.parseInt(model.getValueAt(r,0).toString()); dao.update(b); }
        clear(); load();
      } catch(IllegalArgumentException ex){ JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation", JOptionPane.WARNING_MESSAGE); }
    });

    delete.addActionListener(a->{
      int r=table.getSelectedRow(); if(r>=0){
        int id=Integer.parseInt(model.getValueAt(r,0).toString());
        dao.delete(id); clear(); load();
      }
    });
  }

  private void clear(){ name.setText(""); phone.setText(""); email.setText(""); rate.setText("2.50"); table.clearSelection(); }
  private void load(){ model.setRowCount(0); for(Broker b: dao.listAll()){ model.addRow(new Object[]{b.id,b.name,b.phone,b.email,b.commissionRate}); } }
}
