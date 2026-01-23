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

WebUI.click(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/hamburger menu'))

WebUI.click(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/btn data penjualan'))

WebUI.click(findTestObject('Admin/Data Penjualan/Page_Dashboard/btn add transaction'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/select_Aksi_produk0id'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/input_Stok tersedia 14_produk0jumlah'), 
    '1')

WebUI.click(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/button_Detail Produk_add-produk'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/select_Stok tersedia 14_produk1id'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/input_Stok tersedia 10_produk1jumlah'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/textarea_Alamat Pengiriman_alamat_pengiriman'), 
    'Dukuh Kedawon')

WebUI.click(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/btn save'))

WebUI.click(findTestObject('Object Repository/Admin/Data Penjualan/Page_Dashboard/btn alert'))

WebUI.closeBrowser()

