package cloudapp.authentication;

import actions.NavigateActions;
import cloudapp.authentication.actions.LoginActions;
import cloudapp.authentication.components.AlertMessage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import static actions.FormPage.*;
import static cloudapp.authentication.User.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingOn {

    @Steps
    NavigateActions navigate;

    @Steps
    LoginActions login;

    AlertMessage alertMessagePage;

    @Test
    public void userCanLogInViaDirectLink() {
        navigate.to(LoginPage);
        login.with(VALID_CREDENTIAL);

        Serenity.reportThat("The 'Welcome back!' message should be displayed",
                () -> assertThat(alertMessagePage.alertMessageText()).contains("Welcome back!")
        );
    }

    @Test
    public void userCanNotLogInWithInvalidEmailOrPasswordCombination() {
        navigate.to(LoginPage);
        login.with(INVALID_EMAIL_OR_PASSWORD_COMBINATION);

        Serenity.reportThat("The 'Invalid email / password combination' message should be displayed",
                () -> assertThat(alertMessagePage.alertValidationFailed()).contains("Invalid email / password combination")
        );
    }
}
