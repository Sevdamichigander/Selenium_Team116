package video3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class test03_bestbuy {
    public static void main(String[] args) {
        WebDriver driver = C01_WebElements.acilisAyarlari();
        driver.get("https://www.bestbuy.com");
        List<WebElement> listButton = driver.findElements(By.tagName("button"));
        System.out.println(listButton.size());

        for (WebElement eachElement:listButton
             ) {
            System.out.print(eachElement.getText() + " - ");
        }

    }
}
