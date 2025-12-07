package SwingProject2.real_estate_project;
import java.sql.*;

public class DBConnection {
  // TODO: set your own credentials
  private static final String URL = "jdbc:mysql://localhost:3306/realestate2?useSSL=false&serverTimezone=UTC";
  private static final String USER = "root";
  private static final String PASSWORD = "root@123";

  public static Connection getConnection() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      return DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (Exception e) {
      throw new RuntimeException("Database connection failed: " + e.getMessage(), e);
    }
  }
}
