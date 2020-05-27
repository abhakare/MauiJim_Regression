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

WebUI.click(findTestObject('Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Browse retailers by country'))

WebUI.click(findTestObject('Page_Authorized Maui Jim Retailers  Maui Jim/a_Canada'))

WebUI.click(findTestObject('Page_Authorized Maui Jim Retailers  Maui Jim/img_SUBSCRIBE_popup-subcription-closes-icon_bd6480'))

WebUI.click(findTestObject('Page_Canada Authorized Retailers  Maui Jim/a_ALBERTA'))

WebUI.click(findTestObject('Page_Alberta Authorized Retailers  Maui Jim/a_AIRDRIE'))

WebUI.click(findTestObject('Page_Airdrie AB Authorized Retailers  Maui Jim/a_Store details'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/li_Airdrie Eyecare Centre 5780'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/h2_AIRDRIE EYECARE CENTRE 5780'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/h3_Maui Jim Authorized Retailer'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/li_Sunglasses'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/li_Sunglasses with Prescription'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/li_Eyeglasses'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/h4_Store details'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/p_AIRDRIE EYECARE CENTRE 5780is a Maui Jim _8a919a'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/h5_Address'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/span_120 2ND AVE NE AIRDRIE AB T4B 2N2 Canada'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/h5_Contact'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/h5_Availability'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/p_24                                 Unique_cf9e0c'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/p_115                                 Uniqu_fc6b0c'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/h5_Store Hours'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/div_Store Hours                            _7d060d'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Page_Airdrie Eyecare Centre 5780  Maui Jim/a_Get Directions'))

WebUI.closeBrowser()

