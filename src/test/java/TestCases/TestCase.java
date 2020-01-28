package TestCases;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.testbase.TestBase;
import com.qa.utilities.Login;
import com.qa.utilities.RegistrationThroughPropertiesFile;

public class TestCase extends TestBase {
	public static RegistrationThroughPropertiesFile reg;
	public static Login login;
	public static Utilities utilities;
	public static ExtentTest logger;
	String timestamp = new SimpleDateFormat("MM.dd.yyyy.HH.mm.ss").format(new Date());
	static ExtentTest test;
	static ExtentReports report;



	public TestCase() {
		super();
	}

	@BeforeMethod
	public void setup() {
		browserInitialization();
		utilities = new Utilities();
		
		reg = new RegistrationThroughPropertiesFile();
		login = new Login();
		/*String Bfilename = "Registration" + timestamp + ".html";
		//reporter = new ExtentHtmlReporter("C:/QCProject_Automation/QCProject_Automation/Reports") + Bfilename;
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest logger = extent.createTest("RegistrationTest");
		logger.log(Status.PASS, "Browser launched");*/
		
		ExtentReports report= new ExtentReports("C:/QCProject_Automation/QCProject_Automation/Reports", false);
		
		//ExtentReports reports = new ExtentReports("C:/QCProject_Automation/QCProject_Automation/Reports", true);
		/*report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		
		test = report.startTest("ExtentDemo");*/

	}

	@AfterMethod
	public void Teardown() {
		//driver.quit();
	}

	@Test
	public void RegistrationTest() throws Exception {
		reg.registration();
	}

}
