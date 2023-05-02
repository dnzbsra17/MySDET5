package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydetme extends BaseDriver {
    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement name= driver.findElement(By.name("username"));
        name.sendKeys("Mehmet Deniz");
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("123456");
        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        //hata var ise çıkan element
        List<WebElement> hatamesaji=driver.findElements(By.cssSelector("div[role='alert']"));
        if (hatamesaji.size()>0){ // hata var ise
            //ekran kaydetme işlemi yapıcağız
            System.out.println("Hata Oluştu");

            TakesScreenshot ts=(TakesScreenshot) driver;
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(hafizadakiHali,new File("ekranGoruntuleri\\screenshot.png"));

            // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
            //        biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
            //        bunu nasıl yaparsınız
            //        LocalDateTime alıcaksın bilgileri
            //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        }

        MyFunc.bekle(5);
        WaitandQuit();

    }
}
