package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://demoqa.com/buttons");
        WebElement element= driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click();

        Actions aksiyonlar=new Actions(driver); // web sayfasındaki aksiyonları açıldı.

        Action aksiyon=aksiyonlar.moveToElement(element).click().build(); //aksiyonu hazır et demek istenmiştir.
        System.out.println("aksiyon hazırlandı");

        MyFunc.bekle(4);
        aksiyon.perform(); //aksiyonu gerçekleştir , işleme al uygula icra et
        System.out.println("aksiyon gerçekleşti");

        WaitandQuit();
    }
}
