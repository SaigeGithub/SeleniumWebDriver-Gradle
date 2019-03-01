package com.tests;

import com.aventstack.extentreports.Status;
import com.vsysq.base.ExtentTestManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsysq.base.TestBase;
import com.vsysq.pages.BasePage;
import com.vsysq.pages.SignInPage;

public class SignInPageTest extends TestBase {

    private WebDriver driver;
    private SignInPage signInPage;
    private BasePage basePage;

    @BeforeClass
    public void setUp() {
        //Get driver
        driver = getDriver();
    }

    @Test
    public void verifySignInFunction() {
        System.out.println("Sign In functionality details...");
        basePage = new BasePage(driver);
        signInPage = basePage.clickSignInBtn();
        ExtentTestManager.getTest().log(Status.INFO, "Check Sign In Page Title");
        Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");

        String username ="info@madoor.com";
        String password ="1234567";
        ExtentTestManager.getTest().log(Status.INFO, "Check Sign In Function");
        Assert.assertTrue(signInPage.verifySignIn(username,password), "Unable to sign in");

        ExtentTestManager.getTest().log(Status.INFO, "Click on Wechat login");
        Assert.assertTrue(signInPage.verifyWechat(), "Unable to use wechat login");

        basePage.GoBack();
        signInPage = basePage.clickSignInBtn();
        ExtentTestManager.getTest().log(Status.INFO, "Click on Facebook login");
        Assert.assertTrue(signInPage.verifyFacebook(), "Unable to use facebook login");
        basePage.GoBack();
        signInPage = basePage.clickSignInBtn();
        ExtentTestManager.getTest().log(Status.INFO, "Check Google login");
        Assert.assertTrue(signInPage.verifyGoogle(), "Unable to use Google login");
    }

    @Test
    public void verifyForgotPassword() {
        basePage = new BasePage(driver);
        signInPage =basePage.clickSignInBtn();

        String email= "info@madoor.com";
        ExtentTestManager.getTest().log(Status.INFO, "verify the forgot password function");
        Assert.assertTrue(signInPage.verifyForgotPassword(email), "Unable to use forgot password");
        basePage.GoBack();
    }

}
