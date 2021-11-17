package Day18;

import Day17.PropertiesFiles;
import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FluentWaits {
    public static void main(String[] args) throws IOException {
//        Launch the application on Firefox browser
        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(PropertiesFiles.getConfigValue(PropertiesFiles.getConfigValue("env")));
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        String amount = "20000";
        WebElement loanamount = driver.findElement(By.id("loanamount"));
        loanamount.sendKeys(amount);
//      driver.findElement(By.id("loanamount")).sendKeys(amount); //        Enter loan amount
        driver.findElement(By.name("rate")).sendKeys("10"); //        Enter the rate of interest
        driver.findElement(By.id("pmonths")).sendKeys("120");//        Enter the tenure
        driver.findElement(By.name("Button1")).click();//        Click on calcualte
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(2))//user config. it will check every 2sec out of 60sec
                .ignoring(Exception.class);//covers every exception, that is it won't stop, will ignore

        WebElement EMI = wait.until(new Function<WebDriver, WebElement>() //anonymous function i.e, will come to know during run time
        {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("EMI1"));
            }
        });
//        WebElement EMI = driver.findElement(By.id("EMI"));
        String output = EMI.getAttribute("value");
//      String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        System.exit(0);}}
