package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn{
	public static void test(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/header/ul/li[2]/div/span")).click();
//      driver.findElement(By.xpath("//*[@id=\"btn-google\"]")).click();
//      Thread.sleep(2000);
//      driver.navigate().back();
//      driver.findElement(By.xpath("//*[@id=\"btn-facebook\"]")).click();
//      driver.navigate().back();
//      driver.findElement(By.xpath("//*[@id=\"btn-wechat\"]")).click();
//      driver.navigate().back();
      //the sign up bottom on the sign in page is broken
//      driver.findElement(By.xpath("/html/body/div/div/footer/div/div[2]/ul/li[1]/a/span")).click();
//      driver.navigate().back();
      driver.findElement(By.xpath("//*[@id=\"forgot-password\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"forgot-password-email\"]")).sendKeys("selenium_student@gmail.com");
      driver.findElement(By.xpath("//*[@id=\"forgot-password-btn-submit\"]")).click();
      Thread.sleep(1000);
      //element not interactable
      //driver.findElement(By.xpath("//*[@id=\"forgot-password-btn-confirm\"]")).click(); 
	
      driver.navigate().to("https://madoor.ca:2083/");
	}
}
	