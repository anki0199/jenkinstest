package basic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.UtilMethods.LaunchBrowser;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

    @Test
    public void yelpTest() {
        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
        //

        WebDriver driver = LaunchBrowser("https://www.yelp.com/");

        WebElement txtusername = driver.findElement(By.id("search_description"));
        txtusername.sendKeys("Restaurants");
        driver.findElement(By.xpath("//button[@aria-label=\"Search\"]")).click();
        
//        TOP 10 BEST Restaurants in San Francisco, CA - January 2024 - Yelp
        
       
        assertEquals("TOP 10 BEST Restaurants in San Francisco, CA - January 2024 - Yelp", driver.getTitle());
        // driver.findElement(By.id("txtPassword")).sendKeys("test@113");
        // driver.findElement(By.name("Butsub")).click();
    }
}