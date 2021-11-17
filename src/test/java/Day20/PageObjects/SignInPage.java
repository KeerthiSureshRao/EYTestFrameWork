package Day20.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SignInPage
    {
//  For Login ===
    @FindBy(name="logid") //Collection of element1
    private WebElement txt_emailID; //type_name for easy reference in future
    @FindBy(name="pswd") //Collection of element2
    private WebElement txt_password; //txt-text
    @FindBy(xpath="//input[@value='Login']") //Collection of element3
    private WebElement btn_login; //btn-button
//    ====Login ----
    @FindBy(xpath="//b[contains(text(),'The username and/or password you entered is incorrect.')]")//Collection of element4
    private WebElement lbl_errorMessage; //lbl-label
    public void enterUserCredentials(String userName,String password)//userName & password varies from person to person => user config, so make it as parameters
    {
        txt_emailID.sendKeys(userName);
        txt_password.sendKeys(password);
        btn_login.click();
    }
    public boolean isInvalidErrorMessageDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }}
