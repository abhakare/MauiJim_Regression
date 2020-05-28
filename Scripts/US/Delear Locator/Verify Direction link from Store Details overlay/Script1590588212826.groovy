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

WebUI.click(findTestObject('B2C/US/AcceptCookies_Guest/button_Accept Cookies'))

WebUI.doubleClick(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailDirection/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailDirection/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    'ok')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailDirection/Page_Find Maui Jim Retailers Near Me  Maui Jim/li_Oklahoma City OK USA'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailDirection/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    'Oklahoma City OK USA')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailDirection/Page_Find Maui Jim Retailers Near Me  Maui Jim/h3_DEAN MCGEE OPTICAL SERVICES'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/StoreDetailDirection/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Directions'))

WebUI.closeBrowser()

