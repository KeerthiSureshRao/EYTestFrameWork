package Day16;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DbHandling_DML {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");//Now, its MYSQL DATABASE but changes w.r.t database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");//Now, its MYSQL DATABASE but changes w.r.t database
        if (con != null) {
            System.out.println("Connection is established");}
        else {
            System.out.println("Connection is not established");}
        Statement stmt = con.createStatement();
        stmt.executeUpdate("update  mydatabase.emp  set empName='Kavitha' where empName='Geethu'");
//        ResultSet result = stmt.executeQuery("select empid as id , empName as eName from mydb.emp");
        con.close();
    }}
