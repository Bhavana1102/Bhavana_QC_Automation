package com.qa.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try{
			prop=new Properties();
			FileInputStream fis = new FileInputStream("C:/QCProject_Automation/QCProject_Automation/"
					+ "src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void method(){
		
	}
	
	public static void browserInitialization(){
		String browserName= prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/QCProject_Automation/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:/QCProject_Automation/Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
}
