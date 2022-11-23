package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.PrivacyScreen;
import util.tests.BaseMobileTest;

/***
 * Class: PrivacyAndLegalTest
 * Class that navigates and tests the Privacy screen navigation
 * @author cf.martinez
 */
public class PrivacyAndLegalTest extends BaseMobileTest{

    /**
     * Method that tests the Privacy screen navigation
     * @author cf.martinez
     */
    @Description(value = "Privacy and Legal Test")
    @Test()
    public void navigateToPrivacyAndLegal() {
        log.info("Start Navigation to Private Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        dashBoard.mainMenuCheck();
        dashBoard.clickMoreOptions();

        log.info("Validate Tickets and Passes Button");
        Assert.assertTrue(dashBoard.ticketsIsDisplayed(), "Tickets and Passes not displayed");

        dashBoard.scrollingToBottom();

        PrivacyScreen privacy = dashBoard.clickPrivacy();

        log.info("Validate Privacy Policy Button");
        Assert.assertTrue(privacy.privacyPolicyIsDisplayed(), "Privacy Policy not displayed");

        log.info("Validate Terms of Use");
        Assert.assertTrue(privacy.termsOfUseIsDisplayed(), "Terms of Use not displayed");

        log.info("Validate Supplemental Terms and Conditions Button");
        Assert.assertTrue(privacy.supplementalTermsIsDisplayed(), "Supplemental Terms and Conditions not displayed");

        log.info("Validate Legal Notices button");
        Assert.assertTrue(privacy.legalNoticesIsDisplayed(), "Legal Notices not displayed");

        log.info("Validate Property Rules button");
        Assert.assertTrue(privacy.propertyRulesIsDisplayed(), "Property Rules not displayed");

        log.info("Validate Electronic Communication Disclosure button");
        Assert.assertTrue(privacy.disclosureIsDisplayed(), "Electronic Communication Disclosure not displayed");
    }
}
