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

WebUI.click(findTestObject('Object Repository/Owner/Modul User/add user/hamburger menu'))

WebUI.click(findTestObject('Object Repository/Owner/Modul User/add user/menu user'))

WebUI.click(findTestObject('Object Repository/Owner/Modul User/add user/btn-add-user'))

WebUI.setText(findTestObject('Object Repository/Owner/Modul User/add user/input_Nama_name'), 'supri')

WebUI.selectOptionByValue(findTestObject('Object Repository/Owner/Modul User/add user/select_Role_role'), 'Admin 2', true)

WebUI.setText(findTestObject('Object Repository/Owner/Modul User/add user/input_Email_email'), 'supri@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Owner/Modul User/add user/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Owner/Modul User/add user/btn-save'))

WebUI.click(findTestObject('Object Repository/Owner/Modul User/add user/btn alert'))

WebUI.click(findTestObject('Owner/Modul User/add user/btn User berhasil ditambahkan'))

WebUI.closeBrowser()

