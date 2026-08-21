package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.AuthedHomePage;
import org.automation.testing.pages.HomePage;
import org.automation.testing.pages.LoginSignUpPage;
import org.automation.testing.utils.TestData;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class LoginTest extends BaseTest {
    public String validEmail = TestData.VALID_EMAIL;
    public String validPassword = TestData.VALID_PASSWORD;
    public String inValidEmail = TestData.INVALID_EMAIL;

    @Test
    public void validLoginTest() {
        SoftAssert softAssert = new SoftAssert();

        HomePage homePage = new HomePage(driver);
        softAssert.assertTrue(homePage.isHomePageVisible());

        LoginSignUpPage loginPage = homePage.navigateLoginSignup();
        softAssert.assertTrue(loginPage.isLoginHeadingVisible());

        AuthedHomePage authedPage = loginPage.loginAction(validEmail, validPassword);
        softAssert.assertTrue(authedPage.isLoggedIn());

        softAssert.assertAll();
    }

    @Test
    public void inValidLoginTest() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible());

        LoginSignUpPage loginPage = homePage.navigateLoginSignup();
        Assert.assertTrue(loginPage.isLoginHeadingVisible());

        loginPage.loginAction(inValidEmail, validPassword);
        Assert.assertTrue(loginPage.isFailedLoginOrSignUpMessageDisplayed());
    }
}