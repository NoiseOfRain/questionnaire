package Pages.Login;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Noise on 09.01.2018.
 */
public class loginPage extends pageObjectsLogin {

    @Test
            (priority = 1)
    public void login() {
        driver.get(addressOfURL);

        Assert.assertTrue(buttonLogin().isDisplayed());
        Assert.assertTrue(imageForsix().isDisplayed());
        Assert.assertTrue(inputLogin().isDisplayed());
        Assert.assertTrue(inputPass().isDisplayed());
    }

    @Test
            (priority = 2)
    public void goToConsole() {
        buttonLogin().click();
    }
}
