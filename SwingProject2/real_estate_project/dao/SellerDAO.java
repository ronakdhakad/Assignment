package SwingProject2.real_estate_project.dao;

import SwingProject2.real_estate_project.model.Seller;
import SwingProject2.real_estate_project.util.HistoryLogger;

import java.sql.*;
import java.util.*;

public class SellerDAO extends BaseDAO {

  public List<Seller> listAll() {
    List<Seller> out = new ArrayList<>();
    String sql =
        "SELECT id,name,email,phone,notes,demand_min,demand_max " +
        "FROM sellers ORDER BY id DESC";

    try (Connection c = getConn();
         PreparedStatement ps = c.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

      while (rs.next()) {
        Seller s = new Seller();
        s.id = rs.getInt("id");
        s.name = rs.getString("name");
        s.email = rs.getString("email");
        s.phone = rs.getString("phone");
        s.notes = rs.getString("notes");

        double dmin = rs.getDouble("demand_min");
        s.demandMin = rs.wasNull() ? null : dmin;

        double dmax = rs.getDouble("demand_max");
        s.demandMax = rs.wasNull() ? null : dmax;

        out.add(s);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return out;
  }

  public int insert(Seller s) {
    String sql =
        "INSERT INTO sellers(name,email,phone,notes,demand_min,demand_max) " +
        "VALUES(?,?,?,?,?,?)";

    try (Connection c = getConn();
         PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

      ps.setString(1, s.name);
      ps.setString(2, s.email);
      ps.setString(3, s.phone);
      ps.setString(4, s.notes);

      if (s.demandMin == null) ps.setNull(5, Types.DECIMAL);
      else ps.setDouble(5, s.demandMin);

      if (s.demandMax == null) ps.setNull(6, Types.DECIMAL);
      else ps.setDouble(6, s.demandMax);

      ps.executeUpdate();

      try (ResultSet k = ps.getGeneratedKeys()) {
        if (k.next()) {
          int id = k.getInt(1);
          HistoryLogger.log("sellers", id, "CREATE", "Seller created: " + s.name);
          return id;
        }
      }
      return -1;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void update(Seller s) {
    String sql =
        "UPDATE sellers SET name=?, email=?, phone=?, notes=?, demand_min=?, demand_max=? WHERE id=?";

    try (Connection c = getConn();
         PreparedStatement ps = c.prepareStatement(sql)) {

      ps.setString(1, s.name);
      ps.setString(2, s.email);
      ps.setString(3, s.phone);
      ps.setString(4, s.notes);

      if (s.demandMin == null) ps.setNull(5, Types.DECIMAL);
      else ps.setDouble(5, s.demandMin);

      if (s.demandMax == null) ps.setNull(6, Types.DECIMAL);
      else ps.setDouble(6, s.demandMax);

      ps.setInt(7, s.id);

      ps.executeUpdate();
      HistoryLogger.log("sellers", s.id, "UPDATE", "Seller updated: " + s.name);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public void delete(int id) {
    String sql = "DELETE FROM sellers WHERE id=?";
    try (Connection c = getConn();
         PreparedStatement ps = c.prepareStatement(sql)) {

      ps.setInt(1, id);
      ps.executeUpdate();
      HistoryLogger.log("sellers", id, "DELETE", "Seller deleted id=" + id);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
