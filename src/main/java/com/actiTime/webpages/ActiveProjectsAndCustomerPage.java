package com.actiTime.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.Utilities.BaseClass;



public class ActiveProjectsAndCustomerPage {
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addNewCustomerButton;
	
	@FindBy(xpath="//input[@value='Add New Project']")
		private WebElement addNewProjectButton;
	
	@FindBy(className="successmsg")
	private WebElement successMessage;
	
	//@FindBy(linkText="gaytt")//have to change every time to delete
	//private WebElement exitedCustomer;
	
	//@FindBy(linkText="project20")//have to change  every time to delete
	//private WebElement exitedProject;
	
	//@FindBy(className="1")//have to change  every time to delete
//	private WebElement exitedTask;
	
	//@FindBy(xpath="//input[@value='Add New Project']")
	//private WebElement addNewProjectButton;

	public ActiveProjectsAndCustomerPage() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	public void clickOnAddNewCustomerButton(){
		addNewCustomerButton.click();
	}
	public void clickOnAddNewProjectButton(){
		addNewProjectButton.click();
	}
	public String retrieveSuccessMessage() {
		// TODO Auto-generated method stub
		String s=successMessage.getText();
		return s;
	}
//	public void clickOnProject(){
	//	exitedProject.click();
	//}
		//public void clickOnCustomer(){
			//exitedCustomer.click();	
	//}
		//public void clickOnAddNewProjectButton(){
			//addNewProjectButton.click();
		//}
	//public void clickOnTasks(){
	//	exitedTask.click();
	//}
}



