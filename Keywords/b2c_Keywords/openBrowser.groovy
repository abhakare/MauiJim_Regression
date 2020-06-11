package b2c_Keywords

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class openBrowser {

	@Keyword
	public void openBrowserWithURL(String url){
		WebUI.openBrowser(url)
		WebUI.waitForPageLoad(GlobalVariable.timeout)
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Object Repository/Retailers/Page_Authorized Maui Jim Retailers  Maui Jim/button_Accept Cookies'))
	}
}
