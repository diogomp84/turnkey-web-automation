package cloudapp.registration.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

public class VerificationPage extends PageObject {

    private final static By ALERT_VALIDATION_FAILED_MESSAGE = By.cssSelector(".flash.alert.alert-danger");

    public String alertValidationFailed() {
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(ALERT_VALIDATION_FAILED_MESSAGE);
        return $(ALERT_VALIDATION_FAILED_MESSAGE).getText();
    }
}
