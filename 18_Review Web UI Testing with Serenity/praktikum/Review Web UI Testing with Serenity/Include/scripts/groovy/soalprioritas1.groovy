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



class soalprioritas1 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("open website")
	def openwebsite() {
		WebUI.openBrowser('https://www.saucedemo.com/')

		WebUI.maximizeWindow()
	}

	@When("I input (.*) in field username")
	def inputInvalidUsername(String username) {
		WebUI.setText(findTestObject('soalprioritas1/fieldusername'), username)
	}

	@And("I input (.*) in field password")
	def inputInvalidUsername2(String password) {
		WebUI.setText(findTestObject('soalprioritas1/fieldpassword'), password)
	}

	@Then("I able to see alert error")
	def alertError() {
		WebUI.getText(findTestObject('soalprioritas1/wording invalid'))
	}


	@When ("I input valid username")
	def inputValid() {
		WebUI.setText(findTestObject('soalprioritas1/fieldusername'), 'standard_user')
	}
	@And ("I input valid password")
	def inputValid2() {
		WebUI.setText(findTestObject('soalprioritas1/fieldpassword'), 'secret_sauce')
	}
	@Then("I able to see homepage")
	def seeHomePage() {
		WebUI.verifyElementPresent(findTestObject('soalprioritas1/product'), 0)
	}

	@And("I click button login")
	def buttonLogin() {
		WebUI.click(findTestObject('soalprioritas1/buttonlogin'))
	}
}