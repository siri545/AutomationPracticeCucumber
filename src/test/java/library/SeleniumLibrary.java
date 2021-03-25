package library;

import com.google.common.io.Files;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.junit.Assert.*;


public class SeleniumLibrary extends BaseClass {
    final Logger logger = Logger.getLogger(SeleniumLibrary.class);


    public WebElement waitForElementVisibility(By by) {
        WebElement elem = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 15);
            elem = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            assertNotNull(elem);
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
        return elem;
    }

    public void getTxtWithoutVerifyPrint(By by, String expectedText) {
        try {
            String actualText = driver.findElement(by).getText();
            assertThat(actualText, equalToIgnoringWhiteSpace(expectedText));
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    public void getTxtWithPrintNoVerify(By by) {
        try {
            String actualText = driver.findElement(by).getText();
            logger.info(actualText);
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    public void selectAndVerifyElementSelected(By by) {
        try {
            WebElement elem = driver.findElement(by);
            elem.click();
            elem.isSelected();
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    public void enterTxt(By by, String inputTxt) {
        try {
            WebElement element = driver.findElement(by);
            element.click();
            element.clear();
            element.sendKeys(inputTxt);
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    public void clickElement(By by) {
        try {
            WebElement elem = driver.findElement(by);
            elem.click();
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    public void mouseHover(By by) {
        try{
            Actions actions = new Actions(driver);
            WebElement elem = driver.findElement(by);
            actions.moveToElement(elem).build().perform();
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }


    public void selectDropDown(By by, String text) {
        try {
            WebElement elem = driver.findElement(by);
            Select dropdown = new Select(elem);
            dropdown.selectByVisibleText(text);
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    public void scrollToElement(By by) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", by);
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }


    public void customWait(double inSeconds) {
        try {
            Thread.sleep((long) (inSeconds * 1000));
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }

    public void uploadFile(String filePath, By by) {
        String absoluteFilePath = null;
        try {
            File file = new File(filePath);
            absoluteFilePath = file.getAbsolutePath();
            WebElement fileUpload = driver.findElement(by);
            fileUpload.sendKeys(absoluteFilePath);
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
        logger.info("file uploaded: " + absoluteFilePath);
    }


    public void captureScreenshot(String screenshotFileName, String filePath) {
        String finalScreenshotPath = null;
        try {
            String timeStamp = getCurrentTime();
            if (filePath.isEmpty()) {
                checkDirectory("target/screenshots/");
                finalScreenshotPath = "target/screenshots/" + screenshotFileName + "_" + timeStamp + ".png";
            } else {
                checkDirectory(filePath);
                finalScreenshotPath = filePath + screenshotFileName + "_" + timeStamp + ".png";
            }
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(scrFile, new File(finalScreenshotPath));
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
        String fullPath = getAbsolutPath(finalScreenshotPath);
        logger.info("Screenshot location: " + fullPath);
    }


    public String getCurrentTime() {
        String finalTime = null;
        try {
            Date date = new Date();
            String tempTime = new Timestamp(date.getTime()).toString();
            logger.debug("Time: " + tempTime);
            finalTime = tempTime.replace("-", "").replace(":", "").replace(" ", "").replace(".", "");
            logger.info("getCurrentTime() ---> " + finalTime);
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
        return finalTime;
    }


    private void checkDirectory(String inputPath) {
        File file = new File(inputPath);
        String abPath = file.getAbsolutePath();
        File file2 = new File(abPath);
        try {
            if (!file2.exists()) {
                if (file2.mkdirs()) {
                    logger.info("Directories are created....");
                } else {
                    logger.info("Directories are NOT created...");
                }
            }
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
    }


    private String getAbsolutPath(String inputPath) {
        String abPath = null;
        try {
            File file = new File(inputPath);
            abPath = file.getAbsolutePath();
        } catch (Exception e) {
            logger.error("Error: ", e);
            assertTrue(false);
        }
        return abPath;
    }


}








