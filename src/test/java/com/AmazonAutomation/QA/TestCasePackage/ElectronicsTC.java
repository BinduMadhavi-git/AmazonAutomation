package com.AmazonAutomation.QA.TestCasePackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AmazonAutomation.QA.BaseClassPackage.BaseClass;
import com.AmazonAutomation.QA.PageObjectPackage.ElectronicsPageObject;
import com.AmazonAutomation.QA.PageObjectPackage.LaunchAndLoginPageObject;

public class ElectronicsTC extends BaseClass 
{
	
    LaunchAndLoginPageObject objlaunch;
	ElectronicsPageObject	 objelectronics;
 
  
  
  @BeforeTest
  @Test
  public void createObjects() 
  {
	  objlaunch = new LaunchAndLoginPageObject();
	  objelectronics = new ElectronicsPageObject();
  }
  
  
  @Test
  public void executeTC_displayHomePageForElectronicsMainMenu()
  {
	  objlaunch.launchApplication();
	  objelectronics.displayHomePageForElectronicsMainMenu();
	  objlaunch.closeApplication();
	  
  }
  
}
