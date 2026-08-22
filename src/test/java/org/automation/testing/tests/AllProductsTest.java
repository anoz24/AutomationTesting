package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.AllProductsPage;
import org.automation.testing.pages.HomePage;
import org.automation.testing.pages.ProductDetailPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllProductsTest extends BaseTest {

    @Test
    public void verifyAllProductsAndProductDetailPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible());

        AllProductsPage allProductsPage = homePage.navigateProducts();
        Assert.assertTrue(allProductsPage.isAllProductsOrSearchedProductsHeadingVisible());

        Assert.assertTrue(allProductsPage.isProductsListVisible());

        allProductsPage.clickViewProduct(1);

        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("/product_details/"));

        Assert.assertTrue(productDetailPage.areAllDetailFieldsVisible());
    }
}
