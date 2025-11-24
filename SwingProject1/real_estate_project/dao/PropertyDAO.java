package SwingProject1.real_estate_project.dao;
import SwingProject1.real_estate_project.model.Property;
import SwingProject1.real_estate_project.util.HistoryLogger;
import java.sql.*; import java.util.*;

public class PropertyDAO extends BaseDAO {
  public List<Property> listAll(){
    List<Property> out=new ArrayList<>();
    String sql="SELECT id,property_no,title,type_id,location,price,size_sqft,seller_id,status FROM properties ORDER BY id DESC";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql);ResultSet rs=ps.executeQuery()){
      while(rs.next()){ out.add(map(rs)); }
    } catch(Exception e){ throw new RuntimeException(e); }
    return out;
  }
  public List<Property> search(String q){
    List<Property> out=new ArrayList<>();
    String sql="SELECT id,property_no,title,type_id,location,price,size_sqft,seller_id,status FROM properties WHERE property_no LIKE ? OR title LIKE ? ORDER BY id DESC";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      String s="%"+q+"%"; ps.setString(1,s); ps.setString(2,s);
      ResultSet rs=ps.executeQuery(); while(rs.next()){ out.add(map(rs)); }
    } catch(Exception e){ throw new RuntimeException(e); }
    return out;
  }
  public int insert(Property p){
    String sql="INSERT INTO properties(property_no,title,type_id,location,price,size_sqft,seller_id,status) VALUES(?,?,?,?,?,?,?,?)";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
      ps.setString(1,p.propertyNo); ps.setString(2,p.title); ps.setInt(3,p.typeId); ps.setString(4,p.location); ps.setDouble(5,p.price);
      if(p.sizeSqft==null) ps.setNull(6, java.sql.Types.INTEGER); else ps.setInt(6,p.sizeSqft);
      if(p.sellerId==null) ps.setNull(7, java.sql.Types.INTEGER); else ps.setInt(7,p.sellerId);
      ps.setString(8,p.status); ps.executeUpdate();
      ResultSet k=ps.getGeneratedKeys(); if(k.next()){ int id=k.getInt(1); HistoryLogger.log("properties",id,"CREATE","Property created: "+p.propertyNo); return id; }
      return -1;
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  public void update(Property p){
    String sql="UPDATE properties SET property_no=?, title=?, type_id=?, location=?, price=?, size_sqft=?, seller_id=?, status=? WHERE id=?";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      ps.setString(1,p.propertyNo); ps.setString(2,p.title); ps.setInt(3,p.typeId); ps.setString(4,p.location); ps.setDouble(5,p.price);
      if(p.sizeSqft==null) ps.setNull(6, java.sql.Types.INTEGER); else ps.setInt(6,p.sizeSqft);
      if(p.sellerId==null) ps.setNull(7, java.sql.Types.INTEGER); else ps.setInt(7,p.sellerId);
      ps.setString(8,p.status); ps.setInt(9,p.id); ps.executeUpdate();
      HistoryLogger.log("properties",p.id,"UPDATE","Property updated: "+p.propertyNo);
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  public void delete(int id){
    String sql="DELETE FROM properties WHERE id=?";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql)){
      ps.setInt(1,id); ps.executeUpdate(); HistoryLogger.log("properties",id,"DELETE","Property deleted id="+id);
    } catch(Exception e){ throw new RuntimeException(e); }
  }
  private Property map(ResultSet rs) throws Exception {
    Property p=new Property();
    p.id=rs.getInt("id"); p.propertyNo=rs.getString("property_no"); p.title=rs.getString("title");
    p.typeId=rs.getInt("type_id"); p.location=rs.getString("location"); p.price=rs.getDouble("price");
    int size=rs.getInt("size_sqft"); p.sizeSqft=rs.wasNull()? null : size;
    int seller=rs.getInt("seller_id"); p.sellerId=rs.wasNull()? null : seller;
    p.status=rs.getString("status");
    return p;
  }
}
