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

Integer fixPrice = 5000

Integer inputPrice = 5510

def minPrice

def maxPrice

def result

maxPrice = 6000 //fixPrice + (fixPrice * 10 / 100)

minPrice = 6000 //fixPrice - (fixPrice * 10 / 100)

println('maxPrice = ' + maxPrice)

println('minPrice = ' + minPrice)

if ((maxPrice < 200) || (minPrice < 200)) {
    result = 'FAIL'
} else if (((maxPrice >= 200) && (maxPrice < 500)) || ((minPrice >= 200) && (minPrice < 500))) {
    result = 'FAIL 1'
} else if (((maxPrice >= 500) && (maxPrice < 2000)) || ((minPrice >= 500) && (minPrice < 2000))) {
    result = 'FAIL 2'
} else if (((maxPrice >= 2000) && (maxPrice < 5000)) || ((minPrice >= 2000) && (minPrice < 5000))) {
    result = 'FAIL 3'
} else if (maxPrice >= 5000) {
    result = 'GOAL'
}

println()

println('RESULT : ' + result)

actualText = Windows.getText(findTestObject('Object_LevelUp/button_OK_selectDate'))

Windows.verifyElementPresent(actualText, 0, FailureHandling.STOP_ON_FAILURE)

