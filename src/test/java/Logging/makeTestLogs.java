package Logging;

import gherkin.lexer.Fi;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;


public class makeTestLogs extends SettingsForTests.settings {

    static int numberOfScreen = 0;
    static String nameOfScreen = "";

    //@AfterMethod
    public static void getScreenshot() throws IOException, InterruptedException {

        //не сразу отрисовываются фото
        Thread.sleep(1000);

        numberOfScreen++;

        //if (!nameOfScreen.equals(driver.getCurrentUrl().substring(24))) {
            nameOfScreen = driver.getCurrentUrl().substring(24);
        //}

        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath + numberOfScreen + nameOfScreen + ".png");
        FileUtils.copyFile(scrFile, destFile);
    }


    @Test
    static void removeScrennshot() {
        File file = new File(filePathFull);


        System.out.println(file.listFiles().length);

        for (File childrenFiles : file.listFiles()) {

            System.out.println(childrenFiles);
//            for (File children : childrenFiles.listFiles()) {
//                System.out.println(children.getName());
//            }
        }


    }
}
