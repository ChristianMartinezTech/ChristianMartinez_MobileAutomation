package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;

/***
 * Class: PlansOptionTest
 * Class that navigates and tests the Add Restaurants functionality
 * @author cf.martinez
 */
public class PlansOptionTest extends BaseMobileTest {

    /**
     * Method that validates the restaurants availability
     * @author cf.martinez
     */
    @Description(value = "Restaurants availability Test")
    @Test()
    public void navigateAddRestaurants() {
        log.info("Start Navigation to Private Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        dashBoard.mainMenuCheck();
        dashBoard.clickAddButton();

        log.info("Validate Check Dining Availability");
        Assert.assertTrue(dashBoard.checkDinningIsDisplayed(), "Check Dining Availability not displayed");
    }
}
