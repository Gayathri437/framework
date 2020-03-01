package com.actiTime.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actiTime.Utilities.BaseClass;

public class AddNewProjectPage {
@FindBy(name="customerId")
private WebElement customerDropdown;
@FindBy(name="name")
private WebElement ProjectNameTextField;
@FindBy(name="createProjectSubmit")
private WebElement CreateProjectButton;
public AddNewProjectPage()
{
	PageFactory.initElements(BaseClass.driver,this);
}
public void CustomerDropdown(String customerName)
{
	Select s1=new Select(customerDropdown);
	s1.selectByVisibleText(customerName);
}
public void ProjectNameTextField(String projectName)
{
	ProjectNameTextField.sendKeys(projectName);
}
public void CreateProjectButton()
{
	CreateProjectButton.click();
}
//public String RetrieveSuccessMessage()
//{
	//RetrieveSuccessMessage.getText();
	
//}
}

