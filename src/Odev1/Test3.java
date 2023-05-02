package Odev1;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test3 extends BaseDriver {
    @Test
    public void Test3(){
//        1) Bu siteye gidin. -> https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/");
//
//        2) "teddy bear" aratın ve Search butonuna tıklayın.
        WebElement search= driver.findElement(By.cssSelector("div[class='overlap']+input"));
        search.click();
        search.sendKeys("teddy bear");
        WebElement button= driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']>span"));
        button.click();
//
//        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
        WebElement assertation= driver.findElement(By.cssSelector("#searchMessageContainer > div>span"));
        System.out.println(assertation.getText());
        Assert.assertTrue(assertation.getText().equals("We've got 314 results for teddy bear"));

        WaitandQuit();


    }
}
