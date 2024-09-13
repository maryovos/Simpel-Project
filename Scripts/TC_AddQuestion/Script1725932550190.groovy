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

WebUI.click(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/button_Add Question'))

WebUI.click(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/span_-- Choose Entity --'))

WebUI.click(findTestObject('Object_CMS_Elearning/Page_Master Question  Elearning CMS/select_INDOCYBER'))

WebUI.click(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/span_-- Choose Branch --'))

WebUI.click(findTestObject('Object_CMS_Elearning/Page_Master Question  Elearning CMS/select_INDOCYBER_DAAN_MOGOT'))

WebUI.setText(findTestObject('Object_CMS_Elearning/Page_Master Question  Elearning CMS/span_textarea_Question'), 'Apa tujuan utama dari QA automation?')

WebUI.setText(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/textarea_Option A_optA'), 
    'Menguji fungsi perangkat lunak secara manual')

WebUI.setText(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/textarea_Option B_optB'), 
    'Mengotomatiskan tugas pengujian yang berulang untuk meningkatkan efisiensi')

WebUI.setText(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/textarea_Option C_optC'), 
    'Menggantikan penguji manusia sepenuhnya')

WebUI.setText(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/textarea_Option D_optD'), 
    'Mengembangkan fitur perangkat lunak yang baru')

WebUI.click(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/input_B_correctAnswer'))

WebUI.click(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/input_Please choose one_isActive'))

WebUI.click(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Object_CMS_Elearning/Page_Master Question  Elearning CMS/h2_Data saved successfully'), 
    4)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

