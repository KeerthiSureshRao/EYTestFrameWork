package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Bing_Inheritance extends Base_inheritance{
    FirefoxDriver driver; //Instance variable: driver [Because we need same variable to be used in 3 diff methods]
    // Launch Application
    void Search(String search) {
        driver.findElement(By.className("sb_form_q")).sendKeys(search);
        driver.findElement(By.id("sb_form_go")).submit();
    }

}



