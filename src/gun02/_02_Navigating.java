package gun02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;
import utility.MyFunc;



public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.get("http://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);
        WebElement element=driver.findElement(By.linkText("Alerts (Javascript)"));
        element.click();
        MyFunc.Bekle(3);



        BekleKapat();

    }
}
