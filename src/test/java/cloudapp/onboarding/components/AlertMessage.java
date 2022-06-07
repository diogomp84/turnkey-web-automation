package cloudapp.onboarding.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

public class AlertMessage extends PageObject {
    private final static By ALERT_MESSAGE = By.cssSelector(".toast-body");

    public String alertMessageText() {
        withTimeoutOf(Duration.ofSeconds(10)).waitForAnyTextToAppear("Account created successfully");
        return $(ALERT_MESSAGE).getText();
    }
}
