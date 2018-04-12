import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.AndroidTestRunner;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WikiTest extends AndroidTestRunner {

    @BeforeMethod
    public void initialiseDriver() throws MalformedURLException {
        getWebDriver();
    }

    @Test
    public void testWiki() {

        SelenideElement wikiLogo = $(By.xpath(".//div[@class='central-textlogo__image sprite svg-Wikipedia_wordmark']"));

        open("https://www.wikipedia.org/");

        wikiLogo
                .shouldBe(visible)
                .shouldHave(exactText("Wikipedia"));
    }
}
