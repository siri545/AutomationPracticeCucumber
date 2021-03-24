package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.MyAccountPage;


public class MyAccountSteps {
    MyAccountPage myAccountPage = new MyAccountPage();

    @Then("User should land on my account page and see {string}")
    public void user_should_land_on_my_account_page_and_see(String accountName) throws Exception {
        myAccountPage.verifyUserLandOnMyAccountPage();
        myAccountPage.verifyMyAccountHeaderIsDisPlay(accountName);
    }
}
