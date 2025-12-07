package SwingProject2.real_estate_project.dao;

import SwingProject2.real_estate_project.model.Buyer;
import SwingProject2.real_estate_project.util.HistoryLogger;

import java.sql.*;
import java.util.*;

public class BuyerDAO extends BaseDAO {

  public List<Buyer> listAll() {
    List<Buyer> out = new ArrayList<>();
    String sql =
        "SELECT id,name,email,phone,preferred_location,requirements," +
        "       min_budget,max_budget " +
        "FROM buyers ORDER BY id DESC";

    try (Connection c = getConn();
         PreparedStatement ps = c.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

      while (rs.next()) {
        Buyer b = new Buyer();
        b.id = rs.getInt("id");
        b.name = rs.getString("name");
        b.email = rs.getString("email");
        b.phone = rs.getString("phone");
        b.preferredLocation = rs.getString("preferred_location");
        b.requirements = rs.getString("requirements");

        double minB = rs.getDouble("min_budget");
        b.minBudget = rs.wasNull() ? null : minB;

        double maxB = rs.getDouble("max_budget");
        b.maxBudget = rs.wasNull() ? null : maxB;

        out.add(b);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return out;
  }

  public int insert(Buyer b) {
    String sql =
        "INSERT INTO buyers(name,email,phone,preferred_location,requirements,min_budget,max_budget) " +
        "VALUES(?,?,?,?,?,?,?)";

    try (Connection c = getConn();
         PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

      ps.setString(1, b.name);
      ps.setString(2, b.email);
      ps.setString(3, b.phone);
      ps.setString(4, b.preferredLocation);
      ps.setString(5, b.requirements);

      if (b.minBudget == null) ps.setNull(6, Types.DECIMAL);
      else ps.setDouble(6, b.minBudget);

      if (b.maxBudget == null) ps.setNull(7, Types.DECIMAL);
      else ps.setDouble(7, b.maxBudget);

      ps.executeUpdate();

      try (ResultSet k = ps.getGeneratedKeys()) {
        if (k.next()) {
          int id = k.getInt(1);
          HistoryLogger.log("buyers", id, "CREATE", "Buyer created: " + b.name);
          return id;
        }
      }
      return -1;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void update(Buyer b) {
    String sql =
        "UPDATE buyers SET name=?, email=?, phone=?, preferred_location=?, " +
        "requirements=?, min_budget=?, max_budget=? WHERE id=?";

    try (Connection c = getConn();
         PreparedStatement ps = c.prepareStatement(sql)) {

      ps.setString(1, b.name);
      ps.setString(2, b.email);
      ps.setString(3, b.phone);
      ps.setString(4, b.preferredLocation);
      ps.setString(5, b.requirements);

      if (b.minBudget == null) ps.setNull(6, Types.DECIMAL);
      else ps.setDouble(6, b.minBudget);

      if (b.maxBudget == null) ps.setNull(7, Types.DECIMAL);
      else ps.setDouble(7, b.maxBudget);

      ps.setInt(8, b.id);

      ps.executeUpdate();
      HistoryLogger.log("buyers", b.id, "UPDATE", "Buyer updated: " + b.name);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void delete(int id) {
    String sql = "DELETE FROM buyers WHERE id=?";
    try (Connection c = getConn();
         PreparedStatement ps = c.prepareStatement(sql)) {

      ps.setInt(1, id);
      ps.executeUpdate();
      HistoryLogger.log("buyers", id, "DELETE", "Buyer deleted id=" + id);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
