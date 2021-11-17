package Day29.TestScripts;

import Day29.Commons.*;
import Day29.Constants.ApplicationConstants;
import Day29.DataProviders.Dp_Login;
import Day29.PageObjects.HomePage;
import Day29.PageObjects.SignInPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static Day29.Constants.ApplicationConstants.*;
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
    public void validateInvalidLogin_Approach1(String username,String password) throws IOException {
        Logutil.info("Testing the Invalid Login Scenario");
        test= extentReports.createTest("Testing the Invalid Login Scenario");
        test.assignAuthor("Keerthi PS");
        test.assignDevice("IOS");
        test.assignCategory("Sprint");
        assertor=new Assertor(test);
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        homePage.clickSignInLink();
        Logutil.info("Currently in Home Page");
        assertor.assertEquals(driver.getTitle(),"books.rediff.com","Sign Page Title is not matching"  );
        Logutil.info("Currently in Sign In Page");
        signInPage.enterUserCredentials(username,password);
        assertor.assertTrue(signInPage.isInvalidErrorMessageDisplayed(),"Invalid Login error is not displayed#" +getScreenshot());
        assertor.assertAll();

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
