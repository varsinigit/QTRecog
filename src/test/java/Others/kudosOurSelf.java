package Others;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import PageObject.ActivityPage;
import PageObject.LoginPage;
import resources.Base;

public class kudosOurSelf extends Base {

		@Test
		public void Ourself() throws IOException, InterruptedException {
			basePageNavigation();
			ActivityPage ap =new ActivityPage(driver);
			ap.ClickSendKudos().click();
			ap.selectkuds().click();
			ap.EnterEmailid().sendKeys("Varsini Siva Bala  (varsini.bala@qualitestgroup.com)");
			ap.selectkuds().click();
			ap.Comments().sendKeys("Great Work");
			ap.Send().click();
			//ActivityPage ap =new ActivityPage(driver);
			Thread.sleep(5000);
			ap.kudosfrom().click();
			Thread.sleep(10000);
			String str=ap.ActivityName().getText();
			String Names=str.substring(0,7)+str.substring(12,17);//Varsini Bala
			boolean var;
			if(Names.equals("Varsini Bala")) {
				var=true;
			}
			else {
				var=false;
			}
			boolean actname=ap.Name().getText().contains("Varsini Bala");
			Assert.assertEquals(var, actname);
			String str2=ap.Name().getText();
			String sender =ap.Ourselfs().getText();
			String recepient=ap.Ourselfre().getText();
			
			
			log1.info("Sender Name is Valid");
			if(sender.equals(Names)) {
				log1.info("Sender is correct");
			}
			
			 if(sender.equals(recepient)) {
				System.out.println("Sender sents kudos to himself");
				log1.info("Sender sents kudos to himself");
			}
			
		}
		@AfterTest
		public void close() {
			driver.close();
		}
}
