package gun02;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;


public class _02_Cssselector_2 extends BaseDriver {
    @Test
    public void Test1(){

String mesajim="Merhaba Selenyum";
    WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));
        txtBox.sendKeys("merhaba selenium");

    WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

    WebElement msg = driver.findElement(By.cssSelector("[id='display']"));
        Assert.assertTrue(  msg.getText().equals(mesajim)  );




    }
}

