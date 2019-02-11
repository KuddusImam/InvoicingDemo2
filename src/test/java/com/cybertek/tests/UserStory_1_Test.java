package com.cybertek.tests;

import com.cybertek.pages.UserStory_1;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserStory_1_Test extends TestBase {

    public UserStory_1 userStory_1;

    @Test
    public void filter_1() {

        userStory_1 = new UserStory_1();

        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        BrowserUtils.wait(5);
        userStory_1.filterBtn.click();

        assertTrue(userStory_1.draft_btn.isDisplayed());
        assertTrue(userStory_1.open_btn.isDisplayed());
    }

    @Test
    public void openOption() {

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.open_btn, 10).click();
        BrowserUtils.wait(5);

        for (int i = 1; i <= 9; i++) {

            String actual_result = Driver.getDriver().findElement(By.xpath(userStory_1.verifyStatus(i))).getText();
            assertEquals(actual_result, "Open");
        }


    }

    @Test
    public void verifyDraftOption() {

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.draft_btn, 10).click();
        BrowserUtils.wait(5);

        for (int i = 1; i <= 2; i++) {

            String actual_result = Driver.getDriver().findElement(By.xpath(userStory_1.verifyStatus(i))).getText();
            assertEquals(actual_result, "Draft");
        }


    }

    @Test
    public void verifyPaidOption(){
        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.paid_btn, 10).click();
        BrowserUtils.wait(5);

        System.out.println(userStory_1.createInvoiceMessage.getText());
        Assert.assertTrue(userStory_1.createInvoiceMessage.isDisplayed());
    }

    @Test
    public void verifyOverdueOption() {

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.overdue_btn, 10).click();
        BrowserUtils.wait(5);

        for (int i = 1; i <= 5; i++) {

            String actual_result = Driver.getDriver().findElement(By.xpath(userStory_1.verifyStatus(i))).getText();
            assertEquals(actual_result, "Open");
        }

    }

    @Test
    public void verifyMyInvoiceFilter(){

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.myInvoiceBtn, 10).click();
        BrowserUtils.wait(5);

        Assert.assertEquals(userStory_1.InvoicingsalePerson.getText(),"Lunch_Invoicing_User");
    }

    @Test
    public void verifyMyActivitiesFilter(){

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.myActivitiesBtn, 10).click();
        BrowserUtils.wait(5);

        Assert.assertTrue(userStory_1.createInvoiceMessage.isDisplayed());
    }

    @Test
    public void verifyLateActivitiesFilter(){

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.lateActivitiesBtn, 10).click();
        BrowserUtils.wait(5);

        Assert.assertTrue(userStory_1.createInvoiceMessage.isDisplayed());
    }

    @Test
    public void verifyTodayActivitiesFilter(){

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.todayActivitiesBtn, 10).click();
        BrowserUtils.wait(5);

        Assert.assertTrue(userStory_1.createInvoiceMessage.isDisplayed());
    }

    @Test
    public void verifyFutureActivitiesFilter(){

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.futureActivitiesBtn, 10).click();
        BrowserUtils.wait(5);

        Assert.assertTrue(userStory_1.createInvoiceMessage.isDisplayed());
    }

    @Test
    public void verifyAddCustomFilter(){

        userStory_1 = new UserStory_1();
        if (userStory_1.searchMagnificationBtn.isEnabled()) {
            userStory_1.searchMagnificationBtn.click();
        }
        //userStory_1.searchMagnificationBtn.click();

        BrowserUtils.wait(5);

        userStory_1.filterBtn.click();

        BrowserUtils.waitForVisibility(userStory_1.addCustomFltrBtn, 10).click();
        BrowserUtils.wait(5);

        Select select = new Select(userStory_1.mainDD);
        select.selectByValue("date");
        userStory_1.applyBtn.click();

    }




}
