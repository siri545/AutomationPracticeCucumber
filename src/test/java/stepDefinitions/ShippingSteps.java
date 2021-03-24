package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ShippingPage;

public class ShippingSteps {

    ShippingPage shippingPage = new ShippingPage();

    @And("User land on Shipping page and cling on checkout")
    public void user_land_on_shipping_page_and_click_on_checkout() throws Exception {
        shippingPage.verifyShippingPageIsDisPlay();
        shippingPage.checkOnTermOfServiceBox();
        shippingPage.clickOnCheckOutButton();

    }


}
