package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {
        //1- Hepsi burada sayfasına git
        //2- Arama kutusuna usb yaz
        //3- Ara butonuna bas
        //4- Cıkan ürünlerin acıklamasında USB kelimesini kontrol et

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");


        //driverdan isteyeceğiz aşağıdaki kodları


//        eleman arama kutusu=aramakutusunu bul
//        aramakutusu.yaziGonder("usb")
//        elemanlar=urunListesiniAl;
//        for dongusuyle kontrol et

        //Elamanın konumunu bulma işlemi :Locators ..

        MyFunc.bekle(5); // kapatma işleminden önce 5 saniye bekleme yapıyor.

        driver.quit();// quit ile close aynı şekilde kullanılabir.
        // Farkı Quit herşeyi kapatır , close sadee çalışanları kapatır.






    }
}
