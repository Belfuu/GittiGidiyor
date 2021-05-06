package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public BasketPage basketPageSteps(){
        getItemPage().ItemSteps();
        hoverElement(By.cssSelector("a[class='header-cart-hidden-link'"));
        clickElement(By.cssSelector("a[class=\"gg-ui-btn-default padding-none\"]"));
        logger.info("Sepete Gidildi");
        clickElement(By.cssSelector("select.amount>option[value='2']"));
        logger.info("Ürün Sayısı 2 Yapıldı");
        String basketPrice = "";
        String price="";
        clickElement(By.cssSelector("select[name]>option[value='0']"));
        basketPrice =getPriceText(By.cssSelector("p[class='new-price']"));
        logger.info("Sepet Fiyatı="+basketPrice);
        price = getPriceText(By.cssSelector("div[class='total-price']"));
        logger.info("Ürün Fiyatı="+price);
        Assert.assertEquals(price,basketPrice);
        logger.info("Karşılaştırma Yapıldı");
        clickElement(By.cssSelector(("a.btn-delete")));
        logger.info("Sepet Boşaltıldı");
        logger.info("&&& Test Bitti &&&");
        return this;

    }
}
