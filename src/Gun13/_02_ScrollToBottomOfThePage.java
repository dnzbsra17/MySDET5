package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("");

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        //sayfanın sonuna kadar gider
        MyFunc.bekle(2);

        js.executeScript("window.scrollTo(0, 3000);"); // en başa direk gidiyor 0 noktasına git.

        js.executeScript("window.scrollBy(0, 3000);"); // bulunduğu yerden 0 kadar gider

        WaitandQuit();
    }
}
