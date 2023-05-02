package Odev1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends BaseDriver {
    @Test
    public void Test2(){
//        1) Bu siteye gidin. -> https://demo.applitools.com/
            driver.get("https://demo.applitools.com/");
//
//        2) Username kısmına "ttechno@gmail.com" girin.
        WebElement userName= driver.findElement(By.cssSelector("div[class='form-group']>input[placeholder='Enter your username']"));
        userName.click();
        MyFunc.bekle(3);
        userName.sendKeys("ttechno@gmail.com");
//
//        3) Password kısmına "techno123." girin.
        WebElement password= driver.findElement(By.cssSelector("div[class='form-group']>input[placeholder='Enter your password']"));
        password.click();
        MyFunc.bekle(3);
        password.sendKeys("techno123.");
//
//        4) "Sign in" buttonunan tıklayınız.
        WebElement signIn=driver.findElement(By.cssSelector("div[class='buttons-w']>a"));
        signIn.click();
//
//        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        WebElement assertion= driver.findElement(By.cssSelector("div[class='element-actions']+h6"));
        Assert.assertTrue("Aranan Yazı Doğrulanamdı",assertion.getText().equals("Your nearest branch closes in: 30m 5s"));


WaitandQuit();
    }
}
