package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage extends TestBase {


    @FindBy(xpath = "//div[@title='All Customers']")
    WebElement AllCustomersTitle;

    @FindBy(xpath = "//a[@id='logoutLink']")
    WebElement logoutButton;

    public TasksPage() {

        PageFactory.initElements(driver, this);
    }


    public Boolean validateTaskPageTitle() {
        return AllCustomersTitle.isDisplayed();
    }

    public LoginPage logout() {


        logoutButton.click();
        return new LoginPage();

    }
}
