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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/input_Swag Labs_user-name'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/input_Swag Labs_password'), 
    password)

WebUI.sendKeys(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/input_Swag Labs_password'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Add to cart_1_2'))

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Add to cart_1_2_3'))

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Add to cart_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Add to cart_1_2_3_4_5'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/a_6'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Checkout'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/input_Checkout Your Information_firstName'), 
    first)

WebUI.setText(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/input_Checkout Your Information_lastName'), 
    last)

WebUI.setText(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/input_Checkout Your Information_postalCode'), 
    post)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_continue'))

WebUI.delay(3)

WebUI.verifyTextPresent('Free Pony Express Delivery!', false)

WebUI.verifyTextPresent('Item total: $129.94', false)

WebUI.verifyTextPresent('Tax: $10.40', false)

WebUI.verifyTextPresent('Total: $140.34', false)

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Finish'))

WebUI.getText(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/header_thank_you'))

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Back Home'))

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/button_Open Menu'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sauce Demo/credentials_and_buying/Page_Swag Labs/a_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

