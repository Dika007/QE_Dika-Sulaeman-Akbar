package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get{
    protected static String url = "https://jsonplaceholder.typicode.com/";


    @Step("I set GET endpoints")
    public String setApiEndpoint() {

        return url + "posts/1";
    }

    @Step("I send GET HTTP request")
    public void sendGetHttpRequest() {
        SerenityRest.given()
                .when()
                .get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail user")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
    }

//negative
    protected static String url2 = "https://jsonplaceholder.typicode.com/";
    @Step("I set the GET endpoint incorrectly")
    public String setApiEndpoint1() {

        return url + "posts/2";
    }

    @Step("I sent an HTTP GET request")
    public void sendGetHttpRequest1() {
        SerenityRest.given()
                .when()
                .get(setApiEndpoint());
    }

    @Step("I received a valid HTTP response code 200")
    public void validateHttpResponseCode200N() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I did not receive valid data for user details")
    public void validateDataDetailUser1() {
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
    }
}

