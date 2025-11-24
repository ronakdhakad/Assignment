package SwingProject1.real_estate_project.ui;
import SwingProject1.real_estate_project.dao.PropertyDAO;
import SwingProject1.real_estate_project.model.Property;
import SwingProject1.real_estate_project.util.ValidationUtil;
import javax.swing.*; import javax.swing.table.DefaultTableModel; import java.awt.*; import java.util.List;

public class PropertiesPanel extends JPanel {
  private final PropertyDAO dao=new PropertyDAO();
  private final DefaultTableModel model=new DefaultTableModel(new String[]{"ID","Property No","Title","TypeId","Location","Price","SizeSqft","SellerId","Status"},0);
  private final JTable table=new JTable(model);
  private final JTextField propertyNo=new JTextField(), title=new JTextField(),
      location=new JTextField(), price=new JTextField(), sizeSqft=new JTextField(), sellerId=new JTextField(), search=new JTextField();
  private final JComboBox<String> type=new JComboBox<>(new String[]{"1:House","2:Plot","3:Flat","4:Villa"});
  private final JComboBox<String> status=new JComboBox<>(new String[]{"AVAILABLE","UNDER_OFFER","SOLD"});

  public PropertiesPanel(){
    setLayout(new BorderLayout(10,10));
    JPanel form=new JPanel(new GridLayout(3,4,8,8));
    form.add(new JLabel("Property No")); form.add(propertyNo);
    form.add(new JLabel("Title")); form.add(title);
    form.add(new JLabel("Type")); form.add(type);
    form.add(new JLabel("Location")); form.add(location);
    form.add(new JLabel("Price")); form.add(price);
    form.add(new JLabel("Size (sqft)")); form.add(sizeSqft);
    form.add(new JLabel("Seller ID")); form.add(sellerId);
    form.add(new JLabel("Status")); form.add(status);

    JPanel actions=new JPanel(new FlowLayout(FlowLayout.RIGHT));
    JButton save=new JButton("Save/Update"), delete=new JButton("Delete"); actions.add(save); actions.add(delete);

    JPanel north=new JPanel(new BorderLayout());
    north.add(UI.titled("Property Details", form), BorderLayout.CENTER);
    JPanel searchPanel=new JPanel(new BorderLayout(8,8));
    searchPanel.add(new JLabel("Search by name / number:"), BorderLayout.WEST);
    searchPanel.add(search, BorderLayout.CENTER);
    JButton go=new JButton("Go"); searchPanel.add(go, BorderLayout.EAST);
    north.add(searchPanel, BorderLayout.SOUTH);

    add(north, BorderLayout.NORTH);
    add(new JScrollPane(table), BorderLayout.CENTER);
    add(actions, BorderLayout.SOUTH);
    load();
    go.addActionListener(a->doSearch());

    table.getSelectionModel().addListSelectionListener(e->{
      int r=table.getSelectedRow(); if(r>=0){
        propertyNo.setText(model.getValueAt(r,1).toString());
        title.setText(model.getValueAt(r,2).toString());
        location.setText(model.getValueAt(r,4).toString());
        price.setText(model.getValueAt(r,5).toString());
        sizeSqft.setText(String.valueOf(model.getValueAt(r,6)));
        sellerId.setText(String.valueOf(model.getValueAt(r,7)));
        status.setSelectedItem(model.getValueAt(r,8).toString());
      }
    });

    save.addActionListener(a->{
      try{
        Property p=new Property();
        ValidationUtil.propertyNo(propertyNo.getText().trim());
        ValidationUtil.title(title.getText().trim());
        ValidationUtil.price(price.getText().trim());
        ValidationUtil.sizeSqft(sizeSqft.getText().trim());
        ValidationUtil.sellerId(sellerId.getText().trim());

        p.propertyNo=propertyNo.getText().trim();
        p.title=title.getText().trim();
        p.typeId=Integer.parseInt(type.getSelectedItem().toString().split(":")[0]);
        p.location=location.getText().trim();
        p.price=Double.parseDouble(price.getText().trim());
        String sizeStr=sizeSqft.getText().trim(); p.sizeSqft=sizeStr.isEmpty()? null : Integer.parseInt(sizeStr);
        String sellerStr=sellerId.getText().trim(); p.sellerId=sellerStr.isEmpty()? null : Integer.parseInt(sellerStr);
        p.status=status.getSelectedItem().toString();

        int r=table.getSelectedRow();
        if(r<0) dao.insert(p); else { p.id=Integer.parseInt(model.getValueAt(r,0).toString()); dao.update(p); }
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

  private void doSearch(){ String q=search.getText().trim(); model.setRowCount(0); List<Property> list=q.isEmpty()? dao.listAll():dao.search(q); for(Property p: list){ model.addRow(new Object[]{p.id,p.propertyNo,p.title,p.typeId,p.location,p.price,p.sizeSqft,p.sellerId,p.status}); } }
  private void clear(){ propertyNo.setText(""); title.setText(""); type.setSelectedIndex(0); location.setText(""); price.setText(""); sizeSqft.setText(""); sellerId.setText(""); status.setSelectedIndex(0); table.clearSelection(); }
  private void load(){ doSearch(); }
}
