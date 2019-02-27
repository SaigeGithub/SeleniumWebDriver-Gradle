package com.tests;

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
        Assert.assertTrue(createAccountPage.verifyPageTitle(), "Page title not matching");

    }

    @Test
    public void verifyCreateAnAccountPageOnHome() {
        basePage = new BasePage(driver);
        createAccountPage = basePage.clickSignUp();
        String username="info@madoor.com";
        String password="Edd123456";
        String password2="Edd123456";
        ExtentTestManager.getTest().createNode("Test User already exists function for sign up");
        Assert.assertTrue(createAccountPage.verifySignUp(username,password,password2),"The sign up is not functional");
    }

//    @Test
//    public void createAccountExample2() {
//        System.out.println("Hey im in Example2 test");
//    }
}
