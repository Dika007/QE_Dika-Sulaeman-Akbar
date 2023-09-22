package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ButtonIcon.ButtonIcon;
import starter.ButtonIconSepulsa.ButtonIconSepulsa;

public class ButtonIconSepulsaAndLinkedinSteps {

    @Steps
    ButtonIcon buttonIcon;

    @Steps
    ButtonIconSepulsa buttonIconSepulsa;

    @Given("I am on the main page")
    public void onMainPage(){
        buttonIcon.onMainPage();
    }
    @When("I click icon button article")
    public void clickButton(){buttonIcon.clickButton();
    }
    @Then("I am to navigate article page")
    public void navigateArticlePage(){
        buttonIcon.navigateArticlePage();
    }

    @When("I click icon button person")
    public void clickButtoniconperson(){buttonIcon.clickButtoniconperson();
    }
    @Then("I am to navigate person page")
    public void navigatePersonPage(){
        buttonIcon.navigatePersonPage();
    }

    @When("I click icon button learning")
    public void clickButtoniconlearning(){buttonIcon.clickButtoniconlearning();
    }
    @Then("I am to navigate learning page")
    public void navigateLearningPage(){
        buttonIcon.navigateLearningPage();
    }

    @When("I click icon button work")
    public void clickButtoniconwork(){buttonIcon.clickButtoniconwork();
    }
    @Then("I am to navigate work page")
    public void navigateWorkPage(){
        buttonIcon.navigateWorkPage();
    }


//SEPULSA

    @When("I click icon button credit")
    public void clickButtonCredit(){buttonIconSepulsa.clickButtonCredit();
    }
    @Then("I am to navigate credit page")
    public void navigateCreditPage(){
        buttonIconSepulsa.navigateCreditPage();
    }

    @When("I click icon button voucher")
    public void clickButtonVoucher(){buttonIconSepulsa.clickButtonVoucher();
    }
    @Then("I am to navigate voucher page")
    public void navigateVoucherPage(){
        buttonIconSepulsa.navigateVoucherPage();
    }

    @When("I click icon button PLN electricity")
    public void clickButtonPLNelectricity(){buttonIconSepulsa.clickButtonPLNelectricity();
    }
    @Then("I am to navigate PLN electricity page")
    public void navigatePLNPage(){
        buttonIconSepulsa.navigatePLNPage();
    }

    @When("I click icon button data package")
    public void clickButtondatapackage(){buttonIconSepulsa.clickButtondatapackage();
    }
    @Then("I am to navigate data package page")
    public void navigateDataPage(){
        buttonIconSepulsa.navigateDataPage();
    }


    @When("I click icon button PDAM")
    public void clickButtonPDAM(){buttonIconSepulsa.clickButtonPDAM();
    }
    @Then("I am to navigate PDAM page")
    public void navigatePDAMPage(){
        buttonIconSepulsa.navigatePDAMPage();
    }

    @When("I click icon button Electronic Money")
    public void clickButtonElectronicMoney(){buttonIconSepulsa.clickButtonElectronicMoney();
    }
    @Then("I am to navigate Electronic Money page")
    public void navigateElectronicMoneyPage(){
        buttonIconSepulsa.navigateElectronicMoneyPage();
    }


    @When("I click icon button other")
    public void clickButtonother(){buttonIconSepulsa.clickButtonother();
    }
    @Then("I am to navigate other page")
    public void navigateotherPage(){
        buttonIconSepulsa.navigateotherPage();
    }




}
