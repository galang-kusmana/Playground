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

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Checkout/input_address_line1'), 
    'Jl. Anggrek 1 No. 208')

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Checkout/input_address_line2'), 
    'RT 009 / RW 009')

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Checkout/input_address_line3'), 
    'West Bekasi, West Java, Indonesia')

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Checkout/input_city'), 'Bekasi')

WebUI.selectOptionByValue(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Checkout/select_indonesia'), 
    'ID', true)

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Checkout/input_state'), 'West Java, Indonesia')

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Checkout/input_postcode'), '17145')

WebUI.setText(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Checkout/input_telephone'), '859106997767')

