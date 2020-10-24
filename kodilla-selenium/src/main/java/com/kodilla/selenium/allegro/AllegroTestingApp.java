package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement categoryCombo = driver.findElement(
                By.xpath("//div//div//select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);
        categoryCombo.submit();

        WebElement inputField = driver.findElement(By.xpath("//input[@type='search']"));
        inputField.sendKeys("mavic mini");
        inputField.submit();
    }
}

