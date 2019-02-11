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
    
    @Test
    public void TestCase_03() {
        userStory_8 = new UserStory_8();

        userStory_8.MasterData.click();
        Assert.assertTrue(userStory_8.Customers.isDisplayed());
        Assert.assertTrue(userStory_8.Sellable_Products.isDisplayed());

    }

    @Test
    public void TestCase_04() {
        userStory_8 = new UserStory_8();
        Assert.assertTrue(userStory_8.Documents_Under_Purchases.isDisplayed());

    }

    @Test
    public void TestCase_05() {
        userStory_8 = new UserStory_8();

        Assert.assertTrue(userStory_8.Master_Data_Under_purchases.isDisplayed());
    }

    @Test
    public void TestCase_06() {
        userStory_8 = new UserStory_8();
        userStory_8.Documents_Under_Purchases.click();
        Assert.assertTrue(userStory_8.Payments_Under_Documents_Under_Purchases.isDisplayed());
        Assert.assertTrue(userStory_8.VandorCreaditNOtes_Under_Documents_Under_Purchases.isDisplayed());
        Assert.assertTrue(userStory_8.VonderBills_Under_Documents_Under_Purchases.isDisplayed());
    }
    @Test
    public void TestCase_07(){
        userStory_8 = new UserStory_8();
        userStory_8.Master_Data_Under_purchases.click();
        Assert.assertTrue(userStory_8.Purchasesable_products_Under_Master_Data_Under_purchases.isDisplayed());
        Assert.assertTrue(userStory_8.Vandor_Under_Master_Data_Under_purchases.isDisplayed());
    }
    
    
}
