import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.media.bean.playerbean.MediaPlayer.popupActionListener as popupActionListener
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

CustomKeywords.'b2c_Keywords.openBrowser.openBrowserWithURL'(GlobalVariable.S1Env)

WebUI.click(findTestObject('Object Repository/Retailers/Page_Authorized Maui Jim Retailers  Maui Jim/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/Retailers/Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Browse retailers by country'))

CustomKeywords.'b2c_Keywords.retailersFlow.selectContinent'(continent)

CustomKeywords.'b2c_Keywords.retailersFlow.selectCountry'(country)

CustomKeywords.'b2c_Keywords.retailersFlow.selectState'(state)

CustomKeywords.'b2c_Keywords.retailersFlow.selectCity'(city)

WebUI.delay(GlobalVariable.timeout)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Retailers/Page_Brooks CA Authorized Retailers  Maui Jim/a_Store details'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Retailers/Page_Cache Creek Casino Resort  Maui Jim/a_Get Directions'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.switchToWindowIndex(1)

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

