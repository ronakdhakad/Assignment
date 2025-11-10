
package SwingProject1.real_estate_project;
import javax.swing.*;
import java.sql.*;

public class LoginPage extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton, clearButton;
    private JLabel messageLabel;

    public LoginPage() {
        setTitle("Broker Login - Real Estate System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocation(200,150);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));

     
        JLabel title = new JLabel("Broker Login", SwingConstants.CENTER);
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(50);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(50);

        loginButton = new JButton("Login");
        clearButton = new JButton("Clear");
        
        loginButton.addActionListener(e -> login());
        clearButton.addActionListener(e -> {
            emailField.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        });

        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setAlignmentX(CENTER_ALIGNMENT);

        panel.add(title);
        panel.add(Box.createVerticalStrut(25));
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(Box.createVerticalStrut(25));
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(Box.createVerticalStrut(50));
        panel.add(loginButton);
        panel.add(Box.createVerticalStrut(25));
        panel.add(clearButton);
        panel.add(Box.createVerticalStrut(25));
        panel.add(messageLabel);

        add(panel);
        setVisible(true);
    }

    private void login() {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                PreparedStatement ps = conn.prepareStatement(
                        "SELECT * FROM broker_login WHERE email=? AND password=?");
                ps.setString(1, email);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    messageLabel.setText("Login Successful!");
                    new Dashboard();
                } else {
                    messageLabel.setText("Invalid Email or Password!");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}
