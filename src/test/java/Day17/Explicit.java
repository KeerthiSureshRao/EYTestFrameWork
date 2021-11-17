package Day17;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Explicit {
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
//        Extract the value //Keeping 60 sec only for EMI field/element not for entire page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));//Explicit wait
        WebElement EMI = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("EMI")));
//        WebElement EMI = driver.findElement(By.id("EMI"));
        String output = EMI.getAttribute("value");
//      String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        System.exit(0);}}
