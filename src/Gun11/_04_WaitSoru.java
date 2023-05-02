package Gun11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {
    @Test
    public void Test1(){
       /*
        Senaryo
        1-  https://www.demoblaze.com/index.html  siteyi açınız.
        2- Samsung galaxy s6  linkine tıklayınız.
        3- Sepete ekleyiniz.
        4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
        */

        driver.get("https://www.demoblaze.com/index.html");

        WebElement link= driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepeteEkle= driver.findElement(By.linkText("Add to cart"));
        sepeteEkle.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent()); // alert cıkana kadar bekle.

        isAlertPresent();
        System.out.println(isAlertPresent());
        driver.switchTo().alert().accept();

        WebElement anasayfa= driver.findElement(By.id("nava"));
        anasayfa.click();

        WaitandQuit();

    }
    //bu method Alert mesajı geliyormu gelmiyormu diye kontrol eder varsa true,yoksa false
    public static boolean isAlertPresent(){
        try{
            driver.switchTo().alert();
            return true;
        }catch(NoAlertPresentException ex){
            return false;
        }
    }
}
