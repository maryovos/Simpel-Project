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

WebUI.openBrowser('https://2captcha.com/demo/recaptcha-v2')

WebUI.delay(5)

WebUI.takeScreenshotAsCheckpoint('Success Navigate To URL')

WebUI.switchToFrame(findTestObject('Object_Captcha/switchToIframe'), 10)

WebUI.waitForElementPresent(findTestObject('Object_Captcha/check_ImNotARobot'), 10)

WebUI.delay(2)

WebUI.takeScreenshotAsCheckpoint('Before Click I\'m Not a Robot ')

WebUI.click(findTestObject('Object_Captcha/check_ImNotARobot'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(60)

WebUI.switchToDefaultContent()

WebUI.takeScreenshotAsCheckpoint('After Verify reCaptcha')

WebUI.delay(2)

WebUI.click(findTestObject('Object_Captcha/button_check'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object_Captcha/verify_successMessage'), 5)

WebUI.takeScreenshotAsCheckpoint('Success Check Captcha')

