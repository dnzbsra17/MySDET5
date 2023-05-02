package Odev4;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test2 extends BaseDriver {
    @Test
    public void Senaryo2() {
//        Senaryo
//        1- https://www.youtube.com/ adresine gidiniz
//        2- "Selenium" kelimesi ile video aratınız.
//        3- Listelenen sonuçlarda 80 videoaya kadar lisiteyi uzatınız.
//        4- Son videonun title ını yazdırınız.

        driver.get("https://www.youtube.com/");

        WebElement aramaButonu = driver.findElement(By.cssSelector("input[id='search']"));
        aramaButonu.click();
        aramaButonu.sendKeys("Selenium");

        WebElement search = driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
        search.click();
        MyFunc.bekle(2);


        JavascriptExecutor js = (JavascriptExecutor) driver;

        List<WebElement> liste = driver.findElements(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])"));
        for (WebElement l : liste) {
            if (liste.size() < 80) {
                js.executeScript("window.scrollBy(0, 3000);");
                MyFunc.bekle(3);
            }

        }


        WebElement element = driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[80]"));

        //js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);

        System.out.println(element.getAttribute("title"));


        WaitandQuit();


    }


}

