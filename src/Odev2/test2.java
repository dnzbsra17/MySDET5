package Odev2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test2 extends BaseDriver {
    @Test
    public void Test2(){
//        1) Bu siteye gidin. -> https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");
//
//        2) Username kısmına "ttechno@gmail.com" girin.
        WebElement usurname=driver.findElement(By.xpath("//*[@id='username']"));
        usurname.click();
        MyFunc.bekle(3);
        usurname.sendKeys("ttechno@gmail.com");
        MyFunc.bekle(1);
//
//        3) Password kısmına "techno123." girin.
        WebElement password= driver.findElement(By.xpath("//*[@id='password']"));
        password.click();
        MyFunc.bekle(2);
        password.sendKeys("techno123.");
        MyFunc.bekle(1);
//
//        4) "Sign in" buttonunan tıklayınız.
        WebElement signIn=driver.findElement(By.xpath("//*[@id='log-in']"));
        signIn.click();
        MyFunc.bekle(2);
//
//        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        WebElement writing=driver.findElement(By.xpath("//*[@id='time']"));
        Assert.assertTrue("eslesme hatası",writing.getText().equals("Your nearest branch closes in: 30m 5s"));
        WaitandQuit();


    }
}
