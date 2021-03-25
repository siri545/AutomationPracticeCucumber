package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import library.BaseClass;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


public class Hooks extends BaseClass {
    final static Logger logger = Logger.getLogger(Hooks.class);


   @Before
    public void setUp() {
        try {
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            options.addArguments("--headless");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                myLibrary.captureScreenshot(scenario.getName(), "");
            }
            Thread.sleep(500);
            driver.quit();
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);

        }
    }
}

