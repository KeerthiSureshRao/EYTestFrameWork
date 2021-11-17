package Day25.TestScripts;

import Day25.Commons.BaseTest;
import Day25.DataProviders.Dp_Login;
import Day25.PageObjects.HomePage;
import Day25.PageObjects.SignInPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(enabled=false)
    public void validateInvalidLogin(){

        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("logid")).sendKeys("askjdgkja");
        driver.findElement(By.name("pswd")).sendKeys("alscn");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        if(driver.findElement(By.xpath("//b[contains(text(),'The username and/or password you entered is incorrect.')]")).isDisplayed()){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }

    @Test(dataProvider = "InvalidLoginData",dataProviderClass = Dp_Login.class)
    public void validateInvalidLogin_Approach1(String username,String password){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);

        homePage.clickSignInLink();
        signInPage.enterUserCredentials(username,password);

        if(signInPage.isInvalidErrorMessageDisplayed()){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }


//    @Test
//    public void validateInvalidLogin_Approach2(){
//        HomePage2 homePage = new HomePage2(driver);
//
//
//        SignInPage2 signInPage2 = homePage.clickSignInLink().enterUserCredentials("raj", "krish");
//
//        if(signInPage2.isInvalidErrorMessageDisplayed()){
//            System.out.println("Pass");
//        }else{
//            System.out.println("Fail");
//        }
//    }


}
