package pages;

import library.BaseClass;

public class SearchResultsPage extends BaseClass {


    public void verifyResultsPageIsDisPlay() throws Exception {
        myLibrary.waitForElementVisibility(resultsLocator.getLocator("ResultsPage.ResultCountText"));
    }

    public void verifySearchResultsText(String results) throws Exception {
        myLibrary.getTxtWithoutVerifyPrint(resultsLocator.getLocator("ResultsPage.ResultCountText"), results);
    }

    public void userClickOnMoreButton() throws Exception {
        myLibrary.mouseHover(resultsLocator.getLocator("ResultPage.HoverDress"));
        myLibrary.clickElement(resultsLocator.getLocator("ResultPage.ClickOnMoreButton"));
    }

}
