package com.AmazonAutomation.QA.PageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation.QA.BaseClassPackage.BaseClass;

public class LaunchAndLoginPageObject extends BaseClass
{

	@FindBy(xpath="//div[@class='nav-fill']//descendant::input[@id='twotabsearchtextbox']")
	private WebElement
	searchBoxInMainMenu;
	
	@FindBy(xpath="//div[@class='nav-fill']//descendant::input[@id='nav-search-submit-button']")
	private WebElement
	mirrorImage;
	public LaunchAndLoginPageObject()
	{
		PageFactory.initElements(driver, this);
	}


	public void launchApplication()
	{
		driver.get(prop.getProperty("istURL"));
	}

	public void displayproducts(String data)
	{
		driver.navigate().to(prop.getProperty("istURL"));
		searchBoxInMainMenu.sendKeys(data);
		mirrorImage.click();
	}
	
	
	
	public void closeApplication()
	{
		driver.close();
		driver.quit();
	}
}
