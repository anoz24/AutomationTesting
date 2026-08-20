package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.HomePage;
import org.testng.annotations.Test;

public class LogOutTest extends BaseTest{
    public String validEmail = "Jonathan_Skiles@gmail.com";
    public String validPassword = "123456789";

    @Test
    public void logOutTest() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        homePage.navigateLoginSignup().loginAction(validEmail, validPassword).logOutAction();
        // Thread.sleep(5000);
    }
}