package cloudapp.authentication.actions;

import cloudapp.authentication.User;
import cloudapp.authentication.components.LoginForm;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {

    @Step("Log in with {0}")
    public void with(User user) {
        $(LoginForm.EMAIL).sendKeys(user.getEmail());
        $(LoginForm.PASSWORD).sendKeys(user.getPassword());
        $(LoginForm.LOGIN_BUTTON).click();
    }
}
