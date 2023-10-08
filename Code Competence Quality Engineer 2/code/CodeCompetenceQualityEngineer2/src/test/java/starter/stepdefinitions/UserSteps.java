package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.User;
public class UserSteps {
    @Steps
    User user;

    //Get all users
    @Given("I set endpoint all users")
    public void setApiEndpointGetallUsers(){user.setApiEndpointGetallUsers();}
    @When("I set the http request get all users")
    public void sendGetallUsersHttpRequest(){user.sendGetallUsersHttpRequest();}
    @Then("received response code 200 all users")
    public void receiveValidHttpResponseCodeGetallIUsers(){user.receiveValidHttpResponseCodeGetallIUsers();}
    @And("Check if data is available or empty user")
    public void allUsers(){user.allUsers();}

    //Get a single user
    @Given("I set endpoint single users")
    public void setApiEndpointGetsingleUsers(){user.setApiEndpointGetsingleUsers();}
    @When("I set the http request get single users")
    public void sendGetsingleUsersHttpRequest(){user.sendGetsingleUsersHttpRequest();}
    @Then("received response code 200 single user")
    public void receiveValidHttpResponseCodeGetseingleIUsers(){user.receiveValidHttpResponseCodeGetseingleIUsers();}
    @And("verify user data details")
    public void SingleUsers(){user.SingleUsers();}

    //Limit results Users
    @Given("I set endpoint Limit results Users")
    public void setApiEndpointGetlimitUsers(){user.setApiEndpointGetlimitUsers();}
    @When("I set http request get Limit results users")
    public void sendGetlimitUsersHttpRequest(){user.sendGetlimitUsersHttpRequest();}
    @Then("received a status code 200 response Limit results users")
    public void receiveValidHttpResponseCodeGetlimitIUsers(){user.receiveValidHttpResponseCodeGetlimitIUsers();}
    @And("Check if data is available or empty limit users")
    public void limitUsers(){user.limitUsers();}

    //Sort results users
    @Given("I set endpoint Sort results users")
    public void setApiEndpointGetsortUsers(){user.setApiEndpointGetsortUsers();}
    @When("I set http request get Sort results user")
    public void sendGetsortUsersHttpRequest(){user.sendGetsortUsersHttpRequest();}
    @Then("received a status code 200 response sort results user")
    public void receiveValidHttpResponseCodeGetsortIUsers(){user.receiveValidHttpResponseCodeGetsortIUsers();}
    @And("Check if data is available or empty sort users")
    public void sortUsers(){user.sortUsers();}

    //Add a new user
    @Given("I set endpoint new data users")
    public void setApiEndpointPostUsers(){user.setApiEndpointPostUsers();}
    @When("I set the http request post new users")
    public void sendPostUsersHttpRequest(){user.sendPostUsersHttpRequest();}
    @Then("received response code 201 data new users")
    public void receiveValidHttpResponseCodePostUsers(){user.receiveValidHttpResponseCodePostUsers();}
    @And("verify post data users")
    public void PostUsers(){user.PostUsers();}

    //Update a users put
    @Given("I set enpoint put users")
    public void setApiEndpointPutUsers(){user.setApiEndpointPutUsers();}
    @When("I set the http request put users")
    public void sendPutUsersHttpRequest(){user.sendPutUsersHttpRequest();}
    @Then("received response code 200 put users")
    public void receiveValidHttpResponseCodePutUsers(){user.receiveValidHttpResponseCodePutUsers();}
    @And("verify put data users")
    public void PutUsers(){user.PutUsers();}

    //Update a users patch
    @Given("I set endpoint patch users")
    public void setApiEndpointPatchUsers(){user.setApiEndpointPatchUsers();}
    @When("I set the http request patch users")
    public void sendPatchUsersHttpRequest(){user.sendPatchUsersHttpRequest();}
    @Then("received response code 200 patch users")
    public void receiveValidHttpResponseCodePatchUsers(){user.receiveValidHttpResponseCodePatchUsers();}
    @And("Check if data is available or empty patch users")
    public void PatchUsers(){user.PatchUsers();}

    //Delete a user
    @Given("I set endpoint delete users")
    public void setApiEndpointDeleteUsers(){user.setApiEndpointDeleteUsers();}
    @When("I set the http request delete users")
    public void sendDeleteUsersHttpRequest(){user.sendDeleteUsersHttpRequest();}
    @Then("received response code 204 delete users")
    public void receiveValidHttpResponseCodeDeleteUsers(){user.receiveValidHttpResponseCodeDeleteUsers();}
}
