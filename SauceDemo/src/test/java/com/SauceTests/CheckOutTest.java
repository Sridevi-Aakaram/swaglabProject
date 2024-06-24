package com.SauceTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SauceClass.LogoutPage;
import com.SauceClass.SauceLoginPage;
import com.SauceClass.UserPage;

public class CheckOutTest {
	WebDriver driver;
	@BeforeTest
	public void SauceDemo()
	{
		
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
	@Test(priority = 1)
	public void firstname() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SauceLoginPage sp = new SauceLoginPage(driver);
	 	sp.UserName("standard_user");
	 	sp.password("secret_sauce");
	 	sp.signIN();
	 	sp.menuIcon();
	 	sp.reset();	 	
	 	UserPage ep = new UserPage(driver);
	 	ep.AddItemsTocart();
	 	Thread.sleep(2000);
	 	ep.Checkout("", "sissy", "345673");
	 	ep.continueit();
	 	ep.checkouterror();
	 	LogoutPage lp = new LogoutPage(driver);
	 	lp.signoutpage();
	}
	@Test(priority = 2)
	public void lastname() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SauceLoginPage sp = new SauceLoginPage(driver);
	 	sp.UserName("standard_user");
	 	sp.password("secret_sauce");
	 	sp.signIN();
	 	sp.menuIcon();
	 	sp.reset();	 	
	 	UserPage ep = new UserPage(driver);
	 	ep.AddItemsTocart();
	 	Thread.sleep(2000);
	 	ep.Checkout(" missy ", "", "345673");
	 	Thread.sleep(2000);
	 	ep.continueit();
	 	ep.checkouterror();
	 	LogoutPage lp = new LogoutPage(driver);
	 	lp.signoutpage();
	}
	@Test(priority = 3)
	public void pincode() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SauceLoginPage sp = new SauceLoginPage(driver);
	 	sp.UserName("standard_user");
	 	sp.password("secret_sauce");
	 	sp.signIN();
	 	sp.menuIcon();
	 	sp.reset();	 	
	 	UserPage ep = new UserPage(driver);
	 	ep.AddItemsTocart();
	 	Thread.sleep(2000);
	 	ep.Checkout(" missy ", "sissy", "");
	 	Thread.sleep(2000);
	 	ep.continueit();
	 	ep.checkouterror();
	 	LogoutPage lp = new LogoutPage(driver);	 	
	 	lp.signoutpage();
	}
	 @AfterTest
	    public void CloseDriver() throws InterruptedException {
	        Thread.sleep(3000);
	        driver.close();
	    }
	
	

}
