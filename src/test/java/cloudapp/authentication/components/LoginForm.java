package cloudapp.authentication.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginForm extends PageObject {
    public static By EMAIL =By.id("email");
    public static By PASSWORD = By.id("password");
    public static By LOGIN_BUTTON = By.cssSelector("input[data-testid='regular-login-submit']");
}
