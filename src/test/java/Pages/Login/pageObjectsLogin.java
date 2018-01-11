package Pages.Login;

import Logging.makeTestLogs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pageObjectsLogin extends makeTestLogs {

    static String addressOfURL = "http://172.29.12.1:9003/Login";

    static WebElement buttonLogin() {
        return driver.findElement(By.id("loginButton"));
    }

    static WebElement imageForsix() {
        return driver.findElement(By.xpath("//img[contains(@src,'https://static.tildacdn.com/tild3462-6263-4236-b935-346134663931/logo_forsix_11.png')]"));
    }

    static WebElement inputLogin() {
        return driver.findElement(By.id("username"));
    }

    static WebElement inputPass() {
        return driver.findElement(By.id("password"));
    }
}
