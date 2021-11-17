package Day7;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_inheritance {
    FirefoxDriver driver;

    // Launch Application
    void launchApp(String url) {         //Local variable : URL
        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(url);
    }
    //  Tear down [means Close the app & reset to initial state]
    void tearDown() {
        driver.quit();
    }//driver.quit -closes all browser, driver.close - Only closes the 1st browser which got accessed by get()
}
