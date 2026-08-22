package org.automation.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(ChromeDriver driver) {
        super(driver);
    }

    private final By productName = By.cssSelector("div.product-information h2");
    private final By productCategory = By.cssSelector("div.product-information p:nth-of-type(1)");
    private final By productPrice = By.cssSelector("div.product-information span span");
    private final By productAvailability = By
            .xpath("//div[@class='product-information']//p[b[text()='Availability:']]");
    private final By productCondition = By.xpath("//div[@class='product-information']//p[b[text()='Condition:']]");
    private final By productBrand = By.xpath("//div[@class='product-information']//p[b[text()='Brand:']]");

    public boolean isProductNameVisible() {
        return driver.findElement(productName).isDisplayed();
    }

    public boolean isProductCategoryVisible() {
        return driver.findElement(productCategory).isDisplayed();
    }

    public boolean isProductPriceVisible() {
        return driver.findElement(productPrice).isDisplayed();
    }

    public boolean isProductAvailabilityVisible() {
        return driver.findElement(productAvailability).isDisplayed();
    }

    public boolean isProductConditionVisible() {
        return driver.findElement(productCondition).isDisplayed();
    }

    public boolean isProductBrandVisible() {
        return driver.findElement(productBrand).isDisplayed();
    }

    public boolean areAllDetailFieldsVisible() {
        return isProductNameVisible()
                && isProductCategoryVisible()
                && isProductPriceVisible()
                && isProductAvailabilityVisible()
                && isProductConditionVisible()
                && isProductBrandVisible();
    }
}
