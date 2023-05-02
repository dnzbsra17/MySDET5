package Odev4;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test1 extends BaseDriver {
    @Test
    public void Senaryo1() {
//        Senaryo
//        1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
//        2- random 100 e kadar 2 sayı üretiniz.
//        3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
//        4- Sonuçları Assert ile kontrol ediniz.
//        5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        Actions action = new Actions(driver);
        int random1 = (int) (Math.random() * 99) + 1;
        int random2 = (int) (Math.random() * 99) + 1;

        int add = random1 + random2;
        int subtract = random1 - random2;
        int multiply = random1 * random2;
        double divide =(double) random1 / random2;


        String stradd = String.valueOf(add);
        String strsub=String.valueOf(subtract);
        String strmult=String.valueOf(multiply);
        String strdiv=String.valueOf(divide);
        String rnd1=String.valueOf(random1);
        String rnd2=String.valueOf(random2);
        String concat=rnd1.concat(rnd2);

        String strrnd1 = String.valueOf(random1);
        String strrnd2 = String.valueOf(random2);

        System.out.println(random1);
        System.out.println(random2);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        action.moveToElement(firstNumber).click().sendKeys(strrnd1).build().perform();

        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        action.moveToElement(secondNumber).click().sendKeys(strrnd2).build().perform();



        List<WebElement> islemler = driver.findElements(By.cssSelector("[id='selectOperationDropdown']>option"));
        System.out.println(islemler.size());

        for (int i = 0; i < islemler.size() ; i++)
        {
            Select secim = new Select(driver.findElement(By.id("selectOperationDropdown")));
            secim.selectByIndex(i);

            WebElement calculate = driver.findElement(By.id("calculateButton"));
            calculate.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" input[id='numberAnswerField']")));
            WebElement answer = driver.findElement(By.cssSelector(" input[id='numberAnswerField']"));

            if (i==0){
                System.out.println(answer.getAttribute("value"));
                Assert.assertEquals("eşleşme başarısız",answer.getAttribute("value"),stradd);
                WebElement clear= driver.findElement(By.id("clearButton"));
                clear.click();
            } else if (i==1)
            {
                System.out.println(answer.getAttribute("value"));
                Assert.assertEquals("eşleşme başarısız",answer.getAttribute("value"),strsub);
                WebElement clear= driver.findElement(By.id("clearButton"));
                clear.click();



            } else if (i==2) {
                System.out.println(answer.getAttribute("value"));
                Assert.assertEquals("eşleşme başarısız",answer.getAttribute("value"),strmult);
                WebElement clear= driver.findElement(By.id("clearButton"));
                clear.click();
            } else if (i==3)
            {
                System.out.println(answer.getAttribute("value"));
                Assert.assertEquals("eşleşme başarısız",answer.getAttribute("value"),strdiv);
                WebElement clear= driver.findElement(By.id("clearButton"));
                clear.click();


            }
            else{
                System.out.println(answer.getAttribute("value"));
                Assert.assertTrue("eşleşme başarısız",answer.getAttribute("value").equals(concat));
            }




        }
        MyFunc.bekle(3);

        WaitandQuit();


    }
}
