package soalprioritas2
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



class soalprioritas2 {
	// login
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("open website sepulsa")
	def openWebsiteSepulsa() {
		WebUI.openBrowser('https://www.sepulsa.com/signin')

		WebUI.maximizeWindow()
	}


	@When ("I input (.*) in field email")
	def invalid(String email) {
		WebUI.setText(findTestObject('soalprioritas2/fieldemail'), email)
	}
	@And ("I input (.*) in field password1")
	def invalid2(String password1) {
		WebUI.setText(findTestObject('soalprioritas2/fieldpassword'), password1)
	}

	@Then ("I can see the error warning above")
	def errorPesan() {
		WebUI.getText(findTestObject('soalprioritas2/wordinginvalid'))
	}

	@When ("I input email valid")
	def Validemail() {
		WebUI.setText(findTestObject('soalprioritas2/fieldemail'), 'dsa799059@gamail.com')
	}

	@And ("I input password1 valid")
	def Validemail2() {
		WebUI.setText(findTestObject('soalprioritas2/fieldpassword'), 'sepakbola070302')
	}

	@Then ("I can see the home page")
	def KeHomePage() {
		WebUI.getText(findTestObject('soalprioritas2/homepage'))
	}

	@And ("I click button masuk")
	def buttonMasuk() {
		WebUI.click(findTestObject('soalprioritas2/buttonlogin'))
	}





	// pilih produk
	@Given ("open website sepulsa homepage")
	def homepage() {
		WebUI.openBrowser('https://www.sepulsa.com/')
		WebUI.maximizeWindow()
	}
	@When ("I check button lainnya")
	def checkbuttonlainnya() {
		WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihproduk/buttonlainnya'))
	}
	@When ("I check button tagihan")
	def checkbuttontagihan() {
		WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihproduk/bayar tagihan'))
	}
	@When ("I check button pendidikan")
	def checkbuttonpendidikan() {
		WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihproduk/pendidikan'))

	}
	@Then ("I verify all buttons work")
	def buttonwork() {
		WebUI.getText(findTestObject('soalprioritas2/soalprioritas_pilihproduk/verifypendidikan'))

	}


	@Given ("open link website")
	def linkwebsite() {
		WebUI.openBrowser('https://www.sepulsa.com/menu')

		WebUI.maximizeWindow()

	}
	@When ("I check button keuangan")
	def checkbuttonkeuangan() {
		WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihproduk/keuangan'))

	}
	@Then ("there is no transport button")
	def notransportbutton() {
		WebUI.getText(findTestObject('soalprioritas2/soalprioritas_pilihproduk/nobuttontransport'))

	}


	//	pilih metode pembayaran
	@Given ("open link website sepulsa")
	def linkwebsitesepulsa() {
		WebUI.openBrowser('https://www.sepulsa.com/transaction/pulsa')
		WebUI.maximizeWindow()
	}
	@When ("I input no telepon")
	def notelepon() {
		WebUI.setText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/notelepon'), '082240936365')
	}

	@When ("I chose the data package")
	def datapackage() {
		WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/pilihpaket'))

	}
	@When ("I input email")
	def masukanemail(){
		WebUI.setText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/emailuntukpembayaran'), 'dikasa711@gmail.com')

	}
	@When ("I choose the payment method")
	def metodepembayaran() {
		WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/metodepembayaran'))

	}

	@Then ("proses succes")
	def proses() {
		WebUI.getText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/succes'))

	}



	@When ("I input no telepon1")
	def notelepon1() {
		WebUI.setText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/notelepon'), '082240936365')
	}

	@When ("I chose the data package1")
	def datapackage1() {
		WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/pilihpaket'))

	}
	@When ("I input email1")
	def masukanemail1(){
		WebUI.setText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/emailuntukpembayaran'), 'dikasa711@gmail.com')

	}



	@Then ("error metode pembayaran")
	def errorMetodePembayaran() {

		WebUI.getText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/errormetodepembayaran'))

	}





	@When ("I click button bayar")
	def klikbuttonbayar() {
		WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/buttonbayar'))
	}
}