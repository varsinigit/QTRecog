package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement EnterUsername() {
		return driver.findElement(By.xpath("//input[@name='username']"));
		
	}
	public WebElement EnterPassword() {
		return driver.findElement(By.xpath("//input[@name='pass']"));
	}
	public WebElement loginbtn() {
		return driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public WebElement Goldens() {
		return driver.findElement(By.xpath("/html/body/div[1]"));
	}
	public WebElement Whites() {
		return driver.findElement(By.xpath("/html/body/div[2]"));
	}
	public WebElement Navy() {
		return driver.findElement(By.xpath("/html/body/div[2]/form/button"));
	}
}
