package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompleteSignUpPage extends BasePage {

    public CompleteSignUpPage(ChromeDriver driver) {
        super(driver);
    }

    private final By genderButton = By.cssSelector("input[id=\"id_gender1\"]");
    private final By passwordField = By.cssSelector("input[data-qa=\"password\"]");
    private final By daysList = By.cssSelector("select[data-qa=\"days\"]");
    private final By monthsList = By.cssSelector("select[data-qa=\"months\"]");
    private final By yearsList = By.cssSelector("select[data-qa=\"years\"]");
    private final By fNameAddressField = By.cssSelector("input[data-qa=\"first_name\"]");
    private final By lNameAddressField = By.cssSelector("input[data-qa=\"last_name\"]");
    private final By mainAddressField = By.cssSelector("input[data-qa=\"address\"]");
    private final By countryAddressField = By.cssSelector("select[data-qa=\"country\"]");
    private final By stateAddressField = By.cssSelector("input[data-qa=\"state\"]");
    private final By cityAddressField = By.cssSelector("input[data-qa=\"city\"]");
    private final By zipCodeAddressField = By.cssSelector("input[data-qa=\"zipcode\"]");
    private final By mobileNumberAddressField = By.cssSelector("input[data-qa=\"mobile_number\"]");
    private final By signUpButton = By.cssSelector("button[data-qa=\"create-account\"]");

    private void setGenderButton() {
        clickButton(genderButton);
    }

    private void setPassword(String password) {
        enterTextFieldData(passwordField, password);
    }

    private void setDay(String dayNum) {
        enterSelectData(daysList, dayNum);
    }

    private void setMonth(String monthName) {
        enterSelectData(monthsList, monthName);
    }

    private void setYear(String year) {
        enterSelectData(yearsList, year);
    }

    private void setFname(String fName) {
        enterTextFieldData(fNameAddressField, fName);
    }

    private void setLname(String lName) {
        enterTextFieldData(lNameAddressField, lName);
    }

    private void setMainAddress(String address) {
        enterTextFieldData(mainAddressField, address);
    }

    private void setCountryAddress(String country) {
        enterSelectData(countryAddressField, country);
    }

    private void setStateAddress(String state) {
        enterTextFieldData(stateAddressField, state);
    }

    private void setCityAddress(String city) {
        enterTextFieldData(cityAddressField, city);
    }

    private void setZipCodeAddress(String zipCode) {
        enterTextFieldData(zipCodeAddressField, zipCode);
    }

    private void setMobileNumberAddress(String mobileNumber) {
        enterTextFieldData(mobileNumberAddressField, mobileNumber);
    }

    private void setSignUpButton() {
        clickButton(signUpButton);
    }

    public void signUpAction(String password, String day, String month, String year,
            String fName, String lName, String address, String country,
            String state, String city, String zipCode, String mobileNumber) {
        setGenderButton();
        setPassword(password);
        setDay(day);
        setMonth(month);
        setYear(year);
        setFname(fName);
        setLname(lName);
        setMainAddress(address);
        setCountryAddress(country);
        setStateAddress(state);
        setCityAddress(city);
        setZipCodeAddress(zipCode);
        setMobileNumberAddress(mobileNumber);
        setSignUpButton();
    }
}
