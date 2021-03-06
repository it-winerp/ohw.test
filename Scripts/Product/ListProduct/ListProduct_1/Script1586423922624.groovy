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

WebUI.verifyElementVisible(findTestObject('Page_Products - Odoo/button_listview'))

WebUI.click(findTestObject('Page_Products - Odoo/button_listview'))

WebUI.verifyElementVisible(findTestObject('Page_Products - Odoo/th_Name'))

WebUI.verifyElementVisible(findTestObject('Page_Products - Odoo/th_Cost'))

WebUI.verifyElementVisible(findTestObject('Page_Products - Odoo/th_Forecasted Quantity'))

WebUI.verifyElementVisible(findTestObject('Page_Products - Odoo/th_Internal Reference'))

WebUI.verifyElementVisible(findTestObject('Page_Products - Odoo/th_Quantity On Hand'))

WebUI.verifyElementVisible(findTestObject('Page_Products - Odoo/th_Sales Price'))

