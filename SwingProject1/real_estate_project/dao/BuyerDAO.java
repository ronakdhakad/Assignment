package SwingProject1.real_estate_project.dao;
import SwingProject1.real_estate_project.model.Buyer;
import SwingProject1.real_estate_project.util.HistoryLogger;
import java.sql.*; import java.util.*;

public class BuyerDAO extends BaseDAO {
  public List<Buyer> listAll(){
    List<Buyer> out=new ArrayList<>();
    String sql="SELECT id,name,email,phone FROM buyers ORDER BY id DESC";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql);ResultSet rs=ps.executeQuery()){
      while(rs.next()){ Buyer b=new Buyer(); b.id=rs.getInt("id"); b.name=rs.getString("name"); b.email=rs.getString("email"); b.phone=rs.getString("phone"); out.add(b); }
    } catch(Exception e){ throw new RuntimeException(e); }
    return out;
  }
  public int insert(Buyer b){
    String sql="INSERT INTO buyers(name,email,phone) VALUES(?,?,?)";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
      ps.setString(1,b.name); ps.setString(2,b.email); ps.setString(3,b.phone); ps.executeUpdate();
      ResultSet k=ps.getGeneratedKeys(); if(k.next()){int id=k.getInt(1); HistoryLogger.log("buyers",id,"CREATE","Buyer created: "+b.name); return id;}
      return -1;
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  public void update(Buyer b){
    String sql="UPDATE buyers SET name=?, email=?, phone=? WHERE id=?";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      ps.setString(1,b.name); ps.setString(2,b.email); ps.setString(3,b.phone); ps.setInt(4,b.id); ps.executeUpdate();
      HistoryLogger.log("buyers",b.id,"UPDATE","Buyer updated: "+b.name);
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  public void delete(int id){
    String sql="DELETE FROM buyers WHERE id=?";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      ps.setInt(1,id); ps.executeUpdate(); HistoryLogger.log("buyers",id,"DELETE","Buyer deleted id="+id);
    } catch(Exception e){ throw new RuntimeException(e); }
  }
}
