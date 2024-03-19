package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SeleniumSauceDemoTest {

    WebDriver driver;

    @BeforeTest
    public void SetupURL(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


    }
    //@Test(priority = 0)
    public void GetTitle(){
        Assert.assertEquals("Swag Labs",driver.getTitle(),"Page title doesnt match");


    }
    @Test(priority = 1)
    public void validLogin() {
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Assert.assertEquals("Swag Labs",driver.getTitle(),"Page title match");
    }
    //@Test(priority = 2)
    public void InvalidLogin() {
        driver.findElement(By.id("user-name")).sendKeys("problem");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    //impliclity wait for 5secs
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement error=driver.findElement(By.xpath("//h3[@data-test='error']"));
        //System.out.println(error.getText());
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",error.getText(),"error message doesnot match");
    }
    @Test(priority = 2)
    public void AddProductToCart(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        String actual_number= "1";
        WebElement expected_number=driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span"));
        //System.out.println(number.getText());
        Assert.assertEquals(actual_number,expected_number.getText(),"Product added to cart");
    }

    @Test(priority=3)
    public void RemoveProductFromCart(){
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
        driver.findElement(By.xpath("//button[@name='remove-sauce-labs-backpack']")).click();
    }

    @AfterTest
    public void QuitBrowser(){
        if (driver != null) {
            driver.quit();
        }
    }


}
