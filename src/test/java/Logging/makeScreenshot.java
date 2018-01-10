package Logging;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class makeScreenshot extends SettingsForTests.settings {

    public static void getScreenshot(String filePath, String fileName) throws IOException, InterruptedException {

        Thread.sleep(2000);

        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath + fileName);
        FileUtils.copyFile(scrFile, destFile);
    }
}
