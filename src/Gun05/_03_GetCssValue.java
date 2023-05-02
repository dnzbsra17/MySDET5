package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.snapdeal.com/");

        WebElement imputValEnter= driver.findElement(By.id("inputValEnter"));

//        <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
//    id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands" value="">


        //elemanın parametrelerine ulaşmak için getAttribute u kullanıyoruz.

        System.out.println("imputValEnter.getAttribute(class) = " + imputValEnter.getAttribute("class"));

        //class ın karşılığı olan CSS-Şekillendirme değerlerini almak için getCSSValue kullanılır.
        System.out.println("imputValEnter.getCssValue(color) = " + imputValEnter.getCssValue("color"));
        System.out.println("imputValEnter.getCssValue(font-size) = " + imputValEnter.getCssValue("font-size"));
        System.out.println("imputValEnter.getCssValue(background) = " + imputValEnter.getCssValue("background"));
        WaitandQuit();
    }
}
