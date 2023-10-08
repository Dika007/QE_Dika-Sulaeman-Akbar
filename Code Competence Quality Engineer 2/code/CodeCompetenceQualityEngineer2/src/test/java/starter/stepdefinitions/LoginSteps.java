package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Login;
public class LoginSteps {
    @Steps
    Login login;

    //User login
    @Given("I set endpoint login")
    public void setApiEndpointlogin(){login.setApiEndpointlogin();}
    @When("I set the http request post login")
    public void sendloginHttpRequest(){login.sendloginHttpRequest();}
    @Then("received response code 200 post login")
    public void receiveValidHttpResponseCodelogin(){login.receiveValidHttpResponseCodelogin();}
    @And("successful login")
    public void login(){login.login();}

}
