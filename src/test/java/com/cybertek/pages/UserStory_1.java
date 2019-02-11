package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory_1 {


    public UserStory_1() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement searchMagnificationBtn;

    @FindBy(xpath = "//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_control_panel']/div[@class='o_cp_right']/div[@class='btn-group o_search_options']/div[1]/button[1]")
    public WebElement filterBtn;

    @FindBy(xpath = "//span[contains(text(),'Customer Invoices')]")
    public WebElement customer_Invoices_btn;

    @FindBy(xpath = "//li[@data-index='0']//a[@href='#'][contains(text(),'Draft')]")
    public WebElement draft_btn;

    @FindBy(xpath = "//a[contains(text(),'Open')]")
    public WebElement open_btn;

    @FindBy(xpath = "//a[contains(text(),'Paid')]")
    public WebElement paid_btn;

    @FindBy(xpath = "//p[@class='oe_view_nocontent_create']")
    public WebElement createInvoiceMessage;

    @FindBy(xpath = "//a[contains(text(),'Overdue')]")
    public WebElement overdue_btn;

    @FindBy(xpath = "//a[contains(text(),'My Invoices')]")
    public WebElement myInvoiceBtn;

    @FindBy(xpath = "//tbody//tr[1]//td[5]")
    public WebElement InvoicingsalePerson;

    @FindBy(xpath = "//a[contains(text(),'My Activities')]")
    public WebElement myActivitiesBtn;

    @FindBy(xpath = "//a[contains(text(),'Late Activities')]")
    public WebElement lateActivitiesBtn;

    @FindBy(xpath = "//a[contains(text(),'Today Activities')]")
    public WebElement todayActivitiesBtn;

    @FindBy(xpath = "//a[contains(text(),'Future Activities')]")
    public WebElement futureActivitiesBtn;

    @FindBy(xpath = "//a[contains(text(),'Add Custom Filter')]")
    public WebElement addCustomFltrBtn;

    @FindBy(xpath = "//select[@class='o_input o_searchview_extended_prop_field']")
    public WebElement mainDD;

    @FindBy(xpath = "//li[@class='o_add_filter_menu']//button[@type='button'][contains(text(),'Apply')]")
    public WebElement applyBtn;

    public String verifyStatus(int row) {

        String xpth = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody/tr[" + row + "]/td[10]";

        return xpth;
    }


}
