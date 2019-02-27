package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.*;

public class BasePage {
    protected WebDriver driver;
    private By signInButton = By.xpath("//*[@id=\"root\"]/header/ul/li[2]/div/span");
    private By UniversityStudent=By.xpath("//*[@id=\"how-it-works\"]/div[2]/div/div/div/button[2]/span/span/span/span");
    private By HighSchoolStudent=By.xpath("//*[@id=\"how-it-works\"]/div[2]/div/div/div/button[1]/span/span/span/span");
    private By whatwedoButton =By.linkText("What we do");
    private By ContinueButton =By.xpath("//*[@id=\"root\"]/header/ul/li[3]/a/span");
    private By signupButton =By.linkText("Sign up");
    private By GetStartedButton=By.xpath("//*[@id=\"root\"]/div/div/main/section[1]/button/span");
    private By HomeButton =By.xpath("//*[@id=\"root\"]/div/div/footer/div/div[2]/ul/li[1]/a/span");
    private By TermsButton=By.xpath("//*[@id=\"root\"]/div/div/footer/div/div[2]/ul/li[3]/a/span");
    private By FAQButton=By.xpath("//*[@id=\"root\"]/div/div/footer/div/div[2]/ul/li[4]/a/span");
    private By PrivacyPolicyButton=By.xpath("//*[@id=\"root\"]/div/div/footer/div/div[2]/ul/li[2]/a/span");


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage clickSignInBtn() {
        System.out.println("clicking on sign in button");

        WebElement signInBtnElement = driver.findElement(signInButton);
        if (signInBtnElement.isDisplayed() || signInBtnElement.isEnabled())
            signInBtnElement.click();
        else
            System.out.println("Element not found");
        return new SignInPage(driver);
    }


    public boolean verifyWhatWeDo (){
        System.out.println("Test What we do");
        WebElement UniBtnElement = driver.findElement(UniversityStudent);
        WebElement HighBtnElement = driver.findElement(HighSchoolStudent);
        if (UniBtnElement.isEnabled()) {
            UniBtnElement.click();
        }else{
            return false;}
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (HighBtnElement.isEnabled()){
            HighBtnElement.click();}
        else{
            return false;}
        return true;

    }

    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public boolean verifyBasePageTitle() {
        String expectedPageTitle = "React App";
        return getPageTitle().contains(expectedPageTitle);
    }

    public void GoBack(){
        driver.navigate().back();
    }

    public CreateAccountPage clickSignUp(){
        WebElement SignUp= driver.findElement(signupButton);
        if (SignUp.isDisplayed()|| SignUp.isEnabled())
            SignUp.click();
        else
            System.out.println("Sign up not found");
        return new CreateAccountPage(driver);
    }

    public TermsPage clickTerms(){
        WebElement element=driver.findElement(TermsButton);
        if(element.isDisplayed()||element.isEnabled())
            element.click();
        return new TermsPage(driver);
    }


}