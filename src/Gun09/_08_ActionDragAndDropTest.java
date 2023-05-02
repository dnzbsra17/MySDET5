package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDragAndDropTest extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar=new Actions(driver);

        MyFunc.bekle(2);
        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement norway= driver.findElement(By.id("box101"));


        //1.yöntem
        //aksiyonlar.dragAndDrop(oslo,norway).build().perform(); // osloyu norwa at direk atıyor.

        //2.yöntem
        aksiyonlar.clickAndHold(oslo).build().perform(); // osloyu tıklat ve al
        aksiyonlar.moveToElement(norway).release().build().perform(); // norway in üzerine git bırak

        WaitandQuit();

    }
}
