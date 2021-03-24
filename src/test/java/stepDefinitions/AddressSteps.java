package stepDefinitions;


import io.cucumber.java.en.Then;
import pages.AddressPage;

public class AddressSteps {

    AddressPage addressPage = new AddressPage();


    @Then("User land on Address page and enter {string} and click on checkout")
    public void user_land_on_address_page_and_click_on_checkout(String massage) throws Exception {
        addressPage.verifyAddressPageIsDisPlay();
        addressPage.enterMassage(massage);
        addressPage.clickOnCheckOutButton();
    }


}
