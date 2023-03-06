package gun07;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.MyFunc;

import static utility.BaseDriver.driver;

public class calişma3 extends Senaryo {
    @Test

    public void Test1() {



        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        MyFunc.Bekle(1);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(1);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        //1.Ürün Ekleme
        MyFunc.Bekle(2);
        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();

        MyFunc.Bekle(2);
        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();

        MyFunc.Bekle(2);
        WebElement btnBack = driver.findElement(By.xpath("//button[@id='back-to-products']")); //   //button[text()='Back to products']
        btnBack.click();


        //2.Ürün Ekleme
        MyFunc.Bekle(2);
        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();

        MyFunc.Bekle(2);
        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();

        MyFunc.Bekle(2);
        WebElement btnBack2 = driver.findElement(By.xpath("//button[@id='back-to-products']")); //   //button[text()='Back to products']
        btnBack2.click();

        // sepet işlemleri
        MyFunc.Bekle(2);
        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();

        MyFunc.Bekle(2);
        WebElement buttonCheckOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        buttonCheckOut.click();

        // kullanıcı bilgileri giriyoruz
        MyFunc.Bekle(1);
        WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("ismet");

        MyFunc.Bekle(1);
        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("temur");

        MyFunc.Bekle(1);
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("232323");

        MyFunc.Bekle(1);
        WebElement btnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
        btnContinue.click();


    }
}

