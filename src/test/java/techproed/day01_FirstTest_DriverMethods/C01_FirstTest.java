package techproed.day01_FirstTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında sistem özelliklerini ayarlamak için setProperty() metodu ile kullanırız.
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty() metodu ile "Key" değerini girerek value'ya ulaşabiliriz.
        WebDriver webDriver=new ChromeDriver();
        //ChromeDriver() türünde yeni bir obje oluşturduk
        webDriver.get("https://www.youtube.com");
        //get() metodu ile String olarak girilen url'e gideriz

    }
}
