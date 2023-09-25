package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
public class Put {
    protected String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set PUT endpoints")
    public String setPutEndpoint(){
        return url + "posts/1";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "aku12");
        requestBody.put("body", "akuganteng12");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void respon200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for existing user")
    public void ValidateDataForExistingUser(){
        restAssuredThat(response -> response.body("'title'", equalTo("aku12")));
        restAssuredThat(response -> response.body("'body'", equalTo("akuganteng12")));
    }

    protected String url1 = "https://jsonplaceholder.typicode.com/";

    @Step("I set PUT endpoints")
    public String setPutEndpointincorrectly(){
        return url1 + "posts/100";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest1(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "aku123");
        requestBody.put("body", "akuganteng123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoint());
    }
    @Step("I receive valid HTTP response code 200")
    public void responN200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for existing user")
    public void ValidateDataForExistingUser1(){
        restAssuredThat(response -> response.body("'title'", equalTo("aku123")));
        restAssuredThat(response -> response.body("'body'", equalTo("akuganteng123")));
    }


}
