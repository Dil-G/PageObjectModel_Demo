package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.TasksPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskPageTest  extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TasksPage tasksPage;
    public TaskPageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        tasksPage = homePage.clickOnTaskLink();
    }


    @Test(priority = 1)
    public void taskPageTitleTest() {

        boolean flag= tasksPage.validateTaskPageTitle();
        Assert.assertTrue(flag,"Cannot find the Title");

    }


    @Test(priority = 2)
    public void tasksePageLogoutButtonTest() {

        tasksPage.logout();

    }
    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}
