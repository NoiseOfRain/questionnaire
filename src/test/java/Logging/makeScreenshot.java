package Logging;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;


public class makeScreenshot extends SettingsForTests.settings {

    static int numberOfScreen = 0;
    static String nameOfScreen = "";

    @AfterMethod
    public static void getScreenshot() throws IOException, InterruptedException {

        nameOfScreen = driver.getCurrentUrl().substring(24);
        numberOfScreen++;

        //не сразу отрисовываются фото
        Thread.sleep(2000);

        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath + numberOfScreen + nameOfScreen + ".png");
        FileUtils.copyFile(scrFile, destFile);
    }
}
