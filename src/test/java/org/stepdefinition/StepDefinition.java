package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.FbLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
		
		@Given("fb login page")
		public void fb_login_page() {
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
	

}
