package Odev2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test5 extends BaseDriver {
    @Test
    public void Test5(){
//        Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        driver.get("https://testpages.herokuapp.com/styled/index.html");
//
//        Fake Alerts' tıklayınız.
        WebElement fake= driver.findElement(By.xpath("//*[@id='fakealerttest']"));
        MyFunc.bekle(1);
        fake.click();

//
//        Show Alert Box'a tıklayınız.
        WebElement show= driver.findElement(By.xpath("//*[@id='fakealert']"));
        MyFunc.bekle(1);
        show.click();
//
//        Ok'a tıklayınız.
        WebElement ok= driver.findElement(By.xpath("//*[@id='dialog-ok']"));
        MyFunc.bekle(1);
        ok.click();
//
//        Alert kapanmalıdır.
        WaitandQuit();
    }
}
