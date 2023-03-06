package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.Properties;

public class BaseTest {
    WebDriver driver;
    Properties properties;

    @Before
    public void before() {
        properties = ConfigReader.initialize_Properties(); // url almak için

      String browser = properties.getProperty("browser");
    //    String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");

        System.out.println("browser:"+browser);

        driver = DriverFactory.initialize_Driver(browser); // driver ayağa kaldırma
    }
    @After
    public void after() {

        driver.quit();
    }
}
