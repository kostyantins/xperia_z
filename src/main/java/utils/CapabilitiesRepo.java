package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesRepo {

    public static AndroidDriver CHROME_CAPABILITIES(final String emulatorName) throws MalformedURLException {

        final DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, emulatorName); //"emulator-5554" //"BX903GHN57"
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
        capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");

        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    public static AndroidDriver SAFARI_CAPABILITIES(final String emulatorName) throws MalformedURLException {

        final DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, emulatorName); //"emulator-5554"
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.SAFARI);
        capabilities.setCapability(MobileCapabilityType.TAKES_SCREENSHOT, "true");

        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    public static AndroidDriver TWITTER_CAPABILITIES(final String emulatorName, final String androidVersion) throws MalformedURLException {

        File app = new File("/Volumes/HD/vcs/xperia_z/src/main/resources/app/com.twitter.android_v6.38.0-6110056_Android-4.1.apk"); //need if 'apk' didn't install with adb
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, emulatorName); //"emulator-5554"
        capabilities.setCapability(CapabilityType.VERSION, androidVersion); //"5.5.1" android version
        capabilities.setCapability("autoDismissAlerts", true);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability("appPackage", "com.twitter.android"); // This is package name of your app (you can get it from apk info app
        capabilities.setCapability("app", app.getAbsolutePath()); // need if 'apk' didn't install with adb and when U got 'app' variable
        capabilities.setCapability("appActivity", "com.twitter.android.StartActivity"); // This is Launcher activity of your app (you can get it from apk info app)

        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    public static AndroidDriver BLABLACAR_CAPABILITIES(final String emulatorName, final String androidVersion) throws MalformedURLException {

        File app = new File("/Volumes/HD/vcs/xperia_z/src/main/resources/app/com.twitter.android_v6.38.0-6110056_Android-4.1.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, emulatorName);
        capabilities.setCapability(CapabilityType.VERSION, androidVersion);
        capabilities.setCapability("autoDismissAlerts", true);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability("appPackage", "com.twitter.android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appActivity", "com.twitter.android.StartActivity");
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
