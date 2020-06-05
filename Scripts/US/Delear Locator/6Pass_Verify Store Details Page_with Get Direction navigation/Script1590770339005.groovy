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

WebUI.navigateToUrl('https://b2cstorefront-stg1.mauijim.dev/US/en_US/')

WebUI.click(findTestObject('B2C/US/New_AcceptCookies/button_Accept Cookies'))

WebUI.waitForElementVisible(findTestObject('B2C/US/New_AcceptCookies/button_Accept Cookies'), 3)

WebUI.click(findTestObject('B2C/US/Dealer Locator/Browse by Retailer/a_Browse retailers by country'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/button_North America'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/Change Country/a_Canada'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_Canada Authorized Retailers  Maui Jim/a_BRITISH COLUMBIA'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_British Columbia Authorized Retailers _6a78bf/a_DUNCAN'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_Duncan BC Authorized Retailers  Maui Jim/a_Store details'))

WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/li_657-iris Duncan'), 
    '657-iris Duncan')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/h2_657-IRIS DUNCAN'), 
    '657-IRIS DUNCAN')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/h3_Maui Jim Authorized Retailer'), 
    'Maui Jim Authorized Retailer')

WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/ul_Sunglasses_Sunglasses with Prescription'), 
    'Sunglasses Sunglasses with Prescription')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/h4_Store details'), 
    'STORE DETAILS')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/p_657-IRIS DUNCANis a Maui Jim authorized d_8b6fca'), 
    '657-IRIS DUNCAN is a Maui Jim authorized dealer based in DUNCAN. Review the selection of Maui Jim sunglasses and eyeglasses below.')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/h5_Address'), 
    'ADDRESS')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/span_2628 BEVERLY ST UNIT 9 DUNCAN BC V9L 5_2378d7'), 
    '2628 BEVERLY ST UNIT 9, DUNCAN, BC, V9L 5C7, CANADA')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/h5_Contact'), 
    'CONTACT')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/span_250 746 6041'), 
    '250 746 6041')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/h5_Availability'), 
    'AVAILABILITY*')

WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/p_70Unique_07cbba'), 
    '70  Unique Sunglass Styles')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/h5_Store Hours'), 
    'STORE HOURS*')

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/p_Not Available'), 
    'Not Available')

WebUI.verifyElementClickable(findTestObject('B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/a_Get Directions'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailsPage/Store Details_Content/Page_657-iris Duncan  Maui Jim/a_Get Directions'))

WebUI.closeBrowser()

