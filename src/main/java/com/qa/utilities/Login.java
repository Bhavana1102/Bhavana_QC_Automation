package com.qa.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.testbase.TestBase;

public class Login extends TestBase{
	
	@FindBy(name="loginRequestBean.userId")
	WebElement username;
	@FindBy(name="loginRequestBean.password")
	WebElement password;
	@FindBy(name="loginRequestBean.locNbr")
	WebElement storeId;
	@FindBy(name="login")
	WebElement submitButton;
	
	public Login(){
		PageFactory.initElements(driver, this);
	}
	
	public void method(){
	}
	
	public void loginIntoApplication() throws Exception {
	driver.get(prop.getProperty("url"));
	System.out.println(1234);
	//driver.findElement(By.name("loginRequestBean.userId")).sendKeys("admin");
	//username.sendKeys("admin");
	username.sendKeys(prop.getProperty("username"));
	password.sendKeys(prop.getProperty("password"));
	storeId.sendKeys(prop.getProperty("storeId"));
	submitButton.click();
	
	}
}
