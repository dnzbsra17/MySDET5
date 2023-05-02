package Odev3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Test1 extends BaseDriver {
    @Test
    public void Test1(){
//        Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//        buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        MyFunc.bekle(2);

        List<WebElement> sehirler=driver.findElements(By.cssSelector("[id='answerDiv']>div"));
        List<WebElement> ulkeler=driver.findElements(By.cssSelector("[class='destinationBox']"));
        System.out.println("sehirler.size() = " + sehirler.size());
        System.out.println("ulkeler.size()="+ulkeler.size());
        MyFunc.bekle(2);

        Actions aksiyonlar=new Actions(driver);

        for (WebElement s: sehirler){
          for (WebElement u:ulkeler){
              aksiyonlar.clickAndHold(s).build().perform();
              MyFunc.bekle(1);
              aksiyonlar.moveToElement(u).release().build().perform();
              MyFunc.bekle(1);
              if (s.getAttribute("class").contains("correct")){
                  ulkeler.remove(u);
                  break;

              }


          }


        }
        WaitandQuit();
    }
}
