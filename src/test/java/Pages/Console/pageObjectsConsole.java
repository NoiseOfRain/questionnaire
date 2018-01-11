package Pages.Console;

import Logging.makeTestLogs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pageObjectsConsole extends makeTestLogs {

    static String addressOfURL = "http://172.29.12.1:9003/Console";

    static WebElement pageConsole() {
        return driver.findElement(By.id("Console"));
    }

    static WebElement captionPollsDraft() {
        return driver.findElement(By.id("console_headSectionPollDraft"));
    }

    static WebElement departmentPollsDraft() {
        return driver.findElement(By.id("console_headSectionPollActual"));
    }

    static WebElement captionPollsActual() {
        return driver.findElement(By.id("console_headSectionPollActual"));
    }

    static WebElement departmentPollsActual() {
        return driver.findElement(By.id("console_headSectionPollActual"));
    }

    static WebElement departmentPollsReport() {
        return driver.findElement(By.id("console_itemReport"));
    }
}
