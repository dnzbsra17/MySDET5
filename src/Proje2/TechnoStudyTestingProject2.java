package Proje2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TechnoStudyTestingProject2 extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("http://demowebshop.tricentis.com/");
        Actions aksiyonlar=new Actions(driver);

        WebElement register= driver.findElement(By.linkText("Register"));
        Action aksiyon=aksiyonlar.moveToElement(register).click().build();
        aksiyon.perform();

        WebElement  gender=driver.findElement(By.cssSelector("[id='gender-male']"));
        aksiyonlar.moveToElement(gender).click().build().perform();

        WebElement firstName=driver.findElement(By.cssSelector("[id='FirstName']"));
        aksiyonlar.moveToElement(firstName).click().build().perform();
        firstName.sendKeys("Mehmet Deniz Asım");

        WebElement lastName=driver.findElement(By.cssSelector("[id='LastName']"));
        aksiyonlar.moveToElement(lastName).click().build().perform();
        lastName.sendKeys("ÜNLÜ Kuzucu");

        WebElement email=driver.findElement(By.cssSelector("[id='Email']"));
        aksiyonlar.moveToElement(email).click().build().perform();
        email.sendKeys("asdsadasdsadasdasdasd@gmail.com");

        WebElement password=driver.findElement(By.cssSelector("[id='Password']"));
        aksiyonlar.moveToElement(password).click().build().perform();
        password.sendKeys("123456");

        WebElement confirmPassword=driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
        aksiyonlar.moveToElement(confirmPassword).click().build().perform();
        confirmPassword.sendKeys("123456");

        WebElement registerButton= driver.findElement(By.cssSelector("[id='register-button']"));
        aksiyonlar.moveToElement(registerButton).click().build().perform();

        WebElement basariliKayit= driver.findElement(By.cssSelector("div[class='result']"));
        System.out.println(basariliKayit.getText());

        Assert.assertTrue("Basarılı Kayıt Alınamadı",basariliKayit.getText().contains("Your registration completed"));

        WebElement continueButton=driver.findElement(By.cssSelector("input[type='type']"));
        aksiyonlar.moveToElement(continueButton).click().build().perform();
        WaitandQuit();
    }
    @Test
    public void Test2(){

        driver.get("http://demowebshop.tricentis.com/");
        Actions aksiyonlar=new Actions(driver);
        MyFunc.bekle(2);

        WebElement register= driver.findElement(By.linkText("Register"));
        Action aksiyon=aksiyonlar.moveToElement(register).click().build();
        aksiyon.perform();

        WebElement  gender=driver.findElement(By.cssSelector("[id='gender-male']"));
        aksiyonlar.moveToElement(gender).click().build().perform();

        WebElement firstName=driver.findElement(By.cssSelector("[id='FirstName']"));
        aksiyonlar.moveToElement(firstName).click().build().perform();
        firstName.sendKeys("Mehmet Deniz Asım");

        WebElement lastName=driver.findElement(By.cssSelector("[id='LastName']"));
        aksiyonlar.moveToElement(lastName).click().build().perform();
        lastName.sendKeys("ÜNLÜ Kuzucu");

        WebElement email=driver.findElement(By.cssSelector("[id='Email']"));
        aksiyonlar.moveToElement(email).click().build().perform();
        email.sendKeys("asdsadasdsadasdasdasd@gmail.com");

        WebElement password=driver.findElement(By.cssSelector("[id='Password']"));
        aksiyonlar.moveToElement(password).click().build().perform();
        password.sendKeys("123456");

        WebElement confirmPassword=driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
        aksiyonlar.moveToElement(confirmPassword).click().build().perform();
        confirmPassword.sendKeys("123456");

        WebElement registerButton= driver.findElement(By.cssSelector("[id='register-button']"));
        aksiyonlar.moveToElement(registerButton).click().build().perform();


        WebElement AyniKayitHatasi= driver.findElement(By.cssSelector("div[class='validation-summary-errors'] li"));
        System.out.println(AyniKayitHatasi.getText());



        Assert.assertTrue("Kayıt Tekrar Hatası Vermedi",AyniKayitHatasi.getText().equals("The specified email already exists"));


        WaitandQuit();
    }
    @Test
    public void Test3(){
        driver.get("http://demowebshop.tricentis.com/");
        Actions aksiyonlar=new Actions(driver);

        WebElement login= driver.findElement(By.linkText("Log in"));
        aksiyonlar.moveToElement(login).click().build().perform();


        WebElement email= driver.findElement(By.cssSelector("[id='Email']"));
        aksiyonlar.moveToElement(email).click().sendKeys("asdsadasdsadasdasdasd@gmail.com").build().perform();

        WebElement passworld=driver.findElement(By.cssSelector("[id='Password']"));
        aksiyonlar.moveToElement(passworld).click().sendKeys("123456").build().perform();

        WebElement loginButton= driver.findElement(By.cssSelector("[value='Log in']"));
        aksiyonlar.moveToElement(loginButton).click().build().perform();
        MyFunc.bekle(2);

        //driver.switchTo().alert().dismiss();
       // MyFunc.bekle(2);

        WebElement dogrulama= driver.findElement(By.linkText("asdsadasdsadasdasdasd@gmail.com"));
        System.out.println(dogrulama.getText());


        Assert.assertTrue("doğrulama başarısız",dogrulama.getText().equals("asdsadasdsadasdasdasd@gmail.com"));



        WaitandQuit();

    }
    @Test
    public void Test4(){
        driver.get("http://demowebshop.tricentis.com/");
        Actions aksiyonlar=new Actions(driver);


        WebElement login= driver.findElement(By.linkText("Log in"));
        aksiyonlar.moveToElement(login).click().build().perform();


        WebElement email= driver.findElement(By.cssSelector("[id='Email']"));
        aksiyonlar.moveToElement(email).click().sendKeys("d@gmail.com").build().perform();

        WebElement passworld=driver.findElement(By.cssSelector("[id='Password']"));
        aksiyonlar.moveToElement(passworld).click().sendKeys("123").build().perform();

        WebElement loginButton= driver.findElement(By.cssSelector("[value='Log in']"));
        aksiyonlar.moveToElement(loginButton).click().build().perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement hataliKayit=driver.findElement(By.cssSelector("div[class='validation-summary-errors']>span"));
        System.out.println(hataliKayit.getText());
        Assert.assertTrue(hataliKayit.getText().contains("Login was unsuccessful. Please correct the errors and try again."));

        WaitandQuit();
    }
     @Test
    public void Test5(){
         driver.get("http://demowebshop.tricentis.com/");
         Actions aksiyonlar=new Actions(driver);

         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

         WebElement login= driver.findElement(By.linkText("Log in"));
         aksiyonlar.moveToElement(login).click().build().perform();


         WebElement email= driver.findElement(By.cssSelector("[id='Email']"));
         aksiyonlar.moveToElement(email).click().sendKeys("asdsadasdsadasdasdasd@gmail.com").build().perform();

         WebElement passworld=driver.findElement(By.cssSelector("[id='Password']"));
         aksiyonlar.moveToElement(passworld).click().sendKeys("123456").build().perform();

         WebElement loginButton= driver.findElement(By.cssSelector("[value='Log in']"));
         aksiyonlar.moveToElement(loginButton).click().build().perform();


         WebElement computers= driver.findElement(By.xpath("//li//a[@href='/computers'][1]"));
         aksiyonlar.moveToElement(computers).build().perform();

         WebElement notebooks= driver.findElement(By.xpath("//a[@href='/notebooks'][1]"));
         aksiyonlar.moveToElement(notebooks).click().build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='product-grid'] a[title='Show details for 14.1-inch Laptop']"))); // locator u bulana kadar bekle.

         WebElement LaptopSelect= driver.findElement(By.cssSelector("div[class='product-grid'] a[title='Show details for 14.1-inch Laptop']"));
         aksiyonlar.moveToElement(LaptopSelect).click().build().perform();

         WebElement addToCart=driver.findElement(By.id("add-to-cart-button-31"));
         aksiyonlar.moveToElement(addToCart).click().build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='The product has been added to your ']")));

         WebElement cartOnay= driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));

         Assert.assertTrue("onaylanma kodu gelmedi",cartOnay.getText().contains("The product has been added to your "));

         WebElement shoppingCart=driver.findElement(By.xpath("//span[@class='cart-label'][1]"));
         aksiyonlar.moveToElement(shoppingCart).click().build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='product']/a[text()='14.1-inch Laptop']")));
         WebElement urunVarMi= driver.findElement(By.xpath("//td[@class='product']/a[text()='14.1-inch Laptop']"));
         Assert.assertEquals("Urun agacında bilgisayar yok","14.1-inch Laptop",urunVarMi.getText());

         WebElement agree= driver.findElement(By.id("termsofservice"));
         aksiyonlar.moveToElement(agree).click().build().perform();

         WebElement Checkout= driver.findElement(By.id("checkout"));
         aksiyonlar.moveToElement(Checkout).click().build().perform();



         WebElement Country= driver.findElement(By.id("BillingNewAddress_CountryId"));
         Select c=new Select(Country);
         c.selectByVisibleText("Turkey");

        // wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("BillingNewAddress_StateProvinceId"))));
        // WebElement State= driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
       //  Select s=new Select(State);
        // s.selectByIndex(0);

         WebElement City= driver.findElement(By.id("BillingNewAddress_City"));
         aksiyonlar.moveToElement(City).click().sendKeys("Ankara").build().perform();

         WebElement adress1= driver.findElement(By.id("BillingNewAddress_Address1"));
         aksiyonlar.moveToElement(adress1).click().sendKeys("altındağ").build().perform();

         WebElement zip= driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
         aksiyonlar.moveToElement(zip).click().sendKeys("altındağ").build().perform();

         WebElement phoneNuber= driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
         aksiyonlar.moveToElement(phoneNuber).click().sendKeys("53879").build().perform();

         WebElement faxNumber=driver.findElement(By.id("BillingNewAddress_FaxNumber"));
         aksiyonlar.moveToElement(faxNumber).click().sendKeys("1234").build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='Billing.save()']")));

         WebElement continueClick=driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
         aksiyonlar.moveToElement(continueClick).click().build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='Shipping.save()']")));
         WebElement continueClick1=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
         aksiyonlar.moveToElement(continueClick1).click().build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='ShippingMethod.save()']")));
         WebElement continueClick2=driver.findElement(By.cssSelector("[onclick='ShippingMethod.save()']"));
         aksiyonlar.moveToElement(continueClick2).click().build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='PaymentMethod.save()']")));
         WebElement continueClick3=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
         aksiyonlar.moveToElement(continueClick3).click().build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='PaymentInfo.save()']")));
         WebElement continueClick4=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
         aksiyonlar.moveToElement(continueClick4).click().build().perform();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick='ConfirmOrder.save()']")));
         WebElement confirm=driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
         aksiyonlar.moveToElement(confirm).click().build().perform();


         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Your order has been successfully processed!']")));
         WebElement neyiBeceremedinSortli=driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
         Assert.assertEquals("Your order has been successfully processed!",neyiBeceremedinSortli.getText());



         WaitandQuit();

     }
}
