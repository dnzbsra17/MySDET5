package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _04_RobotClass extends BaseDriver {
    @Test

    public void Test1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.bekle(2);

        //List<WebElement> acceptAll=driver.findElements(By.xpath("//span[text()='Accept All']"));
        // if (acceptAll.size()>0)
        //   acceptAll.get(0).click();
/***********************************************/
        Robot robot = new Robot();

        for (int i = 0; i < 21; i++) {
            MyFunc.bekle(1);
            robot.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
            robot.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //copy to clipboard in javascript olarak googladım

        // buraya kadar windows dosya bul açıldı
        // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\Busra\\Desktop\\Yeni Metin Belgesi (3).txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        MyFunc.bekle(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        MyFunc.bekle(2);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        MyFunc.bekle(1);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        for (int i = 0; i <2 ; i++) {
            MyFunc.bekle(1);
            robot.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
            robot.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);

        for (int i = 0; i <2 ; i++) {
            MyFunc.bekle(1);
            robot.keyPress(KeyEvent.VK_TAB); // tuşa basıldı
            robot.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//center[text()='has been successfully uploaded.']")));
        WebElement mesaj= driver.findElement(By.xpath("//center[text()='has been successfully uploaded.']"));

        Assert.assertTrue(mesaj.isDisplayed());



        WaitandQuit();


    }
}
