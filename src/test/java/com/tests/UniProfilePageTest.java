package com.tests;

import com.aventstack.extentreports.Status;
import com.vsysq.base.ExtentTestManager;
import com.vsysq.base.TestBase;
import com.vsysq.pages.BasePage;
import com.vsysq.pages.SignInPage;
import com.vsysq.pages.UniProfilePage;
import com.vsysq.pages.UniversityStarPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UniProfilePageTest extends TestBase {

    private WebDriver driver;
    private SignInPage signInPage;
    private BasePage basePage;
    private UniversityStarPage Upage;
    private UniProfilePage Profile;
    @BeforeClass
    public void setUp() {
        //Get driver
        driver = getDriver();
    }

    @Test
    public void checkTheButtons(){
        basePage = new BasePage(driver);
        signInPage = basePage.clickSignInBtn();

        String username = "info@madoor.com";
        String password = "Madoor107!";
        String temp =" Test";
        String birth="02021994";
        String character="c";
        Upage = signInPage.SignInUstar(username,password);
        basePage.wait100();
        Upage.clickProfile();
        Profile=Upage.GetProfile();
        ExtentTestManager.getTest().log(Status.INFO, "Click on edit");
        basePage.wait100();
        Profile.ClickOnEdit();
        ExtentTestManager.getTest().log(Status.INFO, "enter first name");
        Profile.SendFirstName(temp);
        ExtentTestManager.getTest().log(Status.INFO, "enter last name");
        Profile.SendLastName(temp);
        ExtentTestManager.getTest().log(Status.INFO, "click on Female");
        Profile.ClickOnFemale();
        ExtentTestManager.getTest().log(Status.INFO, "Click on Male");
        Profile.ClickOnMale();
        ExtentTestManager.getTest().log(Status.INFO, "Click on Male");
        Profile.ClickOnMale();
        ExtentTestManager.getTest().log(Status.INFO, "Enter BirthDay");
        Profile.SendBirth(birth);

        ExtentTestManager.getTest().log(Status.INFO, "click on current enrolled university");
        Profile.ClickOnUniversity();
        basePage.wait100();

        ExtentTestManager.getTest().log(Status.INFO, "enter a key word in University");
        Profile.SendUniversity(character);
        basePage.wait100();

        ExtentTestManager.getTest().log(Status.INFO, "select enrolled university");
        Profile.SelectUniversity();

        ExtentTestManager.getTest().log(Status.INFO, "click on field of study");
        Profile.ClickOnStudy();
        basePage.wait100();

        ExtentTestManager.getTest().log(Status.INFO, "enter a key word in field of study");
        Profile.SendStudy(character);
        basePage.wait100();


        ExtentTestManager.getTest().log(Status.INFO, "Select one in field of study");
        Profile.SelectStudy();

        ExtentTestManager.getTest().log(Status.INFO, "re-enter 'I am from'");
        Profile.SendIamFrom(temp);

        ExtentTestManager.getTest().log(Status.INFO, "Click on Year of admittance");
        Profile.ClickOnYear();

        basePage.wait100();
        ExtentTestManager.getTest().log(Status.INFO, "Select Year of admittance");
        Profile.SelectYear();

        ExtentTestManager.getTest().log(Status.INFO, "re-enter about me");
        Profile.SendAboutMe(temp);


    }
}