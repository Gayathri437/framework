package com.actitime.projects_scripts;

import org.testng.annotations.Test;

import com.actiTime.Utilities.BaseClass;
import com.actiTime.webpages.ActiveProjectsAndCustomerPage;
import com.actiTime.webpages.AddNewProjectPage;
import com.actiTime.webpages.OpenTaskPage;

public class CreateProject extends BaseClass {
  @Test
  public void testCreateProject() {
	  
	  OpenTaskPage otp= new OpenTaskPage();
		otp.clickProjectsAndCustomersLink();
		ActiveProjectsAndCustomerPage apcp=new ActiveProjectsAndCustomerPage();
		apcp.clickOnAddNewProjectButton();
		AddNewProjectPage anpp=new AddNewProjectPage();
		anpp.CustomerDropdown("happy12");
		anpp.ProjectNameTextField("surjyo");
		anpp.CreateProjectButton();
		//String s=anpp.RetrieveSuccessMessage();	
  //	System.out.println(s);  
  }
}
