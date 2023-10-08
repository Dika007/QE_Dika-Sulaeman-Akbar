package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Products;
public class ProductsSteps {
    @Steps
    Products products;

    // Get all products
    @Given("I set the endpoint all products")
    public void setApiEndpointGetAll(){products.setApiEndpointGetAll();}
    @When("I set http request get all")
    public void sendGetAllHttpRequest(){products.sendGetAllHttpRequest();}
    @Then("received a status code response of 200 get all")
    public void receiveValidHttpResponseCodeGetAll(){products.receiveValidHttpResponseCodeGetAll();}
    @And("response should contain a list of products")
    public void listproduk(){products.listproduk();}


    // Get a single product
    @Given("I set the endpoint products 1")
    public void setApiEndpoint(){products.setApiEndpoint();}
    @When("I set the http request get")
    public void sendGetHttpRequest(){products.sendGetHttpRequest();}
    @Then("received a status code 200 response")
    public void receiveValidHttpResponseCode(){products.receiveValidHttpResponseCode();}
    @And("Verify details of product 1")
    public void receiveValidDataForDetailProducts(){products.receiveValidDataForDetailProducts();}

    //Limit results product
    @Given("I set endpoint Limit results product")
    public void setApiEndpointlimitproduk(){products.setApiEndpointlimitproduk();}
    @When("I set http request get Limit results product")
    public void sendGetHttpRequestlimitproduk(){products.sendGetHttpRequestlimitproduk();}
    @Then("received a status code 200 response Limit results product")
    public void receiveValidHttpResponseCodelimitproduk(){products.receiveValidHttpResponseCodelimitproduk();}
    @And("Check if data is available or empty limit product")
    public void dataresultproduk(){products.dataresultproduk();}

    //Sort results product
    @Given("I set endpoint Sort results product")
    public void setApiEndpointsortproduk(){products.setApiEndpointsortproduk();}
    @When("I set http request get Sort results product")
    public void sendGetHttpRequestsortproduk(){products.sendGetHttpRequestsortproduk();}
    @Then("received a status code 200 response sort results product")
    public void receiveValidHttpResponseCodesortproduk(){products.receiveValidHttpResponseCodesortproduk();}
    @And("Check if data is available or empty sort product")
    public void datasortproduk(){products.datasortproduk();}


    //Get all categories
    @Given("I set the endpoint categories")
    public void setApiEndpoinCategories(){products.setApiEndpoinCategories();}
    @When("I set the http request get categories")
    public void sendGetHttpRequestCategories(){products.sendGetHttpRequestCategories();}
    @Then("received a status code response of 200 categories")
    public void receiveValidHttpResponseCodeCategories(){products.receiveValidHttpResponseCodeCategories();}
    @And("Verify categories data")
    public void receiveValidDataForCategories(){products.receiveValidDataForCategories();}

    //Get products in a specific category
    @Given("I set endpoint detail category")
    public void setApiEndpoinDetailCategories(){products.setApiEndpoinDetailCategories();}
    @When("I set the http request get detail category")
    public void sendGetHttpRequestDetailCategories(){products.sendGetHttpRequestDetailCategories();}
    @Then("received a status code 200 response detail category")
    public void receiveValidHttpResponseCodeDetailCategories(){products.receiveValidHttpResponseCodeDetailCategories();}
    @And("Verify details of category")
    public void receiveValidDataFordetailCategories(){products.receiveValidDataFordetailCategories();}

    //Add new product
    @Given("I set endpoint Add new product")
    public void setPostApiEndpoint(){products.setPostApiEndpoint();}
    @When("I set http request post")
    public void sendPostHttpRequestpostproduk(){products.sendPostHttpRequestpostproduk();}
    @Then("received response code 201")
    public void receiveValidHttpResponseCode201postproduk(){products.receiveValidHttpResponseCode201postproduk();}
    @And("verify adding new data")
    public void receiveValidDatapostproduk(){products.receiveValidDatapostproduk();}

    //Update a product put
    @Given("I set endpoint Update a product")
    public void setPutApiEndpoint(){products.setPutApiEndpoint();}
    @When("I set the http request put")
    public void sendPutHttpRequestputproduk(){products.sendPutHttpRequestputproduk();}
    @Then("received response code 200 Update a product")
    public void receiveValidHttpResponseCodeputproduk(){products.receiveValidHttpResponseCodeputproduk();}
    @And("verify update data put")
    public void receiveValidDataputproduk(){products.receiveValidDataputproduk();}

    //Update a product patch
    @Given("I set endpoint Update a product patch")
    public void setPatchApiEndpoint(){products.setPatchApiEndpoint();}
    @When("I set the http request patch")
    public void sendpatchHttpRequestproduk(){products.sendpatchHttpRequestproduk();}
    @Then("received response code 200 Update a product patch")
    public void receiveValidHttpResponseCodepatchproduk(){products.receiveValidHttpResponseCodepatchproduk();}
    @And("verify update data patch")
    public void receiveValidDatapatchproduk(){products.receiveValidDatapatchproduk();}

    //Delete a product
    @Given("I set endpoint delete")
    public void setDeleteApiEndpoint(){products.setDeleteApiEndpoint();}
    @When("I set the http request delete")
    public void senddeletehHttpRequestproduk(){products.senddeletehHttpRequestproduk();}
    @Then("received response code 204 delete")
    public void receiveValidHttpResponseCodedeleteproduk(){products.receiveValidHttpResponseCodedeleteproduk();}

}
