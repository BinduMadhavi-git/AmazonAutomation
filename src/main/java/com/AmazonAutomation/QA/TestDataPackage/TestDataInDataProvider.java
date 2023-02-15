package com.AmazonAutomation.QA.TestDataPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataInDataProvider 
{
  
	@DataProvider(name="AllSearchProducts")
	public Object[] dataForSearchBoxInHomePage()
	{
		Object[] data = new Object[6];
		
		data[0]="Books";
		data[1]="Mobiles";
		data[2]="Greetings";
		data[3]="Lotion";
		data[4]="Jewellery";
		data[5]="Tally Software";
		
		
		return data;
	}
	
	
	
}
