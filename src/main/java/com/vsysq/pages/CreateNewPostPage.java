package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewPostPage {
    private WebDriver driver;
    private By heading = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/button[1]");
    private By blockQuotes = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/button[2]");
    private By unorderedList = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/button[3]");
    private By orderedList = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[1]/button[4]");
    private By bold = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[2]/button[1]");
    private By italic = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[2]/button[2]");
    private By underLine = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[2]/button[3]");
    private By textArea = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[2]");
    private By type = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div");

    private By text = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div/div/span/span");
    public CreateNewPostPage(WebDriver driver){this.driver = driver;}

    public void typeMessage() {
        WebElement element = driver.findElement(text);
        if (element.isEnabled()) {
            element.sendKeys("qwertyuiopasdfghjkl;zxcvbnm.,");
        }
    }

    public String getFontWeight(WebElement element){
        return element.getCssValue("font-weight");
    }

    public String getMessage(){
        WebElement element = driver.findElement(text);
        return element.getText();
    }

    public void clickHeading(){
        WebElement element = driver.findElement(heading);
        if (element.isDisplayed() || element.isEnabled()){
            element.click();
        }
    }

    public void clickblockQuotes(){
        WebElement element = driver.findElement(blockQuotes);
        if (element.isEnabled() || element.isEnabled()){
            element.click();
        }
    }

    public void clickUnorderedList(){
        WebElement element = driver.findElement(unorderedList);
        if (element.isEnabled() || element.isDisplayed()){
            element.click();
        }
    }

    public void clickOrderedList(){
        WebElement element = driver.findElement(orderedList);
        if (element.isEnabled() || element.isDisplayed()){
            element.click();
        }
    }

    public void clickBold(){
        WebElement element = driver.findElement(bold);
        if (element.isEnabled() || element.isDisplayed()){
            element.click();
        }
    }

    public void clickItalic(){
        WebElement element = driver.findElement(italic);
        if (element.isEnabled() || element.isDisplayed()){
            element.click();
        }
    }

    public void clickUnderline(){
        WebElement element = driver.findElement(underLine);
        if (element.isEnabled() || element.isDisplayed()){
            element.click();
        }
    }

    public void clickTextArea(){
        WebElement element = driver.findElement(type);
        if (element.isEnabled() || element.isDisplayed()){
            element.click();
        }
    }

    public boolean checkHeading(){
        clickHeading();
       // clickTextArea();
        typeMessage();
        WebElement element = driver.findElement(text);
        if (getFontWeight(element).equals("bold")){
            return true;
        }
        return false;
    }
}
