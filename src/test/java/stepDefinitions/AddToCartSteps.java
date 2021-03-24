package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddToCartPage;

public class AddToCartSteps {

    AddToCartPage purchaseItem = new AddToCartPage();

    @Then("User land on Add to cart page")
    public void user_land_on_add_to_cart_page() throws Exception {
        purchaseItem.verifyUserLandOnAddToCartPage();
    }


    @And("User choose {string} and {string} and {string}")
    public void user_choose_and_and(String quantity, String size, String color) throws Exception {
        purchaseItem.userChooseQuantityAndSizeAndColor(quantity, size, color);

    }

    @When("User click on Add to cart button")
    public void user_click_on_add_to_cart_button() throws Exception {
        //purchaseItem.scrollToAddToCart();
        purchaseItem.clickAddCart();
    }

    @Then("User should see the confirm massage and click on proceed to checkout")
    public void user_should_see_the_confirm_massage() throws Exception {
        purchaseItem.waitForConfirmationMessage();
        purchaseItem.clickOnCheckOut();
    }
}
