package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IframeGiris extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Türkiye");

        driver.switchTo().defaultContent().switchTo().frame(1);

        WebElement avatar= driver.findElement(By.cssSelector("[id='animals']"));
        Select amenu=new Select(avatar);
        amenu.selectByValue("avatar");

        WaitandQuit();

    }
}
