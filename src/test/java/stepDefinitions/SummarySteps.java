package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SummaryPage;

public class SummarySteps {

    SummaryPage summaryPage = new SummaryPage();

    @Then("User land on Summary page and click on proceed to checkout")
    public void user_land_on_summary_page_and_click_proceed_to_checkout() throws Exception{
        summaryPage.verifySummaryPageIsDisplay();
        summaryPage.clickOnProceedToCheckout();
    }


}
