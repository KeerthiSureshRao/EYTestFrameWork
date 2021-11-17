package Day12_13;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExcelReadnWrite {
    public static void main(String[] args) throws IOException, InterruptedException {
//  Open the Excel
        FileInputStream fis = new FileInputStream("C:\\Training\\Search.xlsx"); //Fileinputstream : converts data into stream of bytes
//  Connect the sheet   //From Apache POI (dependencies pastes on POM.xml :-)
        XSSFWorkbook wb = new XSSFWorkbook(fis); //connects/points to workbook
        XSSFSheet sheet1 = wb.getSheet("Sheet1"); //If sheet#2 present, create one more obj for that.
//  Collect the row count (i.e, to know how many items are present in excel, nothing but to know where we need to finish this activity Eg: 10 out off 10L+rows)
        int rowCount = sheet1.getLastRowNum(); //Give last row having data

//      Launch the application on firebox browser
        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bing.com/");
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//  Logic - Reading from Excel, Applying to Appln, Extracting value & writing back to excel
        for(int iRow=1;iRow<=rowCount;iRow++){
//          Reading from a cell
            XSSFCell cell = sheet1.getRow(iRow).getCell(0);//Pointing to (cell 1,0) ie,Term Selenium
//          Excel O/P format-string/boolean/date/numeric etc.So converting(except string format like int/date)to comfortable format-'string'
            String cellValue="";
            if(cell.getCellType()== CellType.STRING){
                cellValue = cell.getStringCellValue();
            }else if(cell.getCellType()==CellType.NUMERIC){
                cellValue = String.valueOf(cell.getNumericCellValue());
            }else if (cell.getCellType()==CellType.BLANK){
                cellValue = "";
            }
            System.out.println(cellValue);

            driver.findElement(By.tagName("input")).sendKeys(cellValue);
            driver.findElement(By.id("sb_form_go")).submit();
            Thread.sleep(4000); //4000ms =4sec
            String result = driver.findElement(By.className("sb_count")).getText();

//          Write to a cell
            sheet1.getRow((iRow)).getCell(1).setCellValue(result);
//          To click on 'back' button of browser
            driver.navigate().back();
        }

//  Save the excel
        FileOutputStream fos = new FileOutputStream("C:\\Training\\Search.xlsx");//Since on same excel need data to be fetched, same PathURL provided
        wb.write(fos);
        fis.close(); //close connection which are in open state (Good Practise, not mandatory)
        fos.close(); //close connection which are in open state (Good Practise, not mandatory)
        driver.close();
//  Close the excel
    }}
