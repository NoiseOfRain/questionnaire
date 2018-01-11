package Pages.Console;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Pages.mainMenu.*;

/**
 * Created by Noise on 09.01.2018.
 */
public class consolePage extends pageObjectsConsole {

    SoftAssert softAssert = new SoftAssert();

    @Test
            (priority = 1)
    public void checkConsolePage() throws AssertionError {

        softAssert.assertTrue(addressOfURL.equals(driver.getCurrentUrl()), "URL is incorrect");
        softAssert.assertTrue(pageConsole().isDisplayed(), "Console isn't Displayed");
        softAssert.assertTrue(captionPollsDraft().isDisplayed(), "captionPollsDraft isn't Displayed");
        softAssert.assertTrue(departmentPollsDraft().isDisplayed(), "departmentPollsDraft isn't Displayed");
        softAssert.assertTrue(captionPollsActual().isDisplayed(), "captionPollsActual isn't Displayed");
        softAssert.assertTrue(departmentPollsActual().isDisplayed(), "departmentPollsActual isn't Displayed");
        softAssert.assertAll();

    }

    @Test
            (priority = 2)
    public void checkMainMenu() {

        softAssert.assertTrue(buttonConsole().isDisplayed(), "page buttonConsole isn't Displayed");
        softAssert.assertTrue(buttonReport().isDisplayed(), "page buttonReport isn't Displayed");
        softAssert.assertTrue(buttonSettings().isDisplayed(), "page buttonSettings isn't Displayed");
        softAssert.assertTrue(buttonSearch().isDisplayed(), "page buttonSearch isn't Displayed");
        softAssert.assertTrue(inputSearch().isDisplayed(), "page inputSearch isn't Displayed");
        softAssert.assertAll();

    }

    @Test
            (priority = 3)
    public void goToPoll() {
        buttonPoll().click();
    }

}
