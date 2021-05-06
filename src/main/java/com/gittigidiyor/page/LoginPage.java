package com.gittigidiyor.page;

import com.gittigidiyor.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage loginPageSteps(){
        getHomePage().homePageSteps();
        sendKeys(By.id("L-UserNameField"),"Username");
        sendKeys(By.id("L-PasswordField"),"Password");
        clickElement(By.id("gg-login-enter"));
        logger.info("Giris Yapıldı");
        return this;
    }
}
