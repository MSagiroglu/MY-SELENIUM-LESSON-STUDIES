package techproed.selenium_lessons.day01_FirstTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        //getTitle() Sayfa Başlığını verir
        System.out.println("Amazon Actual Title : " + driver.getTitle());//getTitle() methodu Sayfa başlığını verir
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHandle=driver.getWindowHandle();
        System.out.println("Techproed WindowHandle Değeri  = " + amazonWindowHandle);

        driver.get("https://techproeducation.com/");
        System.out.println("Techproeducation Actual Title : " + driver.getTitle());//getTitle() methodu Sayfa başlığını verir


        //getCurrentUrl() Sayfanın Url'sini  verir
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());

        //getPageSource() Sayfaya ait kaynak kodlarını verir
        //System.out.println("Techproed Actual Page Source Codes = " + driver.getPageSource());


        //getWindowHandle() Gidilen sayfanın handle değerini(hashCode) verir
        //Bu handle değerini sayfalar arası geçiş için kullanırız.
        System.out.println("Techproed WindowHandle Değeri  = " + driver.getWindowHandle());//7CA53D4DE2E1F6BA756C687E18240D8B


    }
}
