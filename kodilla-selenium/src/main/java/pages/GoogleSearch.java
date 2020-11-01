package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Search']")
    static WebElement inputField;

    @FindBy(css = "input[value='Google Search']")
    static List<WebElement> searchButton;
    private GoogleResult googleResult;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResult() {
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResult = loadResult(driver);
        googleResult.iSeeResult();
    }

    public GoogleResult loadResult(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResult googleResult = new GoogleResult(driver);
        return googleResult;

    }
}
