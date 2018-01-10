package Pages.Console;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Noise on 09.01.2018.
 */
public class consolePage extends pageObjectsConsole {

    @Test
    public void console() {

        buttonLogin().click();

        driver.findElement(By.id("labelConsole")).isDisplayed();
        driver.findElement(By.xpath("//img[contains(@src,'https://s5o.ru/storage/simple/ru/edt/33/71/89/08/rue720debfb87.jpg')]")).isDisplayed();



    }


    public String getMethodName() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        return stackTrace[1].getMethodName();
    }
}
