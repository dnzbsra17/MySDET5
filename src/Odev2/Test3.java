package Odev2;

import Utility.BaseDriver;
import Utility.MyFunc;
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
        WebElement search= driver.findElement(By.xpath("//*[@id='inputValEnter']"));
        MyFunc.bekle(1);
        search.click();
        MyFunc.bekle(1);
        search.sendKeys("teddy bear");
        MyFunc.bekle(1);

        WebElement searchClick= driver.findElement(By.xpath("//*[@id='sdHeader']/div[4]/div[2]/div/div[2]/button/span"));
        searchClick.click();
        MyFunc.bekle(2);
//
//        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        WebElement writing= driver.findElement(By.xpath("//*[@id='searchMessageContainer']/div/span"));
        Assert.assertTrue("eşleşme başarısız",writing.getText().equals("We've got 317 results for teddy bear"));
        WaitandQuit();
    }
}
