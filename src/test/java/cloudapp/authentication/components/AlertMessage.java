package cloudapp.authentication.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

public class AlertMessage extends PageObject {

    private final static By ALERT_MESSAGE = By.cssSelector(".alert.alert-message");
    private final static By ALERT_VALIDATION_FAILED_MESSAGE = By.cssSelector("div[class^='alert alert-danger']");

    public String alertMessageText() {
        return withTimeoutOf(Duration.ofSeconds(10)).waitFor(ALERT_MESSAGE).getText();
    }

    public String alertValidationFailed() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(ALERT_VALIDATION_FAILED_MESSAGE);
        return $(ALERT_VALIDATION_FAILED_MESSAGE).getText();
    }
}
