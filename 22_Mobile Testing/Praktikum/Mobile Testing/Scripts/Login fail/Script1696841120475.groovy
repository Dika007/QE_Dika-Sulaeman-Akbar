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

Mobile.startApplication('D:\\MBKM\\Materi\\22_Mobile Testing\\app.apk', false)

Mobile.setText(findTestObject('Login/EmailLogin'), 'siapaakuini888@gmail.com', 0)

Mobile.setText(findTestObject('Login/PasswordLogin'), 'hellowrold', 0)

Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)

Mobile.getText(findTestObject('Login/WrongEmailOrPassword'), 0)

Mobile.closeApplication()

Mobile.startApplication('D:\\MBKM\\Materi\\22_Mobile Testing\\app.apk', false)

Mobile.setText(findTestObject('Login/EmailLogin'), 'akuini', 0)

Mobile.setText(findTestObject('Login/PasswordLogin'), 'ganteng', 0)

Mobile.tap(findTestObject('Login/android.widget.Button - LOGIN'), 0)

Mobile.getText(findTestObject('Login/NotValidEmail'), 0)

Mobile.closeApplication()

