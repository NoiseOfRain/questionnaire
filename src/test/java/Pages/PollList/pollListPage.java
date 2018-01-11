package Pages.PollList;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Noise on 09.01.2018.
 */
public class pollListPage extends pageObjectsPollList {

    SoftAssert softAssert = new SoftAssert();

    @Test
            (priority = 1)
    public void checkPollListPage() throws AssertionError {

        softAssert.assertTrue(addressOfURL.equals(driver.getCurrentUrl()), "URL is incorrect");
        softAssert.assertTrue(buttonAddTemplatePoll().isDisplayed(), "buttonAddTemplatePoll isn't Displayed");
        softAssert.assertTrue(departmentItemPollDraft().isDisplayed(), "departmentItemPollDraft isn't Displayed");
        softAssert.assertTrue(departmentItemPollActual().isDisplayed(), "departmentItemPollActual isn't Displayed");
        softAssert.assertAll();

    }

    @Test
            (priority = 2)
    public void addPollList() {
        buttonAddTemplatePoll().click();
    }
}
