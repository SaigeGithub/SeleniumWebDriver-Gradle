package com.tests;

import com.aventstack.extentreports.Status;
import com.vsysq.base.ExtentTestManager;
import com.vsysq.base.TestBase;
import com.vsysq.pages.BasePage;
import com.vsysq.pages.SignInPage;
import com.vsysq.pages.TermsPage;

import com.vsysq.pages.UniversityStarPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UniversityStarPageTest extends TestBase {
    private WebDriver driver;
    private SignInPage signInPage;
    private BasePage basePage;
    private UniversityStarPage Upage;

    @BeforeClass
    public void setUp() {
        //Get driver
        driver = getDriver();
    }

    @Test
    public void verifyUStarSignIn() {
        System.out.println("Sign In functionality details...");
        basePage = new BasePage(driver);
        signInPage = basePage.clickSignInBtn();

        String username = "info@madoor.com";
        String password = "Madoor107!";
        Upage = signInPage.SignInUstar(username,password);
        basePage.wait100();
        ExtentTestManager.getTest().log(Status.INFO, "sign in as university student");
        Assert.assertTrue(Upage.verifyProfile(), "Unable to sign in");


    }
}
