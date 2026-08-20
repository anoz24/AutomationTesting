package org.automation.testing.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {
    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    public LoginSignUpPage navigateLoginSignup(){
        driver.get("https://www.automationexercise.com/login");
        return new LoginSignUpPage(driver);
    }
}
