package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");
        WebElement element= driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        MyFunc.bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).doubleClick().build();
        aksiyon.perform();



        WaitandQuit();
    }
}
