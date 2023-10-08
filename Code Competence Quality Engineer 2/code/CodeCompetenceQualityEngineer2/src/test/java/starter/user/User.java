package starter.user;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.CoreMatchers.equalTo;
public class User {
    //    Get all users
    protected static String urlGetallUsers = "https://fakestoreapi.com/";

    @Step("I set endpoint all users")
    public String setApiEndpointGetallUsers() {

        return urlGetallUsers + "users";
    }

    @Step("I set the http request get all users")
    public void sendGetallUsersHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetallUsers());
    }

    @Step("received response code 200 all users")
    public void receiveValidHttpResponseCodeGetallIUsers() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty user")
    public void allUsers() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //      Get a single user
    protected static String urlGetSingleUsers = "https://fakestoreapi.com/";

    @Step("I set endpoint single users")
    public String setApiEndpointGetsingleUsers() {

        return urlGetSingleUsers + "users/1";
    }

    @Step("I set the http request get single users")
    public void sendGetsingleUsersHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetsingleUsers());
    }

    @Step("received response code 200 single user")
    public void receiveValidHttpResponseCodeGetseingleIUsers() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("verify user data details")
    public void SingleUsers() {
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'email'", equalTo("john@gmail.com")));
        restAssuredThat(response -> response.body("'username'", equalTo("johnd")));
        restAssuredThat(response -> response.body("'password'", equalTo("m38rmF$")));

    }

    //      Limit results Users
    protected static String urllimitUsers = "https://fakestoreapi.com/";

    @Step("I set endpoint Limit results Users")
    public String setApiEndpointGetlimitUsers() {

        return urllimitUsers + "users?limit=5";
    }

    @Step("I set http request get Limit results users")
    public void sendGetlimitUsersHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetlimitUsers());
    }

    @Step("received a status code 200 response Limit results users")
    public void receiveValidHttpResponseCodeGetlimitIUsers() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty limit users")
    public void limitUsers() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //      Sort results users
    protected static String urlsortUsers = "https://fakestoreapi.com/";

    @Step("I set endpoint Sort results users")
    public String setApiEndpointGetsortUsers() {

        return urlsortUsers + "users?sort=desc";
    }

    @Step("I set http request get Sort results user")
    public void sendGetsortUsersHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetsortUsers());
    }

    @Step("received a status code 200 response sort results user")
    public void receiveValidHttpResponseCodeGetsortIUsers() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty sort users")
    public void sortUsers() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }


    //    Add a new user

    protected String urlAddUsers = "https://fakestoreapi.com/";

    @Step("I set endpoint new data users")
    public String setApiEndpointPostUsers() {
        return urlAddUsers + "users";
    }

    @Step("I set the http request post new users")
    public void sendPostUsersHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "johnd");
        requestBody.put("password", "m38rmF$");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpointPostUsers());
    }

    @Step("received response code 201 data new users")
    public void receiveValidHttpResponseCodePostUsers() {

        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("verify post data users")
    public void PostUsers() {
        restAssuredThat(response -> response.body("'username'", equalTo("johnd")));
        restAssuredThat(response -> response.body("'password'", equalTo("m38rmF$")));

    }

    //    Update a users put
    protected String urlPutUsers = "https://fakestoreapi.com/";

    @Step("I set enpoint put users")
    public String setApiEndpointPutUsers() {
        return urlPutUsers + "users/7";
    }

    @Step("I set the http request put users")
    public void sendPutUsersHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "johnd");
        requestBody.put("password", "m38rmF$");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setApiEndpointPutUsers());
    }

    @Step("received response code 200 put users")
    public void receiveValidHttpResponseCodePutUsers() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("verify put data users")
    public void PutUsers() {
        restAssuredThat(response -> response.body("'username'", equalTo("johnd")));
        restAssuredThat(response -> response.body("'password'", equalTo("m38rmF$")));
    }


    //Update a users patch

    protected String urlPatchUsers = "https://fakestoreapi.com/";

    @Step("I set endpoint patch in cart")
    public String setApiEndpointPatchUsers() {
        return urlPatchUsers + "carts/7";
    }

    @Step("I set the http request patch cart")
    public void sendPatchUsersHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "johnd");
        requestBody.put("password", "m38rmF$");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).patch(setApiEndpointPatchUsers());
    }

    @Step("received response code 200 patch cart")
    public void receiveValidHttpResponseCodePatchUsers() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty patch users")
    public void PatchUsers() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //    Delete a user
    protected String urldeleteCart = "https://fakestoreapi.com/";
    @Step("I set endpoint delete users")
    public String setApiEndpointDeleteUsers(){
        return urldeleteCart + "users/6";
    }

    @Step("I set the http request delete users")
    public void sendDeleteUsersHttpRequest(){
        SerenityRest.given().delete(setApiEndpointDeleteUsers());
    }
    @Step("received response code 204 delete users")
    public void receiveValidHttpResponseCodeDeleteUsers(){
        restAssuredThat(response -> response.statusCode(204));
    }
}
