package com.vsysq.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBase {

    private WebDriver driver;
    private static String driverPath = "";

    public WebDriver getDriver() {
        return driver;
    }

    private void setDriver(String browserType, String appURL, String OS) {
        switch (browserType) {
            case "chrome":
                driver = initChromeDriver(appURL,OS);
                break;
            case "firefox":
                driver = initFirefoxDriver(appURL);
                break;
            default:
                System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
                driver = initFirefoxDriver(appURL);
        }
    }

    private static WebDriver initChromeDriver(String appURL, String OS) {
        System.out.println("Launching google chrome with new profile..");
        if(OS.equals("MacOS"))
            System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        if(OS.equals("Windows"))
            System.setProperty("webdriver.chrome.driver", driverPath + "C://Windows/chromedriver.exe");
        if(OS.equals("Linux"))
            System.setProperty("webdriver.chrome.driver", driverPath + "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;
    }

    private static WebDriver initFirefoxDriver(String appURL) {
        System.out.println("Launching Firefox browser..");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        return driver;
    }

    @Parameters({ "browserType", "appURL" ,"OS"})
    @BeforeClass
    public void initializeTestBaseSetup(String browserType, String appURL, String OS) {
        try {
            setDriver(browserType, appURL, OS);

        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}