package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;


public class LoginSteps {
    LoginPage myLoginPage = new LoginPage();

    @Given("User try to sign in using {string} and {string}")
    public void user_enter_login_information_and(String username, String password) throws Exception {
       myLoginPage.verifyLoginPageDisplay();
       myLoginPage.userEnterEmailAddress(username);
       myLoginPage.userEnterPassword(password);
       myLoginPage.clickOnSignInButton();
    }

    @Then("User should see {string}")
    public void user_should_see(String warningMassage) throws Exception {
       myLoginPage.verifyWarningMassageIsDisPlay(warningMassage);

    }


}
