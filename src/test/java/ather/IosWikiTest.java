package ather;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.IOSTestRunner;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IosWikiTest extends IOSTestRunner {

    @BeforeMethod
    public void initialiseDriver() throws MalformedURLException {
        getIOSDriver();
    }

    @Test
    public void testTwitterLogIn() {

        open("https://www.google.com");

        $(By.id("hplogo"))
                .shouldBe(Condition.visible);
    }
}
