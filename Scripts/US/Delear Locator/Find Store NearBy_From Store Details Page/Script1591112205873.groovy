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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.prodEnv)

CustomKeywords.'b2c_Keywords.DL_Overlay_nav.keyValue'()

WebUI.focus(findTestObject('B2C/US/Dealer Locator/New_Navigation From HomePage/DL_overlay_search_box'))

WebUI.sendKeys(findTestObject('B2C/US/Dealer Locator/New_Navigation From HomePage/DL_overlay_search_box'), Keys.chord(Searchkey, Keys.ENTER))

/*WebUI.sendKeys(findTestObject('B2C/US/Dealer Locator/New_Navigation From HomePage/DL_overlay_search_box'), Keys.chord(Searchkey, 
        Keys.ENTER))*/
/*WebUI.click(findTestObject('B2C/US/New_AcceptCookies/button_Accept Cookies'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/New_Navigation From HomePage/a_Find a Retailer'))

WebUI.setText(findTestObject('B2C/US/Dealer Locator/New_Navigation From HomePage/DL_overlay_search_box'), 'new') */
//WebUI.click(findTestObject('B2C/US/Dealer Locator/New_Dealer Locator Page/div_LONG ISLAND OPTICIANS'))
//Actual
WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.xpath(('//h3[@class=\'dealer-name\'][contains(text(),\'' + storeName) + '\')]')).click()

WebUI.takeScreenshot()

String actualOutletName = driver.findElement(By.xpath(('//li[contains(@aria-label,"' + storeName) + '")]/div/h3')).getText()

System.out.println('actualOutletName >> ' + actualOutletName)

String actualOutletAddress = driver.findElement(By.xpath(('//ul[@class="listview k-widget k-listview k-selectable"]//li[@aria-label="' + 
        storeName) + '"]/div/p')).getText()

System.out.println('actualOutletAddress >> ' + actualOutletAddress)

//Expected
String overlayOutletName = driver.findElement(By.xpath('//div[contains(@class,\'tabs__content-header\')]//h3')).getText()

String overlayOutletAddress = driver.findElement(By.xpath('//div[@id="tab-details_"]//p[@class="tabs__content-item dl_subtext"]')).getText()

System.out.println('overlayOutletAddress >> ' + overlayOutletAddress)

if (actualOutletName.contentEquals(overlayOutletName) && actualOutletAddress.equals(overlayOutletAddress)) {
    System.out.println('Matched')
} else {
    System.out.println('Not Matched')
}

WebUI.click(findTestObject('B2C/US/Dealer Locator/New_Dealer Locator Page/a_More details about this location'))

WebUI.switchToWindowTitle(StoreNamePage)

WebUI.click(findTestObject('B2C/US/Dealer Locator/New_Store Details Page/SDP_Find_Store_Nearby_button'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/New_Dealer Locator Page/Pin_image_aftre_nav_StoreDetails'))

WebUI.click(findTestObject('B2C/US/Dealer Locator/New_Dealer Locator Page/a_More details about this location'))

WebUI.switchToWindowTitle(StoreName)

WebUI.click(findTestObject('B2C/US/Dealer Locator/New_Store Details Page/a_Get Directions'))

WebUI.closeBrowser()

