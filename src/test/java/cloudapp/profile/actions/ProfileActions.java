package cloudapp.profile.actions;

import cloudapp.profile.AvatarProfile;
import cloudapp.profile.AvatarSize;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.io.File;

import static cloudapp.profile.components.Profile.*;


public class ProfileActions extends UIInteractionSteps {

    @Step("Update avatar")
    public void updateAvatar(AvatarProfile avatarProfile) {
        $(UPLOAD).sendKeys(avatarProfile.avatarSize().absolutePath());

        $(USERNAME).clear();
        $(USERNAME).sendKeys(avatarProfile.name());

        $(COMPANY).clear();
        $(COMPANY).sendKeys(avatarProfile.company());
        $(SUBMIT_BUTTON).click();
    }
}
