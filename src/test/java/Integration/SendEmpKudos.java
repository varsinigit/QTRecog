package Integration;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import PageObject.LoginPage;
import resources.Base;

public class SendEmpKudos extends Base {
@Test
public void Multiple() throws IOException {
	basePageNavigation();
	ActivityPage ap =new ActivityPage(driver);
	ap.ClickSendKudos().click();
	ap.EnterEmailid().sendKeys("Deepitha Jagatheesan  (deepitha.jagatheesan@qualitestgroup.com)");
	ap.selectkuds().click();
	ap.Comments().sendKeys("Providing for quick solution");
	ap.Send().click();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src, new File("C:\\Users\\Qualitest\\Documents\\Pictures\\ScreenShot\\Singlekudos.png"));
	
	driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
	ap.ClickSendKudos().click();
	ap.EnterEmailid().sendKeys("Deepitha Jagatheesan  (deepitha.jagatheesan@qualitestgroup.com)");
	String arr[]= {"Exceptional Work","Excellent Team Work","Innovative Thinker","Good Client Relations","Quality Hero","Quick Learner","Hard Worker","Team player"};
	for(int i=0;i<arr.length;i++) {
	ap.kudostype(arr[i]);
	File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src1, new File("C:\\Users\\Qualitest\\Documents\\Pictures\\ScreenShot\\IntegrationMultiplekudos.png"));
	}
	ap.Comments().sendKeys("Providing for quick solution");
	ap.Send().click();
	
}

	@Test(dataProvider="data")
	public void sendrecentcont(int media) throws IOException, InterruptedException {
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

