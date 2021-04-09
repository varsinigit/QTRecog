package Others;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.ActivityPage;
import resources.Base;

public class KudosFromMe extends Base {
	@Test
public void kudosfromMe() throws IOException {
	basePageNavigation();
	ActivityPage ap =new ActivityPage(driver);
	ap.kudosfrom().click();
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
	String sender = str2.substring(str2.indexOf("") + 0, str2.indexOf("has sent an appreciation to")); 
	String check="appreciation to"; 
	String recepient = str2.substring(str2.indexOf(check) + check.length(), str2.indexOf(" on")); 
	log1.info("Sender Name is Valid");
	if(sender.equals(Names)) {
		log1.info("Sender is correct");
	}
	 if(!sender.equals(recepient)) {
		log1.info("Sender sents kudos to other empl");
	}
}
	@AfterTest
	public void close() {
		driver.close();
	}
}

