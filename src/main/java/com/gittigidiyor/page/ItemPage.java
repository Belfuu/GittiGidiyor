package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage extends BasePage {
    public ItemPage(WebDriver driver) {
        super(driver);
    }
    public ItemPage ItemSteps(){
        getProductPage().productPageSteps();
        randomClick(By.xpath("//div[@class='product-info-con clearfix ']"));
        logger.info("Random sekilde urun secildi");
        scrollToElement(By.id("add-to-basket"));
        clickElement(By.id("add-to-basket"));
        logger.info("Sepete urun eklendi");

       return this;

    }
}


