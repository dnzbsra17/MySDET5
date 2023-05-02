package Odev1;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test6 extends BaseDriver {
    @Test
    public void Test6(){
//        Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
//
//        Fake Alerts'e tıklayınız.
        WebElement fakeAlters= driver.findElement(By.cssSelector(" ul:nth-child(6) > li:nth-child(5) > ul > li:nth-child(2)>a"));
        fakeAlters.click();
//
//        Show modal dialog buttonuna tıklayınız.
        WebElement showmodal= driver.findElement(By.cssSelector("body > div.page-body > div:nth-child(9)>input"));
        showmodal.click();
//
//                Ok'a tıklayınız.
        WebElement ok=driver.findElement(By.cssSelector("#dialog > div.dialog.active > div>button"));
        ok.click();
//
//        Alert kapanmalıdır.
        driver.navigate().back();
        WaitandQuit();

    }
}
