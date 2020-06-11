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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class retailersFlow {

	// for getting the country name
	private String getCountryXpath(String country){
		return "//div[@id='retailerCountryData']//a[@class='country-selector__country-link'][contains(text(),'"+country+"')]"
	}

	private TestObject getTestObjectForCountry(String country){
		TestObject testObject = new TestObject(country)
		testObject.addProperty("xpath", ConditionType.EQUALS, getCountryXpath(country) , true)
		return testObject
	}

	@Keyword
	public void selectCountry(String country){
		TestObject countryTestObject = getTestObjectForCountry(country)
		WebUI.waitForElementVisible(countryTestObject, 2)
		WebUI.click(countryTestObject)
	}


	// for getting state name

	private String getStateXpath(String state){
		return "//a[contains(text(),'"+state+"')]"
	}

	private TestObject getTestObjectForState(String state){
		TestObject testObject = new TestObject(state)
		testObject.addProperty("xpath", ConditionType.EQUALS, getStateXpath(state) , true)
		return testObject
	}

	@Keyword
	public void selectState(String state){
		TestObject stateTestObject = getTestObjectForState(state)
		WebUI.waitForElementVisible(stateTestObject, 2)
		WebUI.click(stateTestObject)
	}


	// for getting city name

	private String getCityXpath(String city){
		return "//a[contains(text(),'"+city+"')]"
	}

	private TestObject getTestObjectForCity(String city){
		TestObject testObject = new TestObject(city)
		testObject.addProperty("xpath", ConditionType.EQUALS, getCityXpath(city) , true)
		return testObject
	}

	@Keyword
	public void selectCity(String city){
		TestObject cityTestObject = getTestObjectForCity(city)
		WebUI.waitForElementVisible(cityTestObject, 2)
		WebUI.click(cityTestObject)
	}

	// for selecting the continent

	private String getContinentXpath(String continent){
		return "//div[@id='retailerCountryData']//div[@class='accordion-tabs__tabs']//button[@id='tab-"+continent+"']"
	}

	private TestObject getTestObjectForContinent(String continent){
		TestObject testObject = new TestObject(continent)
		testObject.addProperty("xpath", ConditionType.EQUALS, getContinentXpath(continent) , true)
		return testObject
	}

	@Keyword
	public void selectContinent(String continent){
		TestObject continentTestObject = getTestObjectForContinent(continent)
		WebUI.waitForElementVisible(continentTestObject, 2)
		WebUI.click(continentTestObject)
	}

}
