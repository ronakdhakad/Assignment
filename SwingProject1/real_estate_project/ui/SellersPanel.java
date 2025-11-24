package SwingProject1.real_estate_project.ui;
import SwingProject1.real_estate_project.dao.SellerDAO;
import SwingProject1.real_estate_project.model.Seller;
import SwingProject1.real_estate_project.util.ValidationUtil;
import javax.swing.*; import javax.swing.table.DefaultTableModel; import java.awt.*;

public class SellersPanel extends JPanel {
  private final SellerDAO dao=new SellerDAO();
  private final DefaultTableModel model=new DefaultTableModel(new String[]{"ID","Name","Email","Phone"},0);
  private final JTable table=new JTable(model);
  private final JTextField name=new JTextField(), email=new JTextField(), phone=new JTextField();

  public SellersPanel(){
    setLayout(new BorderLayout(10,10));
    JPanel form=new JPanel(new GridLayout(2,4,8,8));
    form.add(new JLabel("Name")); form.add(name);
    form.add(new JLabel("Email")); form.add(email);
    form.add(new JLabel("Phone")); form.add(phone);
    JButton save=new JButton("Save/Update"), delete=new JButton("Delete");
    form.add(save); form.add(delete);
    add(UI.titled("Seller Details", form), BorderLayout.NORTH);
    add(new JScrollPane(table), BorderLayout.CENTER);
    load();

    table.getSelectionModel().addListSelectionListener(e->{
      int r=table.getSelectedRow(); if(r>=0){
        name.setText(model.getValueAt(r,1).toString());
        email.setText(model.getValueAt(r,2).toString());
        phone.setText(model.getValueAt(r,3).toString());
      }
    });

    save.addActionListener(a->{
      try{
        Seller s=new Seller();
        ValidationUtil.name(name.getText().trim());
        ValidationUtil.email(email.getText().trim());
        ValidationUtil.phone(phone.getText().trim());
        s.name=name.getText().trim(); s.email=email.getText().trim(); s.phone=phone.getText().trim();
        int r=table.getSelectedRow();
        if(r<0) dao.insert(s); else { s.id=Integer.parseInt(model.getValueAt(r,0).toString()); dao.update(s); }
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

  private void clear(){ name.setText(""); email.setText(""); phone.setText(""); table.clearSelection(); }
  private void load(){ model.setRowCount(0); for(Seller s: dao.listAll()){ model.addRow(new Object[]{s.id,s.name,s.email,s.phone}); } }
}
