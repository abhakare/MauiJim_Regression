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

CustomKeywords.'b2c_Keywords.openBrowser.openBrowserWithURL'(GlobalVariable.prodEnv)

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Find a Retailer'))

WebUI.sendKeys(findTestObject('Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    Keys.chord(searchLocation, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/div_LONG ISLAND OPTICIANS   3844 SUNRISE HW_cf5b92'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Directions'))

WebUI.setText(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'), 
    'san jose')

WebUI.sendKeys(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/div_I-80 E            2972 mi 1 day 20 hours'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Send to your phone'))

WebUI.setText(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_Send to your phone_email-contact'), 
    'az@gmail.com')

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Send'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Close'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_back'))

WebUI.setText(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'), 
    'florida')

WebUI.sendKeys(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/div_I-95 N            1176 mi 17 hours 32 mins'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Get directions'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Send to your phone'))

WebUI.setText(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_Send to your phone_email-contact'), 
    'az@gmail.com')

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Send'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Close'))

WebUI.closeBrowser()

