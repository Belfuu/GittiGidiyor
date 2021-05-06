package com.gittigidiyor.test;

import com.gittigidiyor.base.BaseTest;
import com.gittigidiyor.page.ItemPage;
import org.junit.Before;
import org.junit.Test;

public class ItemPageTest extends BaseTest {
    ItemPage itemPage;
    @Before
    public void before(){
        itemPage = new ItemPage(driver);

    }
    @Test
    public void itemPageTest(){
        itemPage.ItemSteps();
    }
}
