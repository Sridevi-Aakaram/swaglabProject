package com.SauceTests;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.SauceClass.BuyProductpage;
import com.SauceClass.LogoutPage;
import com.SauceClass.SauceLoginPage;
import com.SauceClass.UserPage;

public class BuyProductsTest {
	
	WebDriver driver;
	@BeforeTest
	public void BuyProducts()
	{
		
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
	@Test(priority = 1)
	
	public void buyProductsKart() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SauceLoginPage sp = new SauceLoginPage(driver);
		BuyProductpage bp = new BuyProductpage(driver);
	 	sp.UserName("standard_user");
	 	sp.password("secret_sauce");
	 	sp.signIN();
	 	sp.menuIcon();
	 	sp.reset();	 	
	 	UserPage ep = new UserPage(driver);
	 	ep.AddItemsTocart();
	 	bp.verifykartpage();
	 	Thread.sleep(2000);
	 	ep.Checkout("missy", "sissy", "345673");
	 	bp.verifycheckoutpage();
	 	ep.continueit();
	 	bp.paymentpage();
	 	ep.finishcheckout();
	 	ep.productshome();
	 	LogoutPage lp = new LogoutPage(driver);
	 	lp.signoutpage();
	}
	 @AfterTest
	    public void CloseDriver() throws InterruptedException {
	        Thread.sleep(3000);
	        driver.close();
	    }
}
