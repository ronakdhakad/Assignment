package SwingProject2.real_estate_project.ui;
import javax.swing.*; import java.awt.*;
public class UI {
  public static JPanel titled(String t, JComponent inner){
    JPanel p=new JPanel(new BorderLayout());
    p.setBorder(BorderFactory.createTitledBorder(t)); p.add(inner, BorderLayout.CENTER); return p;
  }
}
