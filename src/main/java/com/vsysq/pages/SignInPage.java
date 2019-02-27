package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class SignInPage {

    private WebDriver driver;


    private By createAccountLink = By.xpath("//*[@id=\"signup-link\"]");
    private By emailTextBox = By.xpath("//*[@id=\"email\"]");
    private By passwordTextBox = By.xpath("//*[@id=\"password\"]");
    private By loginBtn = By.xpath("//*[@id=\"btn-login\"]");
    private By errorMsgTxt = By.xpath("//*[@id=\"error-message\"]");

    private By facebook = By.xpath("//*[@id=\"btn-facebook\"]");
    private By google = By.xpath("//*[@id=\"btn-google\"]");
    private By wechat = By.xpath("//*[@id=\"btn-wechat\"]");

    private By forgotBtn =By.xpath("//*[@id=\"forgot-password\"]");
    private By forgotSend= By.xpath("//*[@id=\"forgot-password-email\"]");
    private By submit =By.xpath("//*[@id=\"forgot-password-btn-submit\"]");

    private By forgotPassword =By.xpath("//*[@id=\"forgot-password-modal\"]/div/div[2]/div");
    private By forgotError=By.xpath("//*[@id=\"forgot-password-error-message\"]");


    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSignInPageTitle() {
        String pageTitle = driver.getTitle();
        return pageTitle;
    }

    public boolean verifySignInPageTitle() {
        String expectedTitle = "Sign In";
        return getSignInPageTitle().contains(expectedTitle);
    }



    public CreateAccountPage clickonCreateAnAccount() {
        WebElement element = driver.findElement(createAccountLink);
        if (element.isDisplayed() || element.isEnabled())
            element.click();
        return new CreateAccountPage(driver);
    }

    public boolean verifySignIn(String username, String password) {
        enterUserName(username);
        enterPassword(password);
        clickOnSignIn();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getErrorMessage().contains("invalid");
    }

    public void enterUserName(String userName) {
        WebElement emailTxtBox = driver.findElement(emailTextBox);
        if (emailTxtBox.isDisplayed())
            emailTxtBox.sendKeys(userName);
    }

    public void enterPassword(String password) {
        WebElement passwordTxtBox = driver.findElement(passwordTextBox);
        if (passwordTxtBox.isDisplayed())
            passwordTxtBox.sendKeys(password);
    }

    public void clickOnSignIn() {
        WebElement signInBtn = driver.findElement(loginBtn);
        if (signInBtn.isDisplayed())
            signInBtn.click();
    }

    public String getErrorMessage() {
        String strErrorMsg = null;
        WebElement errorMsg = driver.findElement(errorMsgTxt);
        if (errorMsg.isDisplayed() && errorMsg.isEnabled())
            strErrorMsg = errorMsg.getText();
        return strErrorMsg;
    }

    public void clickOnWechat() {
        WebElement WechatBtn = driver.findElement(wechat);
        if (WechatBtn.isDisplayed())
            WechatBtn.click();
    }


    public void chickOnFacebook(){
        WebElement FacebookBtn = driver.findElement(facebook);
        if (FacebookBtn.isDisplayed())
            FacebookBtn.click();
    }

    public void clickOnGoogle(){
        WebElement GoogleBtn=driver.findElement(google);
        if(GoogleBtn.isDisplayed()){
            GoogleBtn.click();
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnForgotPassword(String email){
        WebElement ForgotBtn=driver.findElement(forgotBtn);
        WebElement ForgotSend=driver.findElement(forgotSend);
        WebElement ForgotSubmit=driver.findElement(submit);
        if(ForgotBtn.isDisplayed() && ForgotBtn.isEnabled()){
            ForgotBtn.click();
        }

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(ForgotSend.isDisplayed())
            ForgotSend.sendKeys(email);

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(ForgotSubmit.isDisplayed())
            ForgotSubmit.click();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean verifyWechat(){
        clickOnWechat();
        String expectedTitle = "Log In to WeChat";
        return getSignInPageTitle().contains(expectedTitle);
    }

    public boolean verifyFacebook(){
        chickOnFacebook();
        String expectedTitle = "Facebook";
        return getSignInPageTitle().contains(expectedTitle);
    }

    public boolean verifyGoogle(){
        clickOnGoogle();
        String expectedTitle = "Google";
        return getSignInPageTitle().contains(expectedTitle);
    }

    public boolean verifyForgotPassword(String email){
        clickOnForgotPassword(email);
        WebElement Msg= driver.findElement(forgotPassword);
        String expectedMsg = null;
        if(Msg.isDisplayed()){
            expectedMsg=Msg.getText();
            if(expectedMsg.contains("Recovery"))
                return true;
        }
        WebElement Error=driver.findElement(forgotError);
        String ErrorMsg =null;
        if(Error.isDisplayed()) {
            ErrorMsg = Error.getText();
            if (ErrorMsg.contains("Too"))
                return true;
        }


        return false;

    }

}
