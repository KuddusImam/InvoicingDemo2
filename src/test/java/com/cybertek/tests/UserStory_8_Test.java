package com.cybertek.tests;

import com.cybertek.pages.UserStory_8;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory_8_Test extends TestBase {
    public UserStory_8 userStory_8;

    @Test
    public void TestCase_01() throws InterruptedException {
        userStory_8 = new UserStory_8();

        Assert.assertTrue(userStory_8.DocumentsOptions.isDisplayed());
    }
    @Test
    public void TestCase_02() throws InterruptedException{
        userStory_8 = new UserStory_8();

        userStory_8.MasterData.click();
        BrowserUtils.wait(5);
        Assert.assertTrue(userStory_8.MasterDataOptions.isDisplayed());


    }
    @Test
    public void documentDropdown(){
        userStory_8=new UserStory_8();
        userStory_8.getDocuments.click();

    }
}
