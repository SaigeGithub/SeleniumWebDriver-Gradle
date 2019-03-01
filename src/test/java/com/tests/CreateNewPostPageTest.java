package com.tests;

import com.aventstack.extentreports.Status;
import com.vsysq.base.ExtentTestManager;
import com.vsysq.base.TestBase;
import com.vsysq.pages.BasePage;
import com.vsysq.pages.CreateNewPostPage;
import com.vsysq.pages.SignInPage;
import com.vsysq.pages.UniversityStarPage;
import org.apache.bcel.generic.BASTORE;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class CreateNewPostPageTest extends TestBase {

    private WebDriver driver;
    private UniversityStarPage usp;
    private CreateNewPostPage cnpp;
    private BasePage basePage;
    private SignInPage signInPage;

    @BeforeClass
    public void setUp() {
        //Get driver
        driver = getDriver();
    }

    @Test
    public void checkPage(){
        basePage = new BasePage(driver);
        signInPage = basePage.clickSignInBtn();

        String username = "info@madoor.com";
        String password = "Madoor107!";
        usp = signInPage.SignInUstar(username,password);
        try{
            sleep(1000);

        } catch(Exception exc){
        }
        cnpp = usp.clickNewPost();
        try{
            sleep(1000);

        } catch(Exception exc){
        }
        ExtentTestManager.getTest().log(Status.INFO, "Verify the heading function on CreateNewPostPage");
        Assert.assertTrue(cnpp.checkHeading(), "heading doesn't work");
    }
}
