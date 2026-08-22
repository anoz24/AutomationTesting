package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.HomePage;
import org.automation.testing.pages.TestCasesPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCaseTest extends BaseTest {

    @Test
    public void testCaseOne() {
        SoftAssert softAssert = new SoftAssert();

        HomePage homePage = new HomePage(driver);
        softAssert.assertTrue(homePage.isHomePageVisible());

        TestCasesPage testCasesPage = homePage.navigateTestCases();
        softAssert.assertTrue(testCasesPage.isTestCasesHeaderVisible());

        softAssert.assertAll();
    }
}
