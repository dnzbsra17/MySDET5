package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_WaitsGris extends BaseDriver {

   /*
     Selenium Bekletme Komutları

      pageLoadTimeout :
      driver.manage().timeouts().pageLoadTimeout(dr);
      30 sn süresinde sayfanın yüklenmesini bekliyor, bu süreden sonra timeout düşerek hata verir.

     ImplicitlyWait:
     Tüm sayfadaki elemanlar için, elemanın locatorı sayfa içinde bulanabilir hale getirene kadar verilen bekleme süresi.
     Bütün elemanlar için geçerli ve eleman bulunduğunda kalan süreyi beklemez.NoSuchElement hatasını için verilen süre
     kadar beler.

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

     Explicit  Wait  : Tek bir eleman özel Kriter olarak tanımlanır sadece ilgili elemanda geçerli olur
 */

    //    1- HTML (DOM) nini içinde locator olarak yüklenmesi
//    java hızlı çalıştığından problem oluyor
//            findElement
//
//    2- kod olarak HTML içinde var ama , CROME tarafından
//    görüntülenmesi, yani gözükür hale gelmesi ayrı bir
//    durum.elemeanınhazır hale gelmesi
//    java hızlı çalıştığından problem oluyor
//            Click
//
//
//    3- HTML içinde var görünür değil
//
//    Sayfanın değişim süresi


    @Test
    public void Wait1(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement btn= driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration muhlet=Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);// iki dakkayı kullanmadı. findElementi html içerisinde var olana kadar bekler sadece


       // MyFunc.bekle(30);// web sayfası ile bir alakası yoktur javayı durduruyor.. bu programı durduruyor
        //sayfayla ilgili olmadığı için sonuna kadar bekler.

        WebElement mesaj= driver.findElement(By.xpath("//p[text()='WebDriver']"));

        WaitandQuit();

    }
}
