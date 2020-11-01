package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResult extends AbstractPage {

    @FindBy(css = "div[class='g']")
    private List<WebElement> result;

    public GoogleResult(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void iSeeResult() {
        System.out.println("I see results");
        System.out.println(result.size());

    }

    public WebElement oneRandomResult() {
        Random random = new Random();

        int randomPageId = random.nextInt(result.size());
        WebElement webElement = result.get(randomPageId);

        System.out.println(webElement.getTagName());
        System.out.println(webElement);

        return result.get(randomPageId);
    }
}
