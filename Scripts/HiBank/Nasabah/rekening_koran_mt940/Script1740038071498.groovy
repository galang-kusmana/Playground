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

WebUI.navigateToUrl('https://hibank-cms2.istcloud.one/login')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Login/input_id_perusahaan'), 
    'PIPIK123')

WebUI.setText(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Login/input_id_pengguna'), 
    'PIPIKMAKER')

WebUI.setEncryptedText(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Login/input_pwd'), 
    'rMKu5t114ksH9TFjJf7PfA==')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Login/button_Masuk'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Dashboard/dropdown_rekening'))

WebUI.click(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Dashboard/menu_rekening_koran_1'))

WebUI.click(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Rekening/select_giro_5301483351'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Rekening/button_Download'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Rekening/choose_mt940'))

WebUI.click(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Rekening/button_Unduh'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/HiBank/Nasabah/Rekening Koran/Page_hibank CMS  Rekening/button_logout'))

WebUI.delay(3)

WebUI.closeBrowser()

