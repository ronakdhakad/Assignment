package SwingProject2.real_estate_project.util;
import SwingProject2.real_estate_project.DBConnection;
import java.sql.*;

public class HistoryLogger {
  public static void log(String entity, Integer entityId, String action, String description){
    String sql="INSERT INTO history(entity, entity_id, action, description) VALUES(?,?,?,?)";
    try(Connection conn=DBConnection.getConnection(); PreparedStatement ps=conn.prepareStatement(sql)){
      ps.setString(1, entity);
      if(entityId==null) ps.setNull(2, java.sql.Types.INTEGER); else ps.setInt(2, entityId);
      ps.setString(3, action);
      ps.setString(4, description);
      ps.executeUpdate();
    } catch(Exception e){ System.err.println("History log failed: "+e.getMessage()); }
  }
}
