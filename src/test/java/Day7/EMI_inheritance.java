package Day7;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class EMI_inheritance extends Base_inheritance {
    // Enter & Extract
    String extractEmi(String amount, String interest, String tenure) {
//    Enter loan amt
        driver.findElement(By.id("loanamount")).sendKeys(amount);
//    Enter rate of interest
        driver.findElement(By.name("rate")).sendKeys(interest);
//    Enter the tenure
        driver.findElement(By.name("pmonths")).sendKeys(tenure);
//   Click on Calculate button
        driver.findElement(By.name("Button1")).click();
//    Extract the value
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        return output;}

}