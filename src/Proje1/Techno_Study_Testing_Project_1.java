package Proje1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Techno_Study_Testing_Project_1 extends BaseDriver {
    @Test
    public void TestProje1() {
        driver.get("https://itera-qa.azurewebsites.net/");
        MyFunc.bekle(1);
        WebElement siginUp = driver.findElement(By.xpath("//*[@id='navbarColor01']/form/ul/li[1]/a"));
        siginUp.click();
        WebElement firsName = driver.findElement(By.xpath("//*[@id='FirstName']"));
        MyFunc.bekle(1);
        firsName.click();
        MyFunc.bekle(1);
        firsName.sendKeys("Mehmet Denizz");
        WebElement surname = driver.findElement(By.xpath("//*[@id='Surname']"));
        MyFunc.bekle(1);
        surname.click();
        MyFunc.bekle(1);
        surname.sendKeys("UNLUU");
        WebElement eposta = driver.findElement(By.cssSelector("input[id='E_post']"));
        MyFunc.bekle(1);
        eposta.click();
        MyFunc.bekle(1);
        eposta.sendKeys("mdu9506@gmail.comm");
        WebElement mobile = driver.findElement(By.cssSelector("input[id='Mobile']"));
        MyFunc.bekle(1);
        mobile.click();
        MyFunc.bekle(1);
        mobile.sendKeys("53849377622");
        WebElement userName = driver.findElement(By.xpath("//*[@id='Username']"));
        MyFunc.bekle(1);
        userName.click();
        MyFunc.bekle(1);
        userName.sendKeys("mhmtdenzu");
        WebElement password = driver.findElement(By.xpath("//*[@id='Password']"));
        MyFunc.bekle(1);
        password.click();
        MyFunc.bekle(1);
        password.sendKeys("1234567");
        WebElement confirmPasswoed = driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
        MyFunc.bekle(1);
        confirmPasswoed.click();
        MyFunc.bekle(1);
        confirmPasswoed.sendKeys("1234567");
        WebElement submit = driver.findElement(By.cssSelector("input[id='submit']"));
        MyFunc.bekle(1);
        submit.click();
        WebElement reSUB = driver.findElement(By.xpath("//*[@class='col-md-offset-2 col-md-2']/label[@class='label-success']"));
        MyFunc.bekle(1);
        System.out.println(reSUB.getText());
        Assert.assertTrue(reSUB.getText().equals("Registration Successful"));
        WaitandQuit();

    }

    @Test
    public void Test2() {

        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement login = driver.findElement(By.xpath("//*[@id='navbarColor01']/form/ul/li[2]/a"));
        login.click();
        WebElement userName = driver.findElement(By.xpath("//*[@id='Username']"));
        MyFunc.bekle(1);
        userName.click();
        MyFunc.bekle(1);
        userName.sendKeys("mhmtdenzu");

        WebElement passlogin = driver.findElement(By.xpath("//*[@id='Password']"));
        passlogin.click();
        MyFunc.bekle(1);
        passlogin.sendKeys("1234567");

        WebElement log = driver.findElement(By.cssSelector("td>input[class='btn btn-primary']"));
        log.click();

        WebElement dogrulama = driver.findElement(By.cssSelector("div>h3"));
        System.out.println(dogrulama.getText());

        Assert.assertTrue(dogrulama.getText().contains("Welcome "));

        WaitandQuit();

    }

    @Test
    public void Test3() {

        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement login = driver.findElement(By.xpath("//*[@id='navbarColor01']/form/ul/li[2]/a"));
        login.click();
        WebElement userName = driver.findElement(By.xpath("//*[@id='Username']"));
        MyFunc.bekle(1);
        userName.click();
        MyFunc.bekle(1);
        userName.sendKeys("mhmtdenzu");


        WebElement passlogin = driver.findElement(By.xpath("//*[@id='Password']"));
        passlogin.click();
        MyFunc.bekle(1);
        passlogin.sendKeys("1234567");

        WebElement log = driver.findElement(By.cssSelector("td>input[class='btn btn-primary']"));
        log.click();

        WebElement createNew = driver.findElement(By.cssSelector("p>a[class='btn btn-primary']"));
        createNew.click();

        WebElement name = driver.findElement(By.xpath("//*[@id='Name']"));
        name.click();
        name.sendKeys("Mehmet");

        WebElement company = driver.findElement(By.xpath("//*[@id='Company']"));
        company.click();
        company.sendKeys("Deniz Soft");

        WebElement address = driver.findElement(By.xpath("//*[@id='Address']"));
        address.click();
        address.sendKeys("Atatürk mah. toros sok.");

        WebElement city = driver.findElement(By.xpath("//*[@id='City']"));
        city.click();
        city.sendKeys("Ankara");

        WebElement phone = driver.findElement(By.xpath("//*[@id='Phone']"));
        phone.click();
        phone.sendKeys("//*[@id='Phone']");


        WebElement emailll = driver.findElement(By.xpath("//*[@id='Email']"));
        emailll.click();
        emailll.sendKeys("mdu9506@gmail.comm");

        WebElement createee = driver.findElement(By.cssSelector("div[class='col-md-offset-2 col-md-10']>input[type='submit']"));
        createee.click();

        WaitandQuit();


    }
}
