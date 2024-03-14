package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class seleniumLoginTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to login page
        driver.get("https://the-internet.herokuapp.com/login");
    }


    @Test(priority = 0)
    public void testValidLogin() {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

        //locate and enter credentials
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //locate button and click
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Test(priority = 1)
    public void testInValidLogin() {

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        //locate and enter credentials
        driver.findElement(By.id("username")).sendKeys("example@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        //locate button and click
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
    @AfterTest
    public void browserTeardown(){
        driver.quit();
    }
}
