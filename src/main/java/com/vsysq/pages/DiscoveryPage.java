package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DiscoveryPage {
    private WebDriver driver;
    private By trending = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/header/div/div/div/div/button[1]/span[1]/span/span");
    private By recommended =By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/header/div/div/div/div/button[2]/span[1]/span/span");
    private By top100 =By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/header/div/div/div/div/button[3]/span[1]/span/span");
    private By experts =By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/header/div/div/div/div/button[4]/span[1]/span/span");
    private By article =By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/div[1]/div/div/div/button[1]/span[1]/span/span");
    private By posts =By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/div[1]/div/div/div/button[2]/span[1]/span/span");

    public DiscoveryPage(WebDriver driver) {
        this.driver = driver;
    }
}
