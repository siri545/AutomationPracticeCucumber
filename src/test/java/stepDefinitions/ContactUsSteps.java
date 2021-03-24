package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ContactUsPage;
import pages.LandingPage;


public class ContactUsSteps {

    ContactUsPage contactUsPage = new ContactUsPage();
    LandingPage myLandingPage = new LandingPage();


    @Then("User land on contact us page")
    public void user_land_on_contact_us_page() throws Exception {
        myLandingPage.clickOnContactUsButton();
        contactUsPage.verifyUserLandOnContactUsPage();
    }

    @And("User choose subject Heading {string}")
    public void user_choose_subject_heading(String Heading) throws Exception {
        contactUsPage.userChooseSubjectHeading(Heading);
    }

    @Then("User enter email address {string}")
    public void user_enter_email_address(String email) throws Exception {
        contactUsPage.userEnterEmailAddress(email);
    }

    @And("User enter order reference {string}")
    public void user_enter_order_reference(String reference) throws Exception {
        contactUsPage.userEnterOrderReference(reference);
    }

    @And("User try to attach file")
    public void user_attach_file() throws Exception {
        contactUsPage.userAttachFile();
    }

    @And("User enter massage {string}")
    public void user_enter_massage(String massage) throws Exception {
        contactUsPage.userEnterMassage(massage);
        contactUsPage.clinkOnSend();
    }

    @Then("User should see successfully sent massage")
    public void user_should_see_successfully_sent_massage() throws Exception {
        contactUsPage.verifySuccessfullySentMassage();
    }

    @Then("User should see warning error massage {string}")
    public void userShouldSeeWarningErrorMassage(String warning) throws Exception {
        contactUsPage.verifyWarningMassage(warning);
    }
}
