package Odev2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends BaseDriver {
    @Test
    public void Test1(){


//  1) Bu siteye gidin. -> http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box");
//
//
//  2) Full Name kısmına "Automation" girin.
        WebElement fullName=driver.findElement(By.xpath("//*[@id='userName']"));
        fullName.click();
        MyFunc.bekle(3);
        fullName.sendKeys("Automation");
//
//  3) Email kısmına "Testing@gmail.com" girin.
        WebElement email=driver.findElement(By.xpath("//*[@id='userEmail']"));
        fullName.click();
        MyFunc.bekle(3);
        email.sendKeys("Testing@gmail.com");

//
//  4) Current Address kısmına "Testing Current Address" girin.
        WebElement currentAddress=driver.findElement(By.xpath("//*[@id='currentAddress']"));
        currentAddress.click();
        MyFunc.bekle(3);
        currentAddress.sendKeys("Testing Current Address");
//
//  5) Permanent Address kısmına "Testing Permanent Address" girin.
        WebElement parmanetAddress=driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        MyFunc.bekle(3);
        parmanetAddress.sendKeys("Testing Permanent Address");
//
//  6) Submit butonuna tıklayınız.
        WebElement submit=driver.findElement(By.xpath("//*[@id='submit']"));
        MyFunc.bekle(3);
        submit.click();
//
//  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        WebElement checkinName=driver.findElement(By.xpath("//*[@id='name']"));
        String checkin=checkinName.getText().replaceAll("Name:","");
        System.out.println("checkin = " + checkin);

        Assert.assertTrue("sonuc aynı değil",checkin.equals("Automation"));
//
//  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
        WebElement checkinEmail=driver.findElement(By.xpath("//*[@id='email']"));
        String checkinE=checkinEmail.getText().replaceAll("Email:","");
        System.out.println("checkinE = " + checkinE);
        Assert.assertTrue("sonuclar aynı değil",checkinE.equals("Testing@gmail.com"));


        WaitandQuit();
    }
}
