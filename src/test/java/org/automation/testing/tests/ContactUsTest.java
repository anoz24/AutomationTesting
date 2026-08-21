package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.ContactUsPage;
import org.automation.testing.pages.HomePage;
import org.automation.testing.utils.FakerUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends BaseTest {

    String name = FakerUtils.generateRandomFirstName();
    String email = FakerUtils.generateRandomEmail(name, name);

    @Test
    public void contactUsTest() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible());

        ContactUsPage contactUsPage = homePage.navigateContactUs();
        Assert.assertTrue(contactUsPage.isGetInTouchHeadingVisible());

        contactUsPage.contactUsAction(name, email, "Test", "Test");
        driver.switchTo().alert().accept();

        Assert.assertTrue(contactUsPage.isSuccessMessageDisplayed());

        homePage = contactUsPage.homePage();
        Assert.assertTrue(homePage.isHomePageVisible());
    }

}
