package iconALTASHOP
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



class IconALTASHOP {
	@Given("Navigate to the register page")
	def navigasikeregister() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/register')

		WebUI.maximizeWindow()
	}

	@When("click icon ALTASHOP")
	def icon() {
		WebUI.click(findTestObject('Icon ALTASHOP/icon ALTASHOP'))
	}

	@Then("Successfully moved to the ALTASHOP home page")
	def succesmove() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('Icon ALTASHOP/icon ALTASHOP'))
	}


	//	login
	@Given("Navigate to the login page")
	def navigasikelogin() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/login')

		WebUI.maximizeWindow()
	}

	@When("click icon ALTASHOP1")
	def icon1() {
		WebUI.click(findTestObject('Icon ALTASHOP/icon ALTASHOP'))


	}

	@Then("Successfully moved to the ALTASHOP home page1")
	def succesmove1() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('Icon ALTASHOP/icon ALTASHOP'))
	}


	//	cart
	@Given("Navigate to the cart page")
	def navigasikecart() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/order')

		WebUI.maximizeWindow()
	}

	@When("click icon ALTASHOP2")
	def icon2() {
		WebUI.click(findTestObject('Icon ALTASHOP/icon ALTASHOP'))


	}

	@Then("Successfully moved to the ALTASHOP home page2")
	def succesmove2() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('Icon ALTASHOP/icon ALTASHOP'))
	}


	//	cart
	@Given("login first5")
	def login() {
		WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('view transactions/iconProfile'))

		WebUI.click(findTestObject('view transactions/transaksi'))
	}

	@When("click icon ALTASHOP3")
	def icon3() {
		WebUI.click(findTestObject('Icon ALTASHOP/icon ALTASHOP'))


	}

	@Then("Successfully moved to the ALTASHOP home page4")
	def succesmove3() {
		WebUI.takeFullPageScreenshot()
		WebUI.getText(findTestObject('Icon ALTASHOP/icon ALTASHOP'))
	}
}