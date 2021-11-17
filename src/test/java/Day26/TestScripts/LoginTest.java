package Day26.TestScripts;

import Day26.Commons.BaseTest;
import Day26.Commons.GlobalConfig;
import Day26.Commons.ReportUtil;
import Day26.Constants.ApplicationConstants;
import Day26.DataProviders.Dp_Login;
import Day26.PageObjects.HomePage;
import Day26.PageObjects.SignInPage;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import static Day26.Constants.ApplicationConstants.*;

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
        test= extentReports.createTest("Testing the Invalid Login Scenario");
        test.assignAuthor("Keerthi PS");
        test.assignDevice("MAC");
        test.assignCategory("Sprint");
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);

        homePage.clickSignInLink();
        signInPage.enterUserCredentials(username,password);

        if(signInPage.isInvalidErrorMessageDisplayed()){
            ReportUtil.pass(test,"Successfully validate the Error message",getScreenshot());
//            test.pass("Successfully validate the Error message", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot().replace(REPORT_PATH +"\\" ,"") ).build());
        }else{
            ReportUtil.fail(test,"Failed as Error message not displayed",getScreenshot());
//            test.fail("Failed as Error message not displayed",MediaEntityBuilder.createScreenCaptureFromPath(getScreenshot().replace(REPORT_PATH +"\\" ,"") ).build());
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
