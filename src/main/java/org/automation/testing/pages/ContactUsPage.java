package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsPage extends BasePage {
    public ContactUsPage(ChromeDriver driver) {
        super(driver);
    }

    private final By getInTouchHeading = By.cssSelector("h2[class=\"title text-center\"]");
    private final By nameField = By.cssSelector("input[data-qa=\"name\"]");
    private final By emailField = By.cssSelector("input[data-qa=\"email\"]");
    private final By subjectField = By.cssSelector("input[data-qa=\"subject\"]");
    private final By messageField = By.cssSelector("textarea[data-qa=\"message\"]");
    // private final By uploadFileInput =
    // By.cssSelector("input[name=\"upload_file\"]");
    private final By submitButton = By.cssSelector("input[data-qa=\"submit-button\"]");
    private final By successMessage = By.cssSelector("div.status.alert.alert-success");
    private final By homeButton = By.cssSelector("a[class=\"btn btn-success\"]");

    private void setNameField(String name) {
        enterTextFieldData(nameField, name);
    }

    private void setEmailField(String email) {
        enterTextFieldData(emailField, email);
    }

    private void setSubjectField(String subject) {
        enterTextFieldData(subjectField, subject);
    }

    private void setMessageField(String message) {
        enterTextFieldData(messageField, message);
    }

    // private void setUploadFileInput(String filePath) {
    // enterTextFieldData(uploadFileInput, filePath);
    // }

    private void setSubmitButton() {
        clickButton(submitButton);
    }

    private void clickHomeButton() {
        clickButton(homeButton);
    }

    public void contactUsAction(String name, String email, String subject, String message) {
        setNameField(name);
        setEmailField(email);
        setSubjectField(subject);
        setMessageField(message);
        // setUploadFileInput(filePath);
        setSubmitButton();
    }

    public boolean isGetInTouchHeadingVisible() {
        return driver.findElement(getInTouchHeading).isDisplayed();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public HomePage homePage() {
        clickHomeButton();
        return new HomePage(driver);
    }
}
