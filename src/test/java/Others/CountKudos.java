package Others;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import PageObject.ActivityPage;
import resources.Base;

public class CountKudos extends Base{
	
	public int sendkudos() throws IOException {
		basePageNavigation();
		ActivityPage ap =new ActivityPage(driver);
		int val=Integer.parseInt(ap.Count().getText().split(" ")[0]);
		return val;
	}
		public void sendkuds() {
		
			ActivityPage ap =new ActivityPage(driver);
		 ap.ClickSendKudos().click();
		 ap.EnterEmailid().sendKeys("Deepitha Jagatheesan  (deepitha.jagatheesan@qualitestgroup.com)");
		 ap.selectkuds().click();
		 ap.Comments().sendKeys("Great Work");
		 ap.Send().click();
		}
		public int  cnt() throws InterruptedException {
			ActivityPage ap =new ActivityPage(driver);
			int vals=Integer.parseInt(ap.Count().getText().split(" ")[0]);
		return vals;
		}
	
		@Test
		public void testcase() throws IOException, InterruptedException {
			int aft=sendkudos();
			sendkuds();
			Thread.sleep(10000);
			int cmt=cnt();
			if(aft<cmt)
			{
				System.out.println("count is increased");
			}
			else {
				System.out.println("Count is not increased");
			}
		}
		@AfterTest
		public void close() {
			driver.close();
		}
	}

