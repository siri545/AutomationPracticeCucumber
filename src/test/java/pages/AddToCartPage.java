package pages;

import library.BaseClass;
import org.openqa.selenium.By;



public class AddToCartPage extends BaseClass {

    public void verifyUserLandOnAddToCartPage() throws Exception {
        myLibrary.waitForElementVisibility(addToCartLocator.getLocator("AddToCart.Title"));
        myLibrary.getTxtWithoutVerifyPrint(addToCartLocator.getLocator("AddToCart.Title"),"Women");
    }

    public void userChooseQuantityAndSizeAndColor(String quantity, String size, String color) throws Exception {
        myLibrary.enterTxt(addToCartLocator.getLocator("AddToCart.QuantityTextBox"), quantity);
        myLibrary.selectDropDown(addToCartLocator.getLocator("AddToCart.SizeDropDown"), size);
        myLibrary.selectAndVerifyElementSelected(By.cssSelector("a[name='" + color + "']"));
    }

   /* public void scrollToAddToCart() throws Exception {
        myLibrary.scrollToElement(addToCartLocator.getLocator("AddToCart.ClickAddToCart"));
    }*/

    public void clickAddCart() throws Exception {
        myLibrary.clickElement(addToCartLocator.getLocator("AddToCart.ClickAddToCart"));
    }


    public void waitForConfirmationMessage() throws Exception {
        myLibrary.waitForElementVisibility(addToCartLocator.getLocator("AddToCart.ConfirmationMessage"));
        myLibrary.getTxtWithoutVerifyPrint(addToCartLocator.getLocator(
                "AddToCart.ConfirmationMessage"), "Product successfully added to your shopping cart");
    }


    public void clickOnCheckOut() throws Exception {
        myLibrary.clickElement(addToCartLocator.getLocator("AddToCart.ClickOnCheckout"));
    }

}
