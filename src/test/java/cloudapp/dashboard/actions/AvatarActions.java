package cloudapp.dashboard.actions;

import cloudapp.dashboard.components.Account;
import cloudapp.dashboard.components.Avatar;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.time.Duration;
import java.util.List;

import static cloudapp.dashboard.components.Account.SETTINGS_SIDEBAR;
import static cloudapp.dashboard.components.Avatar.*;

public class AvatarActions extends UIInteractionSteps {

    @Step("Open settings profile")
    public void openSettingsProfile() {
        $(AVATAR_ICON).click();
        withTimeoutOf(Duration.ofSeconds(10)).waitFor(MENU_DROPDOWN);
        $(PROFILE_ITEM).click();

        withTimeoutOf(Duration.ofSeconds(10)).waitFor(SETTINGS_SIDEBAR);

        $(Account.PROFILE_LINK).click();
    }
}
