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



class transaksi {
	// TC1
	@Given("User clicks endpoint register")
	def endpointRegister() {
		WebUI.openBrowser('https://alta-shop.vercel.app/auth/register')
	}

	@When("User sets full name email and password")
	def setbenar() {
		WebUI.setText(findTestObject('namalenkapregistrasi'), 'dikasa')

		WebUI.setText(findTestObject('Register/emailregister'), 'siapaakuhhsih@gmail.com')

		WebUI.setText(findTestObject('passwordregister'), 'siapaaku')

	}
	@And("The user clicks the register button")
	def buttonregister() {
		WebUI.click(findTestObject('Register/buttonregister'))
	}
	@Then("registration successful")
	def registersukses() {
		WebUI.getText(findTestObject('Register/berhasilRegister'))

	}

	// TC2,TC3,TC4
	@When("User set(.*)and(.*)and(.*)")
	def setsalahnameemaildanpassword(String fullname, String email, String password) {
		WebUI.setText(findTestObject('namalenkapregistrasi'), fullname)

		WebUI.setText(findTestObject('Register/emailregister'), email)

		WebUI.setText(findTestObject('passwordregister'), password)

	}
	@And("The user clicks the register button1")
	def buttonregisterTC2sampai4() {
		WebUI.click(findTestObject('Register/buttonregister'))
	}
	@Then("displays a notification that the full name must be filled in")
	def notifikasifullnameemailpassword() {
		WebUI.verifyElementPresent(findTestObject('verifyelementkosong'), 0)

	}

	//TC5
	@When("User set email as broaku338gmail.com")
	def formatemailsalah() {
		WebUI.setText(findTestObject('namalenkapregistrasi'), 'aku')

		WebUI.setText(findTestObject('Register/emailregister'), 'broaku338gmail.com')

		WebUI.setText(findTestObject('passwordregister'), 'admin123')

	}
	@And("The user clicks the register button2")
	def buttonregisterTC5() {
		WebUI.click(findTestObject('Register/buttonregister'))
	}
	@Then("displays a notification that the email format is incorrect")
	def notifikasiformatemail() {
		WebUI.verifyElementPresent(findTestObject('verifyelementkosong'), 0)

	}

	//TC6
	@When("User set email as broaku338at")
	def formatemailsalah2() {
		WebUI.setText(findTestObject('namalenkapregistrasi'), 'aku')

		WebUI.setText(findTestObject('Register/emailregister'), 'broaku338gmail.com')

		WebUI.setText(findTestObject('passwordregister'), 'admin123')

	}
	@And("The user clicks the register button3")
	def buttonregisterTC6() {
		WebUI.click(findTestObject('Register/buttonregister'))
	}
	@Then("displays a notification that the email format is incorrect2")
	def notifikasiformatemail2() {
		WebUI.verifyElementPresent(findTestObject('verifyelementkosong'), 0)

	}

	//TC7
	@Given("The user clicks on the endpoint login")
	def endpointLogin() {
		WebUI.openBrowser('https://alta-shop.vercel.app/auth/login')
	}

	@When("User sets email as broaku338@gmail.com and User sets password with admin123")
	def setbenarLogin() {
		WebUI.setText(findTestObject('Fitur transaksi/email'), 'dsa799059@gmail.com')

		WebUI.setText(findTestObject('Fitur transaksi/password'), 'sepakbola070302')



	}
	@And("User clicks the login button")
	def buttonLogin() {
		WebUI.click(findTestObject('Fitur transaksi/buttonlogin'))
	}
	@Then("successful login")
	def Loginsukses() {
		WebUI.verifyElementPresent(findTestObject('Fitur transaksi/berhasilLogin'), 0)

	}

	//TC8
	@Given("User has logged in")
	def SudahLogin() {
		WebUI.openBrowser('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Fitur transaksi/email'), 'dsa799059@gmail.com')
		WebUI.setText(findTestObject('Fitur transaksi/password'), 'sepakbola070302')
		WebUI.click(findTestObject('Fitur transaksi/buttonlogin'))
		WebUI.verifyElementPresent(findTestObject('Fitur transaksi/berhasilLogin'), 0)
	}

	@When("User clicks details")
	def buttondetail() {
		WebUI.click(findTestObject('Fitur transaksi/detailproduct'))
	}
	@Then("managed to see product details")
	def seeproductdetail() {
		WebUI.getText(findTestObject('Fitur transaksi/berhasillihatdetail'))

	}

	//TC9
	@Given("User has logged in2")
	def SudahLogin2() {
		WebUI.openBrowser('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Fitur transaksi/email'), 'dsa799059@gmail.com')
		WebUI.setText(findTestObject('Fitur transaksi/password'), 'sepakbola070302')
		WebUI.click(findTestObject('Fitur transaksi/buttonlogin'))
		WebUI.verifyElementPresent(findTestObject('Fitur transaksi/berhasilLogin'), 0)
	}
	@When("The user makes a purchase of the product")
	def beli() {
		WebUI.click(findTestObject('Fitur transaksi/buttonBeli'))

		WebUI.verifyElementPresent(findTestObject('Fitur transaksi/elementJikaAdaProduk'), 0)

		WebUI.click(findTestObject('Fitur transaksi/buttonKeranjang'))
		WebUI.click(findTestObject('Fitur transaksi/ButtonBayar'))

		WebUI.getText(findTestObject('Fitur transaksi/verifyTransaksi'))



	}
	@And("The user returns to the home page")
	def kembalikemuhome() {
		WebUI.click(findTestObject('Fitur transaksi/KembaliKehome'))
	}
	@And("The user clicks on the details of the product that has been purchased")
	def buttondetailproduct() {
		WebUI.click(findTestObject('Fitur transaksi/detailproduct'))
	}
	@And("User adds or subtracts 1 star from the product")
	def bintang() {
		WebUI.click(findTestObject('Fitur transaksi/berkurangbintang'))

		WebUI.click(findTestObject('Fitur transaksi/bertambahbintang'))
	}
	@Then("The stars on the product change according to the user's settings")
	def sukses() {
		WebUI.verifyElementPresent(findTestObject('Fitur transaksi/Jumlahbintang'), 0)

	}

	//	TC10
	@Given("User has logged in3")
	def SudahLogin3() {
		WebUI.openBrowser('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Fitur transaksi/email'), 'dsa799059@gmail.com')
		WebUI.setText(findTestObject('Fitur transaksi/password'), 'sepakbola070302')
		WebUI.click(findTestObject('Fitur transaksi/buttonlogin'))
		WebUI.verifyElementPresent(findTestObject('Fitur transaksi/berhasilLogin'), 0)
	}
	@When("Users make product purchases")
	def beli1() {
		WebUI.click(findTestObject('Fitur transaksi/buttonBeli'))

		WebUI.verifyElementPresent(findTestObject('Fitur transaksi/elementJikaAdaProduk'), 0)

		WebUI.click(findTestObject('Fitur transaksi/buttonKeranjang'))
		WebUI.click(findTestObject('Fitur transaksi/ButtonBayar'))

		WebUI.getText(findTestObject('Fitur transaksi/verifyTransaksi'))



	}
	@And("User returns to the home page")
	def kembalikemuhome1() {
		WebUI.click(findTestObject('Fitur transaksi/KembaliKehome'))
	}
	@And("The user clicks on the details of the product that has been purchased2")
	def buttondetailproduct2() {
		WebUI.click(findTestObject('Fitur transaksi/detailproduct'))
	}
	@And("Users add or subtract more than 1 star in product details")
	def lebihdari1bintang() {
		WebUI.click(findTestObject('Fitur transaksi/berkurangbintang'))

		WebUI.click(findTestObject('Fitur transaksi/bertambahbintanglebihdari1'))
	}
	@Then("The stars on the product change according to the user's settings2")
	def gagal() {
		WebUI.verifyElementPresent(findTestObject('Fitur transaksi/Jumlahbintang'), 0)

	}

}