package Day16;
import java.sql.*;
public class DbHandling {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Now, its MYSQL DATABASE but changes w.r.t database
            Connection con=null;
            try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");//Now, its MYSQL DATABASE but changes w.r.t database
            if (con != null) { System.out.println("Connection is established");}
            else { System.out.println("Connection is not established");}
            Statement stat = con.createStatement(); //Standard class
            ResultSet result = stat.executeQuery("select * from mydatabase.emp"); //result will be stored in 'result'
            ResultSetMetaData metaData = result.getMetaData();
            int columnCount = metaData.getColumnCount(); //say 2 in this eg.
            while(result.next()){
                for (int iCol = 1; iCol <= columnCount; iCol++)
                {
                    String columnName = metaData.getColumnLabel(iCol); //metaData hold column structure
                    String rowValue = result.getString(iCol);
                    System.out.println(columnName + "<<< >>>" + rowValue);
//                 HardCoded Values -
//                System.out.println(result.getString("empid"));//column doesn't matter so better to go with column name
//                System.out.println(result.getString("empName"));
                }}}catch(Exception e){
                    System.out.println("Exeption is " + e.toString());
                }finally //will execute no matter execution happens or not
                {
                    if(con!=null && !con.isClosed()) {
                    System.out.println("Connection is closed");
                    con.close(); }}}}