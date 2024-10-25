package locatorRepo

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


public class HomePageLocators {
	def listNavTabs(){
		return findTestObject('Object Repository/Page_Home/listNavTabs')
	}
	def btnForgetPassword(){
		return findTestObject('Object Repository/Page_Home/Page_Login/btnForgetPassword')
	}
	def btnSubmit(){
		return findTestObject('Object Repository/Page_Home/Page_Login/btnSubmit')
	}
	def inputPassword(){
		return findTestObject('Object Repository/Page_Home/Page_Login/inputPassword')
	}
	def inputUserEmail(){
		return findTestObject('Object Repository/Page_Home/Page_Login/inputUserEmail')
	}
	def btnPersonalProfile(){
		return findTestObject('Object Repository/Page_Home/btnPersolProfile')
	}
	def listProfileOptions(){
		return findTestObject('Object Repository/Page_Home/listProfileOptions')
	}
}
