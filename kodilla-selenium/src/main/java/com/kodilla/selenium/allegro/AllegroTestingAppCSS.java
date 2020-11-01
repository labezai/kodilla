package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllegroTestingAppCSS {
    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement webElement = driver.findElement(By.cssSelector("button[class='_13q9y _8hkto munh_56_m m7er_k4 m7er_wn m7er_56_m']"));
        webElement.click();
        WebElement input = driver.findElement(By.cssSelector("input[type='search']"));
        input.sendKeys("Mavic mini");
        WebElement eleSelect = driver.findElement(By.cssSelector("option[value='/kategoria/elektronika']"));
        eleSelect.click();
        WebElement szukajButton = driver.findElement(By.cssSelector("button[type='submit']"));
        szukajButton.click();
        List<WebElement> a = driver.findElements(By.cssSelector("article[data-analytics-enabled='true']"));

        for (WebElement element : a) {
            System.out.println(element.getText());
            System.out.println("---------");
        }
    }
}







