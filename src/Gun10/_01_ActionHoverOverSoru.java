package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_ActionHoverOverSoru extends BaseDriver {
    @Test
    public void Test1() {
        //https://www.etsy.com/ sayfasına gidiniz
        //Jewellery -> Neckless -> Bib Neckless click
        //tıklatma işleminden sonra URL de
        //bib-necklaces kelimesinin geçtiğini doğrulayın.
        driver.get("https://www.etsy.com/");

        // List<WebElement> cookiesAccept = driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        // if (cookiesAccept.size() > 0) // varsa
        //   cookiesAccept.get(0).click(); //kapat, tıkla demek..  İhtiyac sonucunda yazılıcak.


        Actions aksiyonlar = new Actions(driver);

        WebElement jewellery = driver.findElement(By.cssSelector("[id='catnav-primary-link-10855']"));
        WebElement Neckless = driver.findElement(By.cssSelector("[id='side-nav-category-link-10873']"));
        WebElement BibNeckless = driver.findElement(By.id("catnav-l3-10881"));

        MyFunc.bekle(2);
        aksiyonlar.moveToElement(jewellery).build().perform();
        MyFunc.bekle(2);
        aksiyonlar.moveToElement(Neckless).build().perform();
        MyFunc.bekle(2);
        aksiyonlar.moveToElement(BibNeckless).click().build().perform();
        MyFunc.bekle(2);


        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue("içerisinde istenilen mesaj yok", driver.getCurrentUrl().contains("bib-necklaces"));

        WaitandQuit();
    }
}
