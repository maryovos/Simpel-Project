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

Mobile.startApplication(GlobalVariable.apkPath, false)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object_LevelUp/button_Allow'), 10)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/field_username'), 5)

Mobile.setText(findTestObject('Object Repository/Object_LevelUp/input_username'), findTestData('DataFile-Internal').getValue(
		1, 1), 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/field_password'), 0)

Mobile.setText(findTestObject('Object Repository/Object_LevelUp/input_password'), findTestData('DataFile-Internal').getValue(
		2, 1), 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_Login'), 5)

Mobile.verifyElementVisible(findTestObject('Object Repository/Object_LevelUp/verify_LoginSuccess'), 5)

