package util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilMethods {

	public static WebDriver LaunchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public static void selectCheckBoxes(WebDriver driver, By locator, String value) {
		List<WebElement> chkboxes = driver.findElements(locator);
		for (WebElement ch : chkboxes)
		{
			if(ch.getAttribute("value").equalsIgnoreCase(value))
			{
				if(!ch.isSelected())
				{
					ch.click();
					break;
				}
			}
		}
	}

	public void selectRadio(WebDriver driver, By locator, String value) {

	}

	public void selectDDByValue(WebDriver driver, By locator, String value) {

	}

	public void selectDDByText(WebDriver driver, By locator, String text) {

	}

	public void verifyCellData(WebDriver driver, By locator, int rownum, int colnum, String text) {

	}

	public void verifyRowData(WebDriver driver, By locator, int rownum, String text) {

	}
}