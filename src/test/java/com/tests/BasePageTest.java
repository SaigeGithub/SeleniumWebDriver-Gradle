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
        BasePage basePage = new BasePage(driver);
        ExtentTestManager.getTest().createNode("Web Title");
        ExtentTestManager.getTest().log(Status.INFO, "Verify Web Title");
        Assert.assertTrue(basePage.verifyBasePageTitle(), "Home page title doesn't match");
        ExtentTestManager.getTest().createNode("What we do");
        ExtentTestManager.getTest().log(Status.INFO, "Verify what we do");
        System.out.println("Hey I am testing what we do");
        Assert.assertTrue(basePage.verifyWhatWeDo(), "What we do cannot be clicked");

    }

//    @Test
////    public void HomePage() {
////        ExtentTestManager.getTest().createNode("What we do");
////        ExtentTestManager.getTest().log(Status.INFO, "Verify what we do");
////        System.out.println("Hey I am testing what we do");
////        BasePage basePage = new BasePage(driver);
////        Assert.assertTrue(basePage.verifyWhatWeDo(), "What we do cannot be clicked");
////
////    }

//    @Test
//    public void baseTest2() throws InterruptedException {
//        ExtentTestManager.getTest().log(Status.INFO, "Hellooo started base test2");
//        System.out.println("Hey im in test2 test");
//        Thread.sleep(3000);
//        ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test2 1");
//        ExtentTestManager.getTest().log(Status.INFO, "Hey im in base test2 2");
//    }
//
//    @Test
//    public void HomePageButtonClickable() {
//        ExtentTestManager.getTest().log(Status.INFO, "Hellooo started HomePageButtonTest");
//
//    }

}