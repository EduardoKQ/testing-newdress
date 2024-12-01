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

WebUI.navigateToUrl('http://localhost:8100/intro')

WebUI.setText(findTestObject('Object Repository/Page_NEW DRESS/input_Usuario_ion-input-0'), 'OR 1=1 --')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NEW DRESS/input_Contrasea_ion-input-1'), 'tzH6RvlfSTg=')

//Click the "Iniciar Sesion" button
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_NEW DRESS/button_Iniciar_Sesion'), 10)
WebUI.click(findTestObject('Object Repository/Page_NEW DRESS/button_Iniciar_Sesion'))

// Step 3: Wait for response
WebUI.delay(5)  // Adjust the delay as needed based on expected loading time

// Step 4: Check for error response text
def errorMessage = WebUI.getText(findTestObject('Object Repository/Page_NEW DRESS/error_message')) // Update to the actual object for error message

if (errorMessage) {
    WebUI.comment("Error response: " + errorMessage)
} else {
    WebUI.comment("No error response found.")
}

// Close the browser at the end
WebUI.closeBrowser()

