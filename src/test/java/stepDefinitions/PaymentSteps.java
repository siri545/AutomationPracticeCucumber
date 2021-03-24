package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaymentPage;

public class PaymentSteps {

    PaymentPage paymentPage = new PaymentPage();

    @And("User land on Payment page and click on pay by check")
    public void user_land_on_payment_page_and_successfully_order() throws Exception {
        paymentPage.verifyPaymentPageIsDisPlay();
        paymentPage.clickOnPayByCheckBox();
    }

    @When("User click on confirm my order button")
    public void user_click_on_confirm_my_order_button() throws Exception {
        paymentPage.clickOnConFirmMyOrder();
    }

    @Then("User should see order confirm massage")
    public void user_should_see_order_confirm_massage() throws Exception {
        paymentPage.getOderConfirmationText();
    }




}
