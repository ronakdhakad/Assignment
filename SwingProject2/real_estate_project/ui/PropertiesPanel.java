package SwingProject2.real_estate_project.ui;

import SwingProject2.real_estate_project.dao.PropertyDAO;
import SwingProject2.real_estate_project.model.Property;
import SwingProject2.real_estate_project.util.ValidationUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.util.List;

public class PropertiesPanel extends JPanel {

  private final PropertyDAO dao = new PropertyDAO();

  // Added "Image" column at the end
  private final DefaultTableModel model =
      new DefaultTableModel(new String[]{
          "ID","Property No","Title","TypeId","Location",
          "Price","SizeSqft","SellerId","Status","Image"
      }, 0);

  private final JTable table = new JTable(model);

  private final JTextField propertyNo = new JTextField();
  private final JTextField title = new JTextField();
  private final JComboBox<String> type =
      new JComboBox<>(new String[]{"1:House","2:Plot","3:Flat","4:Villa"});

  private final JTextField location = new JTextField();
  private final JTextField price = new JTextField();
  private final JTextField sizeSqft = new JTextField();
  private final JTextField sellerId = new JTextField();
  private final JComboBox<String> status =
      new JComboBox<>(new String[]{"AVAILABLE","UNDER_OFFER","SOLD"});

  private final JTextField search = new JTextField();

  // Image support
  private final JLabel imagePreview =
      new JLabel("No Image", SwingConstants.CENTER);
  private String currentImagePath = null;

  public PropertiesPanel() {
    // Soft background color for this panel
    Color bg = new Color(240, 247, 255);
    setLayout(new BorderLayout(10, 10));
    setBackground(bg);

    // === FORM AREA ===
    JPanel form = new JPanel(new GridLayout(3, 4, 8, 8));
    form.setBackground(bg);

    form.add(new JLabel("Property No"));
    form.add(propertyNo);

    form.add(new JLabel("Title"));
    form.add(title);

    form.add(new JLabel("Type"));
    form.add(type);

    form.add(new JLabel("Location"));
    form.add(location);

    form.add(new JLabel("Price"));
    form.add(price);

    form.add(new JLabel("Size (sqft)"));
    form.add(sizeSqft);

    form.add(new JLabel("Seller ID"));
    form.add(sellerId);

    form.add(new JLabel("Status"));
    form.add(status);

    // === IMAGE AREA ===
    JButton chooseImage = new JButton("Choose Image...");
    JPanel imagePanel = new JPanel(new BorderLayout(5, 5));
    imagePanel.setBackground(bg);

    imagePreview.setPreferredSize(new Dimension(180, 130));
    imagePreview.setBorder(
        BorderFactory.createLineBorder(new Color(170, 190, 220))
    );

    imagePanel.add(imagePreview, BorderLayout.CENTER);
    imagePanel.add(chooseImage, BorderLayout.SOUTH);

    // Wrap form + image side by side
    JPanel top = new JPanel(new BorderLayout(10, 0));
    top.setBackground(bg);
    top.add(form, BorderLayout.CENTER);
    top.add(imagePanel, BorderLayout.EAST);

    // === ACTIONS ===
    JPanel actions = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    actions.setBackground(bg);
    JButton save = new JButton("Save/Update");
    JButton delete = new JButton("Delete");
    actions.add(save);
    actions.add(delete);

    // === SEARCH AREA ===
    JPanel searchPanel = new JPanel(new BorderLayout(8, 8));
    searchPanel.setBackground(bg);
    searchPanel.add(new JLabel("Search by name / number:"), BorderLayout.WEST);
    searchPanel.add(search, BorderLayout.CENTER);
    JButton go = new JButton("Go");
    searchPanel.add(go, BorderLayout.EAST);

    JPanel north = new JPanel(new BorderLayout());
    north.setBackground(bg);
    north.add(UI.titled("Property Details", top), BorderLayout.CENTER);
    north.add(searchPanel, BorderLayout.SOUTH);

    add(north, BorderLayout.NORTH);
    add(new JScrollPane(table), BorderLayout.CENTER);
    add(actions, BorderLayout.SOUTH);

    // Style table header a bit
    table.getTableHeader().setBackground(new Color(210, 225, 245));
    table.getTableHeader().setForeground(Color.DARK_GRAY);

    // === LISTENERS ===

    // Choose image button
    chooseImage.addActionListener(e -> {
      JFileChooser chooser = new JFileChooser();
      if (currentImagePath != null) {
        chooser.setSelectedFile(new File(currentImagePath));
      }
      int result = chooser.showOpenDialog(PropertiesPanel.this);
      if (result == JFileChooser.APPROVE_OPTION) {
        File file = chooser.getSelectedFile();
        currentImagePath = file.getAbsolutePath();
        updateImagePreview();
      }
    });

    // Search
    go.addActionListener(a -> doSearch());

    // Click row to edit
    table.getSelectionModel().addListSelectionListener(e -> {
      int r = table.getSelectedRow();
      if (r >= 0) {
        propertyNo.setText(String.valueOf(model.getValueAt(r, 1)));
        title.setText(String.valueOf(model.getValueAt(r, 2)));
        location.setText(String.valueOf(model.getValueAt(r, 4)));
        price.setText(String.valueOf(model.getValueAt(r, 5)));
        sizeSqft.setText(String.valueOf(model.getValueAt(r, 6)));
        sellerId.setText(String.valueOf(model.getValueAt(r, 7)));
        status.setSelectedItem(String.valueOf(model.getValueAt(r, 8)));

        Object imgVal = model.getValueAt(r, 9);
        currentImagePath = (imgVal == null) ? null : imgVal.toString();
        updateImagePreview();
      }
    });

    // Save / Update
    save.addActionListener(a -> {
      try {
        int r = table.getSelectedRow();
        Property p = new Property();

        // Validate inputs
        ValidationUtil.propertyNo(propertyNo.getText().trim());
        ValidationUtil.title(title.getText().trim());
        ValidationUtil.price(price.getText().trim());
        ValidationUtil.sizeSqft(sizeSqft.getText().trim());
        ValidationUtil.sellerId(sellerId.getText().trim());

        // Copy to object
        p.propertyNo = propertyNo.getText().trim();
        p.title = title.getText().trim();
        p.typeId = Integer.parseInt(
            type.getSelectedItem().toString().split(":")[0]
        );
        p.location = location.getText().trim();
        p.price = Double.parseDouble(price.getText().trim());

        String sizeStr = sizeSqft.getText().trim();
        p.sizeSqft = sizeStr.isEmpty() ? null : Integer.parseInt(sizeStr);

        String sellerStr = sellerId.getText().trim();
        p.sellerId = sellerStr.isEmpty() ? null : Integer.parseInt(sellerStr);

        p.status = status.getSelectedItem().toString();

        // NEW: imagePath
        p.imagePath = currentImagePath;

        if (r < 0) {
          dao.insert(p);
        } else {
          p.id = Integer.parseInt(model.getValueAt(r, 0).toString());
          dao.update(p);
        }
        clear();
        load();
      } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(
            this, ex.getMessage(), "Validation",
            JOptionPane.WARNING_MESSAGE
        );
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(
            this, ex.getMessage(), "Error",
            JOptionPane.ERROR_MESSAGE
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

    // Load data initially
    load();
  }

  private void updateImagePreview() {
    if (currentImagePath == null || currentImagePath.isEmpty()) {
      imagePreview.setIcon(null);
      imagePreview.setText("No Image");
      return;
    }
    File f = new File(currentImagePath);
    if (!f.exists()) {
      imagePreview.setIcon(null);
      imagePreview.setText("Image not found");
      return;
    }
    ImageIcon icon = new ImageIcon(currentImagePath);
    Image img = icon.getImage().getScaledInstance(
        imagePreview.getWidth() > 0 ? imagePreview.getWidth() : 180,
        imagePreview.getHeight() > 0 ? imagePreview.getHeight() : 130,
        Image.SCALE_SMOOTH
    );
    imagePreview.setText(null);
    imagePreview.setIcon(new ImageIcon(img));
  }

  private void doSearch() {
    String q = search.getText().trim();
    model.setRowCount(0);
    List<Property> list = q.isEmpty() ? dao.listAll() : dao.search(q);
    for (Property p : list) {
      model.addRow(new Object[]{
          p.id,
          p.propertyNo,
          p.title,
          p.typeId,
          p.location,
          p.price,
          p.sizeSqft,
          p.sellerId,
          p.status,
          p.imagePath   // show path in table (for debugging)
      });
    }
  }

  private void clear() {
    propertyNo.setText("");
    title.setText("");
    type.setSelectedIndex(0);
    location.setText("");
    price.setText("");
    sizeSqft.setText("");
    sellerId.setText("");
    status.setSelectedIndex(0);
    table.clearSelection();
    currentImagePath = null;
    updateImagePreview();
  }

  private void load() {
    doSearch();
  }
}
