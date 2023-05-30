package techproed.selenium_lessons.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidelim.
        driver.get("https://amazon.com");
        //Arama kutusunu locate edelim
        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
        //Arma kutusuna iphone yazdıralım ve aratalım.
        aramaKutusu.sendKeys("samsung");
        Thread.sleep(3000);
        aramaKutusu.submit();//Keys.ENTER

        //Sayfayı kapatalım
        driver.close();

    }
}
