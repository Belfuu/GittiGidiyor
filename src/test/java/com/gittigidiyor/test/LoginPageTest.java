package com.gittigidiyor.test;


import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    @Before
    public void before(){

        loginPage = new LoginPage(driver);
    }
    @Test
    public void loginPageTest(){
        loginPage.loginPageSteps();

    }
}
