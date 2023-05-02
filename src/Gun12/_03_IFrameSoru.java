package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseDriver {
    @Test
    public void Test() {
        /*
      1-driver.get("http://chercher.tech/practice/frames); sayfasına gidiniz.
      2-Inputa ülke adı yazınız
      3-CheckBox ı çekleyiniz.
      4-Select in 4.elemanını seçiniz.
 */
        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0);
        WebElement checkBox= driver.findElement(By.cssSelector("[id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent().switchTo().frame(1);

        WebElement avatar= driver.findElement(By.cssSelector("[id='animals']"));
        Select amenu=new Select(avatar);
        amenu.selectByValue("avatar");

        WaitandQuit();



    }
}
