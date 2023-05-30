package techproed.selenium_lessons.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebelementLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim.
        driver.get("https://amazon.com");
        //Arama kutusunu locate edelim
        driver.findElement(By.id("twotabsearchtextbox"));
        //Bir webelementin locate'ini birden fazla kullanacaksanız bir Webelement'e değişken olarak atayabilirsiniz.
        //WebElement webElement =driver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiriz.
        // 1-Locate işlemi bittikten sonra eğer webelemente bir metin göndereceksek sendKeys() metodu kullanabiliriz.
        // 2-webelemente tılayacaksak click() metodunu kullanırız
        // 3-webelementin üzerindeki yazıyı almak istiyorsak getText() metodunu kullanırız
        // 4-sendKeys() metodundan sonra yani webelemente metin gönderdikten sonra Keys.ENTER ile yada submit()
        // metodu ile manuel olarak ENTER yaptığımız gibi otomasyonda da yapabiliriz.



        //Arma kutusuna iphone yazdıralım ve aratalım.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //Sayfayı kapatalım
        driver.close();
    }
}
