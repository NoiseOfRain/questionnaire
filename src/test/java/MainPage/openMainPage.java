package MainPage;

import com.sun.scenario.Settings;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


/**
 * Created by Noise on 09.01.2018.
 */
public class openMainPage extends SettingsForTests.settings {

    @Test
    public void open() {

        driver.get("http://ya.ru");

        driver.findElement(By.className("button__text"));

        System.out.println();

        //(new Actions(driver)).dragAndDrop(element, target).perform();

    }
}
