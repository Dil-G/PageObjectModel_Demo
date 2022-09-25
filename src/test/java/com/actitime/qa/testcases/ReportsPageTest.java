package com.actitime.qa.testcases;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReportsPageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    ReportsPage reportsPage;
    public ReportsPageTest() {
        super();

    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        reportsPage = homePage.clickOnReportsLink();
    }



    @Test(priority = 1)
	public void reportsPageLinkTest() {

        reportsPage.validateReportPageTitle();
	}

    @Test(priority = 2)
    public void reportsPageLeaveReportTest() {

        reportsPage.userLeavesReport();
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}
