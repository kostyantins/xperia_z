package ather;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.AndroidTestRunner;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TwitterTest extends AndroidTestRunner {

    @BeforeMethod
    public void initialiseDriver() throws MalformedURLException {
        getTwitterDriver();
    }

    private SelenideElement byLoginFirst = $(By.id("com.twitter.android:id/log_in"));
    private SelenideElement byEmail = $(By.id("com.twitter.android:id/login_identifier"));
    private SelenideElement byPass = $(By.id("com.twitter.android:id/login_password"));
    private SelenideElement loginButton = $(By.id("com.twitter.android:id/login_login"));
    private SelenideElement title = $(By.id("com.twitter.android:id/empty_title"));
    private SelenideElement customizationPopup = $(By.id("com.twitter.android:id/parentPanel"));
    private SelenideElement customizationDoNotAllowButton = $(By.id("com.twitter.android:id/button2"));
    private SelenideElement getStartedWall = $(By.id("com.twitter.android:id/cta_button"));
    private SelenideElement haveAnAccountAlready = $(By.id("com.twitter.android:id/sign_in_text"));


    @Test
    public void testTwitterLogIn() {

        if (getStartedWall.isDisplayed()){
            haveAnAccountAlready.click();
        }else {
            byLoginFirst.click();
        }

        byEmail.clear();
        byEmail.sendKeys("kostyantins@mail.ru");
        byPass.sendKeys("100784664482");
        loginButton.click();

        if(customizationPopup.isDisplayed()){
            customizationDoNotAllowButton.click();
        }

        title.shouldHave(text("What? No Tweets yet?"));
    }
}
