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


import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8100/login')

WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/h4_Olvidaste la Contrasea'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_NEW DRESS/input_Email_ion-input-2'), 5)

WebUI.setText(findTestObject('Object Repository/Page_NEW DRESS/input_Email_ion-input-2'), 'hola@gmail.com')

// Esperar a que el botón de reestablecer esté presente
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_NEW DRESS/span_button-inner-ESS-f39-8e2'), 5)

// Usar JavaScript para hacer clic en el botón de reestablecer
JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
js.executeScript("arguments[0].click();", WebUI.findWebElement(findTestObject('Object Repository/Page_NEW DRESS/span_button-inner-ESS-f39-8e2')))

// Esperar a que el modal esté presente
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_NEW DRESS/span_Action'), 5)

// Usar JavaScript para hacer clic en el botón de acción del modal
js.executeScript("arguments[0].click();", WebUI.findWebElement(findTestObject('Object Repository/Page_NEW DRESS/span_Action')))

// Esperar a que el siguiente botón esté presente
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_NEW DRESS/span_button-inner-ESS-d0e-ab0'), 5)

WebUI.closeBrowser()

