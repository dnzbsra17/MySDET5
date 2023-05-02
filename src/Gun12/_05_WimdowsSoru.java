package Gun12;

/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */


import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_WimdowsSoru extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowId=driver.getWindowHandle();


        List<WebElement> liste=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link:liste){
            if (!link.getAttribute("href").contains("mail"))
            link.click();

        }
        // suanda bütün sayfalar açıldı.

        Set<String> windowsIdler=driver.getWindowHandles();

        for (String  id:windowsIdler){
            MyFunc.bekle(2);
            driver.switchTo().window(id); // sıradaki tabdaki window a geçmiş oldum
            System.out.println("title = " + driver.getTitle()+" , url="+driver.getCurrentUrl());

        }
        for (String  id:windowsIdler){
            if (id.equals(anaSayfaWindowId))
                continue;
            MyFunc.bekle(2);
            driver.switchTo().window(id); // sıradaki tabdaki window a geçmiş oldum
            driver.close();


        }

        WaitandQuit();

    }
}
