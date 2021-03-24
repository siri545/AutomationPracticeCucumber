package pages;

import library.BaseClass;


public class ContactUsPage extends BaseClass {

    public void verifyUserLandOnContactUsPage() throws Exception {
        myLibrary.waitForElementVisibility(contactusLocator.getLocator("ContactUsPage.GetHeader"));
        myLibrary.getTxtWithoutVerifyPrint(contactusLocator.getLocator(
                "ContactUsPage.GetHeader"),"Contact");
    }


    public void userChooseSubjectHeading(String Heading) throws Exception {
        myLibrary.selectDropDown(contactusLocator.getLocator("ContactUsPage.SubjectHeading"), Heading);
    }

    public void userEnterEmailAddress(String email) throws Exception {
        myLibrary.enterTxt(contactusLocator.getLocator("ContactUsPage.EmailAddress"), email);
    }

    public void userEnterOrderReference(String reference) throws Exception {
        myLibrary.enterTxt(contactusLocator.getLocator("ContactUsPage.Reference"), reference);
    }

    public void userAttachFile() throws Exception {
        myLibrary.uploadFile("src/test/resources/data/TestFile.docx", contactusLocator.getLocator(
                "ContactUsPage.AttachFile"));
    }

    public void userEnterMassage(String massage) throws Exception {
        myLibrary.enterTxt(contactusLocator.getLocator("ContactUsPage.EnterMassage"), massage);
        //myLibrary.customWait(500);
    }

    public void clinkOnSend() throws Exception {
        myLibrary.clickElement(contactusLocator.getLocator("ContactUsPage.ClickOnSend"));

    }

    public void verifySuccessfullySentMassage() throws Exception {
          myLibrary.getTxtWithPrintNoVerify(contactusLocator.getLocator("ContactUsPage.GetConfirmMsg"));
    }

    public void verifyWarningMassage(String warning) throws Exception {
        myLibrary.getTxtWithoutVerifyPrint(contactusLocator.getLocator("ContactUsPage.GetWarningMsg"),warning);

    }
}