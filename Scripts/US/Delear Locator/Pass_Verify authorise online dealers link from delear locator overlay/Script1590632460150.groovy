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

'Maximize the window\r\n'
WebUI.maximizeWindow()

'Enter navigational URL'
WebUI.navigateToUrl('https://b2cstorefront-stg1.mauijim.dev/US/en_US/')

'Wait for element to be visible'
WebUI.waitForElementVisible(findTestObject('B2C/US/AcceptCookies_Guest/button_Accept Cookies'), 2)

'Click on Accept cookies button'
WebUI.click(findTestObject('B2C/US/AcceptCookies_Guest/button_Accept Cookies'))

'Wait for elemnt to be clickable'
WebUI.waitForElementClickable(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/Find Retailer link/a_Find a Retailer'), 
    2)

'Click on Find a Retailer link.'
WebUI.click(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/Find Retailer link/a_Find a Retailer'))

'Verify If authorized Online Dealer link is clickable'
WebUI.verifyElementClickable(findTestObject('B2C/US/Dealer Locator/DL overlay_Content/DL Content/a_authorized online dealers'))

'Click authorized Online Dealer link '
WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/DL overlay_Content/Verify_authorized online dealers link navigation_DL Overlay/Page_Find Maui Jim Retailers Near Me  Maui Jim/a_authorized online dealers'))

'Navigate to window to be verified'
WebUI.switchToWindowIndex(0)

'Get the window title of expected window'
String WindowTitle = WebUI.getWindowTitle()

'Set the expected title of window'
String ExpectedTitle = 'Authorized Online Retailers | Maui Jim®'

'Verify the expected title and actual title is same'
if (ExpectedTitle != WindowTitle) {
    KeywordUtil.markFailed('Navigation is not as expected.')
}

WebUI.closeBrowser()

