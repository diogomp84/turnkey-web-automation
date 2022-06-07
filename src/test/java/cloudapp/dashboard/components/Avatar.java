package cloudapp.dashboard.components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Avatar extends PageObject {
    public static By AVATAR_ICON =By.id("avatar");

    public static By PROFILE_ITEM = By.cssSelector("a[href*='settings#profile']");

    public static By MENU_DROPDOWN = By.cssSelector(".dropdown-menu.dropdown-menu-right.nav-item.show");

}
