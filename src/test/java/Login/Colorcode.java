package Login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import resources.Base;

public class Colorcode  extends Base{

 @Test
	public void Color() throws IOException {
	   basePageNavigation();
	   
		WebElement element=driver.findElement(By.xpath("/html/body/div[1]"));
		 LoginPage lp=new LoginPage(driver);
		String Golden=element.getCssValue("background-color");
		String hexHead=Color.fromString(Golden).asHex();
		if(hexHead.equals("#FECC160")) {
			System.out.println("Color code is matched");
		}
		else {
			System.out.println("Mismatch color code");
		}
		element=driver.findElement(By.xpath("/html/body/div[2]"));
		String colorbdy=element.getCssValue("background-color");
		String hexBody=Color.fromString(colorbdy).asHex();
		if(hexBody.equals("#939598")) {
			System.out.println("Color code is matched");
		}
		else {
			System.out.println("Mismatch color code");
		}
		element=driver.findElement(By.xpath("/html/body/div[2]"));
		String colorbtn=element.getCssValue("background-color");
		String hexBtn=Color.fromString(colorbtn).asHex();
		if(hexBtn.equals("#2A2559")) {
			System.out.println("Color code is matched");
		}
		else {
			System.out.println("Mismatch color code");
		}
	}
}
