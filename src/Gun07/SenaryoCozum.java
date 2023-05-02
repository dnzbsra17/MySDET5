package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SenaryoCozum extends BaseDriver {
    @Test
    public void Test1() {
//        1- https://www.saucedemo.com/
        driver.navigate().to("https://www.saucedemo.com/");
        MyFunc.bekle(2);
//        2- login işlemini yapınız.
        WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
        username.click();
        MyFunc.bekle(2);
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.click();
        MyFunc.bekle(2);
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.xpath("//*[@id='login-button']"));
        login.click();


//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
        WebElement sauceclick = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        sauceclick.click();
        MyFunc.bekle(5);
        WebElement addToCard = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        addToCard.click();
        MyFunc.bekle(3);
//        4- Sonra geri dönün (Back to products e tıklatın)
        WebElement backToProducts = driver.findElement(By.xpath("//*[@id='back-to-products']"));
        backToProducts.click();
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
        WebElement tShirt = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        tShirt.click();
        MyFunc.bekle(3);
        WebElement addTshirt = driver.findElement(By.xpath("//*[text()='Add to cart']"));
        addTshirt.click();
        MyFunc.bekle(3);

//        6- sepete tıklatın
        WebElement sepet=driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a"));
        sepet.click();
        MyFunc.bekle(3);


//        7- CheckOut a tıklatın
        WebElement checkOut=driver.findElement(By.xpath("//*[text()='Checkout']"));
        checkOut.click();
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
        WebElement firtName=driver.findElement(By.xpath("//*[@id='first-name']"));
        firtName.click();
        MyFunc.bekle(3);
        firtName.sendKeys("Mehmet Deniz");

        WebElement lastName=driver.findElement(By.xpath("//*[@id='last-name']"));
        lastName.click();
        MyFunc.bekle(3);
        lastName.sendKeys("ÜNLÜ");

        WebElement zip=driver.findElement(By.xpath("//*[@id='postal-code']"));
        zip.click();
        zip.sendKeys("123");
        MyFunc.bekle(3);

        WebElement conti=driver.findElement(By.xpath("//*[@id='continue']"));
        conti.click();

//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.

        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for (WebElement e: ucretler){
            System.out.println("e.getText() = " + e.getText());
            toplam=toplam+Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        WebElement itemTotal=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println("item toplam  = " +itemTotal.getText());

        double altTotal=Double.parseDouble(itemTotal.getText().replaceAll("[^0-9,.]",""));
        Assert.assertTrue("Değerler Eşit değil",toplam==altTotal);



//


        //2.yöntem
//        WebElement urun1= driver.findElement(By.xpath("//*[@id='checkout_summary_container']/div/div[1]/div[3]/div[2]/div[2]/div"));
//
//        double a=Double.parseDouble(urun1.getText().replaceAll("[$]",""));
//
//
//        WebElement urun2=driver.findElement(By.xpath("//*[@id='checkout_summary_container']/div/div[1]/div[4]/div[2]/div[2]/div"));
//        double b=Double.parseDouble(urun2.getText().replaceAll("[$]",""));
//
//        WebElement tax=driver.findElement(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[6]"));
//
//        double tax1=Double.parseDouble(tax.getText().replaceAll("[A-Za-z:$]",""));
//        System.out.println("tax1 = " + tax1);
//
//
//        double top=a+b+tax1;
//        System.out.println("top = " + top);
//
//        WebElement total=driver.findElement(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[7]"));
//        double tot=Double.parseDouble(total.getText().replaceAll("[A-Za-z:$]",""));
//        System.out.println("tot = " + tot);
//        Assert.assertTrue(tot==top);


        WaitandQuit();
    }
}
