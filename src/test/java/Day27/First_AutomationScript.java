package Day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class First_AutomationScript {
    public static void main(String[] args) {


        SoftAssert Assert = new SoftAssert();//        soft assert
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
//        Launch the application on Firefox browser
//        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        if(driver.getTitle().equals("Union Bank of India- emicalculator")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        Assert.assertEquals(driver.getTitle(),"Union  of India- emicalculator","Title is not matching");

        String amount = "20000";
        driver.findElement(By.id("loanamount")).sendKeys(amount);//        Enter loan amount
        driver.findElement(By.name("rate")).sendKeys("10");//        Enter the rate of interest
        driver.findElement(By.id("pmonths")).sendKeys("120");//        Enter the tenure
        driver.findElement(By.name("Button1")).click();//        Click on calculate
//        Extract the value
        String output = driver.findElement(By.id("EMI")).getAttribute("value");

        if(output.equals("234")){
            System.out.println(" EMI Pass");
        }else{
            System.out.println(" EMI Fail");
        }

        Assert.assertEquals(output,"234","EMI is not matching");
        System.out.println(output);
        driver.quit();
        Assert.assertAll();
        System.exit(0);

    }
}
