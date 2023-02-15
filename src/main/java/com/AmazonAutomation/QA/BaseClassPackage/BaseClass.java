package com.AmazonAutomation.QA.BaseClassPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
 
  public  static WebDriver driver;	
  public static Properties prop;
  public static String propertyfilepath="C:\\Users\\hp\\OneDrive\\Desktop\\Bindu\\save_backups\\MyDemoProject\\AmazonAutomation\\src\\main\\java\\com\\AmazonAutomation\\QA\\Configuration\\config.properties\\";
  public static File file;
  public static FileInputStream fis;
  
  
  public BaseClass()
  {
	 file = new File(propertyfilepath);
	 try {
		fis = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 prop = new Properties();
	 try {
		prop.load(fis);
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
  
  
  @Test
  public void initialize() 
  {
	  if(prop.getProperty("browserToExecute").equalsIgnoreCase("chrome")==true)
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }else if(prop.getProperty("browserToExecute").equalsIgnoreCase("firefox")==true)
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  
	  }else if(prop.getProperty("browserToExecute").equalsIgnoreCase("edge")==true)
	  {
		  WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
		  
	  }else if(prop.getProperty("browserToExecute").equalsIgnoreCase("ie")==true)
	  {
		  WebDriverManager.iedriver().setup();
		  driver = new InternetExplorerDriver();
		  
	  }
	  
	  driver.manage().window().maximize();
	  
  }
}
