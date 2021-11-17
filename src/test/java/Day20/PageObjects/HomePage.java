package Day20.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn; //If more than 1 element =>WebElement, private scope inside class.
//  private WebElement lk_SignIn=driver.findElement(By.linkText("Sign In"));

    public void clickSignInLink(){
        lk_SignIn.click();
    }

}
