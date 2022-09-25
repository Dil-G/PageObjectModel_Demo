package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class HomePage extends TestBase {

	
	//Page Factory - Object Repository
	
		@FindBy(xpath = "//a[@class='content tasks']")
		WebElement taskLink;
		
		@FindBy(xpath = "//a[@class='content reports']")
		WebElement reportsLink;

		@FindBy(xpath = "//a[@class='content users']")
		WebElement usersLink;

		@FindBy(xpath = "//div[@id='logo_aT']")
		WebElement actitimeLogo;

		@FindBy(xpath = "//div[@class='logoSwitcherText']")
		WebElement actitimePlanSwitch;




		
		//initialization
		
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		//Action/Methods
		
		public Boolean validateActiTimeLogo() {
			return actitimeLogo.isDisplayed();
		}


		
		public TasksPage clickOnTaskLink() {
			
			taskLink.click();
			return new TasksPage();
			
		}

	public UsersPage clickOnUsersLink() {

		usersLink.click();
		return new UsersPage();

	}


	public ReportsPage clickOnReportsLink() {
			
	         reportsLink.click();
	         return new ReportsPage();
			
		}

	
}
