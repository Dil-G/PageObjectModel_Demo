package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage extends  TestBase {


    @FindBy(xpath = "//td[@class='pagetitle']")
    WebElement ReportsDashboard;

    @FindBy(xpath = "//table[@class='configItemContainer CHART TIME  enabled']")
    WebElement leaveReport;

    @FindBy(xpath = "//div[@id='createChartLightbox_content']")
    WebElement leaveReportChart;

    public ReportsPage() {

        PageFactory.initElements(driver, this);
    }


    public Boolean validateReportPageTitle() {

        return ReportsDashboard.isDisplayed();

    }
    public boolean userLeavesReport() {
        leaveReport.click();
        if(leaveReportChart.isDisplayed()) {
            return true;
        }else {
            return false;
        }
    }




}
