package com.gittigidiyor.test;

import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.HomePage;
import org.junit.Before;
import org.junit.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage;
   @Before
   public void before(){

       homePage = new HomePage(driver);
   }

    @Test
    public void homePageTest(){


    }
}
