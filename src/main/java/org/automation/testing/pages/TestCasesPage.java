package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCasesPage extends BasePage {

    public TestCasesPage(ChromeDriver driver) {
        super(driver);
    }

    private final By testCasesHeader = By.cssSelector("h2[class=\"title text-center\"]");

    public boolean isTestCasesHeaderVisible() {
        return driver.findElement(testCasesHeader).isDisplayed();
    }

}
