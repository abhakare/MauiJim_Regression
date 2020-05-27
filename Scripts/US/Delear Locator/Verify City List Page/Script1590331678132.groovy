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

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StateListingPage/Page_Canada Authorized Retailers  Maui Jim/img_SUBSCRIBE_popup-subcription-closes-icon_bd6480'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StateListingPage/Page_Canada Authorized Retailers  Maui Jim/a_ALBERTA'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/StateListingPage/Page_Alberta Authorized Retailers  Maui Jim/input_Search_search-standalone-form__input'), 
    'bo')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StateListingPage/Page_Alberta Authorized Retailers  Maui Jim/a_BONNYVILLE'))

WebUI.closeBrowser()

