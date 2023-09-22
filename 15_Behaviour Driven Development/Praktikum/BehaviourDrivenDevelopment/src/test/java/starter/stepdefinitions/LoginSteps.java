package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I am on main page")
    public void onMainPage(){
        login.onMainPage();
    }
    @When("I log in using the correct Google account")
    public void loginGoogleaccountcorrect(){
        login.loginGoogleaccountcorrect();
    }

    @Then("I am on the home page")
    public void onTheHomePage(){
        login.onTheHomePage();
    }


    @When("I input invalid my username and password")
    public void InputInvalidUserAndPassword(){
        login.InputInvalidUserAndPassword();
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.clickLoginButton();
    }
    @Then("I get a notification that the email or password is wrong")
    public void emailorpasswordiswrong(){
        login.emailorpasswordiswrong();
    }



}
