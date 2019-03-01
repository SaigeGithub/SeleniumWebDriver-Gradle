package com.tests;

import com.aventstack.extentreports.Status;
import com.vsysq.base.ExtentTestManager;
import com.vsysq.base.TestBase;
import com.vsysq.pages.BasePage;
import com.vsysq.pages.HighSchoolStudentPage;
import com.vsysq.pages.SignInPage;
import com.vsysq.pages.UniversityStarPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HighSchoolStudentPageTest extends TestBase {
    private WebDriver driver;
    private SignInPage signInPage;
    private BasePage basePage;
    private HighSchoolStudentPage Hpage;

    @BeforeClass
    public void setUp() {
        //Get driver
        driver = getDriver();
    }

    @Test
    public void verifyStudentAccountSignIn() {
        System.out.println("Sign In functionality details...");
        basePage = new BasePage(driver);
        signInPage = basePage.clickSignInBtn();

        String username = "info.madoor@gmail.com";
        String password = "Madoor107!";
        Hpage = signInPage.SignInHStudent(username,password);
        ExtentTestManager.getTest().log(Status.INFO, "Sign in as high school student");
        Assert.assertTrue(Hpage.verifyProfile(), "Unable to sign in");


    }
}
