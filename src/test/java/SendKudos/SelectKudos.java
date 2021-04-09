package SendKudos;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import PageObject.LoginPage;

import resources.Base;
public class SelectKudos extends Base {
	
		@Test
		public void sendkudos() throws IOException {
			basePageNavigation();
			ActivityPage ap =new ActivityPage(driver);
			ap.ClickSendKudos().click();
			ap.selectkuds().click();
			ap.EnterEmailid().sendKeys("Deepitha Jagatheesan  (deepitha.jagatheesan@qualitestgroup.com)");
			ap.selectkuds().click();
			ap.Comments().sendKeys("Great Work");
			ap.Send().click();
			
		}
		@AfterTest
		public void close() {
			driver.close();
		}
}
