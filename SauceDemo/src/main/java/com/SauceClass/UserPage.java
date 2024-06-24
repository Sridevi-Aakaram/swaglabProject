package com.SauceClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserPage extends SauceObject {
	
	WebDriver driver;
	public UserPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void AddItemsTocart()
	{
		driver.findElement(SauceLabsBackpack).click();
		driver.findElement(addTOkart).click();		
		driver.findElement(backTOproduct).click();
		driver.findElement(SauceLabsBikeLight).click();
		driver.findElement(addTOkart).click();
		driver.findElement(backTOproduct).click();
		driver.findElement(SauceLabsBoltTShirt).click();
		driver.findElement(addTOkart).click();
		driver.findElement(backTOproduct).click();	
		driver.findElement(SauceLabsFleeceJacket).click();
		driver.findElement(addTOkart).click();
		driver.findElement(backTOproduct).click();
		driver.findElement(kartpage).click();
	}
	public void verifykartvalue()
	{
		String Expectedrlt = "4";
		String ActualRslt = driver.findElement(By.className("shopping_cart_badge")).getText();
		System.out.println(ActualRslt);
		//Assert.assertEquals(ActualRslt, Expectedrlt);
		if(Expectedrlt.equals(ActualRslt))
		{
			System.out.println("This UserAccount works");
		}
		else
		{
			System.out.println("The UserAccount has bug");

		}
	}
	public void Checkout(String fname, String lname, String zip)
	{
		driver.findElement(checkout).click();
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(zipcode).sendKeys(zip);
	}
	public void fname(String fname)
	{
		driver.findElement(firstname).sendKeys(fname);
	}
	public void lname(String lname) 
	{
		driver.findElement(lastname).sendKeys(lname);
	}
	public void zip( String zip)
	{
		driver.findElement(zipcode).sendKeys(zip);
	}
	public void continueit( )
	{
		driver.findElement(continu).click();
	}
	public void finishcheckout( )
	{
		driver.findElement(finishit).click();
	}
	public void checkouterror()
	{
		System.out.println(driver.findElement(By.xpath("//h3[@data-test='error']")).getText());
	}
	public void productshome()
	{
		driver.findElement(backTOproduct).click();
	}
}
