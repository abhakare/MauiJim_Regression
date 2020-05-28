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

WebUI.click(findTestObject('Page_PolarizedPlus2 Sunglasses  Maui Jim/button_Accept Cookies'))

WebUI.click(findTestObject('Page_PolarizedPlus2 Sunglasses  Maui Jim/a_Browse retailers by country'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/ul_Maui Jim   Retailers'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/li_Retailers'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/h2_Authorized Maui Jim Locations'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/h3_Choose your country'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/div_Choose your country_country-selector__m_aafe37'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/button_North America'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/div_CanadaGuamMexicoPuerto RicoUnited State_2f6535'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/button_Europe'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/div_AustriaBelgiumCroatiaCyprusCzech Republ_8ee806'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/button_Africa'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/button_Middle East'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/div_United Arab Emirates'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/button_Asia Pacific'))

WebUI.click(findTestObject('Object Repository/B2C/US/Dealer Locator/Choose Your Country Page/Choose country/Page_Authorized Maui Jim Retailers  Maui Jim/div_AustraliaHong KongIndiaIndonesiaJapanKo_26574f'))

WebUI.closeBrowser()

