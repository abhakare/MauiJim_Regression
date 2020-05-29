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

WebUI.delay(2)

WebUI.navigateToUrl('https://b2cstorefront-stg1.mauijim.dev/US/en_US/')

WebUI.waitForElementNotClickable(findTestObject('B2C/US/LogIn/Valid Login user/Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'), 
    3)

WebUI.click(findTestObject('Object Repository/B2C/US/LogIn/Valid Login user/Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/ChangeState/States/Page_Maui Jim Eyeglasses  Maui Jim/a_Browse retailers by country'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/ChangeState/States/Page_Authorized Maui Jim Retailers  Maui Jim/a_United States'))

String object1 = WebUI.getText(findTestObject('B2C/US/Dealer Locator/ChangeState/States/Page_United States Authorized Retailers  Maui Jim/a_ALABAMA'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/ChangeState/States/Page_United States Authorized Retailers  Maui Jim/a_ALABAMA'))

String object2 = WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/ChangeState/Header/Page_Alabama Authorized Retailers  Maui Jim/h2_ALABAMA'), 
    'ALABAMA')

if (object1 != object2) {
    System.out.println('Not matching')
}

String object3 = WebUI.getText(findTestObject('B2C/US/Dealer Locator/ChangeState/States/Page_United States Authorized Retailers  Maui Jim/a_NEBRASKA'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/ChangeState/States/Page_Alabama Authorized Retailers  Maui Jim/a_Change State'))

String object4 = WebUI.verifyElementText(findTestObject('B2C/US/Dealer Locator/ChangeState/Header/Page_Nebraska Authorized Retailers  Maui Jim/h2_NEBRASKA'), 
    '')

if (object3 != object4) {
    System.out.println('Not matching')
}

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/ChangeState/States/Page_United States Authorized Retailers  Maui Jim/input_Search_search-standalone-form__input'), 
    'b')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/ChangeState/States/Page_United States Authorized Retailers  Maui Jim/a_NEBRASKA'))

