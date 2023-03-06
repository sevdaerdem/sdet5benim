package gun09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

import java.util.List;

public class soru_02_ extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.facebook.com/");


        MyFunc.Bekle(2);
        List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
        if (cookiesAccept.size() > 0)
            gun09.MyFunc.Bekle(2);
        WebElement btnYeniHesap = driver.findElement(By.linkText("Create new account"));
        btnYeniHesap.click();

        MyFunc.Bekle(1);
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Sevda");

        MyFunc.Bekle(1);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Erdem");
    }
}
