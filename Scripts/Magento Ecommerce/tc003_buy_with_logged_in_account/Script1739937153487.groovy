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

WebUI.callTestCase(findTestCase('Magento Ecommerce/tc002_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Magento Ecommerce/tc005_jackets'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Magento Ecommerce/tc006_hoodies_sweatshirt'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Magento Ecommerce/tc008_tanks'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Magento Ecommerce/tc009_pants'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Magento Ecommerce/tc010_shorts'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Magento Ecommerce/tc011_checkout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Magento Ecommerce/tc012_po'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Success Page/button_change'))

WebUI.click(findTestObject('Object Repository/Magento Ecommerce/buy_with_account/Page_Success Page/button_sign_out'))

