package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActivityPage {
	public WebDriver driver;
	public ActivityPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement ClickSendKudos() {
		return driver.findElement(By.xpath("//a[@class='nav-item nav-link']"));
	}
	public WebElement EnterEmailid() {
		return driver.findElement(By.xpath("//input[@id='email_address']"));
	}
   public void kudostype(String kudostype) {
		WebElement kudos=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]//ancestor::center"));
		kudos.click();
	}
	public WebElement selectkuds() {
		return driver.findElement(By.xpath("//i[contains(text(),'Innovative Thinker')]//ancestor::center"));
	}
	public WebElement Comments() {
		return driver.findElement(By.xpath("//textarea[@id='comment']"));
	}
	public WebElement Send() {
		return driver.findElement(By.xpath("//button[contains(text(),'Send')]"));
	}
	public WebElement Cancel() {
		return driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
	}
	 public WebElement kudosfrom() {
	    return driver.findElement(By.xpath("//span[contains(text(),'Kudos from me')]"));
	  }
	 public WebElement Name() {
	    return driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]"));
	  }
	    
	 public WebElement ActivityName() {
	    return driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]"));
	  }
	 public WebElement kudosme() {
	    return driver.findElement(By.xpath("//span[contains(text(),'Kudos to me')]"));
	  }
	 public WebElement Count() {
	    return driver.findElement(By.xpath("//h5[@id='todayCount']"));
	  }
	 public WebElement ClickRecentContact(int j)
	 	{
			return driver.findElement(By.xpath("//*[@id=\"contact_list\"]/div["+j+"]/div/h5/small/a/i"));
		}
	 public WebElement Ourselfs() {
		 return driver.findElement(By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5/b[1]"));
	 }
	 public WebElement Ourselfre() {
		 return driver.findElement(By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5/b[2]"));
	 }
	 public WebElement ClckSearch() {
			return driver.findElement(By.xpath("//span[contains(text(),'Kudos Search')]"));
		}
		public WebElement Searchbox() {
			return driver.findElement(By.xpath("//input[@id='s_e_add']"));
		}
		public WebElement SearchBtn() {
			return driver.findElement(By.xpath("//button[@onclick='kudosSearch()']"));
		}
	

}
