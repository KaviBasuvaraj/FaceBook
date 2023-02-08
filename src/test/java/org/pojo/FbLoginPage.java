package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage extends BaseClass {
	
	public FbLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//input[@type='text']"))
	private WebElement username;
	
	
	@CacheLookup
	@FindBys({
		@FindBy(xpath=("//input[@type='password']")),
		@FindBy(xpath=("//input[@name='pass']"))
		
	})
	private WebElement pass;
	
	
	@CacheLookup
	@FindAll({
		@FindBy(xpath = ("//button[@type='submit']"))
		
	})
	private WebElement submit;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
		
	

}
