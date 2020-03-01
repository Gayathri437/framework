package com.actiTime.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.Utilities.BaseClass;

public class OpenTaskPage {

		@FindBy(linkText="Projects & Customers")
		private WebElement projectsAndCustomerLink;
		
		@FindBy(linkText="delete")
		private WebElement deleteLink;
		@FindBy(xpath="//input[@value='Add New Tasks']")
		private WebElement addNewTasksButton;
		
		@FindBy(className="successmsg")
		private WebElement successMessage;
		
		public   OpenTaskPage() {
			PageFactory.initElements(BaseClass.driver, this);
		}
	public void clickProjectsAndCustomersLink()
	{
		projectsAndCustomerLink.click();
	}
    public void AddNewTasksButton()
{
	addNewTasksButton.click();
}
public String retrieveSuccessMessage()
{
	String s=successMessage.getText();
	System.out.println(s);
	return s;
}
public void clickOnDeleteLink()
{
	deleteLink.click();
}
public void clickOnDeletePopup()
{
	BaseClass.driver.switchTo().alert().accept();
}
}



