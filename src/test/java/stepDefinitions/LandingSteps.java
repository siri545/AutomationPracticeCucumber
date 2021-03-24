package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LandingPage;

public class LandingSteps {

    LandingPage myLanding = new LandingPage();

    @Given("Navigate to automation practice website")
    public void navigate_to_automation_practice_website() {
        myLanding.navigateToAutomationPractice();
    }

    @Then("Verify landing page display")
    public void verify_landing_page_display() throws Exception {
        myLanding.verifyLandingPageIsDisPlays();
    }

    @Given("Click on Sign in button")
    public void click_on_login_button() throws Exception {
        myLanding.clickLoginButton();
    }

    @Given("User search for item {string}")
    public void user_search_for_item(String keyword) throws Exception {
        myLanding.searchForItem(keyword);
        myLanding.clickOnSearchButton();
    }

    //Contact Us Page
    @Given("User click on contact us button")
    public void user_click_on_contact_us_button() throws Exception {
        myLanding.clickOnContactUsButton();
    }

}
