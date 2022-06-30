package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.LoginStep;

public class LoginStepdefs {


    @Steps
    LoginStep Loginstep;


    @Given("The user is already on the login page")
    public void theUserIsAlreadyOnTheLoginPage() {
        Loginstep.openLoginPage();
    }

    @When("Input valid username {string}")
    public void inputValidUsername(String name) {

        Loginstep.inputValidUsername(name);
    }

    @When("Input valid password {string}")
    public void inputValidPassword(String password) {
        Loginstep.inputValidPassword(password);
    }

    @And("Click login button")
    public void clickLoginButton() {
        Loginstep.clickLoginButton();
    }

    @Then("Go to inventory page")
    public void goToInventoryPage(String expectedName) {

        Loginstep.goToInventoryPage(expectedName);
    }

}
