package com.SauceClass;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginPage extends SauceObject
{
	WebDriver driver;
	public SauceLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void addDataFile() throws IOException
		{
		String file = "/Volumes/Learnings/Selinium/Login.xlsx";
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		System.out.println("Number of rows: " +rows);
		try {
			for(int i= 1; i<=rows;i++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell UName = row.getCell(0);
				XSSFCell PWD = row.getCell(1);
				System.out.println("Email given--- "+UName+" ****  password given ----"+PWD);
				driver.findElement(UserName).sendKeys(UName.toString());
				driver.findElement(Password).sendKeys(PWD.toString());
				driver.findElement(Login).click();
				Thread.sleep(2000);
				String exp = "https://www.saucedemo.com/inventory.html";
				System.out.println(driver.getCurrentUrl());
				if(driver.getCurrentUrl().equals(exp))
					{
					driver.findElement(menubutton).click();
					driver.findElement(logout).click();
					}
				else
				{
					System.out.println(driver.findElement(By.xpath("//div[@class=\"login-box\"]/form/div[3]/h3")).getText());
				}
				driver.navigate().refresh();
			}
		}
				catch(Exception a)
				{
						System.out.println("Invalid data");
				}
				
			}
	public void UserName(String uname)
	{
		driver.findElement(UserName).sendKeys(uname);
	}
	public void password(String pass)
	{
		driver.findElement(Password).sendKeys(pass);
	}
	public void signIN()
	{
		driver.findElement(Login).click();
	}
	public void menuIcon()
	{
		driver.findElement(menubutton).click();
	}
	public void signout()
	{
		driver.findElement(logout).click();
	}
	public void reset()
	{
		driver.findElement(resetbtn).click();
		driver.findElement(closeSidebar).click();
		driver.navigate().refresh();
	}
}
		
		
		
		
	
