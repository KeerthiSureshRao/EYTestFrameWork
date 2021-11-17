package Day28.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *This class handles the elements and business logics for SingIn Page
 *
 * @author Keerthi PS
 * @since 07-Nov-2021
 *
 */

public class SignInPage extends PageObjectBase {

    WebDriver driver;

    //For Login ===
    @FindBy(name="logid")
    private WebElement txt_emailID;

    @FindBy(name="pswd")
    private WebElement txt_password;

    @FindBy(xpath="//input[@value='Login']")
    private WebElement btn_login;

//    ====Login ----

    @FindBy(xpath="//b[contains(text(),'The username and/or password you entered is incorrect.')]")
    private WebElement lbl_errorMessage;

    /**
     *
     * @param driver
     */
    public SignInPage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
//        basePage=new PageObjectBase(driver);
    }

    /**
     * The method enters username ,password
     * @param userName
     * @param password
     *
     */
    public void enterUserCredentials(String userName,String password){

//        txt_emailID.sendKeys(userName);
////        txt_password.sendKeys(password);
////        btn_login.click();
        type(txt_emailID,userName);
        type(txt_password,password);
        click(btn_login);
    }

    public boolean isInvalidErrorMessageDisplayed(){
//        return lbl_errorMessage.isDisplayed();
        return isElementDisplayed(lbl_errorMessage);
    }
}
