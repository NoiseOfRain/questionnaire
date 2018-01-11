package Pages.PollList.EditPollList;

import Pages.PollList.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pageObjectsEditPoll extends pageObjectsPollList {

    static String addressOfURL = "http://172.29.12.1:9003/EditPoll?createPoll=true";

    static WebElement iconWhiteEdit() {
        return driver.findElement(By.xpath("//img[contains(@src,'http://dev.fs.marm.altarix.org/material-design/editor/drawable-xhdpi/ic_mode_edit_white_24dp.png')]"));
    }

    static WebElement iconWhiteDelete() {
        return driver.findElement(By.xpath("//img[contains(@src,'http://dev.fs.marm.altarix.org/material-design/action/drawable-xhdpi/ic_delete_white_24dp.png')]"));
    }

    static WebElement departmentList() {
        return driver.findElement(By.id("questionList"));
    }

    static WebElement buttonAddAnswer() {
        return driver.findElement(By.id("addAnswer"));
    }

    static WebElement buttonAddQuest() {
        return driver.findElement(By.id("addQuest"));
    }

    static WebElement questionList() {
        return driver.findElement(By.id("2.list"));
    }
}
