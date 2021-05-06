package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public HomePage homePageSteps(){

        hoverElement(By.cssSelector("div[title=\"Giriş Yap\"]"));
        clickElement(By.cssSelector("a[data-cy=\"header-login-button\"]"));
        logger.info("&&& Test Basladi &&&");

        return this;
    }
}
