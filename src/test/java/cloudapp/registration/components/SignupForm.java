package cloudapp.registration.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SignupForm extends PageObject {
    public static By EMAIL =By.id("email");
    public static By PASSWORD = By.id("password");
    public static By SIGNUP_BUTTON = By.cssSelector("input[data-testid='regular-signup-submit']");
}
