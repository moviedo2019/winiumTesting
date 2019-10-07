import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.winium.DesktopOptions as DesktopOptions
import org.openqa.selenium.winium.WiniumDriver as WiniumDriver
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL

WiniumDriver driver = null

String appPath = 'C:/windows/system32/calc.exe'

DesktopOptions option = new DesktopOptions()

option.setApplicationPath(appPath)

option.setDebugConnectToRunningApp(false)

option.setLaunchDelay(2)

driver = new WiniumDriver(new URL('http://localhost:9999'), option)

Thread.sleep(2000)

driver.findElement(By.name('Siete')).click()

driver.findElement(By.name('Más')).click()

driver.findElement(By.name('Ocho')).click()

driver.findElement(By.name('Es igual a')).click()

Thread.sleep(2000)

resultado = driver.findElement(By.id('CalculatorResults')).getAttribute('Name')

println(resultado)

assert resultado == 'Se muestra 15'

driver.findElement(By.id('Close')).click()

