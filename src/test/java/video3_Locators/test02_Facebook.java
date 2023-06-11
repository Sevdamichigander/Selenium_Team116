package video3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test02_Facebook {
    public static void main(String[] args) {
        WebDriver driver = C01_WebElements.acilisAyarlari();
        driver.get("https://fr-fr.facebook.com/");
        driver.findElement(By.xpath("//button[@title = 'Refuser les cookies optionnels']")).click();

        WebElement epostaKutusu = driver.findElement(By.xpath("//input[@id='email']"));
        epostaKutusu.sendKeys("khslqhHK");
        WebElement passwordKutusu = driver.findElement(By.xpath("//input[@id='pass']"));
        passwordKutusu.sendKeys("kjhkjghgk");

        driver.findElement(By.xpath("//button[@name='login']")).click();
        WebElement sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='_9ay7']"));

        String expectedResult = "L’adresse e-mail ou le numéro de mobile que vous avez saisi(e) n’est pas associé(e) à un compte. Trouvez votre compte et connectez-vous.";
        String actualResult = sonucYazisiElementi.getText();

        if (expectedResult.equals(actualResult)) System.out.println("passed");
        else System.out.println("failed");

        driver.close();



    }
}
