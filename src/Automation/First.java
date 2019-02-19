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


public class First {
	
	
    public static void main(String[] args) throws InterruptedException, AWTException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
        //System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");

        WebDriver driver = (WebDriver) new FirefoxDriver();

        // Launch website
        // driver.navigate().to("http://www.baidu.com/");
        driver.get("http://madoor.tech:3000/");
        //driver.get("http://madoor.ca");
        
        
        driver.manage().window().maximize();
        String titile = driver.getTitle();

        System.out.println("title is => " + titile);
       
        homepage(driver);
        //signinpage(driver);
        //aftersignin(driver);
        //profile(driver);
        //ustarprofile(driver);
        
        

        
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //driver.quit();
        driver.close();
        System.out.println("The Test is finished");
     
        System.exit(0);

    }
    
    public static void homepage(WebDriver driver) throws InterruptedException {
      driver.findElement(By.linkText("Sign up")).click();  
      driver.findElement(By.linkText("What we do")).click();
      driver.findElement(By.xpath("/html/body/div/div/div/div/main/section[1]/button")).click();
      Thread.sleep(1000);
      driver.navigate().back();
      driver.findElement(By.linkText("What we do")).click();
      //Click on the university student button
      driver.findElement(By.xpath("/html/body/div/div/div/div/main/section[3]/div[2]/div/div/div/button[2]")).click();
      captureScreenShot(driver);
      driver.findElement(By.xpath("/html/body/div/div/div/div/main/section[3]/div[2]/div/div/div/button[1]")).click();
      driver.findElement(By.xpath("/html/body/div/div/div/div/footer/div/div[2]/ul/li[1]/a")).click();
      driver.findElement(By.xpath("/html/body/div/div/div/div/footer/div/div[2]/ul/li[3]/a")).click();
      captureScreenShot(driver);
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
      captureScreenShot(driver);
      //driver.findElement(By.xpath("/html/body/div/div/div/div/footer/div/div[3]/div[1]/div/div/svg")).click();
      //click on sign in/html/body/div/div/header/ul/li[2]/div/span

    }
    
    public static void signinpage(WebDriver driver)throws InterruptedException, AWTException {
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
      driver.findElement(By.xpath("//*[@id=\"forgot-password-btn-confirm\"]")).click();  
    }
    
    public static void aftersignin(WebDriver driver) throws InterruptedException, AWTException {
        driver.findElement(By.xpath("/html/body/div/div/header/ul/li[2]/div/span")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("selenium_student@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Madoor107!");
        driver.findElement(By.xpath("//*[@id=\"btn-login\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/div[1]/div/div/div/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/header/div/div/div/div/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/div/div/div/div/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div[1]/div/div/div/div/button[3]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/header/div/div/div/div/button[3]")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/header/div/div/div/div/button[4]")).click();
        //test the side bar
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[1]/a[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[1]/a[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[1]/a[3]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[2]/a/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[3]/a[1]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[3]/a[2]/div")).click();
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/ul[3]/a[3]/div")).click();
        
    }
    
    public static void profile(WebDriver driver) throws InterruptedException, AWTException {
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
    public static void ustarprofile(WebDriver driver) throws InterruptedException, AWTException {
    	driver.findElement(By.xpath("/html/body/div/div/header/ul/li[2]/div/span")).click();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("selenium_ustar@gmail.com");
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


	public static void captureScreenShot(WebDriver ldriver){
		// Take screenshot and store as a file format             
		File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);           
		try {
		// now copy the  screenshot to desired location using copyFile method
		 
		FileUtils.copyFile(src, new File("C:/selenium/TestScreenshot/"+System.currentTimeMillis()+".png"));
		} catch (IOException e){
		  System.out.println(e.getMessage());
		 }
		
	  }
    
}
