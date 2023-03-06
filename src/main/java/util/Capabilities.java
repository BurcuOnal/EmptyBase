package util;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Capabilities {
    ChromeOptions chromeOptions = new ChromeOptions();
    FirefoxOptions firefoxOptions = new FirefoxOptions();

    public ChromeOptions chromeCapabilities() {
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-popup-blocking");

        return chromeOptions;
    }

    public FirefoxOptions firefoxCapabilities() {
        firefoxOptions.setProfile(new FirefoxProfile());
        firefoxOptions.addPreference("dom.webnotifications.enabled", false);
        return firefoxOptions;
    }
}
