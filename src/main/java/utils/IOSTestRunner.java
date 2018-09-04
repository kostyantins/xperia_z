package utils;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

import static utils.CapabilitiesRepo.CHROME_CAPABILITIES;
import static utils.CapabilitiesRepo.IOS_CHROME_CAPABILITIES;

public class IOSTestRunner {

    private static final ThreadLocal<IOSDriver> DRIVER = new ThreadLocal<>();

    public static IOSDriver getIOSDriver() throws MalformedURLException {

        if (DRIVER.get() == null) {
            DRIVER.set(IOS_CHROME_CAPABILITIES("iPhone 5", "10.3.3"));
            WebDriverRunner.setWebDriver(getIOSDriver());
            return DRIVER.get();
        } else
            return DRIVER.get();
    }
}
