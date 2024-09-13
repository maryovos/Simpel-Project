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

WebUI.navigateToUrl('http://130.211.243.37:96/login')

WebUI.setText(findTestObject('Object Repository/Object_CMS_Elearning/Page_Login  Elearning CMS/input_Email_email'), 'admin@indocyber.com')

WebUI.setText(findTestObject('Object Repository/Object_CMS_Elearning/Page_Login  Elearning CMS/input_Password_password'), 
    'admin123')

WebUI.click(findTestObject('Object Repository/Object_CMS_Elearning/Page_Login  Elearning CMS/button_Login'))

WebUI.click(findTestObject('Object Repository/Object_CMS_Elearning/Page_Home  Elearning CMS/span_Master Question'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object_CMS_Elearning/Page_Master Question  Elearning CMS/verify_Title_MasterQuestion'), 
    'Master Question')

WebUI.takeElementScreenshotAsCheckpoint('Berhasil Verify Title Master Question', findTestObject('Object_CMS_Elearning/Page_Master Question  Elearning CMS/verify_Title_MasterQuestion'))

WebUI.takeScreenshotAsCheckpoint('Berhasil Navigate to Master Question')

WebUI.delay(3)

