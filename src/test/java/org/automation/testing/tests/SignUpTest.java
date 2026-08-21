package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.HomePage;
import org.automation.testing.utils.FakerUtils;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void signUpTest() {
        String fName = FakerUtils.generateRandomFirstName();
        String lName = FakerUtils.generateRandomLastName();
        String email = FakerUtils.generateRandomEmail(fName, lName);

        HomePage homePage = new HomePage(driver);

        homePage.navigateLoginSignup()
                .initSignUpAction(fName, email)
                .signUpAction(
                        "123456789",
                        FakerUtils.generateRandomDay(),
                        FakerUtils.generateRandomMonth(),
                        FakerUtils.generateRandomYear(),
                        fName,
                        lName,
                        FakerUtils.generateRandomStreetAddress(),
                        "United States",
                        FakerUtils.generateRandomState(),
                        FakerUtils.generateRandomCity(),
                        FakerUtils.generateRandomZipCode(),
                        FakerUtils.generateRandomPhoneNumber());

        System.out.println("Signed up with: " + email);
    }
}