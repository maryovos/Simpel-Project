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

Mobile.startApplication('C:\\Users\\1556\\Downloads\\levelup-v8.apk', false)

Mobile.verifyElementVisible(findTestObject('Object Repository/Object_LevelUp/field_username'), 5)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Username dan Password', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/field_username'), 5)

Mobile.setText(findTestObject('Object Repository/Object_LevelUp/input_username'), 'administrator', 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/field_password'), 0)

Mobile.setText(findTestObject('Object Repository/Object_LevelUp/input_password'), '1234567890', 5)

Mobile.hideKeyboard()

Mobile.takeScreenshotAsCheckpoint('Seteleah Input Username dan Password', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_Login'), 5)

Mobile.verifyElementVisible(findTestObject('Object Repository/Object_LevelUp/verify_LoginSuccess'), 5)

Mobile.takeScreenshotAsCheckpoint('Berhasil Login', [])

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_burgerMenu'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/menu_Inventory'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/submenu_StockTransfer'), 5)

Mobile.verifyElementVisible(findTestObject('Object Repository/Object_LevelUp/verify_NavigateToStockTransfer'), 5)

Mobile.takeScreenshotAsCheckpoint('Berhasil Navigate To Stock Transfer', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_Add'), 5)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Stock Transfer', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/field_PostingDate'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_OK_selectDate'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/field_DocDate'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_OK_selectDate'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/select_FromWarehouse'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/select_GudangJakartaSelatan'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/select_ToWarehouse'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/select_GudangJakartaUtara'), 5)

Mobile.setText(findTestObject('Object Repository/Object_LevelUp/input_Reference'), 'ref test', 5)

Mobile.hideKeyboard()

Mobile.takeScreenshotAsCheckpoint('Setelah Input Stock Transfer', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_Next'), 5)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Item', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_AddItem'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/field_ItemNumber'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/select_SPIDOL_BIRU_BESAR'), 15)

Mobile.setText(findTestObject('Object Repository/Object_LevelUp/field_Qty'), '7', 5)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/field_Uom'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/select_UNIT'), 5)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_saveItem'), 5)

Mobile.takeScreenshotAsCheckpoint('Setelah Input Item', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_Next (1)'), 5)

Mobile.takeScreenshotAsCheckpoint('Sebelum Input Journal', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object_LevelUp/field_JournalRemark'), 'Journal Remark Automation', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Object_LevelUp/field_Description'), 'Description Automation', 5)

Mobile.hideKeyboard()

Mobile.takeScreenshotAsCheckpoint('Setelah Input Journal', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Object_LevelUp/button_Save'), 5)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Berhasil Add Stock Transfer', [])

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

