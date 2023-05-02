package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_Alertart3 extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement clickMe1=driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        MyFunc.bekle(2);
        clickMe1.click();
        MyFunc.bekle(2);

        driver.switchTo().alert().sendKeys("mehmet");
        driver.switchTo().alert().accept();
        MyFunc.bekle(2);

        WebElement element= driver.findElement(By.cssSelector("[id='prompt-demo']"));

        Assert.assertTrue("Beklenen yazı gözüktümü",element.getText().contains("mehmet"));


        WaitandQuit();
    }
}
