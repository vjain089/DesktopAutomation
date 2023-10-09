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

Windows.startApplicationWithTitle('C:\\LabDB\\LabDB.exe', '')

Windows.switchToWindowTitle('Trial')

Windows.click(findWindowsObject('Object Repository/LabDB/Button'))

Windows.switchToWindowTitle('Login (LabDB)')

Windows.setText(findWindowsObject('Object Repository/LabDB/Edit'), 'admin')

Windows.click(findWindowsObject('Object Repository/LabDB/Button(1)'))

Windows.switchToWindowTitle('LabDB')

Windows.click(findWindowsObject('Object Repository/LabDB/Button(2)'))

Windows.click(findWindowsObject('Object Repository/LabDB/Button(3)'))

Windows.setText(findWindowsObject('Object Repository/LabDB/Edit(1)'), 'Purvi')

Windows.setText(findWindowsObject('Object Repository/LabDB/Edit(2)'), '123456')

Windows.setText(findWindowsObject('Object Repository/LabDB/Edit(3)'), '7647637682')

Windows.setText(findWindowsObject('Object Repository/LabDB/Edit(4)'), 'India')

Windows.setText(findWindowsObject('Object Repository/LabDB/Edit(5)'), 'Cancer')

Windows.setText(findWindowsObject('Object Repository/LabDB/Edit(6)'), 'Demo')

Windows.click(findWindowsObject('LabDB/Button(4)'))

Windows.closeApplication()

