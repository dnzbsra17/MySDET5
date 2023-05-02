package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/");

        //ana sayfadayım
        //bunulunan windowid yi almak içinde
        String anasayfaWindewID = driver.getWindowHandle();
        System.out.println("anasayfaWindewID = " + anasayfaWindewID);

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler) {
            if (!link.getAttribute("href").contains("mail"))
                link.click();
            //su asamada bütün sayfalar açıldı

        }
        Set<String> windowsIdler = driver.getWindowHandles();
        for (String id : windowsIdler) {
            System.out.println("id = " + id);
        }
        //suanda en son acılan sayfadayım ana sayfaya geçmek için
        driver.switchTo().window(anasayfaWindewID);
        MyFunc.bekle(10);
        WaitandQuit();
    }
}
