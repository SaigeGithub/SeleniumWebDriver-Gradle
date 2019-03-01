package com.tests;

import com.aventstack.extentreports.Status;
import com.vsysq.base.ExtentManager;
import com.vsysq.base.ExtentTestManager;
import com.vsysq.pages.TermsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsysq.base.TestBase;
import com.vsysq.pages.BasePage;


public class TermsPageTest extends TestBase{
    private WebDriver driver;
    private TermsPage termsPage;
    private BasePage basePage;


    @BeforeClass
    public void setUp() {
        //Get driver
        driver = getDriver();
    }

    @Test
    public void verifyTermPage(){
        basePage = new BasePage(driver);
        termsPage = basePage.clickTerms();
        ExtentTestManager.getTest().log(Status.INFO, "check the high school student agreement");
        Assert.assertTrue(termsPage.verifyHighSchool(), "high school doesn't match");

        termsPage.clickUniversity();
        ExtentTestManager.getTest().log(Status.INFO, "Check the University student agreement");
        Assert.assertTrue(termsPage.verifyUniversity(), "university doesn't match");

        termsPage.clickPrivacyPolicy();
        ExtentTestManager.getTest().log(Status.INFO, "Check the privacy policy");
        Assert.assertTrue(termsPage.verifyPrivacyPolicy(), "bad privacy policy");

        termsPage.clickPrivateAgr();
        ExtentTestManager.getTest().log(Status.INFO, "Check the privacy agreement");
        Assert.assertTrue(termsPage.verifyPrivacyAgr(), "bad privacy agreement");
    }


}
