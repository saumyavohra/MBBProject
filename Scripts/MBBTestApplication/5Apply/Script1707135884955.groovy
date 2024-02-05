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

'Tap on Apply'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.ApplyButton'), 0)

'Verify apply page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.view.Grid'), 0)

Mobile.takeScreenshot()

'Tap on Options Grid'
Mobile.tap(findTestObject('Object Repository/Verification/android.view.Grid'), 0)

'Scroll to Services'
CustomKeywords.'mobileKeywords.scroll.horizontalScroll'(findTestObject('Object Repository/Verification/android.view.Grid'), 
    findTestObject('Object Repository/Verification/android.widget.TextView - SERVICES'))

Mobile.takeScreenshot()

Mobile.delay(2)

'Tap on Services'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.TextView - SERVICES'), 0)

'Verify services page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.TextView - Auto Debit for ZakatSimpanan  Pelaburan (1)'), 
    0)

Mobile.takeScreenshot()

'Tap on Auto Debit'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.TextView - Auto Debit for ZakatSimpanan  Pelaburan (1)'), 
    0)

'Verify login page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.TextView - Lets Get Started (1)'), 0)

'Verify text'
Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Lets Get Started (1)'), 
    'Let\'s Get Started!')

Mobile.takeScreenshot()

'Tap on back'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.ImageView (2)'), 0)

'Tap on Home'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.ImageView (3)'), 0)

'Verify home page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.TextView - Secure. Convenient. Improved'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Secure. Convenient. Improved'), 
    'Secure. Convenient. Improved.')

