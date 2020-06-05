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
import com.kms.katalon.core.annotation.Keyword as Keyword
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

WebUI.openBrowser('')

'Navigate to mauijim URL'
WebUI.navigateToUrl('https://www.mauijim.com/US/en_US?clear=true')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('B2C/US/Dealer Locator/NAvFromFooter/Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Find a Retailer_footer__retailer-submit'))

WebUI.click(findTestObject('Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Find a Retailer'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/ZipCityAddressSearch/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    '73121')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/ZipCityAddressSearch/Page_Find Maui Jim Retailers Near Me  Maui Jim/svg_Search_icon icon--search'))

//excelPathSet to get data from excel file for matching
//String storeTableRowSize = nameForYourData .
//WebElement storeParent = driver.findElement(By.xpath('//ul[@class="listview k-widget k-listview k-selectable"]'))
//List <WebElement> storeName = storeParent.findElements(By.xpath('//ul[@class="listview k-widget k-listview k-selectable"]/li'));
//driver.findElements(By.xpath('//ul[@class="listview k-widget k-listview k-selectable"]')).get
//System.out.println("Total selected rows are " + storeName.size());
/*Iterator<WebElement> iter = storeName.iterator();
	while (iter.hasNext()) {
	// Iterate one by one
	WebElement item = iter.next();
	// get the text
	String label = item.getText();
	// print the text
	System.out.println(label);
	}
	*/
// if (address.equals('JACLYN BENZONI OD')){
// System.out.println(i+' = '+storeName[i].getAttribute('aria-label'))
//System.out.println(storeName[i].getText())
WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/ZipCityAddressSearch/Page_Find Maui Jim Retailers Near Me  Maui Jim/img_Menu_header__logo'))

WebUI.click(findTestObject('Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Find a Retailer'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/ZipCityAddressSearch/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    'ok')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/ZipCityAddressSearch/Page_Find Maui Jim Retailers Near Me  Maui Jim/span_Oklahoma City OK USA'))

WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/ZipCityAddressSearch/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    'Oklahoma City OK USA')

WebUI.waitForPageLoad(3)

WebUI.closeBrowser()

