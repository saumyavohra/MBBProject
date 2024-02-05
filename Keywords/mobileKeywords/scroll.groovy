ackage mobileKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

class scroll {
	def horizontalScroll(TestObject toGrid, TestObject toTarget) {
		int xPositionValue
		int yPositionValue
		int w1
		int h1
		int x=Integer.parseInt(Mobile.getAttribute(toGrid, 'x', 10))
		int y=Integer.parseInt(Mobile.getAttribute(toGrid, 'y', 10))
		int xWidth=Integer.parseInt(Mobile.getAttribute(toGrid, 'width', 10))
		int newXWidth=xWidth/2
		int yHeight=Integer.parseInt(Mobile.getAttribute(toGrid, 'height', 10))
		int newYHeight=y+yHeight/2

		println("Value of X:"+x)
		println("Value of Y:"+y)
		println("Value of New X Width:"+newXWidth)
		println("Value of New Y Height:"+yHeight)
		for(int i=1;i=50;i++) {
			Mobile.swipe(newXWidth,newYHeight,50,newYHeight)
			try {
				boolean isVisible=Mobile.verifyElementVisible(toTarget, 2)
				if (isVisible==true) {
					Mobile.swipe(newXWidth,newYHeight,50,newYHeight)
					println("Targeted Element found")
					break
				}
			}
			catch(Exception e) {
				println(e.message)
			}
		}
	}
}
