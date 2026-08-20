package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.HomePage;
import org.testng.annotations.Test;

import net.datafaker.Faker;

public class SignUpTest extends BaseTest {

    @Test
    public void signUpTest() {
        Faker fakeData = new Faker();
        String fName = fakeData.name().firstName();
        String lName = fakeData.name().lastName();
        String email = "%s_%s@gmail.com".formatted(fName, lName);

        HomePage homePage = new HomePage(driver);

        homePage.navigateLoginSignup()
                .initSignUpAction(fName, email)
                .signUpAction(
                        "123456789",
                        "6",
                        "November",
                        "2004",
                        fName,
                        lName,
                        "Cairo",
                        "United States",
                        "New York",
                        "New York",
                        "10001",
                        "1234567890");

        System.out.println("Signed up with: " + email);
    }
}