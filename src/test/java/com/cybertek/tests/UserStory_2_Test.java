package com.cybertek.tests;

import com.cybertek.pages.UserStory_2;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory_2_Test extends TestBase {


    public UserStory_2 userStory_2;


    @Test //1,2,3
    public void test1() {
        userStory_2 = new UserStory_2();
        wait.until(ExpectedConditions.visibilityOf(userStory_2.createBtn));
        userStory_2.createBtn.click();

        BrowserUtils.wait(2);
        List<WebElement> mylist = driver.findElements(By.xpath("//input[@class='o_input ui-autocomplete-input' and @autocomplete='off']"));
        mylist.get(0).click();

        userStory_2.createAndEdit.click();
        wait.until(ExpectedConditions.visibilityOf(userStory_2.radioButton));

        //2
        Assert.assertTrue(userStory_2.radioButton.isSelected());

        //3
        userStory_2.discard.click();

    }

    @Test //4
    public void test4() {
        userStory_2 = new UserStory_2();
        wait.until(ExpectedConditions.visibilityOf(userStory_2.createBtn));
        userStory_2.createBtn.click();

        BrowserUtils.wait(2);
        List<WebElement> mylist = driver.findElements(By.xpath("//input[@class='o_input ui-autocomplete-input' and @autocomplete='off']"));
        mylist.get(0).sendKeys("John Smith");

        mylist.get(1).sendKeys("123 fairfax rd. farirfax VA");
        //BrowserUtils.wait(100);

        new Actions(driver).pause(2000).perform();
        userStory_2.CancelButton.click();
        userStory_2.discard2.click();







    }












    }
