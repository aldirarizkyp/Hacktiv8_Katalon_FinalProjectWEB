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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('MainPageNavbar/btn_Shop'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Add To Cart/Page_Products  Kotakoki/img_BeanieWithLogoProduct'))

WebUI.scrollToElement(findTestObject('Add To Cart/Page_Beanie/Shop Rating/link_Reviews'), 0)

WebUI.click(findTestObject('Add To Cart/Page_Beanie/Shop Rating/link_Reviews'))

WebUI.click(findTestObject('Add To Cart/Page_Beanie/Shop Rating/rating_3'))

WebUI.setText(findTestObject('Add To Cart/Page_Beanie/Shop Rating/textarea__your review'), 'Love this product!')

WebUI.setText(findTestObject('Add To Cart/Page_Beanie/Shop Rating/input__name'), 'Aldira')

WebUI.setText(findTestObject('Add To Cart/Page_Beanie/Shop Rating/input__email'), 'rizky@gmail.com')

WebUI.click(findTestObject('Add To Cart/Page_Beanie/Shop Rating/btn_Submit'))

WebUI.verifyElementVisible(findTestObject('Add To Cart/Page_Beanie/Shop Rating/div_Rated 3 out of 5Your review is awaiting approvalLove this product'), 
    FailureHandling.STOP_ON_FAILURE)

