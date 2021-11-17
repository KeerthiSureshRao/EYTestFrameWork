package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdentifyLocators {
    public static void main(String[] args) {
//    Launch the application on firebox browser
        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");
        driver.findElement(By.className("sb_form_q")).sendKeys("Automation Testing");
        driver.findElement(By.id("sb_form_go")).submit();

    }
}
