package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu= driver.findElement(By.id("searchDropdownBox"));

        //bu element select tag i ile baslıyorsa , sen bunu Select e cast yap öyle kullan

        Select ddMenu1=new Select(webMenu); // elementi daha rahat kullanabilir SELECT nesnesini haline dönüştürdü
       // ddMenu1.selectByIndex(3);  // ister bununla seçersin
       // ddMenu1.selectByValue("search-alias=aps"); //istersen bu şekilde seçebilirsin
        ddMenu1.selectByVisibleText("Elektronik");
        System.out.println("ddMenu1.getOptions().size() = " + ddMenu1.getOptions().size());


        
        WaitandQuit();
    }
}
