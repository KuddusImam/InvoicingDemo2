package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_6 {
    public UserStory_6() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement verifyImportButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/form/div[1]/div[2]/div/span[1]/label")
    public WebElement loadFile;

    @FindBy(xpath = "//button[contains(text(),'Import')]")
    public WebElement verifyHelpButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/form/div[1]/div[1]/p/a")
    public WebElement clickHelpButton;
}
