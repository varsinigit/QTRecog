package SearchKudos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import PageObject.LoginPage;

import resources.Base;

public class KudosSearch extends Base {
	
	@Test 
	public void Searchkudos() throws IOException, InterruptedException, AWTException{
		basePageNavigation();
		ActivityPage ap =new ActivityPage(driver);
		ap.ClckSearch().click();
		Thread.sleep(1000);
		ap.Searchbox().sendKeys("monika");
		Thread.sleep(1000);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		ap.SearchBtn().click();
		Thread.sleep(5000);
		log1.info("User able to view list of kudos sent from him to other employess and kudos recieved from other users");
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
