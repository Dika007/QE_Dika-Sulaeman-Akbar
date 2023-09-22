package starter.login;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on main page")
    public void onMainPage(){
        System.out.println("I am on main page");
    }
    @Step("I log in using the correct Google account")
    public void loginGoogleaccountcorrect(){
        System.out.println("I log in using the correct Google account");
    }
    @Step("I am on the home page")
    public void onTheHomePage(){
        System.out.println("I am on the home page");
    }

    @Step("I input invalid my username and password")
    public void InputInvalidUserAndPassword(){
        System.out.println("I input invalid my username and password");
    }
    @Step("I click login button")
    public void clickLoginButton(){
        System.out.println("I click login button");
    }
    @Step("I get a notification that the email or password is wrong")
    public void emailorpasswordiswrong(){
        System.out.println("I get a notification that the email or password is wrong");
    }
}