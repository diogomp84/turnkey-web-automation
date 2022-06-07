package cloudapp.dashboard.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Account extends PageObject {

    public static By SETTINGS_SIDEBAR = By.cssSelector("[data-testid='settings-sidebar']");
    public static By PROFILE_LINK = By.cssSelector("a[data-testid='profile-settings']");
}
