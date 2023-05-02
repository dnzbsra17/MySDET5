package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/"); // sayfaya gittim

        // LinkText yoluyla eleman bulma işlemi sadece a tag inde kullanabilinir.
        WebElement siparislerimLinki= driver.findElement(By.linkText("Siparişlerim")); // tam olarak tamamını vericeğiz
        // gözüken text i Siparişlerim olan a tag li webElement
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText()); // siparişlerim

        System.out.println("siparislerimLinki.getAttribute() = " + siparislerimLinki.getAttribute("href")); //https://www.hepsiburada.com/siparislerim
        System.out.println("siparislerimLinki.getAttribute(\"title\") = " + siparislerimLinki.getAttribute("title"));// Siparişlerim
        System.out.println("siparislerimLinki.getAttribute(rel) = " + siparislerimLinki.getAttribute("rel")); //nofollow

        //partiallinkText
        WebElement link2= driver.findElement(By.partialLinkText("Süper Fiyat")); // verilen verinin bir kısmını almamız yeterlidir.
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.bekle(3);
        driver.quit();
    }
}
