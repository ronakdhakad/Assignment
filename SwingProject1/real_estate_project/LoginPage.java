package SwingProject1.real_estate_project;
import SwingProject1.real_estate_project.util.ValidationUtil;
import javax.swing.*; import java.awt.*; import java.sql.*;

public class LoginPage extends JFrame {
  private final JTextField email=new JTextField();
  private final JPasswordField password=new JPasswordField();
  private final JButton login=new JButton("Login");

  public LoginPage(){
    super("Broker Login");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,240); setLocationRelativeTo(null);
    setLayout(new BorderLayout(10,10));
    JPanel form=new JPanel(new GridLayout(4,2,8,8));
    form.add(new JLabel("Email")); form.add(email);
    form.add(new JLabel("Password")); form.add(password);
    JLabel hint=new JLabel("<html><small>Password: 8+ chars, upper, lower, digit, special</small></html>");
    form.add(hint); form.add(new JLabel());
    form.add(new JLabel()); form.add(login);
    add(form, BorderLayout.CENTER);
    login.addActionListener(a -> doLogin());
  }

  private void doLogin(){
    try{
      String em=email.getText().trim();
      String pw=new String(password.getPassword());
      // Regex validation
      ValidationUtil.email(em);
      ValidationUtil.passwordStrong(pw);

      String sql="SELECT id FROM users WHERE email=? AND password_hash=?";
      try(Connection conn=DBConnection.getConnection(); PreparedStatement ps=conn.prepareStatement(sql)){
        ps.setString(1,em); ps.setString(2,pw);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){ dispose(); new Dashboard().setVisible(true);}
        else { JOptionPane.showMessageDialog(this,"Invalid credentials"); }
      }
    } catch(IllegalArgumentException ex){
      JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation", JOptionPane.WARNING_MESSAGE);
    } catch(Exception e){
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }

  public static void main(String[] args){ SwingUtilities.invokeLater(() -> new LoginPage().setVisible(true)); }
}
