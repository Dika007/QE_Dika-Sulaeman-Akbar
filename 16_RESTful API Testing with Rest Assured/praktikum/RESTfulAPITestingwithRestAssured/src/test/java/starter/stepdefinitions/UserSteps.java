package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;
import starter.user.Get;
import starter.user.Get_SemuaData;
import starter.user.Post;
import starter.user.Put;

public class UserSteps {
    @Steps
    Get get;

    @Steps
    Get_SemuaData get_semuaData;
    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;

    @Given("I set GET endpoints")
    public void setGetApiEndpoint(){
        get.setApiEndpoint();
    }
    @When("I send GET HTTP request")
    public void sendGetHttpRequest(){
        get.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponseCode(){
        get.validateHttpResponseCode200();
    }
    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser(){
        get.validateDataDetailUser();
    }


//    negative
    @Given("I set the GET endpoint incorrectly")
    public void setGetApiEndpoint1(){
        get.setApiEndpoint1();
    }
    @When("I sent an HTTP GET request")
    public void sendGetHttpRequest1(){
        get.sendGetHttpRequest1();
    }

    @Then("I received a valid HTTP response code 200")
    public void receiveValidHttpResponseCode1(){
        get.validateHttpResponseCode200N();
    }
    @And("I did not receive valid data for user details")
    public void receiveValidDataForDetailUser1(){get.validateDataDetailUser1();}

//    get semua data

    @Given("I set the GET endpoint correctly")
    public void setGetApiEndpoint2(){
        get_semuaData.setApiEndpoint2();
    }
    @When("I sent the HTTP GET request correctly")
    public void sendGetHttpRequest2(){
        get_semuaData.sendGetHttpRequest2();
    }
    @Then("I received a valid HTTP response code 200 correctly")
    public void validrespon(){
        get_semuaData.validrespon();
    }
    @And("I received valid data for the user")
    public void receiveValidDataForDetailUser2(){get_semuaData.validateDataDetailUser2();}

//negative
    @Given("I set the GET endpoint1 correctly")
    public void setGetApiEndpoint4(){
        get_semuaData.setApiEndpoint4();
    }
    @When("I sent the HTTP GET request1 correctly")
    public void sendGetHttpRequest4(){
        get_semuaData.sendGetHttpRequest4();
    }
    @Then("I received valid HTTP response code 200")
    public void respon200Get(){
        get_semuaData.respon200Get();
    }
    @And("I received empty valid data")
    public void receiveValidDataForDetailUser4(){get_semuaData.validateDataDetailUser4();}




// post
    @Given("I set POST endpoints")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();

    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        post.sendPostHttpRequest();

    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }

    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.validateDatanewUser();

    }

//    negative

    @Given("I set POST endpoints incorrectly")
    public void setPostApiEndpoint1(){
        post.setPostApiEndpoint1();

    }
    @When("I send POST HTTP request1")
    public void sendPostHTTPRequest1(){
        post.sendPostHttpRequest1();

    }

    @Then("I receive valid HTTP response1 code 201")
    public void receiveValid1Http201(){
        post.receiveHttpRespon1seCode201();

    }

    @And("I receive valid data for new user1")
    public void validateDataNewUser1(){
        post.validateDatanewUser1();

    }


//    put
    @Given("I set PUT endpoints")
    public void setPutEndpoint(){
        put.setPutEndpoint();

    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }
    @Then("I receive valid HTTP response12 code 200")
    public void respon200(){
        put.respon200();

    }


    @And("I receive valid data for existing user")
    public void validateDataForExistingUser(){
        put.ValidateDataForExistingUser();

    }

//negative
@Given("I set PUT endpoints incorrectly")
public void setPutEndpointincorrectly(){
    put.setPutEndpointincorrectly();

}

    @When("I send PUT HTTP request1")
    public void sendPutHttpRequest1(){
        put.sendPutHttpRequest1();

    }
    @Then("I receive valid HTTP response100 code 200")
    public void responN200(){
        put.responN200();

    }


    @And("I receive valid data for existing user5")
    public void validateDataForExistingUser1(){
        put.ValidateDataForExistingUser1();

    }

    // delete
    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        delete.setDeleteEndpoint();


    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();

    }

    @Then("I valid HTTP response code 200")
    public void validHttpResponseCode204(){
        delete.validHttpresponseCode204();

    }

    // negative
    @Given("I set DELETE endpoints incorrectly")
    public void setDeleteEndpointincorrectly(){
        delete.setDeleteEndpointincorrectly();


    }
    @When("I send DELETE HTTP request1")
    public void sendDeleteHttpRequest1(){
        delete.sendDeleteHttpRequest1();

    }

    @Then("I receive valid HTTP response1 code 204")
    public void validHttpResponse1Code204(){
        delete.validHttpResponse1Code204();

    }
}

