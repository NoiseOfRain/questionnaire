package MainPage;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;


import java.io.File;

import static Logging.makeScreenshot.getScreenshot;


/**
 * Created by Noise on 09.01.2018.
 */
public class openMainPage extends SettingsForTests.settings{

    @Test
    public void open() throws Exception {

        driver.get("http://172.29.12.1:9003/Login");

        driver.findElement(By.xpath("//img[contains(@src,'logo_forsix_11.png')]")).isDisplayed();


        getScreenshot("/home/noise/", "123.png");




        driver.findElement(By.id("loginButton")).click();


        driver.findElement(By.id("labelConsole")).isDisplayed();

        driver.findElement(By.xpath("//img[contains(@src,'https://s5o.ru/storage/simple/ru/edt/33/71/89/08/rue720debfb87.jpg')]")).isDisplayed();

        getScreenshot("/home/noise/", "456.png");

        //(new Actions(driver)).dragAndDrop(element, target).perform();

    }
}
