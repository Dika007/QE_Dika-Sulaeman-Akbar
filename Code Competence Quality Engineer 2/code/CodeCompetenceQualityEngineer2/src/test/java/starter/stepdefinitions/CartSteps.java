package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Cart;
public class CartSteps {
    @Steps
    Cart cart;

    //Get all  carts
    @Given("I set endpoint Get all carts")
    public void setApiEndpointGetallCarts(){cart.setApiEndpointGetallCarts();}
    @When("I set http request Get all carts")
    public void sendGetallCartsHttpRequest(){cart.sendGetallCartsHttpRequest();}
    @Then("received a status code response of 200 Get all carts")
    public void receiveValidHttpResponseCodeGetallCarts(){cart.receiveValidHttpResponseCodeGetallCarts();}
    @And("verify get all cart data")
    public void allCarts(){cart.allCarts();}

    //Get a single cart
    @Given("I set endpoint Get a single cart")
    public void setApiEndpointGetUserCartsSingle(){cart.setApiEndpointGetUserCartsSingle();}
    @When("I set the http request get single cart")
    public void sendGetUserCartsSingleHttpRequest(){cart.sendGetUserCartsSingleHttpRequest();}
    @Then("received a status code 200 response Get a single cart")
    public void receiveValidHttpResponseCodeGetUserCartsSingle(){cart.receiveValidHttpResponseCodeGetUserCartsSingle();}
    @And("Verify details of carts 5")
    public void UserCarts5(){cart.UserCarts5();}

    //Limit results cart
    @Given("I set endpoint Limit results cart")
    public void setApiEndpointGetlimitcart(){cart.setApiEndpointGetlimitcart();}
    @When("I set http request get Limit results cart")
    public void sendGetlimitcartHttpRequest(){cart.sendGetlimitcartHttpRequest();}
    @Then("received a status code 200 response Limit results cart")
    public void receiveValidHttpResponseCodeGetlimitcart(){cart.receiveValidHttpResponseCodeGetlimitcart();}
    @And("Check if data is available or empty limit cart")
    public void limitcart(){cart.limitcart();}

    //Sort results cart
    @Given("I set endpoint Sort results cart")
    public void setApiEndpointGetsortcart(){cart.setApiEndpointGetsortcart();}
    @When("I set http request get Sort results cart")
    public void sendGetsortcartHttpRequest(){cart.sendGetsortcartHttpRequest();}
    @Then("received a status code 200 response sort results cart")
    public void receiveValidHttpResponseCodeGetsortcart(){cart.receiveValidHttpResponseCodeGetsortcart();}
    @And("Check if data is available or empty sort cart")
    public void sortcart(){cart.sortcart();}

    //Get carts in a date range
    @Given("I set endpoint carts in a date range")
    public void setApiEndpointGetdaterange(){cart.setApiEndpointGetdaterange();}
    @When("I set the http request get date range")
    public void sendGetdatarangeHttpRequest(){cart.sendGetdatarangeHttpRequest();}
    @Then("received response code 200 date range")
    public void receiveValidHttpResponseCodeGetdatarange(){cart.receiveValidHttpResponseCodeGetdatarange();}
    @And("Check if data is available or empty date range")
    public void datarange(){cart.datarange();}

    //Get user carts
    @Given("I set endpoint user carts")
    public void setApiEndpointGetUserCarts(){cart.setApiEndpointGetUserCarts();}
    @When("I set the http request get user carts")
    public void sendGetUserCartsHttpRequest(){cart.sendGetUserCartsHttpRequest();}
    @Then("received response code 200 user carts")
    public void receiveValidHttpResponseCodeGetUserCarts(){cart.receiveValidHttpResponseCodeGetUserCarts();}
    @And("Check if data is available or empty user carts")
    public void UserCarts(){cart.UserCarts();}

    //Add a new product in cart
    @Given("I set endpoint new product in cart")
    public void setApiEndpointPostCarts(){cart.setApiEndpointPostCarts();}
    @When("I set the http request post user cart")
    public void sendPostCartsHttpRequest(){cart.sendPostCartsHttpRequest();}
    @Then("received response code 201 user cart")
    public void receiveValidHttpResponseCodepostCarts(){cart.receiveValidHttpResponseCodepostCarts();}
    @And("verify post cart data")
    public void postCarts(){cart.postCarts();}

    //Update a product put in cart
    @Given("I set endpoint put in cart")
    public void setApiEndpointPutCarts(){cart.setApiEndpointPutCarts();}
    @When("I set the http request put cart")
    public void sendPutCartsHttpRequest(){cart.sendPutCartsHttpRequest();}
    @Then("received response code 200 put cart")
    public void receiveValidHttpResponseCodeputCarts(){cart.receiveValidHttpResponseCodeputCarts();}
    @And("verify put cart data")
    public void putCarts(){cart.putCarts();}

    //Update a product patch in cart
    @Given("I set endpoint patch in cart")
    public void setApiEndpointPatchCarts(){cart.setApiEndpointPatchCarts();}
    @When("I set the http request patch cart")
    public void sendPatchCartsHttpRequest(){cart.sendPatchCartsHttpRequest();}
    @Then("received response code 200 patch cart")
    public void receiveValidHttpResponseCodepatchCarts(){cart.receiveValidHttpResponseCodepatchCarts();}
    @And("verify patch cart data")
    public void patchCarts(){cart.patchCarts();}

    //Delete a cart
    @Given("I set endpoint delete cart")
    public void setApiEndpointDeleteCarts(){cart.setApiEndpointDeleteCarts();}
    @When("I set the http request delete cart")
    public void sendDeleteCartsHttpRequest(){cart.sendDeleteCartsHttpRequest();}
    @Then("received response code 204 delete cart")
    public void receiveValidHttpResponseCodedeleteCarts(){cart.receiveValidHttpResponseCodedeleteCarts();}

}
