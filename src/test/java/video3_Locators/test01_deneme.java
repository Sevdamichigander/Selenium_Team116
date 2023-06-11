package video3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test01_deneme {
    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        //2- https://www.automationexercise.com/ adresine gidin
        //3- Category bolumundeki elementleri locate edin
        //4- Category bolumunde 3 element oldugunu test edin
        //5- Category isimlerini yazdirin
           /*  System.out.println(categoryElementsList);
            Normalde bir list direk yazdirilabilir
            Ancak findElements() ile bulunan elementler Webelement oldugundan direk YAZDIRILAMAZ

            bir for-each loop kullanilarak listenin elementleri yazdirilabilir
         */
        //6- Sayfayi kapatin

        WebDriver driver = C01_WebElements.acilisAyarlari();
        driver.get("https://www.automationexercise.com/");
        List<WebElement> categoryElementsList = driver.findElements(By.className("panel-group category-products"));

        int expectedSize = 3;
        int actualSize = categoryElementsList.size();

        if (expectedSize==actualSize)  System.out.println("passed");
        else System.out.println("failed");

        for (WebElement eachElement:categoryElementsList
             ) {
            System.out.println(eachElement.getText());

        }
        Thread.sleep(3000);
        driver.close();
















    }
}
