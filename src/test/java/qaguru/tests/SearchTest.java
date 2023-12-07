package qaguru.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import drivers.BrowserstackDriver;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.*;


public class SearchTest extends TestBase{

    @Test
    void successfulSearchTest() throws MalformedURLException, InterruptedException {


        // Test case for the BrowserStack sample Android app.
        // If you have uploaded your app, update the test case here.
//        WebElement searchElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                ExpectedConditions.elementToBeClickable(
//                        accessibilityId("Search Wikipedia")));
//        searchElement.click();

        $(accessibilityId("Search Wikipedia")).click();

//        WebElement insertTextElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(30)).until(
//                ExpectedConditions.elementToBeClickable(
//                        id("org.wikipedia.alpha:id/search_src_text")));
//        insertTextElement.sendKeys("Appium");

        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");

//        Thread.sleep(5000);
//        List<WebElement> allProductsName = driver.findElements(className(
//                "android.widget.TextView"));
//        assert (allProductsName.size() > 0);

        $$(className("android.widget.TextView")).shouldHave(sizeGreaterThan(0));


        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        closeWebDriver();


    }
}
