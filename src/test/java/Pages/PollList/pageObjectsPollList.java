package Pages.PollList;

import Logging.makeTestLogs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pageObjectsPollList extends makeTestLogs {

    static String addressOfURL = "http://172.29.12.1:9003/PollList";

    static WebElement buttonAddTemplatePoll() {
        return driver.findElement(By.id("addTemplatePoll"));
    }

    static WebElement departmentItemPollDraft() {
        return driver.findElement(By.id("pollList_itemPollDraft"));
    }

    static WebElement departmentItemPollActual() {
        return driver.findElement(By.id("pollList_itemPollActual"));
    }
}
