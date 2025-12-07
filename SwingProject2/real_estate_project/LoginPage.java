package SwingProject2.real_estate_project;

import SwingProject2.real_estate_project.util.ValidationUtil;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LoginPage extends JFrame {

    private final JTextField email = new JTextField();
    private final JPasswordField password = new JPasswordField();
    private final JButton login = new JButton("Login");

    public LoginPage() {
        super("Real Estate Login");

        // === WINDOW SIZE & CENTER ===
        setSize(550, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // === MAIN BACKGROUND PANEL ===
        JPanel bg = new JPanel(new GridBagLayout());
        bg.setBackground(new Color(210, 225, 255)); // light blue theme
        add(bg);

        // === INNER PANEL ===
        JPanel box = new JPanel(new GridBagLayout());
        box.setPreferredSize(new Dimension(380, 300));
        box.setBackground(new Color(255, 255, 255));
        box.setBorder(BorderFactory.createLineBorder(new Color(120, 150, 200), 2));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 12, 12, 12);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // === TITLE ===
        JLabel title = new JLabel("ADMIN LOGIN");
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        title.setForeground(new Color(50, 70, 120));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        box.add(title, gbc);

        // === EMAIL LABEL ===
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblEmail.setForeground(new Color(60, 60, 80));

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        box.add(lblEmail, gbc);

        // === EMAIL FIELD ===
        email.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        email.setPreferredSize(new Dimension(200, 30));
        email.setBorder(BorderFactory.createLineBorder(new Color(140, 170, 220), 2));

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        box.add(email, gbc);

        // === PASSWORD LABEL ===
        JLabel lblPass = new JLabel("Password:");
        lblPass.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblPass.setForeground(new Color(60, 60, 80));

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        box.add(lblPass, gbc);

        // === PASSWORD FIELD ===
        password.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        password.setPreferredSize(new Dimension(200, 30));
        password.setBorder(BorderFactory.createLineBorder(new Color(140, 170, 220), 2));

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        box.add(password, gbc);

        // === LOGIN BUTTON ===
        login.setBackground(new Color(70, 120, 200));
        login.setForeground(Color.WHITE);
        login.setFocusPainted(false);
        login.setFont(new Font("Segoe UI", Font.BOLD, 16));
        login.setPreferredSize(new Dimension(140, 38));
        login.setBorder(BorderFactory.createLineBorder(new Color(50, 80, 150), 2));

        // Hover Effect
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login.setBackground(new Color(90, 140, 220));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login.setBackground(new Color(70, 120, 200));
            }
        });

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        box.add(login, gbc);

        // Add inner panel to main background panel
        bg.add(box);

        // === LOGIN BUTTON LOGIC ===
        login.addActionListener(e -> doLogin());

        setVisible(true);
    }

    private void doLogin() {
        try {
            String em = email.getText().trim();
            String pw = new String(password.getPassword());

            ValidationUtil.email(em);
            ValidationUtil.passwordStrong(pw);

            String sql = "SELECT id FROM users WHERE email=? AND password_hash=?";

            try (Connection conn = DBConnection.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {

                ps.setString(1, em);
                ps.setString(2, pw);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    dispose();
                    new Dashboard().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Invalid email or password!",
                            "Login Failed",
                            JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Validation Warning",
                    JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Login Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginPage::new);
    }
}
