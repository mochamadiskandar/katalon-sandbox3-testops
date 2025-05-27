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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ibbisnis-uat.btn.co.id/login')

WebUI.setText(findTestObject('Object Repository/Bale Bisnis/Login/input_EN_corporateID'), 'SSPatrick2')

WebUI.setText(findTestObject('Object Repository/Bale Bisnis/Login/input__userID'), 'SSPatrick2')

WebUI.setText(findTestObject('Object Repository/Bale Bisnis/Login/input__password'), 'Johndev2!')

WebUI.click(findTestObject('Object Repository/Bale Bisnis/Login/span_Masuk'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Bale Bisnis/Login/p_Ringkasan'), 0)

WebUI.takeScreenshot()

