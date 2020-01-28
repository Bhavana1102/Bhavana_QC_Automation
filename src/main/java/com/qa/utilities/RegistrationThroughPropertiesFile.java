package com.qa.utilities;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.testbase.TestBase;

public class RegistrationThroughPropertiesFile extends TestBase{
	Utilities utilities;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	Login login = new Login();
	
	@FindBy(linkText="Borrower")
	WebElement Borrower;
	
	@FindBy(linkText="Registration")
	WebElement Registration;
	
	@FindBy(name="ssn1")
	WebElement ssn1;
	
	@FindBy(name="ssn2")
	WebElement ssn2;
	
	@FindBy(name="ssn3")
	WebElement ssn3;
	
	@FindBy(name="ssn4")
	WebElement confirm_ssn1;
	
	@FindBy(name="ssn5")
	WebElement confirm_ssn2;
	
	@FindBy(name="ssn6")
	WebElement confirm_ssn3;
	
	@FindBy(name="customerBean.lastNm")
	WebElement lastName;
	
	@FindBy(name="customerBean.firstNm")
	WebElement firstName;
	
	@FindBy(name="customerBean.addressLn")
	WebElement addressLine1;
	
	@FindBy(name="customerBean.city")
	WebElement city;
	
	@FindBy(name="customerBean.stateCd")
	WebElement stateID;
	@FindBy(name="customerBean.postalCd")
	WebElement postalCode;
	@FindBy(name="customerBean.monthsAtAddress")
	WebElement monthsAtAddress;
	@FindBy(name="phoneNbr1")
	WebElement phoneNbr1;
	@FindBy(name="phoneNbr2")
	WebElement phoneNbr2;
	@FindBy(name="phoneNbr3")
	WebElement phoneNbr3;
	@FindBy(name="customerBean.phoneCd")
	WebElement phoneType;
	
	@FindBy(name="customerBean.email")
	WebElement email;
	
	@FindBy(name="customerBean.driversLicNbr")
	WebElement photoIDNbr;
	
	@FindBy(name="customerBean.driversLicSt")
	WebElement IDState;
	
	@FindBy(name="dlexpiry1")
	WebElement IDexpiry1;
	
	@FindBy(name="dlexpiry2")
	WebElement IDexpiry2;
	@FindBy(name="dlexpiry3")
	WebElement IDexpiry3;
	@FindBy(name="customerBean.photoIdType")
	WebElement photoIdType;
	@FindBy(name="customerBean.drivingZipcode")
	WebElement drivingZipcode;
	@FindBy(name="dob1")
	WebElement dob1;
	@FindBy(name="dob2")
	WebElement dob2;
	@FindBy(name="dob3")
	WebElement dob3;
	
	@FindBy(name="customerBean.incomeCdDisp")
	WebElement incomeType;
	@FindBy(name="customerBean.empNmDisp")
	WebElement employer;
	
	@FindBy(name="workPhoneNbrDisp1")
	WebElement workPhoneNbrDisp1;
	
	@FindBy(name="workPhoneNbrDisp2")
	WebElement workPhoneNbrDisp2;
	
	@FindBy(name="workPhoneNbrDisp3")
	WebElement workPhoneNbrDisp3;
	
	@FindBy(name="customerBean.incomeAmtDisp")
	WebElement netIncome;
	@FindBy(name="customerBean.grossAmtDisp")
	WebElement grossIncome;
	
	@FindBy(id="payFreqCdId")
	WebElement payFreq;
	
	@FindBy(name="customerBean.monthlyDate")
	WebElement monthlyDate;
	@FindBy(name="payStubReviewed1")
	WebElement payStubReviewed1;
	@FindBy(name="payStubReviewed2")
	WebElement payStubReviewed2;
	@FindBy(name="payStubReviewed3")
	WebElement payStubReviewed3;
	
	@FindBy(name="payStubDate1")
	WebElement payStubDate1;
	@FindBy(name="payStubDate2")
	WebElement payStubDate2;
	@FindBy(name="payStubDate3")
	WebElement payStubDate3;
	
	@FindBy(name="hireDate1")
	WebElement hireDate1;
	@FindBy(name="hireDate2")
	WebElement hireDate2;
	@FindBy(name="hireDate3")
	WebElement hireDate3;
	
	@FindBy(name="customerBean.directDeposit")
	WebElement directDeposit;
	
	@FindBy(name="statementEndDtDisp1")
	WebElement accountVerDate1;
	@FindBy(name="statementEndDtDisp2")
	WebElement accountVerDate2;
	@FindBy(name="statementEndDtDisp3")
	WebElement accountVerDate3;
	
	@FindBy(name="customerBean.abaNbrDisp")
	WebElement abaNbr;
	@FindBy(name="checkAbaNbrDisp")
	WebElement confirm_abaNbr;
	
	@FindBy(name="customerBean.accountNbrDisp")
	WebElement accountNbr;
	@FindBy(name="checkAccountNbrDisp")
	WebElement confirm_accountNbr;
	
	@FindBy(name="customerBean.contName")
	WebElement ref1_LastName;
	@FindBy(name="customerBean.contactFirstName")
	WebElement ref1_FirstName;
	
	@FindBy(name="customerBean.contactrelationDisp")
	WebElement ref1_relation;
	@FindBy(name="cphoneNbrDisp1")
	WebElement ref1_cphoneNbr1;
	@FindBy(name="cphoneNbrDisp2")
	WebElement ref1_cphoneNbr2;
	@FindBy(name="cphoneNbrDisp3")
	WebElement ref1_cphoneNbr3;
	
	@FindBy(name="customerBean.nameDispSummary")
	WebElement ref2_LastName;
	@FindBy(name="customerBean.referenceFirstNameSummary")
	WebElement ref2_FirstName;
	@FindBy(name="customerBean.relationDispSummary")
	WebElement ref2_relation;
	
	@FindBy(name="refPhoneNbr1")
	WebElement ref2_PhoneNbr1;
	@FindBy(name="refPhoneNbr2")
	WebElement ref2_PhoneNbr2;
	@FindBy(name="refPhoneNbr3")
	WebElement ref2_PhoneNbr3;
	
	@FindBy(name="bt_Reference")
	WebElement ref_Button;
	
	@FindBy(name="customerBean.bankrupty")
	WebElement bankrupty;
	
	@FindBy(id="marRadioEmailOptOut")
	WebElement marRadioEmailOptOut;
	@FindBy(id="marRadioSmsOptOut")
	WebElement marRadioSmsOptOut;
	@FindBy(id="marRadioAutoCallOut")
	WebElement marRadioAutoCallOut;
	
	@FindBy(name="Save")
	WebElement saveAndExit;
	/*@FindBy(name="SLoan")
	WebElement saveAndLoan;
	@FindBy(name="Next")
	WebElement saveAndNext;
	@FindBy(name="deny")
	WebElement deny;
	*/
	
	public RegistrationThroughPropertiesFile(){
		PageFactory.initElements(driver, this);
	}
	
	public void registration() throws Exception{
		utilities=new Utilities();
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(
				"C:/QCProject_Automation/QCProject_Automation/Reports");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("registration test");
		login.loginIntoApplication();
		
		Thread.sleep(2000);
		driver.switchTo().frame("topFrame");
		logger.log(Status.PASS, "Entered into top frame");
		Borrower.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		Registration.click();
		//driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		
		ssn1.sendKeys(prop.getProperty("ssn1"));
		logger.log(Status.PASS, "Entered ssn1: ");
		ssn2.sendKeys(prop.getProperty("ssn2"));
		logger.log(Status.PASS, "Entered ssn2: ");
		ssn3.sendKeys(prop.getProperty("ssn3"));
		logger.log(Status.PASS, "Entered ssn3: ");
		confirm_ssn1.sendKeys(prop.getProperty("ssn1"));
		logger.log(Status.PASS, "Entered confirm_ssn1: ");
		confirm_ssn2.sendKeys(prop.getProperty("ssn2"));
		logger.log(Status.PASS, "Entered confirm_ssn2: ");
		confirm_ssn3.sendKeys(prop.getProperty("ssn3"));
		logger.log(Status.PASS, "Entered confirm_ssn3: ");
		lastName.sendKeys(prop.getProperty("lastName"));
		firstName.sendKeys(prop.getProperty("firstName"));
		addressLine1.sendKeys(prop.getProperty("addressLine1"));
		city.sendKeys(prop.getProperty("city"));
		stateID.sendKeys(prop.getProperty("stateID"));
		postalCode.sendKeys(prop.getProperty("postalCode"));
		monthsAtAddress.sendKeys(prop.getProperty("monthsAtAddress"));
		phoneNbr1.sendKeys(prop.getProperty("phoneNbr1"));
		phoneNbr2.sendKeys(prop.getProperty("phoneNbr2"));
		phoneNbr3.sendKeys(prop.getProperty("phoneNbr3"));
		Select phne_type = new Select(phoneType);
		phne_type.selectByVisibleText(prop.getProperty("phoneType"));
		//phoneType.sendKeys(prop.getProperty("phoneType"));
		email.sendKeys(prop.getProperty("email"));
		photoIDNbr.sendKeys(prop.getProperty("photoIDNbr"));
		IDState.sendKeys(prop.getProperty("IDState"));
		IDexpiry1.sendKeys(prop.getProperty("IDexpiry1"));
		IDexpiry2.sendKeys(prop.getProperty("IDexpiry2"));
		IDexpiry3.sendKeys(prop.getProperty("IDexpiry3"));
		photoIdType.sendKeys(prop.getProperty("photoIdType"));
		drivingZipcode.sendKeys(prop.getProperty("drivingZipcode"));
		dob1.sendKeys(prop.getProperty("dob1"));
		dob2.sendKeys(prop.getProperty("dob2"));
		dob3.sendKeys(prop.getProperty("dob3"));
		incomeType.sendKeys(prop.getProperty("incomeType"));
		employer.sendKeys(prop.getProperty("employer"));
		workPhoneNbrDisp1.sendKeys(prop.getProperty("workPhoneNbrDisp1"));
		workPhoneNbrDisp2.sendKeys(prop.getProperty("workPhoneNbrDisp2"));
		workPhoneNbrDisp3.sendKeys(prop.getProperty("workPhoneNbrDisp3"));
		netIncome.sendKeys(prop.getProperty("netIncome"));
		grossIncome.sendKeys(prop.getProperty("grossIncome"));
		payFreq.sendKeys(prop.getProperty("payFreq"));
		monthlyDate.sendKeys(prop.getProperty("monthlyDate"));
		payStubReviewed1.sendKeys(prop.getProperty("payStubReviewed1"));
		payStubReviewed2.sendKeys(prop.getProperty("payStubReviewed2"));
		payStubReviewed3.sendKeys(prop.getProperty("payStubReviewed3"));
		payStubDate1.sendKeys(prop.getProperty("payStubDate1"));
		payStubDate2.sendKeys(prop.getProperty("payStubDate2"));
		payStubDate3.sendKeys(prop.getProperty("payStubDate3"));
		
		
		
		hireDate1.sendKeys(prop.getProperty("hireDate1"));
		hireDate2.sendKeys(prop.getProperty("hireDate2"));
		hireDate3.sendKeys(prop.getProperty("hireDate3"));
		
		directDeposit.sendKeys(prop.getProperty("directDeposit"));
		
		accountVerDate1.sendKeys(prop.getProperty("accountVerDate1"));
		accountVerDate2.sendKeys(prop.getProperty("accountVerDate2"));
		accountVerDate3.sendKeys(prop.getProperty("accountVerDate3"));
		abaNbr.sendKeys(prop.getProperty("abaNbr"));
		confirm_abaNbr.sendKeys(prop.getProperty("abaNbr"));
		accountNbr.sendKeys(prop.getProperty("accountNbr"));
		confirm_accountNbr.sendKeys(prop.getProperty("accountNbr"));
		
		ref1_LastName.sendKeys(prop.getProperty("ref1_LastName"));
		ref1_FirstName.sendKeys(prop.getProperty("ref1_FirstName"));
		ref1_relation.sendKeys(prop.getProperty("ref1_relation"));
		ref1_cphoneNbr1.sendKeys(prop.getProperty("ref1_cphoneNbr1"));
		ref1_cphoneNbr2.sendKeys(prop.getProperty("ref1_cphoneNbr2"));
		ref1_cphoneNbr3.sendKeys(prop.getProperty("ref1_cphoneNbr3"));
		
		ref2_LastName.sendKeys(prop.getProperty("ref2_LastName"));
		ref2_FirstName.sendKeys(prop.getProperty("ref2_FirstName"));
		ref2_relation.sendKeys(prop.getProperty("ref2_relation"));
		ref2_PhoneNbr1.sendKeys(prop.getProperty("ref2_PhoneNbr1"));
		ref2_PhoneNbr2.sendKeys(prop.getProperty("ref2_PhoneNbr2"));
		ref2_PhoneNbr3.sendKeys(prop.getProperty("ref2_PhoneNbr3"));
		Thread.sleep(2000);
		ref_Button.click();
		bankrupty.sendKeys(prop.getProperty("bankrupty"));
	
		marRadioEmailOptOut.click();
		marRadioSmsOptOut.click();
		marRadioAutoCallOut.click();
		
		saveAndExit.click();
		
		extent.flush();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
