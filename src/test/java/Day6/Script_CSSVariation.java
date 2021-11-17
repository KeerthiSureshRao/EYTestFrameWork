package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_CSSVariation {
    public static void main(String[] args) {

//    Launch the application on firebox browser
        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        String amount ="20000";
//    Enter loan amt
        driver.findElement(By.cssSelector("input[name='loanamount']")).sendKeys(amount);
//    Enter rate of interest
        driver.findElement(By.cssSelector("input[name='rate'][type='text']")).sendKeys("13");
//    Enter the tenure
        driver.findElement(By.cssSelector("table#tblinput tr:nth-of-type(4) input")).sendKeys("12");
//   Click on Calculate button
        driver.findElement(By.cssSelector("input[value='Calculate']")).click();
//    Extract the value
        String output = driver.findElement(By.cssSelector("input[id=EMI],[id=EMI1]")).getAttribute("value"); //OR operator
        System.out.println(output);

    }
}
