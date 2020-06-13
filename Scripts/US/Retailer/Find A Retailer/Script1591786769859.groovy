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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.deleteClause_scope as deleteClause_scope
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.object_return
import org.openqa.selenium.Keys as Keys

CustomKeywords.'b2c_Keywords.openBrowser.openBrowserWithURL'(GlobalVariable.prodEnv)

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Find a Retailer'))

WebUI.sendKeys(findTestObject('Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    Keys.chord(searchLocation, Keys.ENTER))

WebUI.delay(2)

CustomKeywords.'b2c_Keywords.DealerLocatorFlow.selectStoreDL'()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Directions'))

WebUI.setText(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'), 
    startingLocation)

WebUI.sendKeys(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'), 
    Keys.chord(Keys.ENTER))

CustomKeywords.'b2c_Keywords.DealerLocatorFlow.clickOnGetDirectionButton'()

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Send to your phone'))

WebUI.setText(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_Send to your phone_email-contact'), 
    email)

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Send'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Close'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_back'))

WebUI.clearText(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/input_back_origin-input'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'),
	startingLocationSecond)

WebUI.sendKeys(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

//selecting the route
CustomKeywords.'b2c_Keywords.DealerLocatorFlow.selectRoute'()

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Get directions'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Send to your phone'))

WebUI.setText(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_Send to your phone_email-contact'), 
    email)

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Send'))

WebUI.click(findTestObject('Object Repository/Find A Retailer_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Close'))

WebUI.delay(3)
WebUI.closeBrowser()

