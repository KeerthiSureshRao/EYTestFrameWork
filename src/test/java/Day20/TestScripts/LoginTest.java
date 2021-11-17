package Day20.TestScripts;

import Day20.Commons.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

    @Test
    public void validateInvalidLogin(){
        driver.findElement(By.linkText("Sign In")).click();//since <a> can use linkText attribute
        driver.findElement(By.name("logid")).sendKeys("keerthi");
        driver.findElement(By.name("pswd")).sendKeys("ps123456");
        driver.findElement(By.xpath("//input[@value='Login']")).click();//no unique items, no classname for this =>xpath attribute

        if(driver.findElement(By.xpath("//b[contains(text(),'The username and/or password you entered is incorrect.')]")).isDisplayed()){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }}}
