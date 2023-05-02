package Odev1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Test1 extends BaseDriver {
    @Test
    public void Test1(){

//        1) Bu siteye gidin. -> http://demoqa.com/text-box
             driver.get("http://demoqa.com/text-box");
//
//        2) Full Name kısmına "Automation" girin.
        WebElement fullName= driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12']>input[id='userName']"));
        fullName.click();
        MyFunc.bekle(3);
        fullName.sendKeys("Automation");
//
//        3) Email kısmına "Testing@gmail.com" girin.
        WebElement email=driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12']>input[id='userEmail']"));
        email.click();
        MyFunc.bekle(3);
        email.sendKeys("Testing@gmail.com");
//
//        4) Current Address kısmına "Testing Current Address" girin.

        WebElement address= driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12']>textarea[placeholder='Current Address']"));
        address.click();
        MyFunc.bekle(3);
        address.sendKeys("Testing Current Address");
//
//        5) Permanent Address kısmına "Testing Permanent Address" girin.
        WebElement parmenetAddress=driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12']>textarea[id='permanentAddress']"));
        parmenetAddress.click();
        MyFunc.bekle(3);
        parmenetAddress.sendKeys("Testing Permanent Address");
//
//        6) Submit butonuna tıklayınız.
        WebElement submit=driver.findElement(By.cssSelector("#userForm > div.mt-2.justify-content-end.row > div>button"));
        MyFunc.bekle(3);
        submit.click();
//
//        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        WebElement okuma=driver.findElement(By.cssSelector("div[class='border col-md-12 col-sm-12']> :nth-child(1)[class='mb-1']"));
        Assert.assertTrue(okuma.getText().equals("Name:Automation")); // ugrasılacak
//
//        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

        WebElement emailIceriyoMu=driver.findElement(By.cssSelector("div[class='border col-md-12 col-sm-12']> :nth-child(2)"));
        Assert.assertTrue(emailIceriyoMu.getText().contains("Testing"));

WaitandQuit();


    }
}
