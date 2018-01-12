package Logging;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.util.*;


public class makeTestLogs extends SettingsForTests.settings {

    static int numberOfScreen = 0;
    static String nameOfScreen = "";

    @AfterMethod
    public static void getScreenshot() throws IOException, InterruptedException {

        removeScrennshot();
        //не сразу отрисовываются фото
        Thread.sleep(1000);

        numberOfScreen++;

        if (!nameOfScreen.equals(driver.getCurrentUrl().substring(24))) {
        nameOfScreen = driver.getCurrentUrl().substring(24);
        }

        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath + numberOfScreen + nameOfScreen + ".png");
        FileUtils.copyFile(scrFile, destFile);
    }


    static void removeScrennshot() {
        File file = new File(filePathFull);

        List<File> files = sortFiles(file);

        while (files.size() > 5) {
            for (File children : files.get(0).listFiles()) {
                children.delete();
            }
            files.get(0).delete();
            files.remove(0);
        }
    }


    private static List<File> sortFiles(File file) {
        List<File> files = new ArrayList<>();

        for (File f : file.listFiles()) {
            files.add(f);
        }

        Collections.sort(files, new Comparator<File>() {
            public int compare(File f1, File f2) {
                return Long.compare(f1.lastModified(), f2.lastModified());
            }
        });

        return files;
    }
}
