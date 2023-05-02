package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev extends BaseDriver {
    @Test
    public void Test1(){
        // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
        // 2- Business i çekleyin.
        // 3- discover XYZ ye tıklatın ve online Advertising i seçin
        // 4- Every day i seçin
        // 5- Good u seçin
        // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
        // css selector

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.bekle(3);
        WebElement buscek=driver.findElement(By.cssSelector("fieldset input[value='Business']"));
        buscek.click();

        MyFunc.bekle(3);
        WebElement online= driver.findElement(By.cssSelector("select>option[value='Online Advertising']"));
        online.click();

        MyFunc.bekle(3);
        WebElement averDay= driver.findElement(By.cssSelector("fieldset label>input[value='Every Day']"));
        averDay.click();

        MyFunc.bekle(3);
        WebElement good=driver.findElement(By.cssSelector("fieldset label>[value='Good']"));
        good.click();

        WebElement how=driver.findElement(By.cssSelector("select[id$='_4597']"));
        how.click();

        MyFunc.bekle(3);
        WebElement XYZ=driver.findElement(By.cssSelector("label[for^='u_']+select[name^='u_'][name$='_4597'][aria-required='true']> :nth-child(3)"));
        XYZ.click();


        WaitandQuit();
    }

}


//    div[id='user-message'] > label
//id si user-message olan DIV in çocuklarından label olan
//
//div[id='user-message'] > label + span
//id si user-message olan DIV in çocuklarından label dan hemen sonraki
//span
//
//div[id='user-message'] > span   yukarıdaki ile aynı
//
//[id='get-input'] input
//id si get-input olan elemanın bütün cocuklarındaki ilk input olan



//>     -> cocuklarda arar
//space -> tüm cocuklarda(torunlar dahil) arar
//+     -> bitişik kardeş i bulur
//~     -> tüm kardeşlerde ara
//[id='user-message'] > *   cocukların hepsi(torunlar yok)
//        [class='nav navbar-nav'] > li+li+li
//[class='nav navbar-nav'] > :nth-child(3)
//yukarıdakilerin ikiside 3.Çocuk demekdir.




//[id^='u'] -> id si    u ile başlayan  startWith
//        [id*='u'] -> id sinde u geçen         contains
//        [id$='u'] -> id si    u ile biten     endWith