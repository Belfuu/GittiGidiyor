package com.gittigidiyor.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver driver;
    public ChromeOptions options;


    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.gittigidiyor.com/");
    }
    @After
    public void tearDown(){

        driver.quit();
    }
}
