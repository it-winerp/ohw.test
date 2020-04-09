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

WebUI.verifyElementText(findTestObject('Page_New Product - Odoo/input_Commitment Document Delay'), findTestData('DefaultValueProduct').getValue(
        2, 1))

WebUI.verifyElementText(findTestObject('Page_New Product - Odoo/input_Commitment Delivery Delay'), findTestData('DefaultValueProduct').getValue(
        2, 2))

WebUI.verifyElementText(findTestObject('Page_New Product - Odoo/input_Comment Thanks Letter Delay'), findTestData('DefaultValueProduct').getValue(
        2, 3))

WebUI.verifyElementText(findTestObject('Page_New Product - Odoo/input_Commitment First Thanks Letter Delay'), findTestData(
        'DefaultValueProduct').getValue(2, 4))

