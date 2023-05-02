package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");
        List<WebElement> linkler=driver.findElements(By.tagName("a")); // verilen tag lerdeki tüm elemanları aldık

        //kırık html linkleri için yazılmıştır. bos linkleri bulduk.
        for (WebElement l:linkler){
            if (l.getText().isEmpty())
            {
                System.out.print("(href) = " + l.getAttribute("href"));
                System.out.print("(title) = " + l.getAttribute("title"));
                System.out.println("(rel) = " + l.getAttribute("rel"));
            }

        }


        WaitandQuit();



    }
}
