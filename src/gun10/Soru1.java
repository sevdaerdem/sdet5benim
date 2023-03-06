package gun10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

import java.util.List;

import static org.openqa.selenium.WebElement.*;

public class Soru1 extends BaseDriver {

    @ Test
    public void Test1(){
        driver.get("http://etsy.com/");
        List<WebElement> cookiesAccept= driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click(); // kapat, tıklat

        WebElement mucevher = driver.findElement(By.id("catnav-primary-link-10855"));
        

                
        


    }
}
