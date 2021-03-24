package pages;

import library.BaseClass;

public class PaymentPage extends BaseClass {

    //final static Logger logger = Logger.getLogger(PaymentPage.class);

    public void verifyPaymentPageIsDisPlay() throws Exception {
        myLibrary.waitForElementVisibility(paymentLocator.getLocator("PaymentPage.Header"));
        myLibrary.getTxtWithoutVerifyPrint(paymentLocator.getLocator(
                "PaymentPage.Header"), "Your payment method");
    }

    public void clickOnPayByCheckBox() throws Exception {
        myLibrary.clickElement(paymentLocator.getLocator("PaymentPage.PayByCheck"));
    }

    public void clickOnConFirmMyOrder() throws Exception {
        myLibrary.clickElement(paymentLocator.getLocator("PaymentPage.ClickConfirmMyOrder"));

    }

    public void getOderConfirmationText() throws Exception {
        myLibrary.waitForElementVisibility(paymentLocator.getLocator("PaymentPage.ConfirmationText"));
        myLibrary.getTxtWithoutVerifyPrint(paymentLocator.getLocator(
                "PaymentPage.ConfirmationText"), "Your order on My Store is complete.");
        myLibrary.getTxtWithPrintNoVerify(paymentLocator.getLocator("PaymentPage.ConfirmationText"));

    }


}
