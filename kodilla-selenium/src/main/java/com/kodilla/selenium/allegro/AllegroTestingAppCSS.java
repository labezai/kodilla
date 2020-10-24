package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingAppCSS {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.allegro.pl");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt='zamknij']"))).click();

        Search("Elektronika", "mavic mini");

        driver.quit();
    }

    public static void Search(String categoryName, String searchString)
    {
        SelectCategory(categoryName);
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='string']"));
        searchBox.sendKeys(searchString);
        searchBox.submit();
    }
    public static void SelectCategory(String categoryName)
    {
        By categoryDropdownLocator = By.cssSelector("select[aria-label='Kategoria i opcje wyszukiwania']");
        new Select(driver.findElement(categoryDropdownLocator)).selectByVisibleText(categoryName);
    }
}


