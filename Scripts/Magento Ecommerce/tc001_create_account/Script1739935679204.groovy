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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/#')

WebUI.click(findTestObject('Object Repository/Magento Ecommerce/register/Page_Home Page/create_account'))

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/register/Page_Create New Customer Account/input_firstname (1)'), 
    'yahya')

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/register/Page_Create New Customer Account/input_firstname'), 
    'galang')

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/register/Page_Create New Customer Account/input_email'), 
    'yahya.galang@ist.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Magento Ecommerce/register/Page_Create New Customer Account/input_password'), 
    '8SQVv/p9jVTrB1VzgqX+Bw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Magento Ecommerce/register/Page_Create New Customer Account/input_confirm_password'), 
    '8SQVv/p9jVTrB1VzgqX+Bw==')

WebUI.click(findTestObject('Object Repository/Magento Ecommerce/register/Page_Create New Customer Account/button_create_account'))

WebUI.click(findTestObject('Object Repository/Magento Ecommerce/register/Page_My Account/button_Change'))

WebUI.click(findTestObject('Object Repository/Magento Ecommerce/register/Page_My Account/sign_out'))

WebUI.closeBrowser()

