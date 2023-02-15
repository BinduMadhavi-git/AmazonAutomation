package com.AmazonAutomation.QA.PageObjectPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation.QA.BaseClassPackage.BaseClass;

public class ElectronicsPageObject extends BaseClass 
{
 
	@FindBy(xpath="//div[@class='nav-fill']//descendant::a[contains(text(),'Electronics')]")
	private WebElement
	electronicsInMainMenu;
	
   public ElectronicsPageObject() 
   	{
	    PageFactory.initElements(driver, this);
   	}
   
   
   public void displayHomePageForElectronicsMainMenu()
   {
	   electronicsInMainMenu.click();
   }
}
