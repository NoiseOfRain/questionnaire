package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mainMenu extends Logging.makeScreenshot {

    public static WebElement buttonConsole() {
        return driver.findElement(By.id("labelConsole"));
    }

    public static WebElement buttonPoll() {
        return driver.findElement(By.id("labelPoll"));
    }

    public static WebElement buttonReport() {
        return driver.findElement(By.id("labelReport"));
    }

    public static WebElement buttonSettings() {
        return driver.findElement(By.id("labelSetting"));
    }

    public static WebElement buttonSearch() {
        return driver.findElement(By.id("searchButton"));
    }

    public static WebElement inputSearch() {
        return driver.findElement(By.id("searchInput"));
    }
}
