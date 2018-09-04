package page_pbjects;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Setter
public class HomePage extends  PageObjectBasePage{

    private SelenideElement offerDriving = $(By.id("com.comuto:id/home_offer_ride_empty_state_button"));

}
