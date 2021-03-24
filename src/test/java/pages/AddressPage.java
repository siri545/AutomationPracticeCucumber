package pages;

import library.BaseClass;


public class AddressPage extends BaseClass {

    public void verifyAddressPageIsDisPlay() throws Exception {
        myLibrary.waitForElementVisibility(addressLocator.getLocator("AddressPage.Header"));
        myLibrary.getTxtWithoutVerifyPrint(addressLocator.getLocator(
                "AddressPage.Header"), "Addresses");
    }

    public void enterMassage(String massage) throws Exception {
        myLibrary.enterTxt(addressLocator.getLocator("AddressPage.EnterMassage"), massage);
    }

    public void clickOnCheckOutButton() throws Exception {
        myLibrary.clickElement(addressLocator.getLocator("AddressPage.ClickOnCheckOut"));

    }
}
