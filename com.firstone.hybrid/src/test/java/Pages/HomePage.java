package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
 WebDriver driver;
 
 public HomePage(WebDriver ldriver) {
	 this.driver=ldriver;
	  
 }
	@FindBy(xpath="//a[text()=' Daily Deals']") WebElement dailydealslink;
	
	@FindBy(xpath="//a[text()=' Sell']") WebElement selllink;
	
	@FindBy(xpath="//a[text()=' Help & Contact']") WebElement helpcontactlink;
	



  public void clickdailydealslink()
  {
	  dailydealslink.click();
  }
  
  public void selllink()
  {
	  selllink.click();
  }
  public void helpcontactlink()
  {
	  helpcontactlink.click();
  }
  public String getApplicationTitle()
  {
	  return driver.getTitle();
	  
  }
  } 