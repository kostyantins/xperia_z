package blablacar;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.AndroidTestRunner;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Condition.text;

public class BlaBlaCarTest extends AndroidTestRunner {

    @BeforeMethod
    public void initialiseDriver() throws MalformedURLException {
        getBlaBlaCarDriver();
    }

    @Test
    public void testTwitterLogIn() {
        loginPage
                .loginWithFacebook()
                .getOfferDriving()
                .shouldHave(text("ЗАПРОПОНУВАТИ"));
    }

}
