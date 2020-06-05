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

import internal.GlobalVariable

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.logging.KeywordLogger

import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory

public class collectStores {
	@Keyword
	public void collectS(String Address){

		WebDriver driver = DriverFactory.getWebDriver()


		//excelPathSet to get data from excel file for matching
		Object nameForYourData = ExcelFactory.getExcelDataWithDefaultSheet('C:\\Katalon_WorkSpace\\Data\\DealerLocator.xlsx', 'StoreDetails', true)

		String store = nameForYourData.getValue(1, 1)
		System.out.println('StoreName = '+store)

		System.out.println('    ')

		//String storeTableRowSize = nameForYourData .


		//WebElement storeParent =  driver.findElement(By.xpath('//ul[@class="listview k-widget k-listview k-selectable"]'))
		List <WebElement> storeName = driver.findElements(By.xpath('//ul[@class="listview k-widget k-listview k-selectable"]/li'));
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

		int totalAddressCount= storeName.size()
		System.out.println('    ')

		System.out.println('totalAddressCount = '+totalAddressCount)

		System.out.println('    ')

		int j=0

		KeywordLogger log = new KeywordLogger()
		for(int i = 0; i < storeName.size; i++){

			j++

			String address = storeName[i].getAttribute('aria-label')
			System.out.println(j+' = '+address)



			// if (address.equals('JACLYN BENZONI OD')){
			if (address.equals(store)){
				System.out.println('Match Found')
				break
			}




			// System.out.println(i+' = '+storeName[i].getAttribute('aria-label'))
		}

		//System.out.println(storeName[i].getText())

	}
}

