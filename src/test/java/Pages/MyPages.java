package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;

public class MyPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public MyPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.elementHelper = new ElementHelper(driver);

    }

    static By aramaKutusu = By.cssSelector("input[class=\"gLFyf\"]");

    public static void aramaKutuTıkla() {

        ElementHelper.click(aramaKutusu);
    }

    public static void biseyYaz() {

        ElementHelper.sendKey(aramaKutusu, "aramak istediğim şey");

    }

    public static void kontrol() {

        ElementHelper.checkVisibility(aramaKutusu);
    }

}


