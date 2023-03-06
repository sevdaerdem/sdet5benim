package gun03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;

public class odev extends BaseDriver {
    @Test
    public void Test1()
    {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyFunc.Bekle(2);
        WebElement business= driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        MyFunc.Bekle(2);
        WebElement dropDownDiscover= driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();

        MyFunc.Bekle(2);
        WebElement optionOnlineAdvertising= driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        MyFunc.Bekle(2);
        WebElement buttonEveryDay= driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryDay.click();

        MyFunc.Bekle(2);
        WebElement goodRadio= driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();

        MyFunc.Bekle(2);
        WebElement howLongDropdown= driver.findElement(By.cssSelector("select[id$='_4597']"));
        howLongDropdown.click();

        MyFunc.Bekle(2);
        WebElement secenek4= driver.findElement(By.cssSelector("select[id$='_4597'] > :nth-child(4)"));
        secenek4.click();

        MyFunc.Bekle(2);
        goodRadio.click();

        BekleKapat();
    }

}
