package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement className=driver.findElement(By.className("form-textbox"));
        className.sendKeys("mehmet deniz");

       // form-textbox validate[required] web sitesindeki class kısmından kopyaladığımız kısım
        //textbox dan sonraki boşluk demek iki classa sahip olduğunu söylüyor ileride bu öğretilecek
        // bu sebepten sadece boşluktan öncesimi By.classname kısmına yapıştırdık.



        // birden fazla aynı locator a sahip eleman bulunursa findElement ne yapar ?
        // cevap : İlk elementi bulur. interview de sorulur

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());
        for (WebElement e:labels){
            System.out.println("e.getText() = " + e.getText());

        }

        //aranılan elaman bunamazsa findElement NoSuchElement hatası verir
        //FindElements in size ı 0 olan List verir , yani hata vermez

        MyFunc.bekle(3);
        driver.quit();
    }
}
