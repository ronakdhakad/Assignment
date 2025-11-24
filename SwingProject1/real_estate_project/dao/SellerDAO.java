package SwingProject1.real_estate_project.dao;
import SwingProject1.real_estate_project.model.Seller;
import SwingProject1.real_estate_project.util.HistoryLogger;
import java.sql.*; import java.util.*;

public class SellerDAO extends BaseDAO {
  public List<Seller> listAll(){
    List<Seller> out=new ArrayList<>();
    String sql="SELECT id,name,email,phone FROM sellers ORDER BY id DESC";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql);ResultSet rs=ps.executeQuery()){
      while(rs.next()){ Seller s=new Seller(); s.id=rs.getInt("id"); s.name=rs.getString("name"); s.email=rs.getString("email"); s.phone=rs.getString("phone"); out.add(s); }
    } catch(Exception e){ throw new RuntimeException(e); }
    return out;
  }
  public int insert(Seller s){
    String sql="INSERT INTO sellers(name,email,phone) VALUES(?,?,?)";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
      ps.setString(1,s.name); ps.setString(2,s.email); ps.setString(3,s.phone); ps.executeUpdate();
      ResultSet k=ps.getGeneratedKeys(); if(k.next()){int id=k.getInt(1); HistoryLogger.log("sellers",id,"CREATE","Seller created: "+s.name); return id;}
      return -1;
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  public void update(Seller s){
    String sql="UPDATE sellers SET name=?, email=?, phone=? WHERE id=?";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      ps.setString(1,s.name); ps.setString(2,s.email); ps.setString(3,s.phone); ps.setInt(4,s.id); ps.executeUpdate();
      HistoryLogger.log("sellers",s.id,"UPDATE","Seller updated: "+s.name);
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  public void delete(int id){
    String sql="DELETE FROM sellers WHERE id=?";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      ps.setInt(1,id); ps.executeUpdate(); HistoryLogger.log("sellers",id,"DELETE","Seller deleted id="+id);
    } catch(Exception e){ throw new RuntimeException(e); }
  }
}
