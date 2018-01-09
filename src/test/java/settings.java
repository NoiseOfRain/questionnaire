import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class settings {

    WebDriver driver;


    @Test
    public void runTest() {

        System.setProperty("webdriver.gecko.driver", "src/test/resurses/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://ya.ru");

    }

}
