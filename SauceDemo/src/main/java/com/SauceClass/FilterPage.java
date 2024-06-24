package com.SauceClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FilterPage {
	WebDriver driver;
	public FilterPage(	WebDriver driver)
	{
		this.driver = driver;
	}
	By filter = By.className("product_sort_container");
	public void filterZTOA()
	{
		driver.findElement(filter).click();
		driver.findElement(By.xpath("//option[@value='za']")).click();
		String actrslt = driver.findElement(By.className("inventory_item_name")).getText();
		String exprslt = "Test.allTheThings() T-Shirt (Red)";
		Assert.assertEquals(actrslt, exprslt);		
	}

}
