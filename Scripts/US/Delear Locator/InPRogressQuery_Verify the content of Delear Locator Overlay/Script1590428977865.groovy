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

'Navigate to home page\r\n'
WebUI.navigateToUrl('https://b2cstorefront-stg1.mauijim.dev/')

WebUI.waitForElementPresent(findTestObject('B2C/US/LogIn/Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'), 
    3)

'To accept cookies\r\n'
WebUI.click(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/Accept cookies/button_Accept Cookies'))

'Navigate to my profile page'
WebUI.click(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/Accept cookies/svg_Account_icon icon--account'))

WebUI.waitForElementClickable(findTestObject('B2C/US/LogIn/Page_PolarizedPlus2 Sunglasses  Maui Jim/svg_Account_icon icon--account'), 
    3)

'Enter Username and password'
WebUI.setText(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/Page_Login  Maui Jim/input_Email Address_j_username'), 
    'anamika@pragiti.com')

WebUI.setEncryptedText(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/Page_Login  Maui Jim/input_Password_j_password'), 
    'dnhddxdq3KHqE0R2nKHvsg==')

'Login to home page'
WebUI.click(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/Page_Login  Maui Jim/button_LOGIN'))

WebUI.waitForElementClickable(findTestObject('B2C/US/LogIn/Page_Login  Maui Jim/button_LOGIN'), 3)

'Navigate to Dealer locator overlay'
WebUI.click(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/Find Retailer link/a_Find a Retailer'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/DL_Overlay_Box'), 2)

WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/DL Overlay_Header'), 'WELCOME TO OUR DEALER LOCATOR', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/DL_Overlay_Subheader'), 'Please enter a location (for example, a zip code, address or city) and we will show you the nearest stores that sell Maui Jim sunglasses.')

WebUI.verifyElementPresent(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/DL_Overlay_SearchBox'), 2)

String expectedPlaceholder = 'Zip code, address or city'

String placeholder = WebUI.getAttribute('DL_Overlay_SearchBox', 'placeholder')

if (expectedPlaceholder != placeholder) {
    KeywordUtil.markFailed('Placeholder is not as expected.')
}

WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/DL_overlay_or text'), 'or')

WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/Text_Use the geolocation'), 
    'Use the geolocation to find stores near you ')

WebUI.verifyElementPresent(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/button_SEARCH STORES NEAR YOU'), 
    2)

WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/button_SEARCH STORES NEAR YOU'), 
    'SEARCH STORES NEAR YOU')

WebUI.verifyElementPresent(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/svg_authorized online dealers_icon icon--arrow-right'), 
    2)

WebUI.closeBrowser()

