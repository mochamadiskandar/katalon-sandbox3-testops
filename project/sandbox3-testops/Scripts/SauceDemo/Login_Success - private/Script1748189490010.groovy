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

WebUI.openBrowser('https://www.saucedemo.com/')

//WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/SauceDemo/LoginPage/input_username'), 'standard_user')

WebUI.setText(findTestObject('Object Repository/SauceDemo/LoginPage/input_password'), 'secret_sauce')

WebUI.click(findTestObject('Object Repository/SauceDemo/LoginPage/button_login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SauceDemo/LoginPage/label_Products'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/SauceDemo/LoginPage/button_hamburgerMenu'))

WebUI.takeScreenshot()

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/SauceDemo/LoginPage/button_logout'))

not_run: WebUI.verifyElementClickable(findTestObject('SauceDemo/LoginPage/button_logout'))

not_run: WebUI.click(findTestObject('Object Repository/SauceDemo/LoginPage/button_logout'))

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/SauceDemo/LoginPage/logo_SwagLabs'))

WebUI.closeBrowser()

