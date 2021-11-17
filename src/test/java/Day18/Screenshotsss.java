package Day18;

import Day17.PropertiesFiles;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Screenshotsss {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat SimpleFormat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss"); //Date & time stamp with allowed characters for file name
        String cleanedDate = SimpleFormat.format(date);
        System.out.println(cleanedDate);

//    Launch the application on Firefox browser
        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); //Interface=>WebDriver
        driver.get(PropertiesFiles.getConfigValue(PropertiesFiles.getConfigValue("env")));
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String amount = "20000";
        //Enter loan amount
        WebElement loanamount = driver.findElement(By.id("loanamount"));
        loanamount.sendKeys(amount);
        TakesScreenshot screen = (TakesScreenshot) driver;// screen - can work to do screenshot, also converting the type Driver to Screenshot
        File img = screen.getScreenshotAs(OutputType.FILE);// will get output on img but remains on thread, i.e, this won't give physical output file
        FileUtils.copyFile(img,new File(System.getProperty("user.dir")+"\\Screenshots\\screenshot_" + cleanedDate + ".png")); //Screenshot1 with loan amt

        driver.findElement(By.name("rate")).sendKeys("10");//Enter the rate of interest
        driver.findElement(By.id("pmonths")).sendKeys("120");//Enter the tenure
        driver.findElement(By.name("Button1")).click();//Click on calcualte
//        Extract the value
        WebElement EMI = driver.findElement(By.id("EMI"));
        String output = EMI.getAttribute("value");
        date = new Date();
        cleanedDate = SimpleFormat.format(date);

        img = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir")+"\\Screenshots\\screenshot_" + cleanedDate + ".png"));//("user.dir") upto seltraining, also new File-will make string to file //Screenshot2 all fields filled

//        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        System.exit(0);
    }
}

