package Pages.PollList.EditPollList;


import Pages.PollList.pageObjectsPollList;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Noise on 09.01.2018.
 */
public class editPollPage extends pageObjectsEditPoll {

    SoftAssert softAssert = new SoftAssert();

    @Test
            (priority = 1)
    public void checkPollEditPage() throws AssertionError {

        softAssert.assertTrue(addressOfURL.equals(driver.getCurrentUrl()), "URL is incorrect");

        softAssert.assertTrue(iconWhiteEdit().isDisplayed(), "iconWhiteEdit isn't Displayed");
        softAssert.assertTrue(iconWhiteDelete().isDisplayed(), "iconWhiteDelete isn't Displayed");
        //softAssert.assertTrue(departmentList().isDisplayed(), "departmentList isn't Displayed");
        //softAssert.assertTrue(buttonAddAnswer().isDisplayed(), "buttonAddAnswer isn't Displayed");
        //softAssert.assertTrue(buttonAddQuest().isDisplayed(), "buttonAddQuest isn't Displayed");
        softAssert.assertAll();

    }
}
