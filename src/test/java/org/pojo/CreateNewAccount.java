package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount extends BaseClass {
	
	public CreateNewAccount() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAccbut;
	
	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")
	private WebElement surName;
		
	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	private WebElement phoneNumber;
	
	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")
	private WebElement newPassword;
	
	@FindBy(xpath="(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]")
	private WebElement date;
	
	@FindBy(xpath="(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]")
	private WebElement month;
	
	@FindBy(xpath="(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]")
	private WebElement year;
	
	@FindBy(xpath="(//label[@class='_58mt'])[2]")
	private WebElement gender;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement signup;

	public WebElement getCreateNewAccbut() {
		return createNewAccbut;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignup() {
		return signup;
	}
	
	
	
	
}
