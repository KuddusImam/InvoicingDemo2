package com.cybertek.tests;

import com.cybertek.pages.UserStory_4;
import com.cybertek.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory_4_Test extends TestBase {
  
  UserStory_4 userStory_4;
  
    @Test
    public void test1(){
        userStory_4 = new UserStory_4();
        userStory_4.magBtn.click();
        userStory_4.Favorites.click();
        Assert.assertTrue( userStory_4.Dashboard.isDisplayed());
        Assert.assertTrue(userStory_4.SaveCurrentSearches.isDisplayed());
    }

    @Test
    public void test2(){
        userStory_4 = new UserStory_4();

        userStory_4.magBtn.click();
        userStory_4.Favorites.click();
        userStory_4.SaveCurrentSearches.click();
        userStory_4.SCSinput.sendKeys("Shapkat");
        userStory_4.SaveButton.click();

    }
    @Test
    public void test3(){
        userStory_4 = new UserStory_4();
        userStory_4.magBtn.click();
        userStory_4.Favorites.click();
        userStory_4.add_to_my_dashboard.click();
        userStory_4.add_to_my_dashboard_save.click();
        Assert.assertTrue(  userStory_4.notification.isDisplayed());

    }
  
}
