package Generic_Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_Utility {
	
	public void getImlplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void getExplictiWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void getMouseHover(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element);
	}
	
	public void getRightClick(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element);
	}
	
	public void getAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void getAlertConformation(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void getSelectByIndex(WebDriver driver, WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void getSelectByText(WebDriver driver, WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void getSelectByValue(WebDriver driver, WebElement element, String text) {
		Select s = new Select(element);
		s.selectByValue(text);;
	}
	
}
