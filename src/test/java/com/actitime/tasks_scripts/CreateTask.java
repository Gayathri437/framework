package com.actitime.tasks_scripts;


import org.testng.annotations.Test;

import com.actiTime.Utilities.BaseClass;
import com.actiTime.webpages.AddNewTasksPage;
import com.actiTime.webpages.OpenTaskPage;

public class CreateTask extends BaseClass{
@Test
public void testCreateTask()
{
	OpenTaskPage otp=new OpenTaskPage();
	otp.AddNewTasksButton();
	AddNewTasksPage antp=new AddNewTasksPage();
	log.info("----------DropDown ");

	antp.SelectCustomertoAddTasksDropdown("Kuk");
	log.info("----------DropDown ");

	antp.projectDropdown("hhhhhh");
	log.info("----------DropDown ");
	
	antp.taskNameTextField("Testingdevelpementss");
	antp.createTasksButton();	
}

}
