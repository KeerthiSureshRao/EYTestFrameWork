package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_Link_Partial_Text {
    public static void main(String[] args) {

//    Launch the application on firebox browser
        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");

//    Enter loan amt
        driver.findElement(By.id("loanamount")).sendKeys("12345");
//    Enter rate of interest
        driver.findElement(By. name("rate")).sendKeys("13");
//    Enter the tenure
        driver.findElement(By. name("pmonths")).sendKeys("12");
//   Click on Calculate button
        driver.findElement(By.name("Button1")).click();
//    Extract the value
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
// LinkText locator
// driver.findElement(By.linkText("Bank Holidays")).click();
//PartialLink Text
        driver.findElement(By.partialLinkText("Holidays")).click();
    }
}
