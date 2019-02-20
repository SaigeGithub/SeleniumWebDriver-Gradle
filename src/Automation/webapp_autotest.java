package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
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



public class webapp_autotest {
	
	
    public static void main(String[] args) throws InterruptedException, AWTException {
    	if (args.length>0){
    		String Driver_path= args[0];
    	
        // declaration and instantiation of objects/variables
        //System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        //For the virtual C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.chrome.driver", Driver_path);

        //WebDriver driver = (WebDriver) new FirefoxDriver();
        WebDriver driver = new ChromeDriver();
        // Launch website
        // driver.navigate().to("http://www.baidu.com/");
        driver.get("https://madoor.ca:2083/");
        //driver.get("http://madoor.ca");
        
        
        driver.manage().window().maximize();
        String titile = driver.getTitle();

        System.out.println("Test start \nThe web title is => " + titile);
       
        try {
        	HomePage.test(driver);
        	//SignIn.test(driver);
        } catch(Exception e){
        	e.printStackTrace();	
        }
        
        try {
        	
        	SignIn.test(driver);
        } catch(Exception e){
        	e.printStackTrace();	
        }
        
        
        
        
        //the sign in in madoor.tech:3000 is temporarily disabled.
//        HighSchoolStudent.test(driver);
//        ChangeProfile.HighSchoolStudent(driver);
//        UniversityStar.test(driver);
//        ChangeProfile.UniversityStar(driver);
        
       
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //driver.quit();
        driver.close();
    	}else {
    		System.out.println("Please enter parameters");
    	}
        System.out.println("The Test is finished");
     
        System.exit(0);

    }
    
    
    
   



    
}
