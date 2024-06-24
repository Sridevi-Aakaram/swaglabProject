package com.SauceClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	WebDriver driver;
	public LogoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By logout = By.id("logout_sidebar_link");
	By menubutton = By.id("react-burger-menu-btn");
	public void signoutpage()
	{
		driver.findElement(menubutton).click();
		driver.findElement(logout).click();
	}

}
