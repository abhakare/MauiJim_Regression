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

WebUI.waitForElementNotClickable(findTestObject('B2C/US/LogIn/Valid Login user/Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'), 
    3)

WebUI.click(findTestObject('Object Repository/B2C/US/LogIn/Valid Login user/Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/B2C/US/LogIn/Valid Login user/Page_PolarizedPlus2 Sunglasses  Maui Jim/svg_Account_icon icon--account'))

WebUI.setText(findTestObject('Object Repository/B2C/US/LogIn/Valid Login user/Page_Login  Maui Jim/input_Email Address_j_username'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/B2C/US/LogIn/Valid Login user/Page_Login  Maui Jim/input_Password_j_password'), 
    password)

WebUI.click(findTestObject('Object Repository/B2C/US/LogIn/Valid Login user/Page_Login  Maui Jim/button_LOGIN'))

WebUI.closeBrowser()

