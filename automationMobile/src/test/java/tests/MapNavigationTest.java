package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;

/***
 * Class: MapNavigationTest
 * Class that navigates and tests the Map button/functionality
 * @author cf.martinez
 */
public class MapNavigationTest extends BaseMobileTest {

    /**
     * Method that validates the map screen navigation.
     * @author cf.martinez
     */
    @Description(value = "Map screen Navigation test")
    @Test()
    public void navigateToMapScreen() {
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        dashBoard.mainMenuCheck();
        MapScreen map = dashBoard.clickMapButton();

        log.info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        log.info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        log.info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");

        log.info("Validate Map is an Attraction");
        Assert.assertTrue(map.isHotelAttraction());
    }
}
