package registrasiScript
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



class Register {

	@Given("I open the application1")
	def OpenAplications1() {
		Mobile.startApplication('D:\\MBKM\\Materi\\22_Mobile Testing\\app.apk', false)
	}
	@When("I click Create one")
	def clickbuttoncreate() {
		Mobile.tap(findTestObject('Registrasi/Registrasi'), 0)
	}

	@And("I set the name email password and confirmed the password correctly")
	def SetNameEmailPasswordAndConfirmPassword() {
		Mobile.setText(findTestObject('Registrasi/NameRegistrasi'), 'dika', 0)
		Mobile.setText(findTestObject('Registrasi/EmailRegistrasi'), 'broaku388@gmail.com', 0)
		Mobile.setText(findTestObject('Registrasi/PasswordRegistrasi'), 'admin123', 0)
		Mobile.setText(findTestObject('Registrasi/ConfirmPasswordRegistrasi'), 'admin123', 0)
	}
	@And("I clicked the register button")
	def buttonregister() {
		Mobile.tap(findTestObject('Registrasi/ButtonRegistrasi'), 0)
	}

	@Then("verify registered successfully")
	def SuccesRegister() {
		Mobile.getText(findTestObject('Registrasi/VerifySuccesRegister'), 0)
		Mobile.closeApplication()
	}

	//	invalid email
	@When("I click Create one1")
	def clickbuttoncreate2() {
		Mobile.tap(findTestObject('Registrasi/Registrasi'), 0)
	}

	@And("I set the (.*), the (.*) as invalid or empty, (.*) and (.*)")
	def invalidemail(String name, String email, String password, String passwordconfirmation) {
		Mobile.setText(findTestObject('Registrasi/NameRegistrasi'), name, 0)
		Mobile.setText(findTestObject('Registrasi/EmailRegistrasi'), email, 0)
		Mobile.setText(findTestObject('Registrasi/PasswordRegistrasi'), password, 0)
		Mobile.setText(findTestObject('Registrasi/ConfirmPasswordRegistrasi'), passwordconfirmation, 0)
	}
	@And("I clicked the register button1")
	def buttonregister2() {
		Mobile.tap(findTestObject('Registrasi/ButtonRegistrasi'), 0)
	}

	@Then("verify registered not valid email")
	def NotvalidemailRegister() {
		Mobile.getText(findTestObject('Registrasi/NotValidEmailRegister'), 0, FailureHandling.STOP_ON_FAILURE)
		Mobile.closeApplication()

	}
}