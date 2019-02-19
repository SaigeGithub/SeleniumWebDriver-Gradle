package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeProfile{
	public static void HighSchoolStudent(WebDriver driver) throws InterruptedException, AWTException {
   	 driver.findElement(By.xpath("/html/body/div/div/header/ul/li[2]/div/span")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("selenium_student@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Madoor107!");
        driver.findElement(By.xpath("//*[@id=\"btn-login\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[3]/a[1]/div")).click();
        Thread.sleep(1000);
        //Open Edit
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/button")).click();
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[1]/div/div/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/button")).click();	 
        //UploadNewimage
        WebElement UploadImg = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[1]/div[1]/img"));
        UploadImg.click();
        Robot rb =new Robot();
        // pressing keys with the help of keyPress and keyRelease events
        rb.keyPress(KeyEvent.VK_C);
        rb.keyRelease(KeyEvent.VK_C);
        //Thread.sleep(1000);
        rb.keyPress(KeyEvent.VK_SHIFT);
        rb.keyPress(KeyEvent.VK_SEMICOLON);
        rb.keyRelease(KeyEvent.VK_SEMICOLON);
        rb.keyRelease(KeyEvent.VK_SHIFT);
        rb.keyPress(KeyEvent.VK_BACK_SLASH);
        rb.keyRelease(KeyEvent.VK_BACK_SLASH);
        //Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_1);
        rb.keyRelease(KeyEvent.VK_1);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[1]/div/div/input")).sendKeys("selenium");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[2]/div/div/input")).sendKeys("student");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/label[2]/span[1]/span[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[5]/div/div[1]/div/div/div/div[2]/div")).click();
        rb.keyPress(KeyEvent.VK_ESCAPE);
        rb.keyRelease(KeyEvent.VK_ESCAPE);
       
        //find all the remove svg button
        List<WebElement> elements = driver.findElements(By.xpath("//*[local-name()='svg'][contains(@class, ' MuiChip-deleteIcon')]"));
        System.out.println("Number of elements:" +elements.size());
        for (int i=0; i<elements.size();i++){
          elements.get(i).click();
        }
        WebElement typenew1=driver.findElement(By.xpath("//*[@id=\"react-select-4-input\"]"));
        //WebElement typenew1=driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]"));
      
        typenew1.sendKeys("c");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='react-select-4-option-0']")).click();
        
        WebElement typenew2=driver.findElement(By.xpath("//*[@id=\"react-select-5-input\"]"));
        
        
        typenew2.sendKeys("c");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='react-select-5-option-0']")).click();
       
        
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[6]/div/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[6]/div/div/input")).sendKeys("Wuhan");
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[7]/div/div/div/textarea[3]")).clear();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[7]/div/div/div/textarea[3]")).sendKeys("I am Unhappy");
        
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[1]/div/div/button[1]")).click();
        //the log out, is not functional right now, so I tell the robot to go to home page
        driver.findElement(By.xpath("/html/body/div/div/header/div/ul/li")).click();
        driver.navigate().to("http://madoor.tech:3000/");
        
   }
	public static void UniversityStar(WebDriver driver) throws InterruptedException, AWTException {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/button")).click();
        WebElement UploadImg = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[1]/div[2]"));
        UploadImg.click();
        Robot rb =new Robot();
        // pressing keys with the help of keyPress and keyRelease events
        rb.keyPress(KeyEvent.VK_C);
        rb.keyRelease(KeyEvent.VK_C);
        //Thread.sleep(1000);
        rb.keyPress(KeyEvent.VK_SHIFT);
        rb.keyPress(KeyEvent.VK_SEMICOLON);
        rb.keyRelease(KeyEvent.VK_SEMICOLON);
        rb.keyRelease(KeyEvent.VK_SHIFT);
        rb.keyPress(KeyEvent.VK_BACK_SLASH);
        rb.keyRelease(KeyEvent.VK_BACK_SLASH);
        //Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_2);
        rb.keyRelease(KeyEvent.VK_2);
        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[1]/div/div/input")).sendKeys("selenium");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[2]/div/div/input")).sendKeys("student");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/label[1]/span[1]/span[1]/input")).click();
        //driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div/input")).click();
        //driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[5]/div/div[1]/div/div/div/div[2]/div")).click();
        //rb.keyPress(KeyEvent.VK_ESCAPE);
        //rb.keyRelease(KeyEvent.VK_ESCAPE);
	}
}