package utils;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import lombok.Getter;
import lombok.Setter;
import org.testng.annotations.BeforeSuite;
import page_pbjects.LoginPage;

import java.net.MalformedURLException;

import static utils.CapabilitiesRepo.BLABLACAR_CAPABILITIES;
import static utils.CapabilitiesRepo.CHROME_CAPABILITIES;
import static utils.CapabilitiesRepo.TWITTER_CAPABILITIES;

@Getter
@Setter
public class AndroidTestRunner {

    private static final ThreadLocal<AndroidDriver> DRIVER = new ThreadLocal<>();

    protected LoginPage loginPage = new LoginPage();

    public static AndroidDriver getWebDriver() throws MalformedURLException {

        if (DRIVER.get() == null) {
            DRIVER.set(CHROME_CAPABILITIES("BX903GHN57"));
            WebDriverRunner.setWebDriver(getWebDriver());
            return DRIVER.get();
        } else
            return DRIVER.get();
    }

    public static AndroidDriver getTwitterDriver() throws MalformedURLException {

        if (DRIVER.get() == null) {
            DRIVER.set(TWITTER_CAPABILITIES("BX903GHN57","5.5.1"));
            WebDriverRunner.setWebDriver(getTwitterDriver());
            return DRIVER.get();
        } else
            return DRIVER.get();
    }

    public static AndroidDriver getBlaBlaCarDriver() throws MalformedURLException {

        if (DRIVER.get() == null) {
            DRIVER.set(BLABLACAR_CAPABILITIES("BX903GHN57","5.5.1"));
            WebDriverRunner.setWebDriver(getBlaBlaCarDriver());
            return DRIVER.get();
        } else
            return DRIVER.get();
    }
}

