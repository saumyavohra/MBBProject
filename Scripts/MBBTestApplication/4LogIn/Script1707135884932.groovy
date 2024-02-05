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

'Tap on Log In Now'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.TextView - Log In Now'), 0)

'Verify Get Started page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.TextView - Lets Get Started'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Lets Get Started'), 'Let\'s Get Started!')

Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Log in to enjoy the app to its fullest'), 
    'Log in to enjoy the app to its fullest.')

'Tap on Existing User'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

Mobile.delay(4)

'Verify username page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.TextView - Please enter your username'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Please enter your username'), 
    'Please enter your username')

Mobile.tap(findTestObject('Object Repository/Verification/android.widget.EditText'), 0)

Mobile.delay(4)

Mobile.takeScreenshot()

'Enter Username'
Mobile.setText(findTestObject('Verification/android.widget.EditText (2)'), 'm2utester1', 0)

'Press back to hide keypad'
Mobile.pressBack()

Mobile.takeScreenshot()

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.TextView - Continue'), 0)

Mobile.delay(4)

'Verify security phase page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.TextView - Yes, Its Mine'), 0)

Mobile.takeScreenshot()

'Tap on Yes'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.TextView - Yes, Its Mine'), 0)

'Verify password page visible'
Mobile.verifyElementVisible(findTestObject('Verification/android.widget.TextView - Enter your password'), 0)

Mobile.takeScreenshot()

Mobile.verifyElementText(findTestObject('Object Repository/Verification/android.widget.TextView - Enter your password'), 
    'Enter your password')

'Enter password'
Mobile.setText(findTestObject('Object Repository/Verification/android.widget.EditText (1)'), 'Maybank@1', 0)

'Press back to hide keypad'
Mobile.pressBack()

Mobile.takeScreenshot()

'Tap on Continue'
Mobile.tap(findTestObject('Object Repository/Verification/android.widget.TextView - Continue (1)'), 0)

'Verify Linked to Device Page present'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.TextView - Your Maybank2u ID is already linked to the following device'), 
    0)

Mobile.takeScreenshot()

'Tap on Close'
Mobile.tap(findTestObject('Object Repository/Verification/android.view.ViewGroup (3)'), 0)

'Verify home page visible'
Mobile.verifyElementVisible(findTestObject('Object Repository/Verification/android.widget.TextView - Secure. Convenient. Improved (2)'), 
    0)

Mobile.takeScreenshot()

