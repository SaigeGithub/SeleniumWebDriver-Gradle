package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;


public class HomePage{
	public static void test(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Sign up")).click();  
	      driver.findElement(By.linkText("What we do")).click();
	      driver.findElement(By.xpath("/html/body/div/div/div/div/main/section[1]/button")).click();
	      Thread.sleep(1000);
	      driver.navigate().back();
	      driver.findElement(By.linkText("What we do")).click();
	      //Click on the university student button
	      driver.findElement(By.xpath("/html/body/div/div/div/div/main/section[3]/div[2]/div/div/div/button[2]")).click();
	      CaptureScreenShot.image(driver);
	      driver.findElement(By.xpath("/html/body/div/div/div/div/main/section[3]/div[2]/div/div/div/button[1]")).click();
	      driver.findElement(By.xpath("/html/body/div/div/div/div/footer/div/div[2]/ul/li[1]/a")).click();
	      driver.findElement(By.xpath("/html/body/div/div/div/div/footer/div/div[2]/ul/li[3]/a")).click();
	      CaptureScreenShot.image(driver);
	      driver.findElement(By.xpath("/html/body/div/div/section/div/div[1]/div/div/div/div/button[2]")).click();
	      driver.findElement(By.xpath("/html/body/div/div/section/div/div[1]/div/div/div/div/button[3]")).click();
	      driver.findElement(By.xpath("/html/body/div/div/section/div/div[1]/div/div/div/div/button[4]")).click();
	      //click on home
	      driver.findElement(By.xpath("/html/body/div/div/footer/div/div[2]/ul/li[1]/a/span")).click();
	      driver.findElement(By.xpath("/html/body/div/div/div/div/footer/div/div[2]/ul/li[2]/a")).click();
	      //From terms go back to what we do
	      driver.findElement(By.xpath("/html/body/div/div/header/ul/li[1]/a")).click();
	      //FAQ
	      driver.findElement(By.xpath("/html/body/div/div/div/div/footer/div/div[2]/ul/li[4]/a")).click();
	      driver.findElement(By.xpath("/html/body/div/div/header/ul/li[1]/a")).click();
	      //driver.findElement(By.xpath("//*[@id=\"custom-css-standard-input\"]")).sendKeys("saige.liu@madoor.com");
	      
	      //driver.findElement(By.xpath("/html/body/div/div/div/div/footer/div/div[3]/div[1]/div/div/svg")).click();
	      //click on sign in/html/body/div/div/header/ul/li[2]/div/span
	}
}
