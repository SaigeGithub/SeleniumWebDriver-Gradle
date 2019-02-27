package com.tests;

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
        ExtentTestManager.getTest().createNode("Sign in with wrong password");
        String username = "info.madoor@gmail.com";
        String password = "Madoor107!";
        Hpage = signInPage.SignInHStudent(username,password);
        Assert.assertTrue(Hpage.verifyProfile(), "Unable to sign in");


    }
}
