package Gun14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;

import org.openqa.selenium.Dimension;

public class _02_WindowSize extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        MyFunc.bekle(4);

        Dimension yeniboyut=new Dimension(516,600);
        driver.manage().window().setSize(yeniboyut);

WaitandQuit();
    }
}
