package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {

        //1-Açılan sayfadaki kutucuğa mesajınızı yazınız
        //2-Butona tıkla
        //3-Cıkan mesajın cıkıp cıkmadığını doğrula

        driver.navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        String mesajim="Biz Yazılımcılar Geldik";
        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        MyFunc.bekle(3);
        txtBox.sendKeys(mesajim);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().equals(mesajim)) {
            System.out.println("Test Passed");
        } else
            System.out.println("Test Fail");


        WaitandQuit();
    }
}
