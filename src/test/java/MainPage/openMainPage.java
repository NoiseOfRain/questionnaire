package MainPage;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Stack;

import static org.apache.regexp.RETest.test;


/**
 * Created by Noise on 09.01.2018.
 */
public class openMainPage extends Logging.makeScreenshot {

    @Test
    public void first() {

        driver.get("http://172.29.12.1:9003/Login");
        driver.findElement(By.xpath("//img[contains(@src,'logo_forsix_11.png')]")).isDisplayed();


    }


    @Test
    public void second() {

        driver.findElement(By.id("loginButton")).click();

        driver.findElement(By.id("labelConsole")).isDisplayed();
        driver.findElement(By.xpath("//img[contains(@src,'https://s5o.ru/storage/simple/ru/edt/33/71/89/08/rue720debfb87.jpg')]")).isDisplayed();



    }


    public String getMethodName() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        return stackTrace[1].getMethodName();
    }
}
