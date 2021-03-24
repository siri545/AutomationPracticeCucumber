package pages;

import library.BaseClass;

public class LoginPage extends BaseClass {
    //final static Logger logger = Logger.getLogger(LoginPage.class);


    public void verifyLoginPageDisplay() throws Exception {
        myLibrary.waitForElementVisibility(loginLocator.getLocator("LoginPage.loginPageHeader"));
    }

    public void userEnterEmailAddress(String username) throws Exception {
        myLibrary.enterTxt(loginLocator.getLocator("LoginPage.EmailAddressTextBox"), username);
    }

    public void userEnterPassword( String password) throws Exception {
        myLibrary.enterTxt(loginLocator.getLocator("LoginPage.PasswordTextBox"), password);

    }

    public void clickOnSignInButton() throws Exception {
        myLibrary.clickElement(loginLocator.getLocator("LoginPage.SignInButton"));
    }

    public void verifyWarningMassageIsDisPlay(String warningMassage) throws Exception {
        myLibrary.getTxtWithoutVerifyPrint(loginLocator.getLocator("LoginPage.ErrorText"), warningMassage);

    }


}
