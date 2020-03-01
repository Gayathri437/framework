package com.actitime.customers_scripts;

import org.testng.annotations.Test;

import com.actiTime.Utilities.BaseClass;
import com.actiTime.webpages.ActiveProjectsAndCustomerPage;
import com.actiTime.webpages.AddNewCustomerPage;
import com.actiTime.webpages.OpenTaskPage;


public class CreateCustomer extends BaseClass {

	// TODO Auto-generated method stub
	    @Test
		public void testCreateCustomer()
		{
	    	OpenTaskPage otp= new OpenTaskPage();
			otp.clickProjectsAndCustomersLink();
			ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
			apcp.clickOnAddNewCustomerButton();
			AddNewCustomerPage ancp=new AddNewCustomerPage();
			ancp.enterCustomerName("Bhavyasreegirl");
			ancp.clickOnCreateCustomerButton();
			String s=apcp.retrieveSuccessMessage();	
	    	System.out.println(s);
	  	
		}
}
