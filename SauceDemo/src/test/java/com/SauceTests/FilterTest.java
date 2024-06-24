package com.SauceTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SauceClass.FilterPage;
import com.SauceClass.SauceLoginPage;

public class FilterTest {
	WebDriver driver;
	@BeforeTest
	public void BuyProductsTest()
	{
		
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
	@Test(priority = 1)
	public void ZtoAfilter()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SauceLoginPage sp = new SauceLoginPage(driver);
	 	sp.UserName("standard_user");
	 	sp.password("secret_sauce");
	 	sp.signIN();
	 	sp.menuIcon();
	 	sp.reset();	 	
	 	FilterPage fp = new FilterPage(driver);
	 	fp.filterZTOA();	 	
	}
	 @AfterTest
	    public void CloseDriver() throws InterruptedException {
	        Thread.sleep(3000);
	        driver.close();
	    }
}
