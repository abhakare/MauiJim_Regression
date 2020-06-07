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
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.prodEnv)

CustomKeywords.'b2c_Keywords.DL_Overlay_nav.keyValue'()

WebUI.sendKeys(findTestObject('B2C/US/Dealer Locator/New_Navigation From HomePage/DL_overlay_search_box'), Keys.chord(Searchkey, 
        Keys.ENTER))

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.xpath(('//h3[@class=\'dealer-name\'][contains(text(),\'' + storeName) + '\')]')).click()

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/button_Directions'))

String actualDirectionPage = WebUI.getWindowTitle()

if (actualDirectionPage != expectedDirectionPageName) {
    KeywordUtil.markFailed('Navigation is not as expected.')
}

WebUI.click(findTestObject('B2C/US/Dealer Locator/Get Direction Page/span_back'))

String actualBackNavPage = WebUI.getWindowTitle()

if (actualBackNavURLPage != expectedBackPageName) {
    KeywordUtil.markFailed('Navigation is not as expected.')
}

WebUI.click(findTestObject('B2C/US/Dealer Locator/New_Dealer Locator Page/button_Directions'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_back_origin-input'), 
    startingAddress)

WebUI.click(findTestObject(selectstartingAddress))

driver.findelement(By.xpath(('//li[@id=\'routes-hook_lv_active\']\\h3[contains(text(), \'' + route) + '\')]')).click()

//WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/Page_Find Maui Jim Retailers Near Me  Maui Jim/h3_I-40 E'))
WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Get directions'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/Get Direction Page/p_Send to your Phone'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_Send to your phone_email-contact'), 
    emailID)

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Send'))

WebUI.verifyElementText(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/Page_Find Maui Jim Retailers Near Me  Maui Jim/p_The message has successfully been sent'), 
    'sentMessage')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Get Direction Page/Page_Find Maui Jim Retailers Near Me  Maui Jim/button_Close'))

