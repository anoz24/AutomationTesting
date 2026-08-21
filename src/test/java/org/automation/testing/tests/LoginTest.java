package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.AuthedHomePage;
import org.automation.testing.pages.HomePage;
import org.automation.testing.pages.LoginSignUpPage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends BaseTest {
    public String validEmail = "Jonathan_Skiles@gmail.com";
    public String validPassword = "123456789";
    public String inValidEmail = "Joel@gmail.com";

    @Test
    public void validLoginTest(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible());
        LoginSignUpPage loginPage = homePage.navigateLoginSignup();
        Assert.assertTrue(loginPage.isLoginFormVisible()); 
        AuthedHomePage authedPage = loginPage.loginAction(validEmail, validPassword);
        Assert.assertTrue(authedPage.isLoggedIn());
    }

    @Test
    public void inValidLoginTest(){
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible());
        LoginSignUpPage loginPage = homePage.navigateLoginSignup();
        Assert.assertTrue(loginPage.isLoginFormVisible());
        loginPage.loginAction(inValidEmail, validPassword);
        Assert.assertTrue(loginPage.isLoginFailedMessageDisplayed());
    }
}