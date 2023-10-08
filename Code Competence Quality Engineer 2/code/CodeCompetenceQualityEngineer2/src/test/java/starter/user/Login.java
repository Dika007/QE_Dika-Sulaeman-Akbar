package starter.user;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.CoreMatchers.equalTo;
public class Login {
    //    User login
    protected String urllogin = "https://fakestoreapi.com/";

    @Step("I set endpoint login")
    public String setApiEndpointlogin() {
        return urllogin + "auth/login";
    }

    @Step("I set the http request post login")
    public void sendloginHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpointlogin());
    }

    @Step("received response code 200 post login")
    public void receiveValidHttpResponseCodelogin() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("successful login")
    public void login() {
        restAssuredThat(response -> response.body("'token'", equalTo("eyJhbGciOiJIUzI1NiIsInR")));
    }
}
