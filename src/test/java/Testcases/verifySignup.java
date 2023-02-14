package Testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import PageObjectModel.LoginPageObject;
import PageObjectModel.signupPageObject;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;




public class verifySignup extends baseClass{
	
	@Test
	public void signup() throws InterruptedException, IOException {
		
	LoginPageObject lpo=new LoginPageObject(driver);
	lpo.clickOntryForFreee().click();
	
	  signupPageObject spo=new signupPageObject(driver);
	  Thread.sleep(5000);
	  spo.enterFirstname().sendKeys(constants.firstname);
	  spo.enterlastname().sendKeys(constants.lastname);
	  spo.enteremilaid().sendKeys(constants.useremialid);
	  spo.enteruserphon().sendKeys(constants.userphon);
	  
	  /*
	  Select s=new Select(spo.selectEmployee());
	  s.selectByIndex(1);
	  
	  Select s1=new Select(spo.selectCountry());
	  s1.selectByIndex(1);
	  */
	  
	  commonMethods.selectDropdown(spo.selectEmployee(),1);
	  commonMethods.selectDropdown(spo.selectCountry(),2);
	}
}
