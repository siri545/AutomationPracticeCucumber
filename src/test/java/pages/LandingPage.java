package pages;

import io.cucumber.java.en.Given;
import library.BaseClass;
import library.ObjectMap;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LandingPage extends BaseClass {
    final static Logger logger = Logger.getLogger(LandingPage.class);

    public void navigateToAutomationPractice() {
        try {
            driver.get(("http://automationpractice.com/"));
            String actualTitle = driver.getTitle();
            assertEquals("My Store", actualTitle);
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    public void verifyLandingPageIsDisPlays() throws Exception {
        myLibrary.waitForElementVisibility(landingLocator.getLocator("LandingPage.Header"));
    }

    public void clickLoginButton() throws Exception {
        myLibrary.clickElement(landingLocator.getLocator("LandingPage.SignInButton"));
    }

    public void searchForItem(String keyword) throws Exception {
        myLibrary.enterTxt(landingLocator.getLocator("LandingPage.SearchBox"), keyword);
    }

    public void clickOnSearchButton() throws Exception {
        myLibrary.clickElement(landingLocator.getLocator("LandingPage.ClickSearchButton"));
    }

    //Contact Us Page
    public void clickOnContactUsButton() throws Exception {
        myLibrary.clickElement(landingLocator.getLocator("LandingPage.ClickOnContactUs"));

    }


}
