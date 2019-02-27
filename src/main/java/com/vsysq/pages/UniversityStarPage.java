package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UniversityStarPage {
    private WebDriver driver;
    private By discovery = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[1]/a[2]/div/div[2]/span");
//    private By subscription = By.xpath("//*[@id=\"signup-link\"]");
    private By favorites = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[1]/a[3]/div/div[2]/span");
    private By allposts = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[2]/a[1]/div/div[2]/span");
    private By createnewpost = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[2]/a[2]/div/div[2]/span");
    private By draft = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[3]/a[1]/div/div[2]/span");
    private By schedule = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[3]/a[2]/div/div[2]/span");
    private By appointment = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/ul[3]/a[2]/div/div[2]/span");
    private By followers = By.xpath("//*[@id=\"signup-link\"]");
    private By comments = By.xpath("//*[@id=\"signup-link\"]");
//    private By payment =By.xpath();
//    private By redeem=By.xpath();
//    private By password=By.xpath();

    public UniversityStarPage(WebDriver driver) {
        this.driver = driver;
    }


}
