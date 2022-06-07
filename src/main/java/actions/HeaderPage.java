package actions;

import components.HeaderMenu;
import net.serenitybdd.core.pages.PageObject;

public class HeaderPage extends PageObject {

    public void openMenu(HeaderMenu menu) {

        switch (menu){
            case PRODUCT:
                $(components.HeaderPage.MENU_PRODUCT).click();
            break;
            case SOLUTIONS:
                $(components.HeaderPage.MENU_SOLUTIONS).click();
            break;
            case RESOURCES:
                $(components.HeaderPage.MENU_RESOURCES).click();
            break;
        }
    }
}
