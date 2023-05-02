package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));
        // element.sendKeys("Ahmet");

        //shift a shift i bıraktım hmet yazdım -> Ahmet cıktı

        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar
                .moveToElement(element)  //kutucuga gel
                .click()                 //içerisine tıkla
                .keyDown(Keys.SHIFT)     //shift e bas
                .sendKeys("a")           //shift+a -> A
                .keyUp(Keys.SHIFT)       //shift i bırak
                .sendKeys("hmet")        //yazıyı gönder
                .build();                // aksiyonları hazırla
        MyFunc.bekle(2);
        aksiyon.perform();// gerceklestir.


        WaitandQuit();

    }
}
