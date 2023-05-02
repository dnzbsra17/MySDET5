package Proje3;

import Utility.BaseDriver;
import org.junit.Test;

public class TechnoStudyTestingProject3 extends BaseDriver {
    @Test
    public void Test1() {
        //  https://shopdemo.e-junkie.com/ sitesine gidiniz
        //E-book add to cart butonuna tıklatınız.
        //Add promo code butonuna tıklatıp veri giriniz.
         // Apply butonuna tıklayınız.
        //Invalid promo code yazısının görüldüğünü doğrulayınız

        driver.get("https://shopdemo.e-junkie.com/");

    }
}
