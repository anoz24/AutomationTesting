package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.HomePage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    public String validEmail = "Jonathan_Skiles@gmail.com";
    public String validPassword = "123456789";
    public String inValidEmail = "Joel@gmail.com";

    @Test
    public void validLoginTest() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        homePage.navigateLoginSignup().loginAction(validEmail, validPassword);
    }

    @Test
    public void inValidLoginTest(){
        HomePage homePage = new HomePage(driver);
        homePage.navigateLoginSignup().loginAction(inValidEmail, validPassword);
    }
}


