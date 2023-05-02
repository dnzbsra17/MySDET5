package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html"); // driver.get ile aynı fakat back yapabilmek için bu şekilde açtık.

        MyFunc.bekle(3); // 3 saniye bekle

        WebElement element = driver.findElement(By.id("alerttest")); // tıklanacak kısmın ıd sinden buluyoruz
        // WebElement el1= driver.findElement(By.linkText("Alerts (JavaScript)"));//linkden çağırma kısmı...
        element.click();// sayfaya gitti.

        MyFunc.bekle(3);// 3 saniye bekledi
        System.out.println(driver.getCurrentUrl());  // o anda bulunduğun sayfayı sana veriyor.

        driver.navigate().back(); // bir geri sayfa geri gidicek.
        MyFunc.bekle(3);//3 saniye bekle
        System.out.println(driver.getCurrentUrl()); // o anda bulunduğun sayfayı sana veriyor.

        driver.navigate().forward();// bir sayfa ileri gidicek.
        MyFunc.bekle(3); // 3 saniye bekle
        System.out.println(driver.getCurrentUrl());// o anda bulunduğun sayfayı sana veriyor.

        WaitandQuit();//bekle kapat
    }
}
