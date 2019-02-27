package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TermsPage {
    protected WebDriver driver;


    private By highSchoolAgr = By.xpath("//*[@id=\"root\"]/section/div/div[1]/div/div/div/div/button[1]/span[1]/span/span/div/p[2]");
    private By universityAgr = By.xpath("//*[@id=\"root\"]/section/div/div[1]/div/div/div/div/button[2]/span[1]/span/span/div/p[2]");
    private By privacyPolicy = By.xpath("//*[@id=\"root\"]/section/div/div[1]/div/div/div/div/button[3]/span[1]/span/span/div/p[2]");
    private By privacyAgre = By.xpath("//*[@id=\"root\"]/section/div/div[1]/div/div/div/div/button[4]/span[1]/span/span/div/p[2]");
    private By termPage = By.xpath("//*[@id=\"root\"]/section/div/div[2]/p[1]/strong");
    public TermsPage(WebDriver driver){this.driver = driver;}

    public boolean verifyHighSchool(){
        String str = getMessage();
        if(str.contains("High School")){
            return true;
        }
        return false;
    }

    public boolean verifyUniversity(){
        String str = getMessage();
        if(str.contains("University")){
            return true;
        }
        return false;
    }

    public boolean verifyPrivacyPolicy(){
        String str = getMessage();
        if(str.contains("Privacy Policy")){
            return true;
        }
        return false;
    }

    public boolean verifyPrivacyAgr(){
        String str = getMessage();
        if(str.contains("Privacy Agreement")){
            return true;
        }
        return false;
    }

    public void clickUniversity(){
        WebElement element = driver.findElement(universityAgr);
        if (element.isDisplayed() || element.isEnabled()) {
            element.click();
        }
    }

    public void clickPrivacyPolicy(){
        WebElement element = driver.findElement(privacyPolicy);
        if (element.isDisplayed() || element.isEnabled()){
            element.click();
        }
    }

    public void clickPrivateAgr(){
        WebElement element = driver.findElement(privacyAgre);
        if (element.isDisplayed() || element.isEnabled()){
            element.click();
        }
    }

    public String getMessage(){
        WebElement element = driver.findElement(termPage);
        if (element.isEnabled() || element.isDisplayed()) {
            return element.getText();
        }
        return "qewrewqrewq";
    }
}
