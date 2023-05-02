package Gun09;
//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru extends BaseDriver {
    @Test
    public void Test1(){
        driver.manage().deleteAllCookies(); // cookiesleri öncesinde temizliyor
        driver.get("https://www.facebook.com/");
        driver.manage().deleteAllCookies();

        MyFunc.bekle(2);
        WebElement createNewAccount= driver.findElement(By.cssSelector("div[class='_6ltg']>a"));
        createNewAccount.click();

        MyFunc.bekle(2);
        WebElement firsName= driver.findElement(By.cssSelector("div[class='_5dbb']>input"));
        firsName.sendKeys("Mehmet Deniz");

        MyFunc.bekle(2);
        WebElement surName= driver.findElement(By.cssSelector("div[class='placeholder']+input[name='lastname']"));
        surName.sendKeys("ÜNLÜ");

        MyFunc.bekle(2);
        WebElement reEmail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        Assert.assertFalse(reEmail.isDisplayed()); // beklenen görünmemesi

        MyFunc.bekle(2);
        WebElement email= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("mdu9506@gmail.com");

        MyFunc.bekle(2);
        Assert.assertTrue(reEmail.isDisplayed()); // true olması beklenir.

        MyFunc.bekle(2);
        WebElement webDay= driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("20");

        MyFunc.bekle(2);
        WebElement webMonth= driver.findElement(By.id("month"));
        Select month=new Select(webMonth);
        month.selectByValue("3");

        MyFunc.bekle(2);
        WebElement webYear= driver.findElement(By.id("year"));
        Select year=new Select(webYear);
        year.selectByVisibleText("1995");

        WaitandQuit();


    }
}
