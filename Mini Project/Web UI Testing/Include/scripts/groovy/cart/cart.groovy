package cart
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



class cart {
	@Given("set login first")
	def setLogin() {
		WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("add product")
	def setaddproduct() {
		WebUI.click(findTestObject('add product/ButtonBeli'))
	}
	@And("click icon cart2  and click button plus")
	def clickbuttoncart() {
		WebUI.click(findTestObject('add product/cart'))

		WebUI.click(findTestObject('Cart/ButtonPlus'))
	}

	@Then("succes")
	def succes() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('Cart/verifyjumlahjadi2'))
	}


	@When("add products1")
	def setaddproduct1() {
		WebUI.click(findTestObject('add product/ButtonBeli'))
	}
	@And("click icon cart3  and click button min")
	def clickbuttoncart1() {
		WebUI.click(findTestObject('add product/cart'))

		WebUI.click(findTestObject('Cart/ButtonPlus'))

		WebUI.click(findTestObject('Cart/ButtonMin'))
	}

	@Then("succes reduce")
	def succesreduce() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('Cart/verifyjumlahjadi1'))
	}

	@When("add products2")
	def setaddproduct2() {
		WebUI.click(findTestObject('add product/ButtonBeli'))
	}
	@And("click icon cart4  and click button min to nol")
	def clickbuttoncart2() {
		WebUI.click(findTestObject('add product/cart'))

		WebUI.click(findTestObject('Cart/ButtonMin'))
	}

	@Then("displays an empty product notification")
	def emptyproduct() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('Cart/kosong'))
	}
}