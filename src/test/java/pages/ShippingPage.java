package pages;

import library.BaseClass;

public class ShippingPage extends BaseClass {


    public void verifyShippingPageIsDisPlay() throws Exception {
        myLibrary.waitForElementVisibility(shippingLocator.getLocator("ShippingPage.Header"));
        myLibrary.getTxtWithoutVerifyPrint(shippingLocator.getLocator(
                "ShippingPage.Header"), "Shipping");
    }

    public void checkOnTermOfServiceBox() throws Exception {
        myLibrary.clickElement(shippingLocator.getLocator("ShippingPage.CheckBox"));
    }

    public void clickOnCheckOutButton() throws Exception {
        myLibrary.clickElement(shippingLocator.getLocator("ShippingPage.ClickCheckOutButton"));
    }
}
