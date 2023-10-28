package addproduct
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



class addproduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("login first1")
	def loginfirst() {
		WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("click button buy")
	def clickbuttonbuy() {
		WebUI.click(findTestObject('add product/ButtonBeli'))
	}

	@And("click icon cart")
	def clickiconcart() {
		WebUI.click(findTestObject('add product/cart'))
	}

	@Then("succes add 1 product")
	def succesadd() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('add product/VerifyAdaProduct'), FailureHandling.STOP_ON_FAILURE)
	}

	//	Negatif
	@When("double click button buy")
	def clickbuttonbuy1() {
		WebUI.doubleClick(findTestObject('add product/ButtonBeli'))
	}

	@And("click icon cart1")
	def clickiconcart1() {
		WebUI.click(findTestObject('add product/cart'))
	}

	@Then("succes add more than 1 product")
	def succesaddmorethan1() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('add product/VerifyAdaProduct'), FailureHandling.STOP_ON_FAILURE)
	}
}