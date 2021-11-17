package Day16;

import java.sql.*;

public class DBWithExceptions {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, myProjectException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=null;
        try {
            con = DriverManager.getConnection("jdbc:mysql1://localhost:3306/myDB", "root", "root");
        }catch(Exception e){
            System.out.println(e.toString());}
        if (con != null) {
            System.out.println("Connection is established");
        } else {
            throw new myProjectException("Oh! Not able to Connect. Try again");} //myProjectException is a constructor
        Statement stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("select empid as id , empName as eName from mydb.emp");
        ResultSetMetaData metaData = result.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (result.next()) {
            for (int iCol = 1; iCol <= columnCount; iCol++) {
                String columnName = metaData.getColumnLabel(iCol);
                String rowValue = result.getString(iCol);
                System.out.println(columnName + "<<<<>>>>" + rowValue);
            }
//            harcoded value
//            System.out.println(result.getString("empid"));
//            System.out.println(result.getString("empName"));
        }
        con.close();
    }
}
