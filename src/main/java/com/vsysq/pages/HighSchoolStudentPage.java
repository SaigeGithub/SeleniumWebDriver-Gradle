package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class HighSchoolStudentPage {
    private WebDriver driver;
    private By profile = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[3]/a[1]/div/div[2]/span");
    private By title=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/h3/span");

    public HighSchoolStudentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProfile(){
        WebElement element=driver.findElement(profile);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        if(element.isEnabled()){
            element.click();
        }

    }
    public String getTitle(){
        WebElement element=driver.findElement(title);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        String title ="";
        if(element.isDisplayed())
            title=element.getText();
        return title;
    }
    public boolean verifyProfile(){
        clickProfile();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(getTitle().contains("Profile"))
            return  true;
        return false;
    }
}
