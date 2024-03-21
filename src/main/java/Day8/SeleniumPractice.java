package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumPractice {

    public static void main(String[] args){

        //initialising chrome driver
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='APjFqb']")));

        element.sendKeys("Selenium");
        //element.sendKeys(Keys.ENTER);
        //element.submit();

        //Navigation WebDriver commands

        /*driver.navigate().to("https://www.google.com/");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();*/
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='OBMEnb'][1]/ul/li[8]")));
        //driver.findElement(By.xpath("//div[@class='OBMEnb'][1]/ul/li[8]")).sendKeys(Keys.ENTER);


        //close the browser
        driver.quit();


    }
}
