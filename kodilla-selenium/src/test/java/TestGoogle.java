import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResult;
import pages.GoogleSearch;
import pages.ResultRandomPage;

import static org.junit.Assert.assertSame;

public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResult();
    }

    @Test
    public void testOneRandomResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResult();
        GoogleResult googleResults = new GoogleResult(driver);
        WebElement webElement = googleResults.oneRandomResult();
        ResultRandomPage resultRandomPage = new ResultRandomPage(driver);
        WebElement webElement1 = resultRandomPage.clickInRandomPage(webElement);

        assertSame(webElement, webElement1);
    }
}