package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_8 {
    public UserStory_8() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/web#menu_id=201&action='])")
    public WebElement Documents;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[1]/ul")
    public WebElement DocumentsOptions;

    @FindBy(xpath = "(//a[@href='/web#menu_id=203&action='])")
    public WebElement MasterData;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[2]/ul")
    public WebElement MasterDataOptions;


@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[1]/a")
    public WebElement getDocuments;
}

