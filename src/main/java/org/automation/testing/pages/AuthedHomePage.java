package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthedHomePage extends BasePage{
    public AuthedHomePage(ChromeDriver driver){
        super(driver);
    }

    private final By logOutButton = By.cssSelector("a[href=\"/logout\"]");
    private final By loggedInUser = By.cssSelector("i[class=\"fa fa-user\"]");

    public boolean isLoggedIn() {
    return driver.findElement(loggedInUser).isDisplayed();
    }

    private void clickLogOutButton(){
        clickButton(logOutButton);
    }
    
    public LoginSignUpPage logOutAction(){
        clickLogOutButton();
        return new LoginSignUpPage(driver);
    }
}
