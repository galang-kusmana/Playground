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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/#appointment')

WebUI.selectOptionByValue(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/dropdown_facility'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/radioButton_admission'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/radioButton_mediacaid'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/calendar_visit_date'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/calendar_select_date'))

WebUI.setText(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'book for medicaid')

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.getText(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/title_appointment_confirmation'))

WebUI.verifyTextPresent('Hongkong CURA Healthcare Center', false)

WebUI.verifyTextPresent('Yes', false)

WebUI.verifyTextPresent('Medicaid', false)

WebUI.verifyTextPresent('28/02/2025', false)

WebUI.verifyTextPresent('book for medicaid', false)

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/button_homepage'))

WebUI.getText(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/title_homepage'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/toggle_menu'))

