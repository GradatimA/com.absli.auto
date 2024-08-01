package com.absli.gps.masterpolicy.maker.page.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.base.AbsliBase;
import com.absli.pages.HomePage;
import com.absli.pages.LoginPage;
import com.absli.pages.clientmaster.MasterPolicyMakerPage;
import com.absli.utill.MyITestListener;
import com.absli.utill.MySuiteListener;
import com.absli.utill.TestUtill;

@Listeners({MySuiteListener.class,MyITestListener.class})
public class TC_MPM_109_MasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRRR extends AbsliBase  {

	LoginPage loginPage;
	HomePage homePage;
	MasterPolicyMakerPage masterPolicyMakerPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		loginPage.loginFunction(prof.getProperty("username"), prof.getProperty("password"));
		homePage=new HomePage();
	}
	
	@DataProvider(name="TestDataFromTC_MPM_109")
	public Object[][] getTestDataFromTestDataFromTC_MPM_109()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_109.xlsx", "TC_MPM_109");
		return arrobj;
	}
	
	@Test(priority = 108,dataProvider = "TestDataFromTC_MPM_109", dataProviderClass = TC_MPM_109_MasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRRR.class)
	public void createAMasterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRRR (String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, String unitAddress, String addressDetails,
			String benefits1, String varientType1,  
			 	String gradeValueValueForBaseBenefit1, String sumAssuredValueForBaseBenefit1,String freeCoverLimitValueForBaseBenefit1, String minimumCapValueForBaseBenefit1, String maximumCapValueForBaseBenefit1, 
			 	String gradeValueValueForBaseBenefit2, String sumAssuredValueForBaseBenefit2,String freeCoverLimitValueForBaseBenefit2, String minimumCapValueForBaseBenefit2, String maximumCapValueForBaseBenefit2, 
			 	String gradeValueValueForBaseBenefit3, String sumAssuredValueForBaseBenefit3,String freeCoverLimitValueForBaseBenefit3, String minimumCapValueForBaseBenefit3, String maximumCapValueForBaseBenefit3, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String percentageofBaseBenefitValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String percentageofBaseBenefitValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable	{
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith5BenefitsAndRidersWithVariantTypeAsGcRRRR(clientName, agreementNumberStringValue, 
				quotationDetailsStringValue, title, firstName, number, emailIDStringValue, numberOfInsured, 
				totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, conditionsValue, 
				benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, retirementAgeValue, nraLetterReceivedDateValue, 
				typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, addressDetails, benefits1, 
				varientType1, gradeValueValueForBaseBenefit1, sumAssuredValueForBaseBenefit1, freeCoverLimitValueForBaseBenefit1, 
				minimumCapValueForBaseBenefit1, maximumCapValueForBaseBenefit1, gradeValueValueForBaseBenefit2, 
				sumAssuredValueForBaseBenefit2, freeCoverLimitValueForBaseBenefit2, minimumCapValueForBaseBenefit2, 
				maximumCapValueForBaseBenefit2, gradeValueValueForBaseBenefit3, sumAssuredValueForBaseBenefit3, 
				freeCoverLimitValueForBaseBenefit3, minimumCapValueForBaseBenefit3, maximumCapValueForBaseBenefit3, benefits2, 
				varientType2, percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, 
				minimumCapValueForInbuildRider, maximumCapValueForInbuildRider, benefits3, varientType3, 
				percentageofBaseBenefitValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, 
				minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider, benefits4, varientType4, 
				percentageofBaseBenefitValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4, benefits5, varientType5, 
				percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
