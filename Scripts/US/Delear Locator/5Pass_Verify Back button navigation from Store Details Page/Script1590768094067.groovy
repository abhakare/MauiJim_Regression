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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://b2cstorefront-stg1.mauijim.dev/')

WebUI.delay(3)

WebUI.click(findTestObject('B2C/US/AcceptCookies_Guest/button_Accept Cookies'))

WebUI.scrollToElement(findTestObject('B2C/US/Dealer Locator/Browse by Retailer/a_Browse retailers by country'), 2)

WebUI.click(findTestObject('B2C/US/Dealer Locator/Browse by Retailer/a_Browse retailers by country'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('B2C/US/Dealer Locator/Change Country/button_North America'))

WebUI.waitForElementVisible(findTestObject('B2C/US/Dealer Locator/Change Country/div_CanadaGuamMexicoPuerto RicoUnited StatesVirgin Islands US'), 
    3)

WebUI.verifyElementClickable(findTestObject('B2C/US/Dealer Locator/Change Country/a_Canada'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/Change Country/a_Canada'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('B2C/US/Dealer Locator/StateListingPage/Page_Canada Authorized Retailers  Maui Jim/a_ALBERTA'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('B2C/US/Dealer Locator/CityListPage/a_BROOKS'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('B2C/US/Dealer Locator/StoreListPage/a_Store details'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('B2C/US/Dealer Locator/StoreDetails_BackButton/a_Back'))

'Navigate to window to be verified'
WebUI.switchToWindowIndex(0)

'Get the window title of expected window'
String WindowTitle = WebUI.getWindowTitle()

'Set the expected title of window'
String ExpectedTitle = 'Brooks, AB Authorized Retailers | Maui Jim®'

'Verify the expected title and actual title is same'
if (ExpectedTitle != WindowTitle) {
    KeywordUtil.markFailed('Navigation is not as expected.')
}

/*if (urlBackExpected != urlBack) {
    KeywordUtil.markFailed('Navigation is not as expected.')
}
*/
WebUI.closeBrowser()

