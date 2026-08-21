package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSignUpPage extends BasePage {
    
    public LoginSignUpPage(ChromeDriver driver) {
        super(driver);
    }

    private final By loginHeading = By.cssSelector("div[class=\"login-form\"] h2");
    private final By failedLoginMessage = By.cssSelector("p[style=\"color: red;\"]");
    private final By loginEmail = By.cssSelector("input[data-qa=\"login-email\"]");
    private final By loginPassword = By.cssSelector("input[data-qa=\"login-password\"]");
    private final By loginButton = By.cssSelector("button[data-qa=\"login-button\"]");
    private final By signUpName = By.cssSelector("input[data-qa=\"signup-name\"]");
    private final By signUpEmail = By.cssSelector("input[data-qa=\"signup-email\"]");
    private final By signUpButton = By.cssSelector("button[data-qa=\"signup-button\"]");

    public boolean isLoginFormVisible() {
        return driver.findElement(loginHeading).isDisplayed();
    }

    public boolean isLoginFailedMessageDisplayed() {
        return driver.findElement(failedLoginMessage).isDisplayed();
    }

    private void setLoginEmail(String email){
        enterTextFieldData(loginEmail, email);
    }

    private void setLoginPassword(String password){
        enterTextFieldData(loginPassword, password);
    }

    private void setLoginButton(){
        clickButton(loginButton);
    }
    
    public AuthedHomePage loginAction(String email , String password){
        setLoginEmail(email);
        setLoginPassword(password);
        setLoginButton();
        return new AuthedHomePage(driver);
    }

    private void setSignUpName(String name){
        enterTextFieldData(signUpName, name);
    }

    private void setSignUpEmail(String email){
        enterTextFieldData(signUpEmail, email);
    }

    private void setSignUpButton(){
        clickButton(signUpButton);
    }

    public CompleteSignUpPage initSignUpAction(String name , String email){
        setSignUpName(name);
        setSignUpEmail(email);
        setSignUpButton();
        return new CompleteSignUpPage(driver);
    }

}
