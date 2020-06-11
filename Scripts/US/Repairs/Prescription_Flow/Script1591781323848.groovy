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

WebUI.navigateToUrl('https://b2cstorefront-stg1.mauijim.dev/US/en_US/')

WebUI.click(findTestObject('Object Repository/Repairs/Page_PolarizedPlus2 Sunglasses  Maui Jim/div_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Repairs'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_Repairs/button_PRESCRIPTION'))

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Repair your Maui Jim sunglasses  Maui Jim/input_Type in your Style number or name and_23578c'), 
    'baby')

WebUI.click(findTestObject('Object Repository/Repairs/Page_Repair your Maui Jim sunglasses  Maui Jim/li_BABY BEACH245'))

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Repair your Maui Jim sunglasses  Maui Jim/input_Type in your Style number or name and_23578c'), 
    'BABY BEACH')

WebUI.click(findTestObject('Object Repository/Repairs/Page_Repair your Maui Jim sunglasses  Maui Jim/button_SELECT'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_Repair your Maui Jim sunglasses  Maui Jim/a_ADD'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_Repair your Maui Jim sunglasses  Maui Jim/button_Continue'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Repairs/Page_Repairs/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    'January', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Repairs/Page_Repairs/select_Year20202019201820172016201520142013_99df94'), 
    '2006', true)

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Repairs/textarea_Repair Notes_additionalAttributes0_0130bd'), 
    'Baby Beach Prescription flow test')

WebUI.click(findTestObject('Object Repository/Repairs/Page_Repairs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/input_First Name_shippingFirstName'), 'test')

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/input_Last Name_shippingLastName'), 'demo')

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/input_Address 1 (Please no PO Boxes)_shippingLine1'), 
    '4001 moorpark')

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/input_City_shippingTownCity'), 'San Jose')

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/input_Zip Code_shippingPostcode'), '95117')

WebUI.selectOptionByValue(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/select_SelectAlabamaAlaskaAmerican SamoaAri_ecaa68'), 
    'US-CA', true)

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/input_Email Address_shippingEmail'), 'test@demo.com')

WebUI.setText(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/input_land Islands_shippingPhone1'), '(201) 555-5555')

WebUI.click(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/button_NEXT  SHIPPING METHOD  PAYMENT'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/label_I will send in a check'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/label_2 Day   300'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/label_I agree to the Terms and Conditions o_3f8de1'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/label_Join our mailing list for latest offe_1a5837'))

WebUI.click(findTestObject('Object Repository/Repairs/Page_Checkout  Maui Jim/button_Submit Order'))

WebUI.closeBrowser()

