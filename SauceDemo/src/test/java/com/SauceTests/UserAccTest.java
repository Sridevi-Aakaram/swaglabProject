package com.SauceTests;

import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.SauceClass.LogoutPage;
import com.SauceClass.SauceLoginPage;
import com.SauceClass.UserPage;

public class UserAccTest {
	WebDriver driver;
	@BeforeTest
	public void SauceDemo()
	{
		
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}	
	@Test (priority = 3)
	public void problemuser()
	{
	 	SauceLoginPage sp = new SauceLoginPage(driver);
	 	sp.UserName("error_user");
	 	sp.password("secret_sauce");
	 	sp.signIN();
	 	sp.menuIcon();
	 	sp.reset();	 	
	 	UserPage ep = new UserPage(driver);
	 	ep.AddItemsTocart();
	 	ep.verifykartvalue();
	 	LogoutPage lp = new LogoutPage(driver);
	 	lp.signoutpage();
	} 
	@Test (priority = 1)
	public void visualuser()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	SauceLoginPage sp = new SauceLoginPage(driver);
	 	sp.UserName("visual_user");
	 	sp.password("secret_sauce");
	 	sp.signIN();
	 	sp.menuIcon();
	 	sp.reset();	 	
	 	UserPage ep = new UserPage(driver);
	 	ep.AddItemsTocart();
	 	ep.verifykartvalue();
	 	LogoutPage lp = new LogoutPage(driver);
	 	lp.signoutpage();
	} 
	
	@Test (priority = 2)
	public void standardUser() throws InterruptedException
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
	 	ep.verifykartvalue();
	 	Thread.sleep(2000);
	 	LogoutPage lp = new LogoutPage(driver);
	 	lp.signoutpage();
	}
	 @AfterTest
	    public void CloseDriver() throws InterruptedException {
	        Thread.sleep(3000);
	        driver.close();
	    }

}
