package com.AmazonAutomation.QA.TestCasePackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AmazonAutomation.QA.BaseClassPackage.BaseClass;
import com.AmazonAutomation.QA.PageObjectPackage.LaunchAndLoginPageObject;
import com.AmazonAutomation.QA.TestDataPackage.TestDataInDataProvider;

public class LaunchAndLoginTC	extends BaseClass 
{
	
  LaunchAndLoginPageObject objlaunchlogin;	
	
	
  @BeforeTest	
  @Test
  public void createObject() 
  {
  
	  objlaunchlogin = new LaunchAndLoginPageObject();
  }
  
  
  @Test
  public void launchApplicationusingURL()
  {
	  objlaunchlogin.launchApplication();
  }
  
  
  @Test(dataProvider="AllSearchProducts", dataProviderClass=TestDataInDataProvider.class)
  public void executeTC_displayproducts(String data)
  {
	  objlaunchlogin.displayproducts(data);
  }
  
    
  public void display()
  {
	  System.out.println("Hello This is the new change in the evening session");
  }
  
  public void show()
  {
	  System.out.println("This is the new message from Bindu");
  }
  
}
