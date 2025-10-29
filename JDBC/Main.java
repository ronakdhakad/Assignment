package JDBC;

//import java.sql.SQLException;
import java.sql.*;

public class Main{
    private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String user="root";
    private static final String password="root@123";
            
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url,user,password);
//            Statement statement = con.createStatement(); 
            String query  ="select marks from students where   id =?";
            PreparedStatement ps =con.prepareStatement(query);
//            ps.setString(1,"ram");
            ps.setInt(1,1);
//            ps.setDouble(3,67.8 );
               
//            int affectedRows=ps.executeUpdate();
//if (affectedRows>0){
//    System.out.println("Data Inserted successfully.");
//}else{
//    System.out.println("Data not Inserted");
//}
       
ResultSet rs =ps.executeQuery();
if(rs.next()){
    double marks=rs.getDouble("marks");
    System.out.println("Marks: "+marks);
}else{
    System.out.println("marks  not found!");
}
   }catch(SQLException e){
            System.out.println(e.getMessage());
        
        }
    }
}
