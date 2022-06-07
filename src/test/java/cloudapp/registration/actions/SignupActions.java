package cloudapp.registration.actions;

import cloudapp.registration.components.SignupForm;
import components.HeaderMenu;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import utils.UserCredential;

import java.time.Duration;

public class SignupActions extends UIInteractionSteps {
    @Step("Sign up with {0}")
    public void with(UserCredential userCredential) {
        $(SignupForm.EMAIL).sendKeys(userCredential.email());
        $(SignupForm.PASSWORD).sendKeys(userCredential.password());
        $(SignupForm.SIGNUP_BUTTON).click();
    }

    @Step("Open sign up free")
    public void openSignUpFree(HeaderMenu item) {
        withTimeoutOf(Duration.ofSeconds(30))
                .waitFor(By.xpath("//h2[@class='elementor-heading-title elementor-size-default' and contains(text(), '" + item.getName() + "')]//parent::div//parent::div//parent::div//a")).click();
    }
}
