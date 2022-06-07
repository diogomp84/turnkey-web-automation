package cloudapp.registration;

import actions.HeaderPage;
import actions.NavigateActions;
import cloudapp.onboarding.components.AlertMessage;
import cloudapp.registration.components.VerificationPage;
import net.serenitybdd.core.Serenity;
import utils.UserCredential;
import utils.Utils;
import cloudapp.registration.actions.SignupActions;
import components.HeaderMenu;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static actions.FormPage.HomePage;
import static actions.FormPage.SignupPage;
import static cloudapp.authentication.User.VALID_CREDENTIAL;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSigningUp {

    @Steps
    NavigateActions navigate;

    @Steps
    SignupActions signup;

    HeaderPage header;

    AlertMessage alertMessagePage;

    VerificationPage verificationPage;

    @ParameterizedTest
    @EnumSource(value = HeaderMenu.class, names = {"PRODUCT", "SOLUTIONS", "RESOURCES"})
    public void userCanSignUpUsingSomeHeaderMenus(HeaderMenu item) {
        navigate.to(HomePage);

        header.openMenu(item);

        signup.openSignUpFree(item);

         UserCredential credential = Utils.generateRandomUserCredential();

         signup.with(credential);

        Serenity.reportThat("The 'Account created successfully' message should be displayed",
                 () -> assertThat(alertMessagePage.alertMessageText()).contains("Account created successfully")
        );

    }

    @Test
    public void userCanSignUpViaDirectLink() {
        navigate.to(SignupPage);

        UserCredential credential = Utils.generateRandomUserCredential();

        signup.with(credential);

        Serenity.reportThat("The 'Account created successfully' message should be displayed",
                () -> assertThat(alertMessagePage.alertMessageText()).contains("Account created successfully")
        );
    }

    @Test
    public void userCanNotSignUpWithEmailThatHasAlreadyBeenTaken() {
        navigate.to(SignupPage);

        signup.with(new UserCredential(VALID_CREDENTIAL.getEmail(), VALID_CREDENTIAL.getPassword()));

        Serenity.reportThat("The 'Validation failed: Email has already been taken' message should be displayed",
                () -> assertThat(verificationPage.alertValidationFailed()).contains("Validation failed: Email has already been taken")
        );
    }
}
