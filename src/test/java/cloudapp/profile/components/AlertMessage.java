package cloudapp.profile.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

public class AlertMessage extends PageObject {
    private final static By ALERT_SUCCESS = By.cssSelector(".alert-success");
    private final static By ALERT_FAILED = By.cssSelector(".alert-danger");

    public String alertSuccessText() {
        return withTimeoutOf(Duration.ofSeconds(10)).waitFor(ALERT_SUCCESS).getText();
    }

    public String alertFailedText() {
        return withTimeoutOf(Duration.ofSeconds(10)).waitFor(ALERT_FAILED).getText();
    }
}
