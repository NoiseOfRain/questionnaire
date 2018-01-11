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


        while (file.listFiles().length > 5) {
            for (File children : file.listFiles()[0].listFiles()) {
                children.delete();
            }
            file.listFiles()[0].delete();
        }


        /*
        String[] fileName = new String[file.listFiles().length];
        int i = 0;
        for (File childrenFiles : file.listFiles()) {
            fileName[i] = childrenFiles.getName();
            i++;
//            for (File children : childrenFiles.listFiles()) {
//                System.out.println(children.getName());
//            }
        }

        i=0;
        DateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy_hh_mm_ss");
        Date[] date = new Date[fileName.length];

        for (String x : fileName) {
            try {
                date[i] = simpleDateFormat.parse(x);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            i++;
        }

        for (Date x : date) {
            System.out.println(x);
        }


    }
}
