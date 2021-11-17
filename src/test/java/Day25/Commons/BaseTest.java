package Day25.Commons;


import Day25.Constants.ApplicationConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static Day25.Constants.ApplicationConstants.*;

public class BaseTest {
    public WebDriver driver;
    public static GlobalConfig config;

    @BeforeSuite
    public void initSetup(){
        config = GlobalConfig.getProperties();
    }

    @BeforeMethod
    public void lauchApp(){
        System.setProperty("webdriver.gecko.driver",GECKO_DRIVER_PATH);
        driver= new FirefoxDriver();
        driver.get(config.get(config.get(CURRENT_ENVIRONMENT)));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public  void tearDown(){
        driver.quit();
    }

}
