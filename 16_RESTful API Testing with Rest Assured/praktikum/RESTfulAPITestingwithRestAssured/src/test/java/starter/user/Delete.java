package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set DELETE endpoints")
    public String setDeleteEndpoint(){
        return url + "posts/1";
    }

    @Step("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteEndpoint());
    }
    @Step("I valid HTTP response code 200")
    public void validHttpresponseCode204(){
        restAssuredThat(response -> response.statusCode(200));
    }


//    // negative
    protected String url1 = "https://jsonplaceholder.typicode.com/";
    @Step("I set DELETE endpoints incorrectly")
    public String setDeleteEndpointincorrectly(){
        return url1 + "posts/10";
    }

    @Step("I send DELETE HTTP request1")
    public void sendDeleteHttpRequest1(){
        SerenityRest.given().delete(setDeleteEndpoint());
    }
    @Step("I receive valid HTTP response1 code 204")
    public void validHttpResponse1Code204(){restAssuredThat(response -> response.statusCode(204));}
}
