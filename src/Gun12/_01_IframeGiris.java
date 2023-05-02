package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IframeGiris extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://chercher.tech/practice/frames");

        // id=frame1 , name=iamframe index de bulunduğu sayfadaki kod sayısı 0 dan başlar sayfadaki 1. olan bizim için 0 dır.

        driver.switchTo().frame(0); //name ve id oldukça yavaş çalışıyor , index hızlı:index>name>id

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input")); // frame ait locator bulamıyor
        input.sendKeys("Türkiye");

        //iframe içindeki bir locator da işlem yapılacaksa önce iframe geçmem lazım.
       // driver.switchTo().frame(0) // ilgili odaya geç
      //  driver.switchTo().parentFrame();// bir önceki odaya geç , parente geç
       // driver.switchTo().defaultContent();// ilk ana sayfaya direk geçer.

        WaitandQuit();
    }
}
