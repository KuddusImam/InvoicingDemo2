package com.cybertek.tests;

import com.cybertek.pages.UserStory_5;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class UserStory_5_Test extends TestBase {
    public UserStory_5 userStory_5;

    @Test
    public void searchingName() {
        userStory_5 = new UserStory_5();


        BrowserUtils.wait(3);
        userStory_5.searchBox.sendKeys("Agrolait" + Keys.ENTER);
        BrowserUtils.wait(3);

        userStory_5.clickOnName.click();
        BrowserUtils.wait(3);

    }

    @Test
    public void test2() {
        userStory_5 = new UserStory_5();
        userStory_5.searchBox.sendKeys("0001" + Keys.ENTER);
    }

    @Test
    public void test3() {
        userStory_5 = new UserStory_5();
        userStory_5.ClickSourceDocument.click();
        userStory_5.clickOnAnyName.click();


    }

    @Test
    public void test4() {
        userStory_5 = new UserStory_5();
        userStory_5.clickonMagnificeGlass.click();
        BrowserUtils.wait(5);

    }

    @Test
    public void test5() {
        userStory_5 = new UserStory_5();
        userStory_5.clickOnMinusMagnifying.click();
    }

    @Test
    public void test6() {
        userStory_5 = new UserStory_5();
        userStory_5.clickOnKanban.click();
        //   userStory_5.clickOnCustomer.click();
        BrowserUtils.wait(5);
    }


}
