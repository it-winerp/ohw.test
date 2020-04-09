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

WebUI.click(findTestObject('Page_Pipeline - Odoo/a_CRM'))

WebUI.click(findTestObject('Page_Pipeline - Odoo/a_Pipeline'))

WebUI.click(findTestObject('Page_Pipeline - Odoo/span_Quotation'))

//WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Page_Opportunity - Odoo/button_New Quotation'))
WebUI.click(findTestObject('Page_Pipeline - Odoo/button_Create'))

WebUI.click(findTestObject('Page_Quotation - Odoo/input_Customer'))

WebUI.click(findTestObject('Page_Quotation - Odoo/a_CoopMart HCM'))

WebUI.click(findTestObject('Page_Quotation - Odoo/a_Add an item'))

WebUI.click(findTestObject('Page_Quotation - Odoo/input_Product'))

WebUI.click(findTestObject('Page_Quotation - Odoo/a_AAA Air Ticket'))

for (def rowNum = 1; rowNum < findTestData('OrderLine').getRowNumbers(); rowNum++) {
    WebUI.click(findTestObject('Page_Quotation - Odoo/input_Ordered Quantity'))

    WebUI.setText(findTestObject('Page_Quotation - Odoo/input_Ordered Quantity'), findTestData('OrderLine').getValue(1, 
            rowNum))

    WebUI.click(findTestObject('Page_Quotation - Odoo/input_Unit Price'))

    WebUI.setText(findTestObject('Page_Quotation - Odoo/input_Unit Price'), findTestData('OrderLine').getValue(2, rowNum))

    WebUI.click(findTestObject('Page_Quotation - Odoo/input__discount'))

    WebUI.setText(findTestObject('Page_Quotation - Odoo/input__discount'), findTestData('OrderLine').getValue(3, rowNum))

    WebUI.click(findTestObject('Page_Quotation - Odoo/button_Save'))

    subtotal = (findTestData('OrderLine').getValue(4, rowNum) + ' ₫')

    WebUI.verifyElementText(findTestObject('Page_Quotation - Odoo/span_price_subtotal'), subtotal)

    WebUI.click(findTestObject('Page_Quotation - Odoo/button_Edit'))

    WebUI.click(findTestObject('Page_Quotation - Odoo/span_Total_sequence'))
}

