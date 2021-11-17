package Day15;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Training\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://bookshopofindia.com/booknotfound.asp");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.name("btnSubmit")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept(); //since ok button on UI
        driver.findElement(By.name("Name")).sendKeys("Keerthi");
        driver.findElement(By.name("btnSubmit")).click();
        System.out.println(alert.getText());
        alert.accept();
    }}
