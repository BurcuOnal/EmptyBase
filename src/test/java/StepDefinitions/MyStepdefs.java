package StepDefinitions;

import Pages.MyPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

public class MyStepdefs {
    WebDriver driver = DriverFactory.getDriver();
    MyPages myPages = new MyPages(driver);


    @Given("Arama kutucuguna tikla")
    public void aramaKutucugunaTikla() {

        MyPages.aramaKutuTıkla();
    }
    @When("{string} yaz")
    public void yaz(String arg0) throws InterruptedException {
        Thread.sleep(5000);
        MyPages.biseyYaz();
    }
    @Then("Yazilim bilgilerinin geldiğini kontrol et")
    public void yazilimBilgilerininGeldiğiniKontrolEt() {
        MyPages.kontrol();
    }

    }
