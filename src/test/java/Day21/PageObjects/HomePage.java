package Day21.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn;

//    private WebElement lk_SignIn=driver.findElement(By.linkText("Sign In"));

    /**
     *
     * @param driver
     */
    public  HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void clickSignInLink(){
        lk_SignIn.click();
    }

}
