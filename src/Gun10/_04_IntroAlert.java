package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {
    /*
        Interview sorusu
      - Alertleri nasıl kullanırsın ?
        driver.switchTo().alert()     -> alerte geçerim
        komutları:
        1- accept : OK, TAMAM botunan basmamızı sağlar.
        2- dismiss : CANCEL, HAYIR, yani olumsuz butonuna basmamızı sağlıyor.
        3- sendKeys : yazı gönderme
        4- getText : uyarı yazısını alma
    */

    @Test
    public void Test1(){
    driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement clickMe1=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        MyFunc.bekle(2);
        clickMe1.click();
        MyFunc.bekle(2);

        driver.switchTo().alert().accept(); //alert kutusunı OK yine bas , böylece kapandı
        MyFunc.bekle(2);


        WaitandQuit();


    }
}
