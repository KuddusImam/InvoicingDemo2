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
    
    @FindBy(xpath = “/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[2]/ul/li[1]/a”)
    public WebElement Customers;
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[1]/li[2]/ul/li[2]/a/span")
    public WebElement Sellable_Products;
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[2]/li[1]/a/span")
    public WebElement Documents_Under_Purchases;
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[2]/li[2]/a/span")
    public WebElement Master_Data_Under_purchases;
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[2]/li[1]/ul/li[1]/a/span")
    public WebElement VonderBills_Under_Documents_Under_Purchases;
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[2]/li[1]/ul/li[2]/a/span")
    public WebElement VandorCreaditNOtes_Under_Documents_Under_Purchases;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[2]/li[1]/ul/li[3]/a/span")
    public WebElement Payments_Under_Documents_Under_Purchases;
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[2]/li[2]/ul/li[1]/a")
    public WebElement Vandor_Under_Master_Data_Under_purchases;
    
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[8]/ul[2]/li[2]/ul/li[2]/a/span")
    public WebElement Purchasesable_products_Under_Master_Data_Under_purchases;
}

