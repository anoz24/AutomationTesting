package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.AuthedHomePage;
import org.automation.testing.pages.HomePage;
import org.automation.testing.pages.LoginSignUpPage;
import org.automation.testing.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest {
    public String validEmail = TestData.VALID_EMAIL;
    public String validPassword = TestData.VALID_PASSWORD;

    @Test
    public void logOutTest() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible());

        LoginSignUpPage loginPage = homePage.navigateLoginSignup();
        Assert.assertTrue(loginPage.isLoginHeadingVisible());

        AuthedHomePage authedPage = loginPage.loginAction(validEmail, validPassword);
        Assert.assertTrue(authedPage.isLoggedIn());

        loginPage = authedPage.logOutAction();
        Assert.assertTrue(loginPage.isLoginHeadingVisible());
    }
}