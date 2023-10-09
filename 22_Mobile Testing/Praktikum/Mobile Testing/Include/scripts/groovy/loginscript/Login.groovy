package loginscript
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



class Login {

	//	login succes
	@Given("I open the application")
	def openaplication() {
		Mobile.startApplication('D:\\MBKM\\Materi\\22_Mobile Testing\\app.apk', false)
	}

	@When("I fill in my email and password correctly")
	def SetEmailandPassword() {
		Mobile.setText(findTestObject('Login/EmailLogin'), 'broaku388@gmail.com', 0)
		Mobile.setText(findTestObject('Login/PasswordLogin'), 'admin123', 0)
	}
	@And ("I click button login")
	def buttonLogin() {
		Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)
	}
	@Then("I successfully logged in")
	def successLogin() {

		Mobile.getText(findTestObject('Login/VerifysuccesLogin'), 0)
		Mobile.closeApplication()

	}

	//	Login failed by entering the wrong email or password

	@When("I entered my (.*) or (.*) incorrectly")
	def SetEmailandPasswordincorrectly(String email, String password) {
		Mobile.setText(findTestObject('Login/EmailLogin'), email, 0)
		Mobile.setText(findTestObject('Login/PasswordLogin'), password, 0)
	}
	@And ("I click button login failed")
	def buttonLoginFailed() {
		Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)
	}
	@Then("verify wrong email or password")
	def WrongLogin() {
		Mobile.getText(findTestObject('Login/WrongEmailOrPassword'), 0)
		Mobile.closeApplication()

	}

	//	login fails when email is empty or email format is not correct

	@When("I entered an empty or incorrectly formatted (.*) and I entered a (.*)")
	def SetEmailNotValid(String email, String password) {
		Mobile.setText(findTestObject('Login/EmailLogin'), email, 0)
		Mobile.setText(findTestObject('Login/PasswordLogin'), password, 0)
	}
	@And ("I click button login failed email")
	def buttonLoginFailedEmail() {
		Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)
	}
	@Then("verify email not valid")
	def EmailNotValidLogin() {
		Mobile.getText(findTestObject('Login/NotValidEmail'), 0)
		Mobile.closeApplication()

	}
}