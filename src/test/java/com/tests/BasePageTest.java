package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.vsysq.base.ExtentTestManager;
import com.vsysq.base.TestBase;
import com.vsysq.pages.BasePage;

public class BasePageTest extends TestBase {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @Test
    public void verifyHomePage() {
        System.out.println("Home page test...");
        ExtentTestManager.getTest().log(Status.INFO, "Open up home Page");
        BasePage basePage = new BasePage(driver);

        ExtentTestManager.getTest().log(Status.INFO, "Verify Web Title");
        Assert.assertTrue(basePage.verifyBasePageTitle(), "Home page title doesn't match");

        ExtentTestManager.getTest().log(Status.INFO, "Verify what we do");
        System.out.println("Hey I am testing what we do");
        Assert.assertTrue(basePage.verifyWhatWeDo(), "What we do cannot be clicked");

    }



}