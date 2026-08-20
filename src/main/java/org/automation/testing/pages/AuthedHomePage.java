package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthedHomePage extends BasePage{
    public AuthedHomePage(ChromeDriver driver){
        super(driver);
    }

    private final By logOutButton = By.cssSelector("a[href=\"/logout\"]");

    private void clickLogOutButton(){
        clickButton(logOutButton);
    }
    
    public HomePage logOutAction(){
        clickLogOutButton();
        return new HomePage(driver);
    }
}
