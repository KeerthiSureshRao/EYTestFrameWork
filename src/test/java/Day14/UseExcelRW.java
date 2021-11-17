package Day14;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UseExcelRW {
    public static void main(String[] args) throws IOException {
        ExcelRW excelRW = new ExcelRW("C:\\Training\\Search.xlsx");
//        excelRW.initExcel("C:\\Training\\Search.xlsx");
        String sheetName="SearchResult";
        int rowCount = excelRW.getRowCount(sheetName);

        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        for(int iRow=1;iRow<=rowCount;iRow++)
        {
            String cellValue= excelRW.readCellValue(sheetName,iRow,0);

            driver.findElement(By.tagName("input")).sendKeys(cellValue);
            driver.findElement(By.id("sb_form_go")).submit();
//            Thread.sleep(4000);
            String result = driver.findElement(By.className("sb_count")).getText();
            //write to cell
//            sheet1.getRow(iRow).getCell(1).setCellValue(result);
            excelRW.writeCellValue(sheetName,iRow,1,result);
//            back button
            driver.navigate().to("https://www.bing.com/");
        }
        excelRW.saveAndCloseWorkbook("C:\\Training\\Search.xlsx");
        driver.quit();
    }}
