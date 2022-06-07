package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class NavigateActions extends UIInteractionSteps {

    @Step("Navigate to {0}")
    public void to(FormPage formPage){
        openPageNamed(formPage.name());
    }
}
