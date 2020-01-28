package com.qa.utilities;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class RegistrationThroughExcel extends TestBase{
	public static Excel excel;
	
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
	
	public RegistrationThroughExcel(){
		PageFactory.initElements(driver, this);
	}
	public void registration(){
	 excel = new Excel("C://QCProject_Automation//QCProject_Automation//src//main//java//com//qa//TestData//QC_Borrower_Registration.xls");
	 
	 for(int rowNum=2;rowNum<=excel.getRowCount("QC_Borrower_Registration");rowNum++){
		 String ssn1=excel.getCellData("QC_Borrower_Registration", "SSN1", rowNum);
		
	 }
	 
	}
}
