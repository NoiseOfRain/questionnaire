package SettingsForTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


//(new Actions(driver)).dragAndDrop(element, target).perform();
public class settings {

    static public  WebDriver driver;
    static private String wayToWebDriver;

    static public  String filePath;
    static public  String nowDatetime = getNowDatetime();

    private void getOperationSystem() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")){
            wayToWebDriver = "src\\test\\resources\\geckodriverForWindows.exe";
            filePath = "src\\logs\\" + nowDatetime + "\\";
        }
        else if (os.contains("osx")){
            wayToWebDriver = null;
        }
        else if (os.contains("nix") || os.contains("aix") || os.contains("nux")){
            wayToWebDriver = "src/test/resources/geckodriverForUbuntu";
            filePath = "src/logs/"  + nowDatetime + "/";
        }
    }

    public static String getNowDatetime() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy_HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    @BeforeClass
    public void setPropertyForDriver() {
        getOperationSystem();

        System.setProperty("webdriver.gecko.driver", wayToWebDriver);
        driver = new FirefoxDriver();

        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @AfterClass
    public  void closeDriver() {
        driver.quit();
    }
}
