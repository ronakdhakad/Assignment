package SwingProject1.real_estate_project.dao;
import SwingProject1.real_estate_project.model.Broker;
import SwingProject1.real_estate_project.util.HistoryLogger;
import java.sql.*; import java.util.*;

public class BrokerDAO extends BaseDAO {
  public List<Broker> listAll(){
    List<Broker> out=new ArrayList<>();
    String sql="SELECT id,name,phone,email,commission_rate FROM brokers ORDER BY id DESC";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql);ResultSet rs=ps.executeQuery()){
      while(rs.next()){ Broker b=new Broker(); b.id=rs.getInt("id"); b.name=rs.getString("name"); b.phone=rs.getString("phone"); b.email=rs.getString("email"); b.commissionRate=rs.getDouble("commission_rate"); out.add(b); }
    } catch(Exception e){ throw new RuntimeException(e); }
    return out;
  }
  public int insert(Broker b){
    String sql="INSERT INTO brokers(name,phone,email,commission_rate) VALUES(?,?,?,?)";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
      ps.setString(1,b.name); ps.setString(2,b.phone); ps.setString(3,b.email); ps.setDouble(4,b.commissionRate); ps.executeUpdate();
      ResultSet k=ps.getGeneratedKeys(); if(k.next()){int id=k.getInt(1); HistoryLogger.log("brokers",id,"CREATE","Broker created: "+b.name); return id;}
      return -1;
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  public void update(Broker b){
    String sql="UPDATE brokers SET name=?, phone=?, email=?, commission_rate=? WHERE id=?";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      ps.setString(1,b.name); ps.setString(2,b.phone); ps.setString(3,b.email); ps.setDouble(4,b.commissionRate); ps.setInt(5,b.id); ps.executeUpdate();
      HistoryLogger.log("brokers",b.id,"UPDATE","Broker updated: "+b.name);
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  public void delete(int id){
    String sql="DELETE FROM brokers WHERE id=?";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      ps.setInt(1,id); ps.executeUpdate(); HistoryLogger.log("brokers",id,"DELETE","Broker deleted id="+id);
    } catch(Exception e){ throw new RuntimeException(e); }
  }
}
