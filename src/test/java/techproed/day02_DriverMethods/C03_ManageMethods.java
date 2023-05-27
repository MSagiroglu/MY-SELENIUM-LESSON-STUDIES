package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanın konumu : " + driver.manage().window().getPosition());
        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanın boyutlatı : " + driver.manage().window().getSize());
        //Browser'i maximize yapalim
        driver.manage().window().maximize();
        // En Çok kullanacak olduğumuz metod maximize():Bir web sitesine gittiğimizde
        // browser fdefault olarak bir boyutta gelir ve açılan broserdaki web elementlere Browser maximize olmadığı için ulaşamayabiliriz
        //Dolayısıyla browserı açtıktan sonra maximize yaparsak driver bütün webelementleri görür ve rahatlıkla müdahale edebilir.
        //Bu yüzden browserı açtıktan sonra ilk olarak maximize yapmamız bizim web elementlere ulaşmada işimizi kolaylaştırır.
        //Böylelikle fail almamış oluruz.
        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");
        //Browser'in konumunu yazdiralim
        System.out.println("Sayfanın konumu : " + driver.manage().window().getPosition());
        //Browser'in boyutlarini yazdiralim
        System.out.println("Sayfanın boyutlatı : " + driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //Sayfayi fullscren yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));//istediğiniz konuma getirir
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz ölçüde sayfa oluşturur
        Thread.sleep(3000);

        //sayfayı kapatınız
        driver.close();

    }
}
