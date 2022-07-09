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

WebUI.click(findTestObject('MainPageNavbar/btn_Register Now'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('Register/Page_Register/input_Username'), 'Alonso')

WebUI.setText(findTestObject('Register/Page_Register/input_Email'), 'alonso@gmail.com')

WebUI.setText(findTestObject('Register/Page_Register/input_Phone Number'), '087777777777')

WebUI.setText(findTestObject('Register/Page_Register/input_Password'), '1234567890Pp')

WebUI.setText(findTestObject('Register/Page_Register/input_Confirm Password'), '123445678900Ppp')

WebUI.setText(findTestObject('Register/Page_Register/input_Address'), 'Bintaro Sektor 7')

WebUI.click(findTestObject('Register/Page_Register/btn_Register'))

WebUI.verifyElementPresent(findTestObject('Register/Page_Register/txt_Your passwords do not match'), 0)

