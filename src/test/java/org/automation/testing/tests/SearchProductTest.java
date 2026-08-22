package org.automation.testing.tests;

import org.automation.testing.base.BaseTest;
import org.automation.testing.pages.AllProductsPage;
import org.automation.testing.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends BaseTest {

    @Test
    public void verifySearchProduct() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageVisible());

        AllProductsPage allProductsPage = homePage.navigateProducts();
        Assert.assertTrue(allProductsPage.isAllProductsOrSearchedProductsHeadingVisible());

        allProductsPage.searchProducts("men");

        Assert.assertTrue(allProductsPage.isAllProductsOrSearchedProductsHeadingVisible());

        Assert.assertTrue(allProductsPage.areSearchedProductsVisible());
    }
}
