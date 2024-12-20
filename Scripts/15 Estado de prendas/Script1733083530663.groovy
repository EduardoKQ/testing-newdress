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


WebUI.openBrowser('')
WebUI.navigateToUrl('http://localhost:8100/login')
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/div_Usuario_native-wrapper sc-ion-input-md _371c1b'))
WebUI.setText(findTestObject('Object Repository/Page_NEW DRESS/input_Usuario_ion-input'), 'testing')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_NEW DRESS/input_Contrasea_ion-input'), 'aeHFOx8jV/A=')
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_NEW DRESS/button_Iniciar_Sesion'), 10)
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/button_Iniciar_Sesion'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/svg_ionicon-ESS-9f6-ac8'))
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/div_Pblica-ESS-aad-870'))
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/div_Privada'))
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/span_OK'))
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/div_Privada-ESS-aad-fbe'))
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/div_Pblica'))
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/span_OK_1'))


