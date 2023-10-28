package addItems
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class additems {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("open apllication")
	def openaplikasi() {
		Mobile.startApplication('D:\\MBKM\\Mini project\\app-debug.apk', false)
	}

	@When("Click add icon and set name1, quantity1")
	def clickandsetvalid() {
		Mobile.tap(findTestObject('buttontambah'), 0)

		Mobile.tap(findTestObject('Add items/Name'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Add items/Name'), 'uji coba', 0)

		Mobile.tap(findTestObject('Add items/Quantity'), 0)

		Mobile.setText(findTestObject('Add items/Quantity'), '10', 0)
	}

	@And("click button add items")
	def buttonadditems() {
		Mobile.tap(findTestObject('Add items/buttonAdd'), 0)
	}

	@Then("Succes add items")
	def succes() {
		Mobile.getText(findTestObject('Add items/verifyberhasiladditems'), 0)
	}

	//	Negative
	@When("click add icon1 and set(.*),(.*)")
	def clickandsetnotvalid(String name, String quantity) {
		Mobile.tap(findTestObject('buttontambah'), 0)

		Mobile.tap(findTestObject('Add items/Name'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Add items/Name'), name, 0)

		Mobile.tap(findTestObject('Add items/Quantity'), 0)

		Mobile.setText(findTestObject('Add items/Quantity'), quantity, 0)

	}

	@And("click button add items1")
	def buttonadditems1() {
		Mobile.tap(findTestObject('Add items/buttonAdd'), 0)

	}

	@Then("failed add itmes")
	def failed() {
		Mobile.getText(findTestObject('Add items/errorName'), 0)
	}


	@When("click add icon2 and set(.*),(.*)")
	def clickandsetnotvalid2(String name2, String quantity2) {
		Mobile.tap(findTestObject('buttontambah'), 0)

		Mobile.tap(findTestObject('Add items/Name'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Add items/Name'), name2, 0)

		Mobile.tap(findTestObject('Add items/Quantity'), 0)

		Mobile.setText(findTestObject('Add items/Quantity'), quantity2, 0)

	}

	@And("click button add items2")
	def buttonadditems2() {
		Mobile.tap(findTestObject('Add items/buttonAdd'), 0)

	}

	@Then("failed add itmes2")
	def failed2() {
		Mobile.getText(findTestObject('Add items/errorQuantity'), 0)

	}
	
	
//TC8
	@When("click add icon3 and set name3,quantity3")
	def clickandsetnotvalid2() {
		Mobile.tap(findTestObject('buttontambah'), 0)

		Mobile.tap(findTestObject('Add items/Name'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Add items/Name'), 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbb', 0)

		Mobile.tap(findTestObject('Add items/Quantity'), 0)

		Mobile.setText(findTestObject('Add items/Quantity'), '10', 0)

	}

	@And("click button add items3")
	def buttonadditems3() {
		Mobile.tap(findTestObject('Add items/buttonAdd'), 0)

	}

	@Then("success cannot be more than 50")
	def failed3() {
	Mobile.getText(findTestObject('Add items/verifyberhasiladditems'), 0)

	}
	
//	TC9
	@When("Click add icon and set name1, quantity1 and list box")
	def clickandsetnotvalid3() {
		Mobile.tap(findTestObject('buttontambah'), 0)

		Mobile.tap(findTestObject('Add items/Name'), 0, FailureHandling.STOP_ON_FAILURE)

		Mobile.setText(findTestObject('Add items/Name'), 'QE ku', 0)

		Mobile.tap(findTestObject('Add items/Quantity'), 0)

		Mobile.setText(findTestObject('Add items/Quantity'), '10', 0)
		Mobile.tap(findTestObject('Add items/buttton list box'), 0)
		
		Mobile.tap(findTestObject('Add items/meatbutton'), 0)

	}

	@And("click button add items4")
	def buttonadditems4() {
		Mobile.tap(findTestObject('Add items/buttonAdd'), 0)

	}

	@Then("Succes add items4")
	def failed4() {
	Mobile.getText(findTestObject('Add items/verifyberhasiladditems'), 0)

	}

}