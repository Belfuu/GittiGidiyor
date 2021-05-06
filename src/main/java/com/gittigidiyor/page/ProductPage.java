package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.openqa.selenium.*;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public ProductPage productPageSteps(){
        getLoginPage().loginPageSteps();
        sendKeys(By.cssSelector("input[type=\"text\"]"),"Bilgisayar" + Keys.ENTER);
        logger.info("Bilgisayar Kelimesi Aratıldı");
        setExecutor();
        clickElement(By.cssSelector("li[class='next-link']"));
        logger.info("2.sayfaya Geçildi");
        return this;

    }
}
