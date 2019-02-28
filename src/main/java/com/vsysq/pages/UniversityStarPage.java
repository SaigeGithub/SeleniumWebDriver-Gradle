package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class UniversityStarPage {
    private WebDriver driver;
    private By discovery = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[1]/a[2]/div/div[2]/span");
    private By subscription = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[1]/a[1]/div/div[2]/span");
    private By favorites = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[1]/a[3]/div/div[2]/span");
    private By allposts = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[2]/a[1]/div/div[2]/span");
    private By createNewPost = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[2]/a[2]/div/div[2]/span");
    private By draft = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[3]/a[1]/div/div[2]/span");
    private By schedule = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[3]/a[2]/div/div[2]/span");
    private By appointment = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[3]/a[2]/div/div[2]/span");
    private By profile= By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[4]/a[1]/div/div[2]/span");
    private By followers = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[4]/a[2]/div/div[2]/span");
    private By comments = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[4]/a[3]/div/div[2]/span");
    private By payment =By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[5]/a[1]/div/div[2]/span");
    private By redeem=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[5]/a[2]/div/div[2]/span");
    private By password=By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[5]/a[3]/div/div[2]/span");
    private By title=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/h3/span");

    public UniversityStarPage(WebDriver driver) {
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

        if(getTitle().contains("Profile"))
            return  true;
        return false;
    }

    public CreateNewPostPage clickNewPost(){
        WebElement element = driver.findElement(createNewPost);
        if (element.isEnabled()){
            element.click();
        }
        return new CreateNewPostPage(driver);
    }

}
