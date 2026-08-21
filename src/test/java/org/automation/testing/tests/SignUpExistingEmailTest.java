package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.HomePage;
import org.automation.testing.pages.LoginSignUpPage;
import org.automation.testing.utils.FakerUtils;
import org.automation.testing.utils.TestData;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignUpExistingEmailTest extends BaseTest {
    public String validEmail = TestData.VALID_EMAIL;
    public String validName = FakerUtils.generateRandomFirstName();

    @Test
    public void signUpExistingEmailTest() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        HomePage homePage = new HomePage(driver);
        softAssert.assertTrue(homePage.isHomePageVisible());

        LoginSignUpPage loginPage = homePage.navigateLoginSignup();
        softAssert.assertTrue(loginPage.isSignUpHeadingVisible());

        loginPage.initSignUpAction(validName, validEmail);
        Thread.sleep(2000);

        softAssert.assertTrue(loginPage.isFailedLoginOrSignUpMessageDisplayed());

        softAssert.assertAll();
    }
}
