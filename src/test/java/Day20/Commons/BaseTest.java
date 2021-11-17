package Day20.Commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver; //public is needed then only it can be shared to another class which belongs to another package eg: 'LoginTest'

    @BeforeMethod
    public void lauchApp(){
        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        driver= new FirefoxDriver();
        driver.get("http://books.rediff.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }







}
