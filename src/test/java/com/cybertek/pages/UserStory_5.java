package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_5 {
    public UserStory_5() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBox;

    @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[1]//td[2]")
    public WebElement clickOnName;

    @FindBy(xpath = "//tbody[@class='ui-sortable']//tr[1]//td[2]")
    public WebElement enterANumber;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[7]")
    public WebElement ClickSourceDocument;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[7]/td[2]" )
    public WebElement clickOnAnyName;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span")
    public WebElement clickonMagnificeGlass;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    public WebElement clickOnMinusMagnifying;

    @FindBy(xpath = "//div[@class='btn-group btn-group-sm o_cp_switch_buttons']//button[2]")
    public WebElement clickOnKanban;
}
