package gun12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class _01_IFrameGiriş extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("http://chercher.tech/practice/frames");
        driver.switchTo().frame("frame1");
        WebElement input=driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys(("Türkiye"));
        BekleKapat();
    }
}
