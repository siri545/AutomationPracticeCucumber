package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.BaseClass;
import pages.SearchResultsPage;


public class SearchResultsSteps {

    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Then("User should see search {string}")
    public void user_should_see_search(String results) throws Exception {
        searchResultsPage.verifyResultsPageIsDisPlay();
        searchResultsPage.verifySearchResultsText(results);

    }

    @When("User click on More button on Printed Summer Dress")
    public void user_click_on_more_button_on_printed_summer_dress() throws Exception {
        searchResultsPage.userClickOnMoreButton();
    }

}
