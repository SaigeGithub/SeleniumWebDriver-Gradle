package com.tests;

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
        ExtentTestManager.getTest().createNode("Sign In Title");
        Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
        ExtentTestManager.getTest().createNode("Sign in with wrong password");
        String username ="info@madoor.com";
        String password ="1234567";
        Assert.assertTrue(signInPage.verifySignIn(username,password), "Unable to sign in");

        ExtentTestManager.getTest().createNode("Verify Wechat");
        Assert.assertTrue(signInPage.verifyWechat(), "Unable to use wechat login");
        basePage.GoBack();
        signInPage = basePage.clickSignInBtn();
        ExtentTestManager.getTest().createNode("Verify Facebook");
        Assert.assertTrue(signInPage.verifyFacebook(), "Unable to use facebook login");
        basePage.GoBack();
        signInPage = basePage.clickSignInBtn();
        ExtentTestManager.getTest().createNode("Verify Google");
        Assert.assertTrue(signInPage.verifyGoogle(), "Unable to use Google login");
    }

    @Test
    public void verifyForgotPassword() {
        basePage = new BasePage(driver);
        signInPage =basePage.clickSignInBtn();
        ExtentTestManager.getTest().createNode("Forgot Password");
        String email= "info@madoor.com";
        Assert.assertTrue(signInPage.verifyForgotPassword(email), "Unable to use Google login");
        basePage.GoBack();
    }
//
//    @Test
//    public void SignInPageTestTwo() {
//        System.out.println("Hey im in example test two");
//    }
//
//    @Test
//    public void SignInPageTestThree() {
//        System.out.println("Hey im in example test three");
//    }
}
