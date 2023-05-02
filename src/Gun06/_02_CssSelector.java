package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class _02_CssSelector extends BaseDriver {
    @Test
    public void Test1() {
        driver.navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim = "Biz Yazılımcılar Geldik";

        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        MyFunc.bekle(3);
        txtBox.sendKeys(mesajim);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

//        if (msg.getText().equals(mesajim)) {
//            System.out.println("Test Passed");
//        } else
//            System.out.println("Test Fail");

        Assert.assertTrue("aranılan mesaj bulunamadı", msg.getText().equals(mesajim)); // verilen değer True mu kontrol et demek.
        // if den farkı hata varsa gösteriyor hata yok ise herhangi bir değer döndürmüyor.

        //   [id^='u'] -> id si    u ile başlayan  startWith
        //   [id*='u'] -> id sinde u geçen         contains
        //   [id$='u'] -> id si    u ile biten     endWith
        WaitandQuit();
    }

}

