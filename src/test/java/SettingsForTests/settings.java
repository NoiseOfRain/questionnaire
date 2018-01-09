package SettingsForTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class settings {

    static public  WebDriver driver;
    static private String wayToWebDriver;

    private void getOperationSystem() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")){
            wayToWebDriver = "src\\test\\resurses\\geckodriverForWindows.exe";
        }
        else if (os.contains("osx")){
            wayToWebDriver = null;
        }
        else if (os.contains("nix") || os.contains("aix") || os.contains("nux")){
            wayToWebDriver = "src/test/resurses/geckodriverForUbuntu";
        }
    }

    @BeforeClass
    public void runTest() {
        getOperationSystem();

        System.setProperty("webdriver.gecko.driver", wayToWebDriver);
        driver = new FirefoxDriver();

        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @AfterClass
    public  void endTest() {
        driver.quit();
    }
}
