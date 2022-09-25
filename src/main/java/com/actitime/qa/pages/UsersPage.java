package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;

public class UsersPage extends TestBase  {

    @FindBy(xpath = "//div[@class='pagetitle']")
    WebElement userListTitle;

    @FindBy(xpath = "html/body/div/div[12]/table/tbody/tr[2]/td/div/div/div[2]/div")
    WebElement attendanceButton;

    @FindBy(xpath = "//div[@class='components_button withPlusIcon']")
    WebElement addUserButton;

    @FindBy(xpath = "//th[@class='ptoTab plannedLeavesHeader manageSickDaysHeader managePTOHeader firstLayer']")
    WebElement userAttendance;

    @FindBy(xpath = "//div[@id='createUserPanel']")
    WebElement createUserPanel;

    @FindBy(xpath = "//div[@id='editUserPanel']")
    WebElement editUserPanel;

    @FindBy(xpath = "//div[@class='userNameContent clickable']")
    WebElement userRow;

    @FindBy(xpath = "//a[@id='logoutLink']")
    WebElement logoutButton;


    public UsersPage() {
        PageFactory.initElements(driver, this);
    }

    public Boolean validateUserListTitle() {
        return userListTitle.isDisplayed();
    }

    public Boolean addUser() {
        addUserButton.click();
        if(createUserPanel.isDisplayed()) {
            return true;
        }else {
            return false;
        }
    }

    public Boolean  viewUser() {
        userRow.click();
        if(editUserPanel.isDisplayed()) {
            return true;
        }else {
            return false;
        }
    }


    public boolean userLeaves() {
        attendanceButton.click();
        if(userAttendance.isDisplayed()) {
            return true;
        }else {
            return false;
        }
    }

    public LoginPage logout() {


        logoutButton.click();
        return new LoginPage();

    }
}