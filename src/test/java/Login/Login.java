package Login;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import resources.Base;

public class Login extends Base {
	@Test(dataProvider="getData")
	public void LoginPage(String Username,String Password) throws IOException, AWTException {
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log1.info("Successfully login into application");
		LoginPage lp=new LoginPage(driver);
		lp.EnterUsername().sendKeys(Username);
		lp.EnterPassword().sendKeys(Password);
	
		lp.loginbtn().click();
		log1.info("Successfully enterted UserName and Password");
		
		if(driver.getTitle().equals("QTRecognition")) {
			System.out.println("Passed");
		}	
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][2];
		data[0][0]="varsini.bala@qualitestgroup.com";
		data[0][1]="Passw0rd";
		
		
		data[1][0]="varsini.bala@qualitestgroup.com";
		data[1][1]="P@ssw0rd";
		log1.info("Wrong Password");
		
		return data;
	
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
