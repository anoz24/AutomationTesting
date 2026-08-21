package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {
    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    private final By signupLoginLink = By.cssSelector("a[href='/login']");
    private final By productsLink = By.cssSelector("a[href='/products']");
    private final By cartLink = By.cssSelector("a[href='/view_cart']");
    private final By testCasesLink = By.cssSelector("a[href='/test_cases']");
    private final By contactUsLink = By.cssSelector("a[href='/contact_us']");

    public LoginSignUpPage navigateLoginSignup() {
        clickButton(signupLoginLink);
        return new LoginSignUpPage(driver);
    }

    public ContactUsPage navigateContactUs() {
        clickButton(contactUsLink);
        return new ContactUsPage(driver);
    }

    public void navigateProducts() {
        clickButton(productsLink);
    }

    public void navigateCart() {
        clickButton(cartLink);
    }

    public void navigateTestCases() {
        clickButton(testCasesLink);
    }

    public boolean isHomePageVisible() {
        return driver.getTitle().contains("Automation Exercise");
    }
}
