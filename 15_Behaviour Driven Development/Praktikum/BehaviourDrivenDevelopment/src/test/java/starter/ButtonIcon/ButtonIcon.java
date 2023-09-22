package starter.ButtonIcon;

import net.thucydides.core.annotations.Step;
public class ButtonIcon {
    @Step("I am on main page")
    public void onMainPage(){
        System.out.println("I am on main page");
    }
    @Step("I click icon button article")
    public void clickButton(){
        System.out.println("I click icon button article");
    }
    @Step("I am to navigate article page")
    public void navigateArticlePage(){
        System.out.println("I am to navigate article page");
    }

    @Step("I click icon button person")
    public void clickButtoniconperson(){
        System.out.println("I click icon button person");
    }
    @Step("I am to navigate person page")
    public void navigatePersonPage(){
        System.out.println("I am to navigate person page");
    }

    @Step("I click icon button learning")
    public void clickButtoniconlearning(){
        System.out.println("I click icon button learning");
    }
    @Step("I am to navigate learning page")
    public void navigateLearningPage(){
        System.out.println("I am to navigate learning page");
    }

    @Step("I click icon button work")
    public void clickButtoniconwork(){
        System.out.println("I click icon button work");
    }
    @Step("I am to navigate work page")
    public void navigateWorkPage(){
        System.out.println("I am to navigate work page");
    }
    
}
