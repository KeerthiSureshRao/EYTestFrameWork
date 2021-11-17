package Day22;
import Day14.ExcelRW;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.*;

public class dp {
//1.Object[][]
//2. Iterator<Object[]>
    @DataProvider(name="LoginData") //unique name for dp
    public static Object[][] dataprovider() //In an object array, can store int/array/map values.Also term static is req.if DP&@Test is in diff class
    {
//        Object[][] objects = new Object[3][2][1]; //[3] controls entire array equal to line no. 24-26
//        objects[0][0]="Keerthi";
//        objects[0][1]="P S";
//        objects[1][0]="Suresh";
//        objects[1][1]="K";
//        objects[2][0]="Sindhu";
//        objects[2][1]="R";
        return new Object[][]{
                {"Keerthi","P S","hi","hello","Tata"},
                {"Suresh","K","hi","hello","Tata"},
                {"Sindhu","R","hi","hello","Tata"},
        };}
    @DataProvider(name="LoginDataExcel")
    public static Iterator<Object[]> dataprovider_Excel() throws IOException {

//        Read values from each row of excel
        String sheetName = "Sheet1";
        ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir") + "\\src\\main\\resources\\TestData.xlsx");
        int rowCount = excelRW.getRowCount(sheetName); //Need to know the row count which is dynamic
        int columnCount = excelRW.getColumnCount(sheetName);
        //Create a index in List
        ArrayList<Object[]> list = new ArrayList<Object[]>();
        for(int iRow = 1;iRow<=rowCount;iRow++)//Each row
        {
            Object[] obj = new Object[1];
            //In that object array , create a Map
            Map<String, String> map = new HashMap<>();
            for(int iCol=0;iCol<columnCount;iCol++)//In each row, keeps reading each column
            {

                String key = excelRW.readCellValue(sheetName, 0, iCol);//resp column, 1st row value
                String value= excelRW.readCellValue(sheetName,iRow,iCol);//resp rows, resp column value
                // In that map , add all the values from the row as Key Value pair
                map.put(key,value);
            }
            obj[0] = map;//Stored in 1st index
            //In that location,need to create a new Obj Array i.e, for entire row so placing here code-
            list.add(obj);
        }
        return list.iterator();}

    @DataProvider(name="LoginDataHardcoded")
    public static Iterator<Object[]> dataprovider_harcoded() throws IOException {
        return Arrays.asList(
                new Object[]{
                        new HashMap<String,String>(){{
                            put("Name","Keerthi");
                            put("City","Udupi");
                            put("State","Karnataka");
                        }}}
                ,new Object[]{
                        new HashMap<String,String>(){{
                            put("Name","Suresh");
                            put("City","Aluva");
                            put("State","Kerala");
                        }}}).iterator(); }}

