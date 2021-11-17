package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_XpathVariations {
    public static void main(String[] args) {

//    Launch the application on firebox browser
        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");

//    Enter loan amt
        driver.findElement(By.xpath("//table[@id='tblinput']//tr[2]/td/following-sibling::td[2]/input")).sendKeys("12345");
//    Enter rate of interest
        driver.findElement(By. xpath("//input[@name='rate' and @type='text']")).sendKeys("13");
//    Enter the tenure
        driver.findElement(By. xpath("//input[@name='rate' and @type='text']/following::input[1]")).sendKeys("12");
//   Click on Calculate button
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
//    Extract the value
        String output = driver.findElement(By.xpath("//input[@name='EMI' or @id='EMI1']")).getAttribute("value");
        System.out.println(output);

    }
}
