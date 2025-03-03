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

WebUI.callTestCase(findTestCase('Heroku Katalon/tc001_login'), [('url') : 'https://katalon-demo-cura.herokuapp.com/', ('username') : 'John Doe'
        , ('pwd') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/input_None_programs'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/td_28'))

WebUI.setText(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/textarea_Comment_comment (1)'), 
    'none healthcare program')

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/button_Book Appointment (1)'))

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.verifyTextPresent('Seoul CURA Healthcare Center', false)

WebUI.verifyTextPresent('No', false)

WebUI.verifyTextPresent('None', false)

WebUI.verifyTextPresent('28/02/2025', false)

WebUI.verifyTextPresent('none healthcare program', false)

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.getText(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/a_History'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/a_Profile'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Heroku Katalon/Page_CURA Healthcare Service/a_Logout'))

