package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.CreateNewAccount;
import org.pojo.FbLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
		
	@Given("open fb login page")
	public void open_fb_login_page1() {
		openChromeBrowser();
		launchUrl("https://www.facebook.com/");
		
	
	}

		@Given("maximize the window")
		public void maximize_the_window() {
			maxWindow();
		}

		@When("enter valid username and invalid password")
		public void enter_valid_username_and_invalid_password() throws IOException {
			FbLoginPage f = new FbLoginPage();
			WebElement username = f.getUsername();
			username.sendKeys(readDataFromExcel(0, 7, 0));
			
			WebElement pass = f.getPass();
			pass.sendKeys(readDataFromExcel(0, 7, 1));
		}

		@When("click login button")
		public void click_login_button() {
			FbLoginPage f = new FbLoginPage();
			WebElement submit = f.getSubmit();
			submit.click();
		}

		@Then("need to be in password incorrect page")
		public void need_to_be_in_password_incorrect_page() {
		   String currentUrl = driver.getTitle();
		   if(currentUrl.contains("privacy_mutation_token")) {
			   System.out.println("Test Pass");
		   }
		   else {
			   System.out.println("InCorrect page - test failed");
		   }
		}
	
		

		@When("create new account button")
		public void create_new_page() throws InterruptedException {
			Thread.sleep(5000);
			CreateNewAccount c = new CreateNewAccount();
			WebElement createNewAccbut = c.getCreateNewAccbut();
			createNewAccbut.click();
			
		}

		@When("enter details")
		public void enter_details() throws InterruptedException {
			Thread.sleep(5000);
			CreateNewAccount c = new CreateNewAccount();
			WebElement firstName = c.getFirstName();
			firstName.sendKeys("8012178331");
			WebElement surName = c.getSurName();
			surName.sendKeys("B");
			WebElement phoneNumber = c.getPhoneNumber();
			phoneNumber.sendKeys("8012178331");
			WebElement newPassword = c.getNewPassword();
			newPassword.sendKeys("Kavi@1389");
			WebElement date = c.getDate();
			date.click();
			selectIndex(date, 2);
			WebElement month = c.getMonth();
			month.click();
			selectIndex(month, 2);
			WebElement year = c.getYear();
			year.click();
			selectIndex(year, 12);
			WebElement gender = c.getGender();
			gender.click();
			
		  
		}

		@Then("signup")
		public void signup() {
			CreateNewAccount c = new CreateNewAccount();
			WebElement signup = c.getSignup();
			signup.click();
		}
	

}
