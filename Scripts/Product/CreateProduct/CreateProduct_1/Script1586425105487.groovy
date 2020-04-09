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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page Odoo/a_Discuss_full'))

WebUI.click(findTestObject('Page Odoo/a_Sales'))

WebUI.click(findTestObject('Page Odoo/a_Products'))

WebUI.click(findTestObject('Page Odoo/span_Products'))

WebUI.click(findTestObject('Page_Products - Odoo/button_Create'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Product Name'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/div_cansold'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/div_canpurchased'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/a_General Information'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/a_eCommerce'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/a_Purchase'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/a_Sales'))

WebUI.click(findTestObject('Page_New Product - Odoo/a_General Information'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/select_ProductType'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Product Category'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Internal Reference'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Barcode'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Comment Thanks Letter Delay'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Commitment Delivery Delay'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Commitment Document Delay'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Commitment First Thanks Letter Delay'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Insurance Rate'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Insurance Value'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Share Rate'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/input_Sales Price'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/div_Taxes'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/span_Cost'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/span_Update Cost'))

WebUI.verifyElementVisible(findTestObject('Page_New Product - Odoo/textarea_Internal Notes'))

