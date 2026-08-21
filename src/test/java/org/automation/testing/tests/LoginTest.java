package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.AuthedHomePage;
import org.automation.testing.pages.HomePage;
import org.automation.testing.pages.LoginSignUpPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class LoginTest extends BaseTest {
    public String validEmail = "Jonathan_Skiles@gmail.com";
    public String validPassword = "123456789";
    public String inValidEmail = "Joel@gmail.com";

    @Test
    public void validLoginTest() {
        SoftAssert softAssert = new SoftAssert();

        HomePage homePage = new HomePage(driver);
        softAssert.assertTrue(homePage.isHomePageVisible());

        LoginSignUpPage loginPage = homePage.navigateLoginSignup();
        softAssert.assertTrue(loginPage.isLoginFormVisible());

        AuthedHomePage authedPage = loginPage.loginAction(validEmail, validPassword);
        softAssert.assertTrue(authedPage.isLoggedIn());

        softAssert.assertAll();
    }

    @Test
    public void inValidLoginTest() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible());

        LoginSignUpPage loginPage = homePage.navigateLoginSignup();
        Assert.assertTrue(loginPage.isLoginFormVisible());

        loginPage.loginAction(inValidEmail, validPassword);
        Assert.assertTrue(loginPage.isLoginFailedMessageDisplayed());
    }
}