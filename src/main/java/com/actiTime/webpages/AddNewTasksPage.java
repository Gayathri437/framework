package com.actiTime.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actiTime.Utilities.BaseClass;

public class AddNewTasksPage {

	@FindBy(xpath="//input[@value='Add New Tasks']")
			private WebElement addNewTaskButton;
	@FindBy(name="customerId")
	private WebElement SelectCustomertoAddTasksDropdown;
	@FindBy(name="projectId")
	private WebElement projectDropdown;
	@FindBy(name="task[0].name")
	private WebElement taskNameTextField;
	@FindBy(xpath="//input[@value='Create Tasks']")
	private WebElement createTasksButton;
	public  AddNewTasksPage()
	{
		
		
		PageFactory.initElements(BaseClass.driver,this);
	}
	public void SelectCustomertoAddTasksDropdown(String dd2 )
	{
		Select s2=new Select(SelectCustomertoAddTasksDropdown);
		s2.selectByVisibleText(dd2);
	}
	public void projectDropdown(String dd3)
	{
		Select s3=new Select(projectDropdown);
		s3.selectByVisibleText(dd3);
	}
	public void taskNameTextField(String text)
	{
		taskNameTextField.sendKeys(text);	
	}
	public void createTasksButton()
	{
		createTasksButton.click();
	}
	


}




