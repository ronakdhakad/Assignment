import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
.
public class Q1 {
    public static void main(String[] args) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql//LocalHost:3306/myDatabase";
        String username="";
        String password="";
        Connection con = DriverManager.getConnection(url, username,password);
        
        PreparedStatement ps =con.prepareStatement("SELECT name FROM students;");
        ResultSet rs = ps.executeQuery();
        
        ArrayList<String> list= new ArrayList<>();
        
        while(rs.next()){
            list.add(rs.getString("name"));
        }
        System.out.println("Array list: "+list);

        Collections.sort(list);

        System.out.println("sorted Array: "+list);
    }
}
