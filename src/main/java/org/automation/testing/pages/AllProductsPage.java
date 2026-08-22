package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllProductsPage extends BasePage {

    public AllProductsPage(ChromeDriver driver) {
        super(driver);
    }

    private final By allProductsOrSearchedProductsHeading = By.cssSelector("h2[class='title text-center']");
    private final By allViewProductLinks = By.cssSelector("div.col-sm-4 a[href^='/product_details/']");
    private final By searchInput = By.id("search_product");
    private final By searchButton = By.id("submit_search");

    public boolean isAllProductsOrSearchedProductsHeadingVisible() {
        return driver.findElement(allProductsOrSearchedProductsHeading).isDisplayed();
    }

    public List<WebElement> getAllViewProductLinks() {
        return driver.findElements(allViewProductLinks);
    }

    public boolean isProductsListVisible() {
        return !getAllViewProductLinks().isEmpty();
    }

    public void clickViewProduct(int index) {
        getAllViewProductLinks().get(index).click();
    }

    public void searchProducts(String keyword) {
        enterTextFieldData(searchInput, keyword);
        clickButton(searchButton);
    }

    public boolean areSearchedProductsVisible() {
        return !getAllViewProductLinks().isEmpty();
    }
}
