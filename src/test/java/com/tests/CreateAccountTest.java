package com.tests;

import com.aventstack.extentreports.Status;
import com.vsysq.base.ExtentTestManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsysq.base.TestBase;
import com.vsysq.pages.BasePage;
import com.vsysq.pages.CreateAccountPage;
import com.vsysq.pages.SignInPage;

public class CreateAccountTest extends TestBase {
    private WebDriver driver;
    private SignInPage signInPage;
    private BasePage basePage;
    private CreateAccountPage createAccountPage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @Test
    public void verifyCreateAnAccountPageOnSignIn() {
        System.out.println("Create An Account page test...");
        basePage = new BasePage(driver);
        signInPage = basePage.clickSignInBtn();
        createAccountPage = signInPage.clickonCreateAnAccount();
        ExtentTestManager.getTest().log(Status.INFO, "Verify Sign Up on the SignIn Page");
        Assert.assertTrue(createAccountPage.verifyPageTitle(), "Page title not matching");

    }

    @Test
    public void verifyCreateAnAccountPageOnHome() {
        basePage = new BasePage(driver);
        createAccountPage = basePage.clickSignUp();
        String username="info@madoor.com";
        String password="Edd123456";
        String password2="Edd123456";
        ExtentTestManager.getTest().log(Status.INFO, "Verify Create account on Home Page");
        Assert.assertTrue(createAccountPage.verifySignUp(username,password,password2),"The sign up is not functional");
    }


}
