import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.sepulsa.com/transaction/pulsa')

WebUI.setText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/notelepon'), '082240936365')

WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/pilihpaket'))

WebUI.setText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/emailuntukpembayaran'), 'dikasa711@gmail.com')

WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/metodepembayaran'))

WebUI.click(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/buttonbayar'))

WebUI.getText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/succes'))

WebUI.getText(findTestObject('soalprioritas2/soalprioritas_pilihMetodePembayaran/errormetodepembayaran'))

