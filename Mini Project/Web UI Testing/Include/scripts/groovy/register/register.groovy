package register
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



class register {
	@Given("Set endpoint register")
	def endpointregister() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')

		WebUI.maximizeWindow()
	}

	@When("set the correct")
	def datavalid() {
		WebUI.setText(findTestObject('Register/textfieldNamaLengkap'), 'Dika sa')

		WebUI.setText(findTestObject('Register/testfieldEmail'), 'akuinisiapa100@gmail.com')

		WebUI.setText(findTestObject('Register/textfieldPassword'), 'admin123')
	}

	@And("click button register")
	def buttonregister() {
		WebUI.click(findTestObject('Register/ButtonRegister'))
	}

	@Then("registration success")
	def succes() {
		WebUI.takeFullPageScreenshot()

		WebUI.getText(findTestObject('Register/VerifyBerhasil'))
	}



	@When("set(.*)and(.*)and(.*)")
	def datavalid(String fullname, String email, String password) {
		WebUI.setText(findTestObject('Register/textfieldNamaLengkap'), fullname)

		WebUI.setText(findTestObject('Register/testfieldEmail'), email)

		WebUI.setText(findTestObject('Register/textfieldPassword'), password)
	}

	@And("click button register1")
	def buttonregister1() {
		WebUI.click(findTestObject('Register/ButtonRegister'))
	}

	@Then("failed to register")
	def fail() {
		WebUI.takeFullPageScreenshot()

		WebUI.verifyElementPresent(findTestObject('Register/alerterror'), 0)
	}
}