package components;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HeaderPage extends PageObject {
    public static final By MENU_PRODUCT = By.xpath("//div[@class='jet-menu-title' and contains(text(), 'Product')]");
    public static final By MENU_SOLUTIONS = By.xpath("//div[@class='jet-menu-title' and contains(text(), 'Solutions')]");
    public static final By MENU_RESOURCES = By.xpath("//div[@class='jet-menu-title' and contains(text(), 'Resources')]");
}
