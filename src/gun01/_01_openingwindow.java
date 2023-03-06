package gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.MyFunc;

public class _01_openingwindow {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        MyFunc.Bekle(5);
        driver.quit();
    }
}
