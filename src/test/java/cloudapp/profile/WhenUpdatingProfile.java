package cloudapp.profile;

import actions.NavigateActions;
import cloudapp.authentication.actions.LoginActions;
import cloudapp.dashboard.actions.AvatarActions;
import cloudapp.profile.actions.ProfileActions;
import cloudapp.profile.components.AlertMessage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static actions.FormPage.LoginPage;
import static cloudapp.authentication.User.VALID_CREDENTIAL;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenUpdatingProfile {

    @Steps
    NavigateActions navigate;

    @Steps
    LoginActions login;

    @Steps
    AvatarActions avatar;

    @Steps
    ProfileActions profile;

    AlertMessage alertMessagePage;

    @BeforeEach
    public void login(){
        navigate.to(LoginPage);
        login.with(VALID_CREDENTIAL);
    }

    @ParameterizedTest
    @EnumSource(value = AvatarSize.class, names = {"SIZE_512_512"})
    public void shouldNotUpdateAvatarSizeOver500x500pixel(AvatarSize avatarSize) {
        avatar.openSettingsProfile();

        profile.updateAvatar(new AvatarProfile("Automation","CloudApp", avatarSize));

        Serenity.reportThat("The 'Avatar Max size is 500x500px' message should be displayed",
                () -> assertThat(alertMessagePage.alertFailedText()).contains("Avatar Max size is 500x500px")
        );
    }

    @ParameterizedTest
    @EnumSource(value = AvatarSize.class, names = {"SIZE_256_256", "SIZE_500_500"})
    public void shouldUpdateAvatarSizeLessThanOrEqualTo500x500pixel(AvatarSize avatarSize) {
        avatar.openSettingsProfile();

        profile.updateAvatar(new AvatarProfile("Automation","CloudApp", avatarSize));

        Serenity.reportThat("The 'Account updated successfully' message should be displayed",
                () -> assertThat(alertMessagePage.alertSuccessText()).contains("Account updated successfully")
        );
    }
}
