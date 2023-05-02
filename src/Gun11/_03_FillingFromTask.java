package Gun11;
/*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
        (xpath kullanmayınız)
 */

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFromTask extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement name= driver.findElement(By.cssSelector("[id='title']"));
        aksiyonlar.moveToElement(name).click().sendKeys("Mehmet Deniz").build().perform();

        WebElement comment= driver.findElement(By.id("description"));
        aksiyonlar.moveToElement(comment).click().sendKeys("ünlü").build().perform();

        WebElement submit= driver.findElement(By.id("btn-submit"));
        aksiyonlar.moveToElement(submit).click().build().perform();

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //findElemen bulma süresi ile
        //ilgili sıkıntıda kullanulıyor findElement zaten bulunabiliniyor burada msjın gelme süresi yetersiz kalıyor.


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       wait.until(ExpectedConditions.textToBe(By.cssSelector("div[id='submit-control']"), "Form submited Successfully!"));


        WebElement mesaj=driver.findElement(By.cssSelector("div[id='submit-control']"));
        Assert.assertEquals("Form submited Successfully!",mesaj.getText());
        WaitandQuit();



    }
}
