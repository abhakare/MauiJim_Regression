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

WebUI.navigateToUrl(GlobalVariable.S1Env)

CustomKeywords.'b2c_Keywords.DL_Overlay_nav.keyValue'()

//WebUI.click(findTestObject('B2C/US/New_AcceptCookies/button_Accept Cookies'))
//WebUI.click(findTestObject('Object Repository/Searchwithcity/Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Find a Retailer'))
WebUI.sendKeys(findTestObject('B2C/US/Dealer Locator/New_Navigation From HomePage/DL_overlay_search_box'), Keys.chord(searchKey, 
        Keys.ENTER))

String actualFRP_url = WebUI.getUrl()

if (actualFRP_url.equals(FRP_URL_Expected)) {
}

WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'b2c_Keywords.collectStores.collectS'('')

//WebDriver driver = DriverFactory.getWebDriver()
//driver.findElement(By.xpath(('//h3[@class=\'dealer-name\'][contains(text(),\'' + storeName) + '\')]')).click()
WebUI.click(findTestObject('Object Repository/Searchwithcity/Page_Find Maui Jim Retailers Near Me  Maui Jim/div_LONG ISLAND OPTICIANS   3844 SUNRISE HW_cf5b92'))

WebUI.closeBrowser()

