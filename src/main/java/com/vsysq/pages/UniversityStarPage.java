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
    private By createnewpost = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[2]/a[2]/div/div[2]/span");
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

    public UniProfilePage GetProfile(){

        return new UniProfilePage(driver);
    }

    public void clickDiscovery(){
        WebElement element=driver.findElement(discovery);
        if(element.isEnabled())
            element.click();
    }

    public void clickSubscription(){
        WebElement element=driver.findElement(subscription);
        if(element.isEnabled())
            element.click();
    }

    public  void clickFavorites(){
        WebElement element=driver.findElement(favorites);
        if (element.isEnabled())
            element.click();
    }

    public void clickAllPosts(){
        WebElement element=driver.findElement(allposts);
        if(element.isEnabled())
            element.click();
    }



    public void clickDraft(){
        WebElement element=driver.findElement(draft);
        if(element.isEnabled())
            element.click();
    }
    public void clickAppointment(){
        WebElement element=driver.findElement(appointment);
        if(element.isEnabled())
            element.click();
    }

    public void clickFollowers(){
        WebElement element=driver.findElement(followers);
        if(element.isEnabled())
            element.click();
    }

    public void clickComments(){
        WebElement element=driver.findElement(comments);
        if(element.isEnabled())
            element.click();
    }

    public void clickPayment(){
        WebElement element=driver.findElement(payment);
        if(element.isEnabled())
            element.click();
    }
    public void clickSchedule(){
        WebElement element=driver.findElement(schedule);
        if(element.isEnabled())
            element.click();
    }
    public void clickRedeem(){
        WebElement element=driver.findElement(redeem);
        if(element.isEnabled())
            element.click();
    }

    public void clickPassword(){
        WebElement element=driver.findElement(password);
        if(element.isEnabled())
            element.click();
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
        WebElement element = driver.findElement(createnewpost);
        if (element.isEnabled()){
            element.click();
        }
        return new CreateNewPostPage(driver);
    }



}