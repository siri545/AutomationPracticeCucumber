package pages;

import library.BaseClass;

public class MyAccountPage extends BaseClass {

    public void verifyUserLandOnMyAccountPage() throws Exception {
        myLibrary.waitForElementVisibility(myAccountLocator.getLocator("MyAccountPage.myAccount"));

    }
    public void verifyMyAccountHeaderIsDisPlay(String accountName) throws Exception {
        myLibrary.getTxtWithoutVerifyPrint(myAccountLocator.getLocator("MyAccountPage.accountNameText"),accountName);
    }
}
