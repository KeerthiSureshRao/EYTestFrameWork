package Day23.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjectBase {

    public static final int DEFAULT_TIMEOUT=20;

    WebDriver driver;

    public PageObjectBase(WebDriver driver){
        this.driver=driver;
    }

    public void click(WebElement element){
        element.click();
    }

    public void type(WebElement element,String text){
        element.sendKeys(text);
    }

    public boolean isElementDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public WebDriverWait getWait(){
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
    }

    public WebDriverWait getWait(int timeout){
        return new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }


}
