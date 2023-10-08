package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.CoreMatchers.equalTo;

public class Products {

    //    Get all products
    protected static String urlGetAll = "https://fakestoreapi.com/";

    @Step("I set the endpoint all products")
    public String setApiEndpointGetAll() {

        return urlGetAll + "products";
    }

    @Step("I set http request get all")
    public void sendGetAllHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointGetAll());
    }

    @Step("received a status code response of 200 get all")
    public void receiveValidHttpResponseCodeGetAll() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("response should contain a list of products")
    public void listproduk() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }


    //    Get a single product
    protected static String urlGet = "https://fakestoreapi.com/";


    @Step("I set the endpoint products 1")
    public String setApiEndpoint() {

        return urlGet + "products/1";
    }

    @Step("I set the http request get")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpoint());
    }

    @Step("received a status code 200 response")
    public void receiveValidHttpResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void receiveValidDataForDetailProducts() {
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops")));
    }

    //    Limit results product
    protected static String urllimitproduk = "https://fakestoreapi.com/";

    @Step("I set endpoint Limit results product")
    public String setApiEndpointlimitproduk() {

        return urllimitproduk + "products?limit=5";
    }

    @Step("I set http request get Limit results product")
    public void sendGetHttpRequestlimitproduk() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointlimitproduk());
    }

    @Step("received a status code 200 response Limit results product")
    public void receiveValidHttpResponseCodelimitproduk() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty limit product")
    public void dataresultproduk() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }

    //    Sort results product
    protected static String urlsortproduk = "https://fakestoreapi.com/";

    @Step("I set endpoint Sort results product")
    public String setApiEndpointsortproduk() {

        return urlsortproduk + "products?sort=desc";
    }

    @Step("I set http request get Sort results product")
    public void sendGetHttpRequestsortproduk() {
        SerenityRest.given()
                .when()
                .get(setApiEndpointsortproduk());
    }

    @Step("received a status code 200 response sort results product")
    public void receiveValidHttpResponseCodesortproduk() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Check if data is available or empty sort product")
    public void datasortproduk() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }


    //   Get all categories
    protected static String urlCategories = "https://fakestoreapi.com/";


    @Step("I set the endpoint categories")
    public String setApiEndpoinCategories() {

        return urlCategories + "products/categories";
    }

    @Step("I set the http request get categories")
    public void sendGetHttpRequestCategories() {
        SerenityRest.given()
                .when()
                .get(setApiEndpoinCategories());
    }

    @Step("received a status code response of 200 categories")
    public void receiveValidHttpResponseCodeCategories() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify categories data")
    public void receiveValidDataForCategories() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }


    //    Get products in a specific category
    protected static String urlDetailCategories = "https://fakestoreapi.com/";


    @Step("I set endpoint detail category")
    public String setApiEndpoinDetailCategories() {

        return urlDetailCategories + "products/category/jewelery";
    }

    @Step("I set the http request get detail category")
    public void sendGetHttpRequestDetailCategories() {
        SerenityRest.given()
                .when()
                .get(setApiEndpoinDetailCategories());
    }

    @Step("received a status code 200 response detail category")
    public void receiveValidHttpResponseCodeDetailCategories() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Verify details of category")
    public void receiveValidDataFordetailCategories() {
        then()
                .assertThat()
                .body("size()", greaterThan(0));
    }


    //    Add new product
    protected String urlAdd = "https://fakestoreapi.com/";

    @Step("I set endpoint Add new product")
    public String setPostApiEndpoint() {
        return urlAdd + "products";
    }

    @Step("I set http request post")
    public void sendPostHttpRequestpostproduk() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "test product");
        requestBody.put("price", 13.5F);
        requestBody.put("description", "lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());
    }

    @Step("received response code 201")
    public void receiveValidHttpResponseCode201postproduk() {

        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("verify adding new data")
    public void receiveValidDatapostproduk() {
        restAssuredThat(response -> response.body("'id'", equalTo(21)));
        restAssuredThat(response -> response.body("'title'", equalTo("test product")));
        restAssuredThat(response -> response.body("'price'", equalTo(13.5F)));
        restAssuredThat(response -> response.body("'description'", equalTo("lorem ipsum set")));
        restAssuredThat(response -> response.body("'image'", equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("'category'", equalTo("electronic")));

    }

    //    Update a product put
    protected String urlPut = "https://fakestoreapi.com/";

    @Step("I set endpoint Update a product")
    public String setPutApiEndpoint() {
        return urlPut + "products/7";
    }

    @Step("I set the http request put")
    public void sendPutHttpRequestputproduk() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "test product");
        requestBody.put("price", 13.5F);
        requestBody.put("description", "lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpoint());
    }

    @Step("received response code 200 Update a product")
    public void receiveValidHttpResponseCodeputproduk() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("verify update data put")
    public void receiveValidDataputproduk() {
        restAssuredThat(response -> response.body("'title'", equalTo("test product")));
        restAssuredThat(response -> response.body("'price'", equalTo(13.5F)));
        restAssuredThat(response -> response.body("'description'", equalTo("lorem ipsum set")));
        restAssuredThat(response -> response.body("'image'", equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("'category'", equalTo("electronic")));

    }

    //    Update a product patch
    protected String urlPatch = "https://fakestoreapi.com/";

    @Step("I set endpoint Update a product patch")
    public String setPatchApiEndpoint() {
        return urlPatch + "products/7";
    }

    @Step("I set the http request patch")
    public void sendpatchHttpRequestproduk() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "test product");
        requestBody.put("price", 13.5F);
        requestBody.put("description", "lorem ipsum set");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "electronic");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).patch(setPatchApiEndpoint());
    }

    @Step("received response code 200 Update a product patch")
    public void receiveValidHttpResponseCodepatchproduk() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("verify update data patch")
    public void receiveValidDatapatchproduk() {
        restAssuredThat(response -> response.body("'title'", equalTo("test product")));
        restAssuredThat(response -> response.body("'price'", equalTo(13.5F)));
        restAssuredThat(response -> response.body("'description'", equalTo("lorem ipsum set")));
        restAssuredThat(response -> response.body("'image'", equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("'category'", equalTo("electronic")));

    }

//    Delete a product
    protected String urldelete = "https://fakestoreapi.com/products/6";
    @Step("I set endpoint delete")
    public String setDeleteApiEndpoint(){
        return urldelete;
    }

    @Step("I set the http request delete")
    public void senddeletehHttpRequestproduk(){
        SerenityRest.given().delete(setDeleteApiEndpoint());
    }
    @Step("received response code 204 delete")
    public void receiveValidHttpResponseCodedeleteproduk(){
        restAssuredThat(response -> response.statusCode(204));
    }
}

