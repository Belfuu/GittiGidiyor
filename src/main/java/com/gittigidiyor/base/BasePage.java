package com.gittigidiyor.base;

import com.gittigidiyor.page.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    public JavascriptExecutor executor;
    public final static Logger logger = Logger.getLogger(com.gittigidiyor.base.BasePage.class);

    public  BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30, 500);
    }
    public WebElement findElement(By by){

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
    public void scrollToElement(By by){
        WebElement scroll = findElement(by);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scroll);

    }
    public void clickElement(By by){
        WebElement element = findElement(by);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public Actions getActions(){
       return new Actions(driver);
    }
    public void hoverElement(By by){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        getActions().moveToElement(findElement(by)).build().perform();
    }
    public void sendKeys(By by,CharSequence text){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        findElement(by).sendKeys(text);

    }
    public HomePage getHomePage(){
        return new HomePage(driver);
    }
    public LoginPage getLoginPage(){

        return new LoginPage(driver);
    }
    public ProductPage getProductPage(){
        return new ProductPage(driver);
    }
    public ItemPage getItemPage(){
        return new ItemPage(driver);
    }
    public BasketPage getBasketPage(){
        return new BasketPage(driver);
    }
    public List<WebElement> findElements(By by){
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
    public void randomClick(By by){
        List<WebElement> elements = findElements(by);
        int maxElement = elements.size();
        Random random = new Random();
        int index = random.nextInt(maxElement);
        elements.get(index).click();
    }
    public void setExecutor(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 9700)");
    }
    public String getPriceText(By by){
        WebElement actualPrice = driver.findElement(by);
        String priceText = actualPrice.getText();
        return priceText;
    }
    public void dropDownSelect(WebElement element, String quantity){

        Select productCount = new Select(element);
        productCount.selectByValue(quantity);

    }


}
