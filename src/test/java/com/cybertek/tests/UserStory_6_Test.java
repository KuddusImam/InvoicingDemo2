package com.cybertek.tests;

import com.cybertek.pages.UserStory_6;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class UserStory_6_Test extends TestBase {
    public UserStory_6 userStory_6;

    @Test
    public void importIcon() {
        userStory_6 = new UserStory_6();
        userStory_6.verifyImportButton.click();
        //userStory_6.loadFile.click();
        BrowserUtils.wait(4);

        String path = "/Users/shernaysawut/Downloads/testing.xlsx";

        BrowserUtils.uploadFile(path);
        BrowserUtils.wait(10);
    }
    @Test
public void ClickHelpIcon(){
        userStory_6=new UserStory_6();
        userStory_6.verifyHelpButton.click();
        userStory_6.clickHelpButton.click();
}
}
