package page_pbjects;

import com.codeborne.selenide.*;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class LoginPage extends PageObjectBasePage {

    private SelenideElement loginButton = $(By.id("com.comuto:id/on_boarding_level_one_sign_in_button"));
    private SelenideElement loginWithFacebook = $(By.id("com.comuto:id/facebook_login_button"));
    private SelenideElement travels = $(By.id("com.comuto:id/bb_bottom_bar_title"));
    private SelenideElement mailFacebookInput = $(By.id("com.comuto:id/m_login_email"));
    private SelenideElement passFacebookInput = $(By.id("com.comuto:id/am_login_password"));
    private SelenideElement loginFacebookButton = $(By.id("com.comuto:id/u_0_5"));
    private SelenideElement continueFacebookButton = $(By.id("com.comuto:id/u_0_3"));

    public HomePage loginWithFacebook() {
        loginButton
                .waitUntil(Condition.visible, 10000)
                .click();
        loginWithFacebook.click();
        mailFacebookInput
                .waitUntil(Condition.visible, 10000)
                .sendKeys("kostyntins@ukr.net");
        passFacebookInput.sendKeys("Aytsok664482");
        loginFacebookButton.click();
        continueFacebookButton.click();

        return new HomePage();
    }
}
