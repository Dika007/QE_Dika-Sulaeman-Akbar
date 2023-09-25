package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
public class Get_SemuaData {
    protected static String url = "https://jsonplaceholder.typicode.com/";


    @Step("I set the GET endpoint correctly")
    public String setApiEndpoint2() {

        return url + "posts";
    }

    @Step("I sent the HTTP GET request correctly")
    public void sendGetHttpRequest2() {
        SerenityRest.given()
                .when()
                .get(setApiEndpoint2());
    }

    @Step("I received a valid HTTP response code 200 correctly")
    public void validrespon() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received valid data for the user")
    public void validateDataDetailUser2() {
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));

    }

//negative
    protected static String url1 = "https://jsonplaceholder.typicode.com/";


    @Step("I set the GET endpoint1 correctly")
    public String setApiEndpoint4() {

        return url1 + "posts";
    }

    @Step("I sent the HTTP GET request1 correctly")
    public void sendGetHttpRequest4() {
        SerenityRest.given()
                .when()
                .get(setApiEndpoint2());
    }

    @Step("I received valid HTTP response code 200")
    public void respon200Get() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received empty valid data")
    public void validateDataDetailUser4() {


    }

}
