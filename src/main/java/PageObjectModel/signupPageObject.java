package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageObject {

	public WebDriver driver;
	
	private By firstName=By.xpath("//input[@name='UserFirstName']");
	
	private By lastName=By.xpath("//input[@name='UserLastName']");
	
	private By Emailid= By.xpath("//input[@name='UserEmail']");
	
	private By userphon=By.xpath("//input[@name='UserPhone']");
	
	 private By employee=By.xpath("//select[@name='CompanyEmployees']");
	 
	 private By country=By.xpath("//select[@name='CompanyCountry']");
	 
	 public signupPageObject(WebDriver driver2) {
		 
		 this.driver=driver2;
	 }
	 public WebElement enterFirstname() {
		 return driver.findElement(firstName);
	 }
	 public WebElement enterlastname() {
		 return driver.findElement(lastName);
	 }
	 public WebElement enteremilaid() {
		 return driver.findElement(Emailid);
	 }
	 public WebElement enteruserphon() {
		 return driver.findElement(userphon);
	 }
	   public WebElement selectEmployee() {
		   
		   return driver.findElement(employee);
	 
	   }
	   public WebElement selectCountry() {
		   
		   return driver.findElement(country);
}	 
}	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
		 
	 

