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

WebUI.callTestCase(findTestCase('Owner/login_owner'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Owner/Master Data/Barang/add product/hamburger menu'))

WebUI.click(findTestObject('Object Repository/Owner/Master Data/Barang/add product/master data'))

WebUI.click(findTestObject('Object Repository/Owner/Master Data/Barang/add product/btn barang'))

WebUI.click(findTestObject('Object Repository/Owner/Master Data/Barang/add product/btn add product'))

WebUI.setText(findTestObject('Object Repository/Owner/Master Data/Barang/add product/input__inputNamaBarang'), 'LG001')

WebUI.setText(findTestObject('Object Repository/Owner/Master Data/Barang/add product/textarea_Deskripsi_deskripsi'), 'TV 20 inci')

WebUI.setText(findTestObject('Object Repository/Owner/Master Data/Barang/add product/input__harga_beli'), '1350000')

WebUI.setText(findTestObject('Object Repository/Owner/Master Data/Barang/add product/input__harga'), '1450000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Owner/Master Data/Barang/add product/select__kategori'), 'TV', true)

WebUI.setText(findTestObject('Object Repository/Owner/Master Data/Barang/add product/input_Stok Awal_stok'), '10')

WebUI.click(findTestObject('Object Repository/Owner/Master Data/Barang/add product/btn save'))

WebUI.closeBrowser()

