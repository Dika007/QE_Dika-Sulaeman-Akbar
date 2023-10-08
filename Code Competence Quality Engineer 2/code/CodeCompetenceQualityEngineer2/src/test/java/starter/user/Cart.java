package starter.user;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.CoreMatchers.equalTo;
public class Cart {
    //    Get all carts
    protected static String urlGetallCarts = "https://fakestoreapi.com/";

    @Step("I set endpoint Get all carts")
    public String setApiEndpointGetallCarts() {

        return urlGetallCarts + "carts";
    }

    @Step("I set http request Get all carts")
    public void sendGetallCartsHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetallCarts());
    }

    @Step("received a status code response of 200 Get all carts")
    public void receiveValidHttpResponseCodeGetallCarts() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("verify get all cart data")
    public void allCarts() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //      Get a single cart
    protected static String urlGetCartsSingle = "https://fakestoreapi.com/";

    @Step("I set endpoint Get a single cart")
    public String setApiEndpointGetUserCartsSingle() {

        return urlGetCartsSingle + "carts/5";
    }

    @Step("I set the http request get single cart")
    public void sendGetUserCartsSingleHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetUserCartsSingle());
    }

    @Step("received a status code 200 response Get a single cart")
    public void receiveValidHttpResponseCodeGetUserCartsSingle() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify details of carts 5")
    public void UserCarts5() {
        restAssuredThat(response -> response.body("'id'", equalTo(5)));
        restAssuredThat(response -> response.body("'userId'", equalTo(3)));
        restAssuredThat(response -> response.body("'date'", equalTo("2020-03-01T00:00:00.000Z")));
    }

    //    Limit results cart
    protected static String urllimitcart = "https://fakestoreapi.com/";

    @Step("I set endpoint Limit results cart")
    public String setApiEndpointGetlimitcart() {

        return urllimitcart + "carts?limit=5";
    }

    @Step("I set http request get Limit results cart")
    public void sendGetlimitcartHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetlimitcart());
    }

    @Step("received a status code 200 response Limit results cart")
    public void receiveValidHttpResponseCodeGetlimitcart() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty limit cart")
    public void limitcart() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //    Sort results cart
    protected static String urlsortcart = "https://fakestoreapi.com/";

    @Step("I set endpoint Sort results cart")
    public String setApiEndpointGetsortcart() {

        return urlsortcart + "carts?sort=desc";
    }

    @Step("I set http request get Sort results cart")
    public void sendGetsortcartHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetsortcart());
    }

    @Step("received a status code 200 response sort results cart")
    public void receiveValidHttpResponseCodeGetsortcart() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty sort cart")
    public void sortcart() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //    Get carts in a date range
    protected static String urldaterange = "https://fakestoreapi.com/";

    @Step("I set endpoint carts in a date range")
    public String setApiEndpointGetdaterange() {

        return urldaterange + "carts?startdate=2019-12-10&enddate=2020-10-10";
    }

    @Step("I set the http request get date range")
    public void sendGetdatarangeHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetdaterange());
    }

    @Step("received response code 200 date range")
    public void receiveValidHttpResponseCodeGetdatarange() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty date range")
    public void datarange() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //    Get user carts
    protected static String urlGetuserCarts = "https://fakestoreapi.com/";

    @Step("I set endpoint user carts")
    public String setApiEndpointGetUserCarts() {

        return urlGetuserCarts + "carts/user/2";
    }

    @Step("I set the http request get user carts")
    public void sendGetUserCartsHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetUserCarts());
    }

    @Step("received response code 200 user carts")
    public void receiveValidHttpResponseCodeGetUserCarts() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("verify get user cart data")
    public void UserCarts() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //    Add a new product in cart
    protected String urlAddCart = "https://fakestoreapi.com/";

    @Step("I set endpoint Add new product")
    public String setApiEndpointPostCarts() {
        return urlAddCart + "carts";
    }

    @Step("I set http request post")
    public void sendPostCartsHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 5);
        requestBody.put("date", 2020-02-03);
        requestBody.put("products", "[{productId:5,quantity:1},{productId:1,quantity:5}]");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpointPostCarts());
    }

    @Step("received response code 201")
    public void receiveValidHttpResponseCodepostCarts() {

        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("verify adding new data")
    public void postCarts() {
        restAssuredThat(response -> response.body("'userId'", equalTo(5)));
        restAssuredThat(response -> response.body("'date'", equalTo(2020-02-03)));
        restAssuredThat(response -> response.body("'products'", equalTo("[{productId:5,quantity:1},{productId:1,quantity:5}]")));

    }

    //    Update a product put in cart
    protected String urlPutCart = "https://fakestoreapi.com/";

    @Step("I set endpoint put in cart")
    public String setApiEndpointPutCarts() {
        return urlPutCart + "carts/7";
    }

    @Step("I set the http request put cart")
    public void sendPutCartsHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 3);
        requestBody.put("date", 2019-12-10);
        requestBody.put("products", "[{productId:1,quantity:3}]");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setApiEndpointPutCarts());
    }

    @Step("received response code 200 put cart")
    public void receiveValidHttpResponseCodeputCarts() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("verify put cart data")
    public void putCarts() {
        restAssuredThat(response -> response.body("'userId'", equalTo(3)));
        restAssuredThat(response -> response.body("'date'", equalTo(2019-12-10)));
        restAssuredThat(response -> response.body("'products'", equalTo("[{productId:1,quantity:3}]")));
    }


    //    Update a product patch in cart
    protected String urlPatchCart = "https://fakestoreapi.com/";

    @Step("I set endpoint patch in cart")
    public String setApiEndpointPatchCarts() {
        return urlPatchCart + "carts/7";
    }

    @Step("I set the http request patch cart")
    public void sendPatchCartsHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId", 3);
        requestBody.put("date", 2019-12-10);
        requestBody.put("products", "[{productId:1,quantity:3}]");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).patch(setApiEndpointPatchCarts());
    }

    @Step("received response code 200 patch cart")
    public void receiveValidHttpResponseCodepatchCarts() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("verify patch cart data")
    public void patchCarts() {
        restAssuredThat(response -> response.body("'userId'", equalTo(3)));
        restAssuredThat(response -> response.body("'date'", equalTo(2019-12-10)));
        restAssuredThat(response -> response.body("'products'", equalTo("[{productId:1,quantity:3}]")));
    }

    //    Delete a cart
    protected String urldeleteCart = "https://fakestoreapi.com/";
    @Step("I set endpoint delete cart")
    public String setApiEndpointDeleteCarts(){
        return urldeleteCart + "carts/6";
    }

    @Step("I set the http request delete cart")
    public void sendDeleteCartsHttpRequest(){
        SerenityRest.given().delete(setApiEndpointDeleteCarts());
    }
    @Step("received response code 204 delete cart")
    public void receiveValidHttpResponseCodedeleteCarts(){
        restAssuredThat(response -> response.statusCode(204));
    }
}
