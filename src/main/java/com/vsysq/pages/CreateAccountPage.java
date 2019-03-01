package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class CreateAccountPage {

    private WebDriver driver;
    private By InputUsername = By.xpath("//*[@id=\"root\"]/div/form/div[3]/div/input");
    private By InputPassword = By.xpath("//*[@id=\"root\"]/div/form/div[4]/div/input");
    private By InputPassword2= By.xpath("//*[@id=\"root\"]/div/form/div[5]/div/input");
    private By SignUpBtn=By.xpath("//*[@id=\"root\"]/div/form/button/span[1]");
    private By existUserError= By.xpath("//*[@id=\"root\"]/div/form/div[3]/p");


    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public boolean verifyPageTitle() {
        String pageTitle = "React App";
        return getPageTitle().contains(pageTitle);
    }

//    public boolean verifyCreateAccountPageText() {
//        WebElement element = driver.findElement(headerPageTxt);
//        String pageText = "Create your Google Account";
//        return element.getText().contains(pageText);
//    }


    public boolean verifySignUp(String username, String password,String password2) {
        enterUserName(username);
        enterPassword(password);
        enterPassword2(password2);
        clickOnSignUp();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(getErrorMessageExistUser().contains("exists"))
            return true;
        return false;

    }

    public void enterUserName(String userName) {
        WebElement usernameTxtBox = driver.findElement(InputUsername);
        if (usernameTxtBox.isDisplayed())
            usernameTxtBox.sendKeys(userName);
    }

    public void enterPassword(String password) {
        WebElement passwordTxtBox = driver.findElement(InputPassword);
        if (passwordTxtBox.isDisplayed())
            passwordTxtBox.sendKeys(password);

    }
    public void enterPassword2(String password) {
        WebElement passwordTxtBox2 = driver.findElement(InputPassword2);
        if (passwordTxtBox2.isDisplayed())
            passwordTxtBox2.sendKeys(password);
    }

    public void clickOnSignUp() {
        WebElement signUpBtn = driver.findElement(SignUpBtn);
        if (signUpBtn.isDisplayed())
            signUpBtn.click();
    }
    public String getErrorMessageExistUser() {
        String strErrorMsg = null;
        WebElement errorMsg = driver.findElement(existUserError);
        if (errorMsg.isDisplayed() && errorMsg.isEnabled())
            strErrorMsg = errorMsg.getText();
        return strErrorMsg;
    }
}