package Odev2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test4 extends BaseDriver {
    @Test
    public void Test4(){
//        Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        driver.get("https://testpages.herokuapp.com/styled/index.html");
//
//        Calculate'e tıklayınız.
        WebElement calcuate= driver.findElement(By.xpath("//*[@id='calculatetest']"));
        calcuate.click();
//
//        İlk input'a herhangi bir sayı giriniz.
        WebElement input1= driver.findElement(By.xpath("//*[@id='number1']"));
        input1.click();
        MyFunc.bekle(1);
        input1.sendKeys("15");
//
//        İkinci input'a herhangi bir sayı giriniz.
        WebElement input2= driver.findElement(By.xpath("//*[@id='number2']"));
        input2.click();
        MyFunc.bekle(1);
        input2.sendKeys("35");
//
//        Calculate button'una tıklayınız.
        WebElement cal= driver.findElement(By.xpath("//*[@id='calculate']"));
        MyFunc.bekle(1);
        cal.click();

//
//        Sonucu alınız.
        WebElement sonucAl= driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("sonuc= "+sonucAl.getText());
//
//        Sonucu yazdırınız.

        WaitandQuit();

    }
}
