package Logging;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class makeScreenshot extends SettingsForTests.settings {

    public static void getScreenshot(String fileName) throws IOException, InterruptedException {

        //не сразу отрисовываются фото
        Thread.sleep(2000);

        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath + fileName);
        FileUtils.copyFile(scrFile, destFile);
    }
}
