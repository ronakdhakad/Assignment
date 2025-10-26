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
            Statement statement = con.createStatement(); 
            String query  =String.format("insert into students (name,age ,marks) values ('%s',%o,%f)","ujjwal",20,88.2);
//            String query = "select * from students";
            int affectedRows=statement.executeUpdate(query);
//            while(resultSet.next()){
//                int id =resultSet.getInt("id");
//                String name =resultSet.getString("name");
//                int age =resultSet.getInt("age");S
//                double marks =resultSet.getDouble("marks");
//                System.out.println("Id: "+id);
//                System.out.println("Name: "+name);
//                System.out.println("Age: "+age);
//                System.out.println("Marks: "+marks);
//            }
if (affectedRows>0){
    System.out.println("Data Inserted successfully.");
}else{
    System.out.println("Data not Inserted");
}
        }catch(SQLException e){
            System.out.println(e.getMessage());
            
        }
    }
}
