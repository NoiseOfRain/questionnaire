package MainPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Noise on 09.01.2018.
 */
public class openMainPage extends pageObjects {

    @Test
    public void first() {
        driver.get(addressOfURL);

        Assert.assertTrue(buttonLogin().isDisplayed());
        Assert.assertTrue(imageForsix().isDisplayed());
        Assert.assertTrue(inputLogin().isDisplayed());
        Assert.assertTrue(inputPass().isDisplayed());
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
