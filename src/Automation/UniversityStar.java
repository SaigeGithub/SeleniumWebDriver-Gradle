package Automation;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UniversityStar{
	public static void test(WebDriver driver) throws InterruptedException, AWTException {
    	driver.findElement(By.xpath("/html/body/div/div/header/ul/li[2]/div/span")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("info.madoor@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Madoor107!");
        driver.findElement(By.xpath("//*[@id=\"btn-login\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[4]/a[3]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[4]/a[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[4]/a[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[3]/a[3]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[3]/a[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[3]/a[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[2]/a[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[2]/a[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[1]/a[3]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[1]/a[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[1]/a[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[3]/a[1]/div")).click();
	}
}
	