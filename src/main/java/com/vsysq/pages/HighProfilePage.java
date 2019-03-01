package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighProfilePage {
    private WebDriver driver;
    private By edit = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/button/span[1]/span");
    private By firstname = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[1]/div[1]/div/div/input");
    private By lastname = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[1]/div[2]/div/div/input");
    private By female= By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/label[1]/span[1]/span[1]/input");
    private By male = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/label[2]/span[1]/span[1]/input");
    private By dateofbirth =By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div/input");

    private By university=By.xpath("//*[@id=\"react-select-2-input\"]");

    private By selectUniversity=By.xpath("//div[@id='react-select-2-option-0']");
    private By fieldofstudy=By.xpath("//*[@id=\"react-select-3-input\"]");

    private By selectfieldofstudy=By.xpath("//div[@id='react-select-3-option-0']");
    private By iresidein=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[6]/div/div/input");

    private By aboutme=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[7]/div/div/div/textarea[3]");


    public HighProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnEdit(){
        WebElement element = driver.findElement(edit);

        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SendFirstName(String temp){
        WebElement element = driver.findElement(firstname);
        if (element.isDisplayed()&& element.isEnabled())
            element.sendKeys(temp);
    }
    public void SendLastName(String temp){
        WebElement element = driver.findElement(lastname);
        if (element.isDisplayed()&& element.isEnabled())
            element.sendKeys(temp);
    }
    public void ClickOnFemale(){
        WebElement element = driver.findElement(female);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void ClickOnMale(){
        WebElement element = driver.findElement(male);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SendBirth(String temp){
        WebElement element = driver.findElement(dateofbirth);
        if (element.isDisplayed()&& element.isEnabled())
            element.sendKeys(temp);
    }
    public void ClickOnUniversity(){
        WebElement element = driver.findElement(university);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }

    public void SendUniversity(String temp){
        WebElement element = driver.findElement(university);
        if (element.isDisplayed())
            element.sendKeys(temp);
    }
    public void SelectUniversity(){
        WebElement element = driver.findElement(selectUniversity);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }

    public void SendStudy(String temp){
        WebElement element = driver.findElement(fieldofstudy);
        if (element.isDisplayed())
            element.sendKeys(temp);
    }
    public void ClickOnStudy(){
        WebElement element = driver.findElement(fieldofstudy);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SelectStudy(){
        WebElement element = driver.findElement(selectfieldofstudy);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SendIamFrom(String temp){
        WebElement element = driver.findElement(iresidein);
        if (element.isDisplayed()&& element.isEnabled()){
            clean(element);
            element.sendKeys(temp);
        }

    }


    public void SendAboutMe(String temp){
        WebElement element = driver.findElement(aboutme);
        if (element.isDisplayed()&& element.isEnabled())
            element.sendKeys(temp);
    }


    public void clean(WebElement temp){
        temp.clear();
    }
}