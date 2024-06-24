package com.SauceClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BuyProductpage extends SauceObject{
	WebDriver driver;
	public BuyProductpage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void verifykartpage()
	{
		String exp = "https://www.saucedemo.com/cart.html";
		String atl = driver.getCurrentUrl();
		Assert.assertEquals(atl, exp);
	}
	public void verifycheckoutpage()
	{
		String exp = "https://www.saucedemo.com/checkout-step-one.html";
		String atl = driver.getCurrentUrl();
		Assert.assertEquals(atl, exp);
	}
	public void paymentpage()
	{
		String exp = "https://www.saucedemo.com/checkout-step-two.html";
		String atl = driver.getCurrentUrl();
		Assert.assertEquals(atl, exp);
	}
	public void successPage()
	{
		String exp = "https://www.saucedemo.com/checkout-complete.html";
		String atl = driver.getCurrentUrl();
		Assert.assertEquals(atl, exp);
		System.out.println(driver.findElement(By.id("checkout_complete_container")).getText());
		
	}


}
