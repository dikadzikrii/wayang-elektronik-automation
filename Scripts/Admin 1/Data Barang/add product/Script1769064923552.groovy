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

WebUI.callTestCase(findTestCase('Admin 1/login admin 1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Admin 1/Data Barang/add product/hamburger menu'))

WebUI.click(findTestObject('Object Repository/Admin 1/Data Barang/add product/btn menu data barang'))

WebUI.click(findTestObject('Object Repository/Admin 1/Data Barang/add product/btn add product'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin 1/Data Barang/add product/select_Pilih dari Master Produk_pilih_master'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Admin 1/Data Barang/add product/input__stok'), '5')

WebUI.click(findTestObject('Object Repository/Admin 1/Data Barang/add product/button__btn-submit'))

WebUI.click(findTestObject('Object Repository/Admin 1/Data Barang/add product/btn alert'))

WebUI.closeBrowser()

