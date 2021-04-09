package SendRecentContact;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObject.ActivityPage;
import PageObject.LoginPage;


import resources.Base;

public class RecentContacts extends Base {
	public WebDriver driver;
	@Test(dataProvider="data")
	public void sendrecentcont(int media) throws IOException, InterruptedException {
		basePageNavigation();
		ActivityPage ap =new ActivityPage(driver);
		Thread.sleep(5000);
		ap.ClickRecentContact(media).click();
		Thread.sleep(1000);
		 ap.selectkuds().click();
		 ap.Comments().sendKeys("Good Work");
		 ap.Send().click();
	}
	@DataProvider
	public Object[] data(){
		Object[] data={1,2,3,4,5};
		return data;
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
