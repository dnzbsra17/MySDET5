package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); // chrome yi acmak için nesne açtık
        driver.get("https://form.jotform.com/221934510376353");// get linki açıyor
        WebElement namekutusu = driver.findElement(By.id("first_8")); // elemanı ıd ile bul
        namekutusu.sendKeys("Mehmet Deniz"); // kutucuklara yazı gönderme

        WebElement lastNamekutusu = driver.findElement(By.id("last_8")); // last name kısmını ıd ile bul
        lastNamekutusu.sendKeys("ÜNLÜ");


        //MyFunc.bekle(2);
        //namekutusu.clear();// name kısmındaki kutucuktakileri sildi
        //lastNamekutusu.clear(); // last name kutusundakileri sildi.

        // Chrome ctrl+f ye basıldığında inspect bölümünde
        //(inpect bölümü aktifken) arama kutusunu açar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelFirstName = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());


        WebElement labelLastName = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());


        WebElement submitButton = driver.findElement(By.id("input_2"));
        submitButton.click();


        MyFunc.bekle(5);
        driver.quit();
    }
}
