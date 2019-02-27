package com.tests;

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
        ExtentTestManager.getTest().createNode("checking high school");
        Assert.assertTrue(termsPage.verifyHighSchool(), "high school doesn't match");
        ExtentTestManager.getTest().createNode("checking university");
        termsPage.clickUniversity();
        Assert.assertTrue(termsPage.verifyUniversity(), "university doesn't match");
        ExtentTestManager.getTest().createNode("checking privacy policy");
        termsPage.clickPrivacyPolicy();
        Assert.assertTrue(termsPage.verifyPrivacyPolicy(), "bad privacy policy");
        ExtentTestManager.getTest().createNode("Checking privacy Agreement");
        termsPage.clickPrivateAgr();
        Assert.assertTrue(termsPage.verifyPrivacyAgr(), "bad privacy agreement");
    }


}
