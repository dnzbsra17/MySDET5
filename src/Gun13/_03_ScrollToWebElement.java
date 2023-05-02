package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test1(){
        driver.manage().deleteAllCookies(); //cookies leri sildik BaseDrivere ekle.
        driver.get("https://copado.com/robotic-testing");

        MyFunc.bekle(2);
        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement element= driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        //element.click(); tıklatma özelliğini kaybettiren elemenlerin altında olduğunda tıklamaz.
        js.executeScript("arguments[0].click();",element); //html içinden elemente ulaşır ve tıklatır.

        MyFunc.bekle(2);

        WaitandQuit();

    }
}
