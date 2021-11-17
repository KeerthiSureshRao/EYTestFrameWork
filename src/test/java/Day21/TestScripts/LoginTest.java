package Day21.TestScripts;

import Day21.Commons.BaseTest;
import Day21.PageObjects.HomePage;
import Day21.PageObjects.SignInPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(enabled=false) //Won't run
    public void validateInvalidLogin(){

        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("logid")).sendKeys("Keerthi");
        driver.findElement(By.name("pswd")).sendKeys("PS123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        if(driver.findElement(By.xpath("//b[contains(text(),'The username and/or password you entered is incorrect.')]")).isDisplayed()){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }

    @Test
    public void validateInvalidLogin_Approach1(){
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);

        homePage.clickSignInLink();
        signInPage.enterUserCredentials("Deva","Rao835");

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
//        SignInPage2 signInPage2 = homePage.clickSignInLink().enterUserCredentials("Devaaa", "123");
//
//        if(signInPage2.isInvalidErrorMessageDisplayed()){
//            System.out.println("Pass");
//        }else{
//            System.out.println("Fail");
//        }
//    }


}
