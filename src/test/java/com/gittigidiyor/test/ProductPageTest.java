package com.gittigidiyor.test;

import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.ProductPage;
import org.junit.Before;
import org.junit.Test;

public class ProductPageTest extends BaseTest {
    ProductPage productPage;
    @Before
    public void before(){
        productPage = new ProductPage(driver);
    }
    @Test
    public void productPageTest(){
        productPage.productPageSteps();

    }

    }
