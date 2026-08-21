package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {
    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    private final By signupLoginLink = By.cssSelector("a[href='/login']");

    public LoginSignUpPage navigateLoginSignup() {
        clickButton(signupLoginLink);
        return new LoginSignUpPage(driver);
    }

    public boolean isHomePageVisible() {
        return driver.getTitle().contains("Automation Exercise");
    }
}
