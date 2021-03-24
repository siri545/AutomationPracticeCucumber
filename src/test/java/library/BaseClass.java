package library;

import org.openqa.selenium.WebDriver;

public class BaseClass {

    public static SeleniumLibrary myLibrary = new SeleniumLibrary();
    public static WebDriver driver;

    public static ObjectMap addressLocator = new ObjectMap("src/test/resources/locator/addressPageLocator.Properties");
    public static ObjectMap addToCartLocator = new ObjectMap("src/test/resources/locator/addToCartPageLocator.properties");
    public static ObjectMap contactusLocator = new ObjectMap("src/test/resources/locator/contactUsPageLocator.properties");
    public static ObjectMap landingLocator = new ObjectMap("src/test/resources/locator/landingPageLocator.properties");
    public static ObjectMap loginLocator = new ObjectMap("src/test/resources/locator/loginPageLocator.properties");
    public static ObjectMap myAccountLocator = new ObjectMap("src/test/resources/locator/myAccountPageLocator.properties");
    public static ObjectMap paymentLocator = new ObjectMap("src/test/resources/locator/paymentPageLocator.properties");
    public static ObjectMap resultsLocator = new ObjectMap("src/test/resources/locator/searchResultsPageLocator.properties");
    public static ObjectMap shippingLocator = new ObjectMap("src/test/resources/locator/shippingPageLocator.Properties");
    public static ObjectMap summaryLocator = new ObjectMap("src/test/resources/locator/summaryPageLocator.properties");


}
