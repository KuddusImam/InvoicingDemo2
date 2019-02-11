package com.cybertek.tests;

import com.cybertek.pages.UserStory_7;
import com.cybertek.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory_7_Test extends TestBase {
    UserStory_7 userStory7;
  
    @Test
    public  void test1(){
        userStory7 = new UserStory_7();
        if (userStory7.firstCusomer.isEnabled()){
            userStory7.firstCusomer.click();
        }

        Assert.assertTrue(userStory7.Action.isDisplayed());
        Assert.assertTrue(userStory7.print.isDisplayed());

    }
    @Test
    public  void test2() {
        userStory7 = new UserStory_7();
        userStory7.firstCusomer.click();

        userStory7.Action.click();
        userStory7.Delete.click();
        driver.switchTo().alert().accept();

    }
}
