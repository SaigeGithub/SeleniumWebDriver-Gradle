package com.vsysq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UniProfilePage {
    private WebDriver driver;
    private By edit = By.xpath("By.xpath(\"//*[@id=\\\"root\\\"]/div/div[2]/div/div[1]/div/button/span[1]/span\")");
    private By firstname = By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[1]/div/div/input");
    private By lastname = By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[2]/div/div/input");
    private By female= By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/label[1]/span[1]/span[1]/input");
    private By male = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/label[2]/span[1]/span[1]/input");
    private By dateofbirth =By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div/input");
    private By university=By.xpath("//*[@id=\"react-select-2-input\"]");
    private By selectUniversity=By.xpath("By.xpath(\"//div[@id='react-select-2-option-0']\")");
    private By fieldofstudy=By.xpath("//*[@id=\"react-select-3-input\"]");
    private By selectfieldofstudy=By.xpath("By.xpath(\"//div[@id='react-select-3-option-0']\")");
    private By iamfrom=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[6]/div/div/input");
    private By yearofadmittance=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[7]/div/div/div/div");
    private By aboutme=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[8]/div/div/div/textarea[3]");
    private By StudentId=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[9]/div/div/img");

    public UniProfilePage(WebDriver driver) {
        this.driver = driver;
    }
}
