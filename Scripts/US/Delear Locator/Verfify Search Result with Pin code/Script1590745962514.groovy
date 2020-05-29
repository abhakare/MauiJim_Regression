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

WebUI.navigateToUrl('https://www.mauijim.com/US/en_US/')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/DL overlay Search/Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/DL overlay Search/Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Find a Retailer'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/DL overlay Search/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'))

def SearchResult = []
def ExpectedSearchResult= []

WebUI.setText(findTestObject('Object Repository/SearchFromoverlay/input_WELCOME TO OUR DEALER LOCATOR_places-search'), '11373')

String SearchResult = (WebUI.getText(findTestObject('Object Repository/SearchFromoverlay/div_SearchList_Overlay'))

	
		
def NumberofResults = SearchResult.size()

for (int i = 0; i<NumberofResults; i++) 
{
	
}


SearchResult.push


int returnedResults= WebUI.getText(findTestObject('Object Repository/SearchFromoverlay/div_SearchList_Overlay')). 
WebUI.setText(findTestObject('Object Repository/B2C/US/Dealer Locator/DL overlay Search/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'), 
    'Queens NY 11373 USA')

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/DL overlay Search/Page_Find Maui Jim Retailers Near Me  Maui Jim/input_WELCOME TO OUR DEALER LOCATOR_places-search'))

WebUI.closeBrowser()

