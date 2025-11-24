package SwingProject1.real_estate_project.dao;
import SwingProject1.real_estate_project.model.Transaction;
import SwingProject1.real_estate_project.util.HistoryLogger;
import java.sql.*; import java.util.*;

public class TransactionDAO extends BaseDAO {
  public List<Transaction> listAll(){
    List<Transaction> out=new ArrayList<>();
    String sql="SELECT id,property_id,buyer_id,seller_id,broker_id,txn_date,amount,payment_method,notes FROM transactions ORDER BY id DESC";
    try(Connection c=getConn();PreparedStatement ps=c.prepareStatement(sql);ResultSet rs=ps.executeQuery()){
      while(rs.next()){ out.add(map(rs)); }
    } catch(Exception e){ throw new RuntimeException(e); }
    return out;
  }

  public int insert(Transaction t, double brokerRate){
    String sql="INSERT INTO transactions(property_id,buyer_id,seller_id,broker_id,txn_date,amount,payment_method,notes) VALUES(?,?,?,?,?,?,?,?)";
    try(Connection c=getConn()){
      c.setAutoCommit(false);
      try(PreparedStatement ps=c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
        ps.setInt(1,t.propertyId); ps.setInt(2,t.buyerId); ps.setInt(3,t.sellerId);
        if(t.brokerId==null) ps.setNull(4, java.sql.Types.INTEGER); else ps.setInt(4,t.brokerId);
        ps.setDate(5,new java.sql.Date(t.txnDate.getTime())); ps.setDouble(6,t.amount);
        ps.setString(7,t.paymentMethod); ps.setString(8,t.notes);
        ps.executeUpdate();
        ResultSet k=ps.getGeneratedKeys(); int txnId=-1; if(k.next()) txnId=k.getInt(1);

        if(t.brokerId!=null){
          double commissionAmount=t.amount*(brokerRate/100.0);
          try(PreparedStatement cps=c.prepareStatement(
              "INSERT INTO commissions(transaction_id, broker_id, commission_rate, commission_amount) VALUES(?,?,?,?)")){
            cps.setInt(1,txnId); cps.setInt(2,t.brokerId); cps.setDouble(3,brokerRate); cps.setDouble(4,commissionAmount); cps.executeUpdate();
          }
        }
        try(PreparedStatement ups=c.prepareStatement("UPDATE properties SET status='SOLD' WHERE id=?")){
          ups.setInt(1,t.propertyId); ups.executeUpdate();
        }

        c.commit();
        HistoryLogger.log("transactions",txnId,"TRANSACT","Transaction created for property="+t.propertyId);
        return txnId;
      } catch(Exception ex){ c.rollback(); throw ex; }
      finally { c.setAutoCommit(true); }
    } catch(Exception e){ throw new RuntimeException(e); }
  }

  private Transaction map(ResultSet rs) throws Exception {
    Transaction t=new Transaction();
    t.id=rs.getInt("id"); t.propertyId=rs.getInt("property_id"); t.buyerId=rs.getInt("buyer_id");
    t.sellerId=rs.getInt("seller_id"); int b=rs.getInt("broker_id"); t.brokerId=rs.wasNull()? null : b;
    t.txnDate=rs.getDate("txn_date"); t.amount=rs.getDouble("amount"); t.paymentMethod=rs.getString("payment_method"); t.notes=rs.getString("notes");
    return t;
  }
}
