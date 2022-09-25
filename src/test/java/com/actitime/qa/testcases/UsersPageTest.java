package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsersPageTest extends TestBase{

    LoginPage loginPage;
    HomePage homePage;
    UsersPage usersPage;

    public UsersPageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        homePage.clickOnUsersLink();
        usersPage = new UsersPage();
    }

    @Test(priority = 1)
    public void userListTitleTest() {
        boolean flag= usersPage.validateUserListTitle();
        Assert.assertTrue(flag,"Cannot find the Title");

	}

    @Test(priority = 2)
    public void viewUserProfileTest() {
        boolean flag= usersPage.viewUser();
        Assert.assertTrue(flag,"Cannot View User");

    }

    @Test(priority = 3)
    public void reviewUserLeavesTest() {
        boolean flag= usersPage.userLeaves();
        Assert.assertTrue(flag,"Cannot view User attendance");

    }

    @Test(priority = 4)
    public void addUserTest() {
        boolean flag= usersPage.addUser();
        Assert.assertTrue(flag,"Cannot add User");

    }
    @Test(priority = 5)
    public void tasksePageLogoutButtonTest() {

        usersPage.logout();

    }
    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}