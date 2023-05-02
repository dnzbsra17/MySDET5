package Odev1;

import Utility.BaseDriver;
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
        WebElement calculate= driver.findElement(By.cssSelector("ul:nth-child(12) > li:nth-child(2)>a"));
        calculate.click();
//
//        İlk input'a herhangi bir sayı giriniz.
        WebElement input1=driver.findElement(By.cssSelector("div.form-label>input[id='number1']"));
        input1.click();
        input1.sendKeys("17");
//
//        İkinci input'a herhangi bir sayı giriniz.
        WebElement input2= driver.findElement(By.cssSelector("div.form-label>input[id='number2']"));
        input2.click();
        input2.sendKeys("71");
//
//        Calculate button'una tıklayınız.
        WebElement button= driver.findElement(By.cssSelector("form > div:nth-child(2)>input"));
        button.click();
//
//        Sonucu alınız.
        WebElement sonuc= driver.findElement(By.cssSelector("div > p>span"));

//
//        Sonucu yazdırınız.
        System.out.println(sonuc.getText());
        WaitandQuit();

    }
}
