package Odev2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test6 extends BaseDriver {
    @Test
    public void Test6(){
//        Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
//
//        Fake Alerts'e tıklayınız.
        WebElement fake= driver.findElement(By.xpath("//*[@id='fakealerttest']"));
        MyFunc.bekle(1);
        fake.click();

//
//        Show modal dialog buttonuna tıklayınız.
        WebElement showmodal= driver.findElement(By.xpath("//*[@id='modaldialog']"));
        MyFunc.bekle(1);
        showmodal.click();
//
//                Ok'a tıklayınız.
        WebElement ok= driver.findElement(By.xpath("//*[@id='dialog-ok']"));
        MyFunc.bekle(1);
        ok.click();
//
//        Alert kapanmalıdır.
        WaitandQuit();
    }
}
