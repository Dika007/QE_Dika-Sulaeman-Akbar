package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Post {
    protected String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set POST endpoints")
    public String setPostApiEndpoint(){
        return url + "posts";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "aku");
        requestBody.put("body", "kamu");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for new user")
    public void validateDatanewUser(){
        restAssuredThat(response -> response.body("'title'", equalTo("aku")));
        restAssuredThat(response -> response.body("'body'", equalTo("kamu")));
    }


//    negative
    protected String url1 = "https://jsonplaceholder.typicode.com/";

    @Step("I set POST endpoints incorrectly")
    public String setPostApiEndpoint1(){
        return url1 + "posts/101";
    }

    @Step("I send POST HTTP request1")
    public void sendPostHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "aku1");
        requestBody.put("body", "kamu1");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response1 code 201")
    public void receiveHttpRespon1seCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for new user1")
    public void validateDatanewUser1(){
        restAssuredThat(response -> response.body("'title'", equalTo("aku1")));
        restAssuredThat(response -> response.body("'body'", equalTo("kamu1")));
    }
}
