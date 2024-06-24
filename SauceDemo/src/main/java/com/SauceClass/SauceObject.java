package com.SauceClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceObject {
	WebDriver driver;
	By UserName = By.id("user-name");
	By Password = By.id("password");
	By Login = By.id("login-button");
	By menubutton = By.id("react-burger-menu-btn");
	By logout = By.id("logout_sidebar_link");
	By backTOproduct = By.id("back-to-products");
	By resetbtn = By.id("reset_sidebar_link");
	By allitems = By.id("inventory_sidebar_link");
	By closeSidebar = By.id("react-burger-cross-btn");
	By SauceLabsBackpack = By.id("item_4_title_link");
	By SauceLabsBikeLight = By.id("item_0_title_link");
	By SauceLabsBoltTShirt = By.id("item_1_title_link");
	By SauceLabsFleeceJacket = By.id("item_5_title_link");
	By addTOkart = By.id("add-to-cart");
	By kartpage = By.id("shopping_cart_container");
	By checkout = By.id("checkout");
	By firstname = By.id("first-name");
	By lastname = By.id("last-name");
	By zipcode = By.id("postal-code");
	By continu = By.xpath("//input[@type='submit']"); 
	By finishit = By.id("finish");
	
}
