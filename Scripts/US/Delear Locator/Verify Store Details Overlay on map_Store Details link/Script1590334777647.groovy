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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.mauijim.com/US/en_US?clear=true')

WebUI.click(findTestObject('Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'))

WebUI.click(findTestObject('Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Find a Retailer'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    'ok')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Oklahoma City OK USA'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    'Oklahoma City OK USA')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/h3_DEAN MCGEE OPTICAL SERVICES'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/div_179264             Details             _5e5f9a'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/div_179264             Details             _5e5f9a'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/h3_DEAN MCGEE OPTICAL SERVICES_1'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Sunglasses'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Sunglasses with Prescription'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_405 271 6174'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Sunglasses with Prescription_iw-icon'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/use'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_126 Unique Sunglass Styles0 Unique Eye_b52ea3'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/use_1'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_1 mi'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Find Maui Jim Retailers Near Me  Maui Jim/a_More details about this location'))

WebUI.switchToWindowTitle('Dean Mcgee Optical Services | Maui Jim®')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsOverlay_MoreDetailsLink/Page_Dean Mcgee Optical Services  Maui Jim/img_SUBSCRIBE_popup-subcription-closes-icon_bd6480'))

