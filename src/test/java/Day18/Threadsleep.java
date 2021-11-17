package Day18;

import Day17.PropertiesFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Threadsleep {
    public static void main(String[] args) throws IOException, InterruptedException  {
//      Launch the application on Firefox browser
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
        //        Extract the value
        Thread.sleep(10000); //10000ms = 10sec,  just Halt the code until 10sec[no condition]
        WebElement EMI = driver.findElement(By.id("EMI"));
        String output =EMI.getAttribute("value");
//        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);

        System.exit(0);

    }
}
