package com.cybertek.pages;

public class UserStory_4 {
  
  public UserStory_4() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button")
    public WebElement Favorites;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[8]/a")
    public WebElement Dashboard;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span")
    public WebElement magBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[3]/a")
    public WebElement SaveCurrentSearches;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[4]/input")
    public WebElement SCSinput;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[7]/button")
    public WebElement SaveButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[1]/a")
    public WebElement ButtonAfterSave;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[8]/a")
    public WebElement add_to_my_dashboard;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[8]")
    public WebElement add_to_my_dashboard_save;
  
    @FindBy(xpath = "/html/body/div[2]")
    public WebElement notification;
  
}
