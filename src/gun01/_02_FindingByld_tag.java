package gun01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BaseDriver;
import utility.MyFunc;

public class _02_FindingByld_tag extends BaseDriver {
    public static void main(String[] args) {
       // DriverBaşlat();
        driver.get("http//:www.hepsiburada.com\"");
        WebDriver driver=new ChromeDriver();
        driver.get("http//:www.hepsiburada.com");
        WebElement siparişlerimLinki= driver.findElement(new By.ByLinkText("Siparişlerim"));

        System.out.println("siparişlerimLinki.getText()= " + siparişlerimLinki.getText());

        MyFunc.Bekle(3);
        driver.quit();


    }

}
