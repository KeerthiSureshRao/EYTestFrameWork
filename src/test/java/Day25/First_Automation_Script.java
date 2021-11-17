package Day25;

import Day25.Constants.ApplicationConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class First_Automation_Script {
    public static void main(String[] args) throws IOException {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\Report.html");//will overlap on each run one over another since name is same
        ExtentLoggerReporter extentLoggerReporter = new ExtentLoggerReporter(System.getProperty("user.dir") + "\\Reports");
        ExtentReports extentReports = new ExtentReports();// to create extent reports
        extentReports.attachReporter(extentSparkReporter,extentLoggerReporter);//capture both spark & logger extent reports

        ExtentTest test = extentReports.createTest("Testing the EMI Calculation");
        test.assignAuthor("Keerthi PS");
        test.assignDevice("MAC");
        test.assignCategory("Sprint");

        test.info("Execution started");
//        Launch the application on Firefox browser
        System.setProperty("webdriver.gecko.driver", ApplicationConstants.GECKO_DRIVER_PATH);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        test.pass("Successfully launched the application" , MediaEntityBuilder.createScreenCaptureFromPath("Screenshots\\screenshot.png").build());

        String amount = "20000";
        driver.findElement(By.id("loanamount")).sendKeys(amount);//Enter loan amount
        driver.findElement(By.name("rate")).sendKeys("10");//Enter the rate of interest
        driver.findElement(By.id("pmonths")).sendKeys("120");//Enter the tenure
        driver.findElement(By.name("Button1")).click();//Click on calculate
//        Extract the value
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        test.pass("Successfully validated the EMI");


        TakesScreenshot screen = (TakesScreenshot) driver;
        File img = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir")+"\\Reports\\Screenshots\\screenshot.png"));

       test.fail("Failed validated the EMI" , MediaEntityBuilder.createScreenCaptureFromPath("Screenshots\\screenshot.png").build());

        extentReports.flush();//never skip, saves whatever done so far
        System.exit(0);
    }}
