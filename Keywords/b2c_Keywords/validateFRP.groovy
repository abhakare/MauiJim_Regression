package b2c_Keywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

public class validateFRP {

	def FRP_url(def DealerLocatorCountry, def FRP_URL_Expected ){

		WebUI.click(findTestObject('B2C_Prod_OR/Homepage/AcceptCookies_bt/button_Accept Cookies'))

		WebUI.click(findTestObject('B2C_Prod_OR/Homepage/MenuNavigations/a_Find a Retailer'))

		WebUI.sendKeys(findTestObject('B2C_Prod_OR/FRP/Overlay/input_WELCOME TO OUR DEALER LOCATOR_places-search'), Keys.chord(DealerLocatorCountry,Keys.ENTER))

		String actualFRP_url = WebUI.getUrl()

		if (actualFRP_url.equals(FRP_URL_Expected)) {
			println(FRP_URL_Matched)
		}

		WebUI.takeScreenshot()

		WebUI.click(findTestObject('Object Repository/Recorder_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/div_LONG ISLAND OPTICIANS   3844 SUNRISE HW_cf5b92'))

		WebUI.click(findTestObject('Object Repository/Recorder_OR/Page_Find Maui Jim Retailers Near Me  Maui Jim/a_More details about this location'))
	}
}
