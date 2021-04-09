package SendKudos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import resources.Base;




public class Multiplekudos extends Base {
	
	@Test
	public void Multiple() throws IOException {
		basePageNavigation();
		ActivityPage ap =new ActivityPage(driver);
		ap.ClickSendKudos().click();
		ap.EnterEmailid().sendKeys("Deepitha Jagatheesan  (deepitha.jagatheesan@qualitestgroup.com)");
		ap.selectkuds().click();
		ap.Comments().sendKeys("Great Work");
		ap.Send().click();
		
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		ap.ClickSendKudos().click();
		ap.EnterEmailid().sendKeys("Deepitha Jagatheesan  (deepitha.jagatheesan@qualitestgroup.com)");
		
		String arr[]= {"Exceptional Work","Excellent Team Work","Innovative Thinker","Good Client Relations","Quality Hero","Quick Learner","Hard Worker","Team player"};
		for(int i=0;i<arr.length;i++) {
		ap.kudostype(arr[i]);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Qualitest\\Documents\\Pictures\\ScreenShot\\Multiplekudos.png"));
		
		}
		driver.close();
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
