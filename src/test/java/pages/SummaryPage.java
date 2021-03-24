package pages;

import library.BaseClass;

public class SummaryPage extends BaseClass {
    //final static Logger logger = Logger.getLogger(SummaryPage.class);

    public void verifySummaryPageIsDisplay() throws Exception {
        myLibrary.waitForElementVisibility(summaryLocator.getLocator("Summary.Header"));
        myLibrary.getTxtWithoutVerifyPrint(summaryLocator.getLocator(
                "Summary.Header"),"Your shopping cart");
    }

    public void clickOnProceedToCheckout() throws Exception {
        myLibrary.clickElement(summaryLocator.getLocator("Summary.ClickOnCheckOut"));
    }

}
