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

'Verify first page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.ImageView-your enhanced experience'), 
    0)

String strNext = 'Next'

'Tap on Next 1'
Mobile.tap(findTestObject('Verification/Next', [('text') : strNext]), 10)

'Verify second page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.ImageView-your maybank accounts'), 
    0)

Mobile.takeScreenshot()

'Verify text'
Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Your Maybank accounts at a glance'), 
    'Your Maybank accounts at a glance')

String strPrevious = 'Previous'

'Tap on Previous'
Mobile.tap(findTestObject('Verification/Previous', [('text') : strPrevious]), 10)

'Verify first page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.ImageView-your enhanced experience'), 
    0)

Mobile.takeScreenshot()

'Tap on Next '
Mobile.tap(findTestObject('Verification/Next', [('text') : strNext]), 10)

'Verify second page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.ImageView-your maybank accounts'), 0)

Mobile.takeScreenshot()

'Tap on Next \r\n'
Mobile.tap(findTestObject('Verification/Next', [('text') : strNext]), 10)

'Verify third page visible '
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.ImageView-pay and transfer'), 0)

Mobile.takeScreenshot()

'Verify text'
Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Pay  transfer on the go'), 
    'Pay & transfer on the go')

'Tap on Previous'
Mobile.tap(findTestObject('Verification/Previous', [('text') : strPrevious]), 10)

'Verify second page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.ImageView-your maybank accounts'), 0)

Mobile.takeScreenshot()

'Tap on Next \r\n'
Mobile.tap(findTestObject('Verification/Next', [('text') : strNext]), 10)

'Verify third page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.ImageView-pay and transfer'), 0)

Mobile.takeScreenshot()

'Tap on Next 3'
Mobile.tap(findTestObject('Verification/Next', [('text') : strNext]), 10)

'Verify fourth page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.ImageView-Customise your'), 0)

Mobile.takeScreenshot()

'Verify text'
Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Customise your apps first screen'), 
    'Customise your app’s first screen')

'Tap on Previous'
Mobile.tap(findTestObject('Verification/Previous', [('text') : strPrevious]), 10)

'Verify third page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.ImageView-pay and transfer'), 0)

Mobile.takeScreenshot()

'Tap on Next'
Mobile.tap(findTestObject('Verification/Next', [('text') : strNext]), 10)

'Verify fourth page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.ImageView-Customise your'), 0)

Mobile.takeScreenshot()

'Tap on Next'
Mobile.tap(findTestObject('Verification/Next', [('text') : strNext]), 10)

'Verify fifth page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.ImageView-Quick Actions'), 0)

Mobile.takeScreenshot()

'Verify text'
Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Customise your Quick Actions'), 
    'Customise your Quick Actions')

'Tap on Previous'
Mobile.tap(findTestObject('Verification/Previous', [('text') : strPrevious]), 10)

'Verify fourth page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.ImageView-Customise your'), 0)

Mobile.takeScreenshot()

'Tap on Next'
Mobile.tap(findTestObject('Verification/Next', [('text') : strNext]), 10)

'Verify fifth page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.ImageView-Quick Actions'), 0)

Mobile.takeScreenshot()

'Tap on Got it'
Mobile.tap(findTestObject('Object Repository/NavigationToDashboard/2Button Got it'), 0)

'Verify \'terms and conditions\' visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.TextView - Terms  Conditions (1)'), 0)

Mobile.takeScreenshot()

'Verify text'
Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Terms  Conditions'), 'Terms & Conditions')

'Tap on Agree'
Mobile.tap(findTestObject('Object Repository/NavigationToDashboard/2Button Agree'), 0)

'Verify home page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.TextView - Secure. Convenient. Improved (1)'), 
    0)

Mobile.takeScreenshot()

'Verify the text'
Mobile.verifyElementText(findTestObject('Object Repository/NavigationToDashboard/2android.widget.TextView - Secure. Convenient. Improved'), 
    'Secure. Convenient. Improved.')

