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

WebUI.maximizeWindow()

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('MainPageNavbar/btn_Shop'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Add To Cart/Page_Products  Kotakoki/img_AlbumProduct'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Add To Cart/Page_Album/input_AlbumProductQty'), '1')

WebUI.click(findTestObject('Add To Cart/Page_Album/btn_Add To Cart'))

WebUI.verifyElementVisible(findTestObject('Add To Cart/Page_Album/txtView_ProductHaveBeen AddedToYourCart'))

WebUI.click(findTestObject('Add To Cart/Page_Album/link_ViewCart'))

WebUI.click(findTestObject('Add To Cart/Page Cart/link_Continue Shopping'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Add To Cart/Page_Products  Kotakoki/img_BeanieWithLogoProduct'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Add To Cart/Page_Beanie/txt_Beanie with Logo'))

WebUI.setText(findTestObject('Add To Cart/Page_Beanie/input_Beanie with Logo Qty'), '3')

WebUI.click(findTestObject('Add To Cart/Page_Album/btn_Add To Cart'))

WebUI.verifyElementVisible(findTestObject('Add To Cart/Page_Album/txtView_ProductHaveBeen AddedToYourCart'))

