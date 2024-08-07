package com.absli.pages.clientmaster;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.absli.base.AbsliBase;
import com.absli.utill.TestUtill;

public class MasterPolicyMakerPage extends AbsliBase {
	

	@FindBy(id = "ContentPlaceHolder1_txtSearchCompany")
	WebElement clienNameSearchField;

	@FindBy(id="ContentPlaceHolder1_txtInsurerMasterAgreementNo")
	WebElement agreementNumber;

	@FindBy(id="ContentPlaceHolder1_txtQuotationDesc")
	WebElement quotationDetails;

	@FindBy(id = "ContentPlaceHolder1_ddlSalutation")
	WebElement contactPersonTitle;

	@FindBy(id = "ContentPlaceHolder1_txtContactPersonFirstName")
	WebElement contactPersonFirstName;

	@FindBy(id = "ContentPlaceHolder1_txtContactNumber")
	WebElement contactNumber;

	@FindBy(id = "ContentPlaceHolder1_txtEmailID")
	WebElement emailID;

	@FindBy(id = "ContentPlaceHolder1_txtTotalMembers")
	WebElement totalProbableNumberOfInsured;

	@FindBy(id = "ContentPlaceHolder1_txtSumInsured")
	WebElement totalSumAssured;

	@FindBy(id = "ContentPlaceHolder1_txtAgreementStart")
	WebElement inceptionDate;

	@FindBy(id = "ContentPlaceHolder1_txtIntermediaryCode")
	WebElement marketingOfficerCode;

	@FindBy(id = "ContentPlaceHolder1_txtAgentCode")
	WebElement agentCode;

	@FindBy(id = "ContentPlaceHolder1_txtBrokerageUpdation")
	WebElement brokerageUpdation;
	
	@FindBy(id = "ContentPlaceHolder1_rbIsChannelDiscountApplicable_0")
	WebElement isChannelDiscountApplicableYesButton;
	
	@FindBy(id = "ContentPlaceHolder1_rbIsChannelDiscountApplicable_1")
	WebElement isChannelDiscountApplicableNoButton;
	
	@FindBy(id = "ContentPlaceHolder1_ddlChannelType")
	WebElement channelTypeDropDown;

	@FindBy(id = "ContentPlaceHolder1_ddlProduct")
	WebElement variantDropDown;

	@FindBy(id = "ContentPlaceHolder1_txtComments")
	WebElement specialConditions;

	@FindBy(id = "ContentPlaceHolder1_ddlBenefitType")
	WebElement benefitTypeDropDown;

	@FindBy(id="ContentPlaceHolder1_chkIsEmployee")
	WebElement schemeLevelButton;

	@FindBy(id="ContentPlaceHolder1_chkIsEmployee")
	WebElement memberLevelButton;

	@FindBy(id="ContentPlaceHolder1_txtWindowPeriod")
	WebElement windowPeriodForMemberAddition;

	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedYes")
	WebElement isNRALetterReceivedYesButton;

	@FindBy(id="ContentPlaceHolder1_rbtNRIIsNRILetterReceivedNo")
	WebElement isNRALetterReceivedNoButton;

	@FindBy(id = "ContentPlaceHolder1_txtNormalRetirementAge")
	WebElement retirementAge;

	@FindBy(id="ContentPlaceHolder1_txtNRILetterReceivedDate")
	WebElement nraLetterReceivedDate;

	@FindBy(id="ContentPlaceHolder1_ddlFrequency")
	WebElement frequencyDropDown;

	@FindBy(id="ContentPlaceHolder1_ddlZonal")
	WebElement zoneDropDown;

	@FindBy(id="ContentPlaceHolder1_txtUnderwritingMinimumAge")
	WebElement underwritingMinimumAge;

	@FindBy(id="ContentPlaceHolder1_txtUnderwritingMaximumAge")
	WebElement underwritingMaximumAge;
	
	@FindBy(id="ContentPlaceHolder1_txtMinimumTenor")
	WebElement minimumTenure;

	@FindBy(id="ContentPlaceHolder1_txtMaximumTenor")
	WebElement maximumTenure;
	
	@FindBy(id="ContentPlaceHolder1_txtMaturityAge")
	WebElement maturityAge;

	@FindBy(id="ContentPlaceHolder1_ddlReinsurer")
	WebElement reInsurerDropDown;
	
	@FindBy(id="ContentPlaceHolder1_ddlInstitutionType")
	WebElement institutionTypeDropDown;
	
	@FindBy(id="ContentPlaceHolder1_chkLevelCover")
	WebElement levelCoverCheckBox;
	
	@FindBy(id="ContentPlaceHolder1_chkVariableCover")
	WebElement reducingCoverCheckBox;
	
	@FindBy(id="ContentPlaceHolder1_chkIncreasingCover")
	WebElement increasingCoverCheckBox;
	
	@FindBy(id="ContentPlaceHolder1_txtIncreasePercentage")
	WebElement increasePercentage;
	
	@FindBy(id="ContentPlaceHolder1_txtincreasemaxLimit")
	WebElement increasingCoverMaxLimit;
	
	@FindBy(css="#ContentPlaceHolder1_ChkbxLoanTypeList label")
	List<WebElement> loanTypeReinsurerLabels;
	
	@FindBy(id="ContentPlaceHolder1_rbUnitAddress_1")
	WebElement unitAddressNoButton;

	@FindBy(id="ContentPlaceHolder1_rbUnitAddress_0")
	WebElement unitAddressYesButton;
	
	@FindBy(id="ContentPlaceHolder1_rbAddress_1")
	WebElement addressNoButton;

	@FindBy(id="ContentPlaceHolder1_rbAddress_0")
	WebElement addressYesButton;

	@FindBy(id="ContentPlaceHolder1_ddlCoverage")
	WebElement benefitsDropDown;

	@FindBy(id="ContentPlaceHolder1_ddlVariantType")
	WebElement variantTypeDropDown;
	
	@FindBy(id = "ContentPlaceHolder1_ddlGroupGrade")
	WebElement gradeDropDown;
	
	@FindBy(id = "ContentPlaceHolder1_txtRetirementAge")
	WebElement retirementAgeInVariantType;
	
	@FindBy(id = "ContentPlaceHolder1_txtSumAssured")
	WebElement maxSumAssured;
	
	@FindBy(id="ContentPlaceHolder1_txtSumAssured")
	WebElement sumAssured;
	
	@FindBy(id = "ContentPlaceHolder1_txtBaseBenefitPercentage")
	WebElement percentageOfBaseBenefit;

	@FindBy(id = "ContentPlaceHolder1_txtCoverageSumInsured")
	WebElement freeCoverLimit;
	
	@FindBy(id = "ContentPlaceHolder1_txtMultiplesOfSalary")
	WebElement multiplesOfSalary;
	
	@FindBy(id = "ContentPlaceHolder1_txtMinimumSACap")
	WebElement minimumCap;
	
	@FindBy(id = "ContentPlaceHolder1_txtMaximumSACap")
	WebElement maximumCap;
	
	@FindBy(id="ContentPlaceHolder1_btnAddCoverage")
	WebElement addRidersButton;

	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ui-button ui-corner-all ui-widget\"]")
	WebElement okButtonInPopMessage;
	
	@FindBy(xpath = "//div[@id=\"ContentPlaceHolder1_UpdatePanel3\"]//input[@id=\"ContentPlaceHolder1_fuLogo\"]")
	WebElement chooseFile;
	
	@FindBy(id="ContentPlaceHolder1_btnupload")
	WebElement fileUploadButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnSendToApprover")
	WebElement sentToCheckerButton;
	
	@FindBy(id = "ContentPlaceHolder1_btnSave")
	WebElement saveButton;
	
	@FindBy(id="ContentPlaceHolder1_Messagebox_lblMsg")
	WebElement popMessageText;
	
	public MasterPolicyMakerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void popupMsgVerification(String popupSuccessfullMsgTextValue) throws Throwable
	{
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		if(popMsgTextValue.equals(popupSuccessfullMsgTextValue))
		{
			System.out.println("Popup Message: " + popMsgTextValue);
		}
		else
		{
			System.out.println("Popup Message: " + popMsgTextValue);
			TestUtill.takeScreenshotAtEndOfTest(popMsgTextValue);
		}
		okButtonInPopMessage.click();
	}
	
	//common steps - GPS
	public void mandatoryFields(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String typeOfRenewal, String windowPeriodValue,	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails) throws Throwable
	{
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue,Keys.ENTER);
		quotationDetails.sendKeys(quotationDetailsStringValue,Keys.ENTER);
		selectVisibleText(contactPersonTitle, title);
		contactPersonFirstName.sendKeys(firstName,Keys.ENTER);
		contactNumber.sendKeys(number,Keys.ENTER);
		emailID.sendKeys(emailIDStringValue,Keys.ENTER);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys(numberOfInsured,Keys.ENTER);
		totalSumAssured.sendKeys(totalSumAssuredStringValue,Keys.ENTER);
		inceptionDate.sendKeys(inceptionDateValue,Keys.ENTER);
		agentCode.sendKeys(agentCodeValue,Keys.ENTER);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys(brokerageUpdationValue,Keys.ENTER);
		selectVisibleText(variantDropDown, varient);
		Thread.sleep(3000);
		specialConditions.sendKeys(conditionsValue,Keys.ENTER);
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, benefitType);
		Thread.sleep(3000);
		if (typeOfRenewal.equals("Scheme Level")) {
			schemeLevelButton.click();
		} else {
			memberLevelButton.click();
		}
		windowPeriodForMemberAddition.sendKeys(windowPeriodValue,Keys.ENTER);
		if(nraLetterReceived.equals("Yes"))
		{
			isNRALetterReceivedYesButton.click();
			retirementAge.sendKeys(retirementAgeValue,Keys.ENTER);
			nraLetterReceivedDate.sendKeys(nraLetterReceivedDateValue,Keys.ENTER);

		}else {

			isNRALetterReceivedNoButton.click();
		}
		selectVisibleText(frequencyDropDown, frequency);
		Thread.sleep(3000);
		selectVisibleText(zoneDropDown, zone);
		Thread.sleep(3000);
		underwritingMinimumAge.sendKeys(minimumAge,Keys.ENTER);
		underwritingMaximumAge.sendKeys(maximumAge,Keys.ENTER);
		selectVisibleText(reInsurerDropDown, reinsurerValue);
		Thread.sleep(3000);
		//Unit Details
		if(unitAddress.equals("No")) {
			unitAddressNoButton.click();
		}else {
			unitAddressYesButton.click();
			//need to write the code for new unit address
		} 
		if(addressDetails.equals("No"))
		{
			addressNoButton.click();
		}else {
			addressYesButton.click();
			//need to write the code for new address
		}
	}
	
	//Customer Defined SA
	public void customerDefinedSA(String freeCoverLimitValue)
	{
		wait.until(ExpectedConditions.elementToBeClickable(freeCoverLimit));
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
	}
	//Flat Sum Assured
	public void flatSumAssured(String sumAssuredValue, String freeCoverLimitValue)
	{
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		sumAssured.sendKeys(sumAssuredValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
	}
	//Multiple Of Salary
	public void multipleOfSalary(String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue)
	{
		wait.until(ExpectedConditions.elementToBeClickable(multiplesOfSalary));
		multiplesOfSalary.sendKeys(multiplesOfSalaryValue,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
	}
	
	//Graded Cover - Grade 1
	public void gradedCoverGrade1(String gradeValue1, String sumAssuredValue1, String freeCoverLimitValue1, 
			String minimumCapValue1, String maximumCapValue1)
	{
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		selectVisibleText(gradeDropDown, gradeValue1);
		sumAssured.sendKeys(sumAssuredValue1,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue1,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue1,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue1,Keys.ENTER);	
	}
	
	//Graded Cover - Grade 2
	public void gradedCoverGrade2(String gradeValue2, String sumAssuredValue2, String freeCoverLimitValue2, 
			String minimumCapValue2, String maximumCapValue2)
	{
		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
		selectVisibleText(gradeDropDown, gradeValue2);
		sumAssured.sendKeys(sumAssuredValue2,Keys.ENTER);
		freeCoverLimit.sendKeys(freeCoverLimitValue2,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue2,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue2,Keys.ENTER);
	}
	
	//Graded Cover - Grade 3
		public void gradedCoverGrade3(String gradeValue3, String sumAssuredValue3, String freeCoverLimitValue3, 
				String minimumCapValue3, String maximumCapValue3)
		{
			wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
			selectVisibleText(gradeDropDown, gradeValue3);
			sumAssured.sendKeys(sumAssuredValue3,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue3,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue3,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue3,Keys.ENTER);
		}
		
	//Future Service Gratuity Amount
		public void futureServiceGratuityAmount(String retirementAgeValueInVariantType, String maxSumAssuredValue, 
				String freeCoverLimitValue, String minimumCapValue, String maximumCapValue)
		{
			wait.until(ExpectedConditions.elementToBeClickable(retirementAgeInVariantType));
			retirementAgeInVariantType.sendKeys(retirementAgeValueInVariantType,Keys.ENTER);
			maxSumAssured.sendKeys(maxSumAssuredValue,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		}
	//Rider
		public void rider(String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, String minimumCapValue,
				String maximumCapValue)
		{
			wait.until(ExpectedConditions.elementToBeClickable(percentageOfBaseBenefit));
			percentageOfBaseBenefit.sendKeys(percentageofBaseBenefitValue,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValueForRider);
			minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		}
	//Graded Cover Salary Multiple - Grade 1
		public void gradedCoverSalaryMultipleGrade1(String gradeValue1, String multiplesOfSalaryValue1, String freeCoverLimitValue1,
				String minimumCapValue1, String maximumCapValue1)
		{
			wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
			selectVisibleText(gradeDropDown, gradeValue1);
			multiplesOfSalary.sendKeys(multiplesOfSalaryValue1,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue1,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue1,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue1,Keys.ENTER);
		}
	//Graded Cover Salary Multiple - Grade 3
		public void gradedCoverSalaryMultipleGrade2(String gradeValue2, String multiplesOfSalaryValue2, String freeCoverLimitValue2,
					String minimumCapValue2, String maximumCapValue2)
		{
			wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
			selectVisibleText(gradeDropDown, gradeValue2);
			multiplesOfSalary.sendKeys(multiplesOfSalaryValue2,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue2,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue2,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue2,Keys.ENTER);
		}
	//Graded Cover Salary Multiple - Grade 3
		public void gradedCoverSalaryMultipleGrade3(String gradeValue3, String multiplesOfSalaryValue3, String freeCoverLimitValue3,
					String minimumCapValue3, String maximumCapValue3)
		{
			wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
			selectVisibleText(gradeDropDown, gradeValue3);
			multiplesOfSalary.sendKeys(multiplesOfSalaryValue3,Keys.ENTER);
			freeCoverLimit.sendKeys(freeCoverLimitValue3,Keys.ENTER);
			minimumCap.sendKeys(minimumCapValue3,Keys.ENTER);
			maximumCap.sendKeys(maximumCapValue3,Keys.ENTER);
		}
	//Accept the popup message and click the 'Ok' button
		public void acceptPopupMsg()
		{
			wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
			okButtonInPopMessage.click();
		}
	//Capture the popup message and Click on 'Ok' button
		public void acceptPopupMsgAndCaptureTheMsg()
		{
			wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
			String popMsgTextValue = popMessageText.getText();
			System.out.println("Popup Message: " + popMsgTextValue);
			okButtonInPopMessage.click();
		}
		
		
		
	//Product - GPS
	
	/* TC_MPM_001 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Customer Defined SA'.
	 */
	public void masterPolicyWithMandatoryFieldsAndCustomerDefinedSA(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		customerDefinedSA(freeCoverLimitValue);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		//saveButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
		
	}
	
	/* TC_MPM_002 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Flat Sum Assured'.
	 */

	public void masterPolicyWithMandatoryFieldsAndFlatSumAssured(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String sumAssuredValue, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		flatSumAssured(sumAssuredValue, freeCoverLimitValue);
//		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
//		sumAssured.sendKeys(sumAssuredValue,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
	/* TC_MPM_003 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Multiple Of Salary'.
	 */
	public void masterPolicyWithMandatoryFieldsAndMultipleOfSalary(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String multiplesOfSalaryValue, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(multiplesOfSalary));
		multipleOfSalary(multiplesOfSalaryValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
//		multiplesOfSalary.sendKeys(multiplesOfSalaryValue,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
//		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}

	/* TC_MPM_004 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Graded Cover'.
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCover(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String noOfGrade, String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, 
			String maximumCapValue1, String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, 
			String maximumCapValue2, String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, 
			String maximumCapValue3) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverGrade1(gradeValue1, sumAssuredValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
//		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
//		selectVisibleText(gradeDropDown, gradeValue1);
//		sumAssured.sendKeys(sumAssuredValue1,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue1,Keys.ENTER);
//		minimumCap.sendKeys(minimumCapValue1,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue1,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverGrade2(gradeValue2, sumAssuredValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
//		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
//		selectVisibleText(gradeDropDown, gradeValue2);
//		sumAssured.sendKeys(sumAssuredValue2,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue2,Keys.ENTER);
//		minimumCap.sendKeys(minimumCapValue2,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue2,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverGrade3(gradeValue3, sumAssuredValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
//		wait.until(ExpectedConditions.elementToBeClickable(sumAssured));
//		selectVisibleText(gradeDropDown, gradeValue3);
//		sumAssured.sendKeys(sumAssuredValue3,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue3,Keys.ENTER);
//		minimumCap.sendKeys(minimumCapValue3,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue3,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
		
	}

	/* TC_MPM_005 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 'GPS Base Benefit' & 
	 * 				variant type as 'Future Service Gratuity Amount'.
	 */
	public void masterPolicyWithMandatoryFieldsAndFutureServiceGratuityAmount(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String typeOfRenewal, String windowPeriodValue,	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails, String benefits,String varientType, 
			String retirementAgeValueInVariantType, String maxSumAssuredValue, String freeCoverLimitValue, String minimumCapValue, 
			String maximumCapValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		futureServiceGratuityAmount(retirementAgeValueInVariantType, maxSumAssuredValue, freeCoverLimitValue, minimumCapValue, maximumCapValue);
//		retirementAgeInVariantType.sendKeys(retirementAgeValueInVariantType,Keys.ENTER);
//		maxSumAssured.sendKeys(maxSumAssuredValue,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
//		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
	/* TC_MPM_006 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 *				Benefit as 'GPS Base Benefit' & variant type as 'Customer Defined SA' and 
	 *				Benefit as 'GPS Rider - Accelerated Terminal Illness Rider' & variant type as 'Rider'.
	 */
	
	public void masterPolicyWithMandatoryFieldsAndRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, 
				nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, UnitAddress, addressDetails);
		//Base Benefit
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForRider);
//		wait.until(ExpectedConditions.elementToBeClickable(freeCoverLimit));
//		freeCoverLimit.sendKeys(freeCoverLimitValueForBaseBenefit,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		
		//Additional Rider
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
//		wait.until(ExpectedConditions.elementToBeClickable(percentageOfBaseBenefit));
//		percentageOfBaseBenefit.sendKeys(percentageofBaseBenefitValue,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValueForRider);
//		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
	/* TC_MPM_007 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 
	 * 			  	'GPS Base Benefit' & variant type as 'Graded Cover Salary Multiple'.
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCoverSalaryMultiple(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String noOfGrade, String gradeValue1, String multiplesOfSalaryValue1,String freeCoverLimitValue1, String minimumCapValue1, 
			String maximumCapValue1, String gradeValue2, String multiplesOfSalaryValue2, String freeCoverLimitValue2, String minimumCapValue2, 
			String maximumCapValue2, String gradeValue3, String multiplesOfSalaryValue3, String freeCoverLimitValue3, String minimumCapValue3, 
			String maximumCapValue3) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);
		//Grade 1
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverSalaryMultipleGrade1(gradeValue1, multiplesOfSalaryValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
//		wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
//		selectVisibleText(gradeDropDown, gradeValue1);
//		multiplesOfSalary.sendKeys(multiplesOfSalaryValue1,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue1,Keys.ENTER);
//		minimumCap.sendKeys(minimumCapValue1,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue1,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		//Grade 2
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverSalaryMultipleGrade2(gradeValue2, multiplesOfSalaryValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
//		wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
//		selectVisibleText(gradeDropDown, gradeValue2);
//		multiplesOfSalary.sendKeys(multiplesOfSalaryValue2,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue2,Keys.ENTER);
//		minimumCap.sendKeys(minimumCapValue2,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue2,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		//Grade 3
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		gradedCoverSalaryMultipleGrade3(gradeValue3, multiplesOfSalaryValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
//		wait.until(ExpectedConditions.elementToBeClickable(gradeDropDown));
//		selectVisibleText(gradeDropDown, gradeValue3);
//		multiplesOfSalary.sendKeys(multiplesOfSalaryValue3,Keys.ENTER);
//		freeCoverLimit.sendKeys(freeCoverLimitValue3,Keys.ENTER);
//		minimumCap.sendKeys(minimumCapValue3,Keys.ENTER);
//		maximumCap.sendKeys(maximumCapValue3,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
	
	/*	TC_MPM_008 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				 Benefit as 'GPS Base Benefit' & variant type as 'Customer Defined SA' and 
	 * 				 Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */

	public void masterPolicyWithMandatoryFieldsAndCustomerDefinedSAWithInBuiltRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String addressDetails,
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, 
				UnitAddress, addressDetails);
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		customerDefinedSA(freeCoverLimitValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/*	TC_MPM_009 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				 Benefit as 'GPS Base Benefit' & variant type as 'Flat Sum Assured' and 
	 * 				 Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	
	public void masterPolicyWithMandatoryFieldsAndFlatSumAssuredWithInBuiltRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String UnitAddress, String addressDetails,
			String benefits1, String varientType1, String sumAssuredValue, String freeCoverLimitValueForBaseBenefit, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValue, String maximumCapValue) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, 
				UnitAddress, addressDetails);
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		flatSumAssured(totalSumAssuredStringValue, freeCoverLimitValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValue, maximumCapValue);
		addRidersButton.click();
		acceptPopupMsg();
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_010 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				Benefit as 'GPS Base Benefit' & variant type as 'Multiple Of Salary' and 
	 * 				Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	public void masterPolicyWithMandatoryFieldsAndMultipleOfSalaryWithInBuiltRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, 
			String totalSumAssuredStringValue, String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, 
			String varient, String conditionsValue, String benefitType, String typeOfRenewal, String windowPeriodValue,	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String unitAddress, String addressDetails,String benefits1, 
			String varientType1, String multiplesOfSalaryValue, String freeCoverLimitValueForBaseBenefit, 
			String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValueForRider, String maximumCapValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, 
				nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge,
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		multipleOfSalary(multiplesOfSalaryValue, freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);	
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValueForRider, maximumCapValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
		
		
	}
	
	/* TC_MPM_011 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				Benefit as 'GPS Base Benefit' & variant type as 'Graded Cover' and 
	 * 				Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCoverWithInBuiltRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits1, 
			String varientType1, String noOfGrade, String gradeValue1, String sumAssuredValue1,String freeCoverLimitValue1, String minimumCapValue1, 
			String maximumCapValue1, String gradeValue2, String sumAssuredValue2,String freeCoverLimitValue2, String minimumCapValue2, 
			String maximumCapValue2, String gradeValue3, String sumAssuredValue3,String freeCoverLimitValue3, String minimumCapValue3, 
			String maximumCapValue3, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValueForRider, String maximumCapValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, 
				nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, 
				minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverGrade1(gradeValue1, sumAssuredValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverGrade2(gradeValue2, sumAssuredValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverGrade3(gradeValue3, sumAssuredValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValueForRider, maximumCapValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_012 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				Benefit as 'GPS Base Benefit' & variant type as 'Future Service Gratuity Amount' and 
	 * 				Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	public void masterPolicyWithMandatoryFieldsAndFutureServiceGratuityAmountWithInBuiltRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String typeOfRenewal, String windowPeriodValue,	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails, String benefits1,String varientType1, 
			String retirementAgeValueInVariantType, String maxSumAssuredValueString, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, 
			String maximumCapValueForBaseBenefit, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValueForRider, String maximumCapValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, 
				nraLetterReceived, retirementAgeValueInVariantType, nraLetterReceivedDateValue, typeOfClient, frequency, 
				zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails);
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		futureServiceGratuityAmount(retirementAgeValueInVariantType, maxSumAssuredValueString, freeCoverLimitValueForBaseBenefit, 
				minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValueForRider, maximumCapValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	/* TC_MPM_013 - Verify user able to create the Master Policy by providing only the Mandatory fields with 
	 * 				Benefit as 'GPS Base Benefit' & variant type as 'Graded Cover Salary Multiple' and 
	 * 				Riders as 'GPS Rider - Terminal illness Premier (In-Built)' & variant type as 'Rider'
	 */
	public void masterPolicyWithMandatoryFieldsAndGradedCoverSalaryMultipleWithInBuiltRider(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits1, 
			String varientType1, String noOfGrade, String gradeValue1, String multiplesOfSalaryValue1,String freeCoverLimitValue1, String minimumCapValue1, 
			String maximumCapValue1, String gradeValue2, String multiplesOfSalaryValue2, String freeCoverLimitValue2, String minimumCapValue2, 
			String maximumCapValue2, String gradeValue3, String multiplesOfSalaryValue3, String freeCoverLimitValue3, String minimumCapValue3, 
			String maximumCapValue3, String benefits2, String varientType2, String percentageofBaseBenefitValue, String freeCoverLimitValueForRider, 
			String minimumCapValueForRider, String maximumCapValueForRider) throws Throwable
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, 
				nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, 
				maximumAge, reinsurerValue, unitAddress, addressDetails);
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultipleGrade1(gradeValue1, multiplesOfSalaryValue1, freeCoverLimitValue1, minimumCapValue1, maximumCapValue1);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultipleGrade2(gradeValue2, multiplesOfSalaryValue2, freeCoverLimitValue2, minimumCapValue2, maximumCapValue2);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits1);
		selectVisibleText(variantTypeDropDown, varientType1);
		gradedCoverSalaryMultipleGrade3(gradeValue3, multiplesOfSalaryValue3, freeCoverLimitValue3, minimumCapValue3, maximumCapValue3);
		addRidersButton.click();
		acceptPopupMsg();
		
		selectVisibleText(benefitsDropDown, benefits2);
		selectVisibleText(variantTypeDropDown, varientType2);
		rider(percentageofBaseBenefitValue, freeCoverLimitValueForRider, minimumCapValueForRider, maximumCapValueForRider);
		addRidersButton.click();
		acceptPopupMsg();
		
		sentToCheckerButton.click();
		acceptPopupMsgAndCaptureTheMsg();
	}
	
	
	//Verify able to capture the Error popup message & screenshot
	
	public void captureAErrorPopupMessage(String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,String benefits, 
			String varientType, String freeCoverLimitValue) throws Throwable 
	{
		mandatoryFields(clientName, agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, 
				emailIDStringValue, numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, 
				brokerageUpdationValue, varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, 
				reinsurerValue, unitAddress, addressDetails);

		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		customerDefinedSA(freeCoverLimitValue);
//		wait.until(ExpectedConditions.elementToBeClickable(freeCoverLimit));
//		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		if(popMsgTextValue.equals("Master Policy Number Sent for Checker Approval Successfully"))
		{
			System.out.println("Popup Message: " + popMsgTextValue);
		}
		else
		{
			System.out.println("Popup Message: " + popMsgTextValue);
			TestUtill.takeScreenshotAtEndOfTest(popMsgTextValue);
		}
		okButtonInPopMessage.click();
	}
	
	//Product - GBY
	
	/*  TC_GBY_MPM_001 - Verify user able to create the Master Policy by providing only the Mandatory fields with Benefit as 
	 * 'ABSLI Group BIMA Yojana Death Benefit V3' & variant type as 'Customer Defined SA'.
	 */
	public void createMasterPolicyMakerWithGPSBaseBenefitAndVariantType(String clientName, String agreementNumberStringValue, 
			String quotationDetailsStringValue, String title, String firstName, String number, String emailIDStringValue, 
			String numberOfInsured, String totalSumAssuredStringValue, String agentCodeValue, String brokerageUpdationValue, 
			String varient, String inceptionDateValue, String conditionsValue, String benefitType, String windowPeriodValue, 
			String zone, String minimumAge, String maximumAge, String minimumTenureValue, String maximumTenureValue, 
   			String maturityAgeValue, String reinsurerValue, String unitAddress, String addressDetails, String benefits, 
   			String varientType, String freeCoverLimitValue, String minimumCapValue, String maximumCapValue) throws Throwable
	{
		clienNameSearchField.sendKeys(clientName);
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys(agreementNumberStringValue,Keys.ENTER);
		quotationDetails.sendKeys(quotationDetailsStringValue,Keys.ENTER);
		selectVisibleText(contactPersonTitle, title);
		contactPersonFirstName.sendKeys(firstName,Keys.ENTER);
		contactNumber.sendKeys(number,Keys.ENTER);
		emailID.sendKeys(emailIDStringValue,Keys.ENTER);
		totalProbableNumberOfInsured.click();
		totalProbableNumberOfInsured.sendKeys(numberOfInsured,Keys.ENTER);
		totalSumAssured.sendKeys(totalSumAssuredStringValue,Keys.ENTER);
		agentCode.sendKeys(agentCodeValue,Keys.ENTER);
		brokerageUpdation.clear();
		brokerageUpdation.sendKeys(brokerageUpdationValue,Keys.ENTER);
		selectVisibleText(variantDropDown, varient);
		Thread.sleep(3000);
		inceptionDate.sendKeys(inceptionDateValue,Keys.ENTER);
		specialConditions.sendKeys(conditionsValue,Keys.ENTER);
		Thread.sleep(3000);
		selectVisibleText(benefitTypeDropDown, benefitType);
		Thread.sleep(3000);
		windowPeriodForMemberAddition.sendKeys(windowPeriodValue,Keys.ENTER);
		selectVisibleText(zoneDropDown, zone);
		Thread.sleep(3000);
		underwritingMinimumAge.sendKeys(minimumAge,Keys.ENTER);
		underwritingMaximumAge.sendKeys(maximumAge,Keys.ENTER);
		minimumTenure.sendKeys(minimumTenureValue);
		maximumTenure.sendKeys(maximumTenureValue);
		maturityAge.sendKeys(maturityAgeValue);
		selectVisibleText(reInsurerDropDown, reinsurerValue);
		Thread.sleep(3000);
		//Unit Details
				if(unitAddress.equals("No")) {
					unitAddressNoButton.click();
				}else {
					unitAddressYesButton.click();
					//need to write the code for new unit address
				} 
				if(addressDetails.equals("No"))
				{
					addressNoButton.click();
				}else {
					addressYesButton.click();
					//need to write the code for new address
				}
		selectVisibleText(benefitsDropDown, benefits);
		selectVisibleText(variantTypeDropDown, varientType);
		wait.until(ExpectedConditions.elementToBeClickable(minimumCap));
		freeCoverLimit.sendKeys(freeCoverLimitValue,Keys.ENTER);
		minimumCap.sendKeys(minimumCapValue,Keys.ENTER);
		maximumCap.sendKeys(maximumCapValue,Keys.ENTER);
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		sentToCheckerButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		String popMsgTextValue = popMessageText.getText();
		System.out.println("Popup Message: " + popMsgTextValue);
		okButtonInPopMessage.click();
	}
	
	//Product - GSS - Group Smart Select
	public void createMasterPolicyMaker() throws Throwable
	{
		String isChannelDiscountApplicableValue= "Yes";
		String coverType= "Level Cover";
		String unitAddress= "No";
		String addressDetails= "No";
		
		clienNameSearchField.sendKeys("Absli-Auto-001");
		Thread.sleep(2000);
		clienNameSearchField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(9000);
		agreementNumber.sendKeys("896745");
		quotationDetails.sendKeys("NA");
		selectVisibleText(contactPersonTitle, "Mr");
		contactPersonFirstName.sendKeys("Gokul");
		contactNumber.sendKeys("9867864523",Keys.ENTER);
		emailID.sendKeys("absli@gmail.com",Keys.ENTER);
		totalProbableNumberOfInsured.sendKeys("100",Keys.ENTER);
		totalSumAssured.sendKeys("1000000",Keys.ENTER);
		agentCode.sendKeys("132430",Keys.ENTER);
		brokerageUpdation.sendKeys("10");
		if(isChannelDiscountApplicableValue.equals("Yes"))
		{
			isChannelDiscountApplicableYesButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(channelTypeDropDown));
			selectVisibleText(channelTypeDropDown, "Direct");
		}
		else {
			isChannelDiscountApplicableNoButton.click();
		}
		selectVisibleText(variantDropDown, "GSS Benefit and Rider");
		Thread.sleep(3000);
		inceptionDate.sendKeys("1/1/2024");
		specialConditions.sendKeys("xxyz");
		Thread.sleep(3000);
		selectVisibleText(zoneDropDown, "Jayanagar");
		underwritingMinimumAge.sendKeys("18",Keys.ENTER);
		underwritingMaximumAge.sendKeys("70",Keys.ENTER);
		selectVisibleText(reInsurerDropDown, "test");
		Thread.sleep(3000);
		selectVisibleText(institutionTypeDropDown, "B1");
		if(coverType.equals("Level Cover"))
		{
			levelCoverCheckBox.click();
		}else if (coverType.equals("Reducing Cover")) 
		{
			reducingCoverCheckBox.click();
		}else if (coverType.equals("Increasing Cover"))
		{
			increasingCoverCheckBox.click();
			increasePercentage.sendKeys("30");
			increasingCoverMaxLimit.sendKeys("100000");
		}else {
			System.out.println("The cover type is not available. Please check the cover type");
		}
		for (WebElement loanTypeReinsurerlabel : loanTypeReinsurerLabels) 
		{
			if(loanTypeReinsurerlabel.getText().equals("Testing"))
			{
				WebElement checkBox = loanTypeReinsurerlabel.findElement(By.xpath("preceding-sibling::input[@type='checkbox']"));
				if (!checkBox.isSelected()) 
				{
					checkBox.click();
				}
				break;
			}
		}
		//Unit Details
		if(unitAddress.equals("No")) {
			unitAddressNoButton.click();
		}else {
			unitAddressYesButton.click();
			//need to write the code for new unit address
		} 
		if(addressDetails.equals("No"))
		{
			addressNoButton.click();
		}else {
			addressYesButton.click();
			//need to write the code for new address
		}
		selectVisibleText(benefitsDropDown, "Death Benefit");
		wait.until(ExpectedConditions.elementToBeClickable(addRidersButton));
		addRidersButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonInPopMessage));
		okButtonInPopMessage.click();
		chooseFile.sendKeys("C:\\Users\\Gokulnath\\Desktop\\ABSLI\\GSS\\New folder\\GSS Premium Rate Sheet-Auto-01.xlsx");
		wait.until(ExpectedConditions.elementToBeClickable(fileUploadButton));
		fileUploadButton.click();
		
	}
	
}
