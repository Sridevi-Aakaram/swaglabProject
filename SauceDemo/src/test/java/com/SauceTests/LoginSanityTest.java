package com.SauceTests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SauceClass.SauceLoginPage;


public class LoginSanityTest {
	
	WebDriver driver;
	@BeforeTest
	public void SauceDemo()
	{
		
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}	
	@Test(priority=1)
    public void addData() throws IOException 
	{
		SauceLoginPage sp = new SauceLoginPage(driver);
		sp.addDataFile();
	}
	@Test(priority=2)
	public void problemuser()
	{
	 	SauceLoginPage sp = new SauceLoginPage(driver);
	 	sp.UserName("problem_user");
	 	sp.password("secret_sauce");
	 	sp.signIN();
	}
	 @AfterTest
	    public void CloseDriver() throws InterruptedException {
	        Thread.sleep(3000);
	        driver.close();
	    }

}

