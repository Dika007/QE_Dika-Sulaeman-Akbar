package login
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



class login {
	@Given("set endpoint Login")
	def setendpointlogin() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')

		WebUI.maximizeWindow()
	}

	@When("set the correct login")
	def dataloginvalid() {
		WebUI.setText(findTestObject('Login/textfieldEmail'), 'akuinisiapa@gmail.com')

		WebUI.setText(findTestObject('Login/textfieldPassword'), 'admin123')
	}
	@And("click button login")
	def clickbuttonlogin() {
		WebUI.click(findTestObject('Login/buttonLogin'))
	}

	@Then("Login Success")
	def loginsucces() {
		WebUI.takeFullPageScreenshot()

		WebUI.getText(findTestObject('Login/verifyberhasil'))
	}

	//	Negatif
	@When("set (.*) and (.*)")
	def datalogininvalid(String email, String password) {
		WebUI.setText(findTestObject('Login/textfieldEmail'), email)

		WebUI.setText(findTestObject('Login/textfieldPassword'), password)

	}
	@And("click button login1")
	def clickbuttonlogin1() {
		WebUI.click(findTestObject('Login/buttonLogin'))
	}

	@Then("Login failed")
	def loginfailed() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('Login/errorTanpaEmail'))

		WebUI.getText(findTestObject('Login/errorTanpaPassword'))

		WebUI.getText(findTestObject('Login/errorEmailBelumTerdaftar'))

		WebUI.getText(findTestObject('Login/errorSalahPassword'))




	}


}