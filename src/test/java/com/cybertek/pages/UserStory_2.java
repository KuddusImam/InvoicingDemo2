package com.cybertek.pages;

import com.cybertek.pages.loginPages.LogInPage;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserStory_2 {
    
     public UserStory_2() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
   public WebElement createBtn;

   @FindBy(partialLinkText = "Create and")
   public WebElement createAndEdit;

   @FindBy(xpath = "//input[@class='o_radio_input' and @type='radio' and @checked='true']")
   public WebElement radioButton;

   @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_form_button_cancel' and @type='button']")
   public WebElement discard;

   @FindBy(xpath = "//div[@class='modal-footer']//button[3]")
   public WebElement CancelButton;

   @FindBy(xpath = "//button[contains(text(),'Discard')]")
   public WebElement discard2;

   @FindBy(partialLinkText = "Search")
   public WebElement searchMore;

   @FindBy(linkText = "Internal Notes")
   public WebElement internalNotes;

   @FindBy(linkText = "Sales & Purchases")
   public WebElement salesPurchases;

   @FindBy(className= "active")
   public WebElement invoice;

   @FindBy(className = "btn btn-sm btn-primary")
   public WebElement save1;

   @FindBy(xpath = "//button[@class='btn btn-sm btn-primary' and @type='button']")
   public WebElement Create;

   @FindBy(linkText = "Add an item")
   public  WebElement addItem;


}
