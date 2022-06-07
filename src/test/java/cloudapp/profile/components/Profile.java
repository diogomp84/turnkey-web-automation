package cloudapp.profile.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Profile extends PageObject {
    public static By USERNAME =By.id("user_name");
    public static By COMPANY = By.id("user_company");
    public static By SUBMIT_BUTTON = By.cssSelector("[data-testid='onboarding-submit-about-you-form']");

    public static By UPLOAD = By.id("user_avatar");
}
