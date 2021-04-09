package Others;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import resources.Base;

public class KudoToMe extends Base{
	@Test
	public void kudosToMe() throws IOException, InterruptedException {
	basePageNavigation();
	ActivityPage ap =new ActivityPage(driver);
	ap.kudosme().click(); 
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
	
	 if(!sender.equals(recepient)) {
		
		log1.info("sender received an kudos from other employee");
	}
	

}
	@AfterTest
	public void close() {
		driver.close();
	}
	}

