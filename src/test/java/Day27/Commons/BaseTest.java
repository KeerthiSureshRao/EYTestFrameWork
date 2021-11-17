package Day27.Commons;

import Day27.Constants.ApplicationConstants.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static Day27.Constants.ApplicationConstants.*;


public class BaseTest {
    public WebDriver driver;
    public static GlobalConfig config;
    public static ExtentReports extentReports;
    public ExtentTest test;
    public Assertor assertor;

    @BeforeSuite
    public void initSetup(){
        config = GlobalConfig.getProperties();
        extentReports= ReportUtil.getReport();
    }

    @BeforeMethod
    public void lauchApp(){
        System.setProperty("webdriver.gecko.driver",GECKO_DRIVER_PATH);
        driver= new FirefoxDriver();
        driver.get(config.get(config.get(CURRENT_ENVIRONMENT)));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterMethod
    public  void tearDown(){

        extentReports.flush();
        driver.quit();
    }

    /**
     * to take Screenshot
     * @return
     */
    public String getScreenshot(){
        String fileName = null;
        try{
            TakesScreenshot screen = (TakesScreenshot) driver;
            File img = screen.getScreenshotAs(OutputType.FILE);
            fileName=REPORT_PATH + "\\Screenshots\\screenshot_" + getUniqueDateTimeStamp() + ".png";
            FileUtils.copyFile(img,new File(fileName));
        }catch(Exception e){
            e.printStackTrace();
        }
        return fileName;
    }

    /**
     * to get uniquie date and timestamp
     * @return
     */
    public static String getUniqueDateTimeStamp(){
        Date date = new Date();
        SimpleDateFormat SimpleFormat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
        String cleanedDate = SimpleFormat.format(date);
        return cleanedDate;
    }

}
