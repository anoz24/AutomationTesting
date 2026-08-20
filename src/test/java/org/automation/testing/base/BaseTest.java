package org.automation.testing.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    protected ChromeDriver driver;

    @BeforeMethod
    public void initDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com");
    }

    @AfterMethod
    public void closeDriver(){
        driver.quit();
    }
}
