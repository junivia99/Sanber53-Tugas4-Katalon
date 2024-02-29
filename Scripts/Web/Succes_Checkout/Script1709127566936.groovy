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

WebUI.click(findTestObject('Cart/button_checkout'))

WebUI.verifyElementText(findTestObject('CheckoutYourInformation/text_checkout'), 'Checkout: Your Information')

WebUI.setText(findTestObject('CheckoutYourInformation/input_first_name'), 'junivia')

WebUI.setText(findTestObject('CheckoutYourInformation/input_last_name'), 'nugraha')

WebUI.setText(findTestObject('CheckoutYourInformation/text_zip'), '68357')

WebUI.click(findTestObject('CheckoutYourInformation/button_continue'))

WebUI.verifyElementText(findTestObject('CheckoutOverview/text_overview'), 'Checkout: Overview')

WebUI.verifyElementText(findTestObject('CheckoutOverview/label_summary_total'), 'Total: $32.39')

WebUI.click(findTestObject('CheckoutOverview/button_finish'))

WebUI.verifyElementText(findTestObject('CheckoutComplete/text_checkout_complete'), 'Checkout: Complete!')

