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
public class TC_MPM_113_MasterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRFsgaFsgaR extends AbsliBase  {

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
	
	@DataProvider(name="TestDataFromTC_MPM_113")
	public Object[][] getTestDataFromTestDataFromTC_MPM_113()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_113.xlsx", "TC_MPM_113");
		return arrobj;
	}
	
	@Test(priority = 112,dataProvider = "TestDataFromTC_MPM_113", dataProviderClass = TC_MPM_113_MasterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRFsgaFsgaR.class)
	public void createAMasterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRFsgaFsgaR (String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, 
			String conditionsValue, String benefitType, String typeOfRenewal, String windowPeriodValue,	
			String nraLetterReceived, String retirementAgeValue, String nraLetterReceivedDateValue,
			String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, String reinsurerValue, 
			String unitAddress, String addressDetails, 
			String benefits1, String varientType1, String retirementAgeValueForBaseBenefit, String maxSumAssuredValueForBaseBenefit, String freeCoverLimitValueForBaseBenefit, String minimumCapValueForBaseBenefit, String maximumCapValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider,
			String benefits3, String varientType3, String retirementAgeValueForAdditionalRider, String maxSumAssuredValueForAdditionalRider, String freeCoverLimitValueForAdditionalRider, String minimumCapValueForAdditionalRider, String maximumCapValueForAdditionalRider,
			String benefits4, String varientType4, String retirementAgeValue4, String maxSumAssuredValue4, String freeCoverLimitValue4, String minimumCapValue4, String maximumCapValue4,
			String benefits5, String varientType5, String percentageofBaseBenefitValue5, String freeCoverLimitValue5, String minimumCapValue5, String maximumCapValue5) throws Throwable	{
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith5BenefitsAndRidersWithVariantTypeAsFsgaRFsgaFsgaR(clientName, 
				agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, varient, 
				conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, retirementAgeValue, 
				nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge, reinsurerValue, unitAddress, 
				addressDetails, benefits1, varientType1, retirementAgeValueForBaseBenefit, maxSumAssuredValueForBaseBenefit, 
				freeCoverLimitValueForBaseBenefit, minimumCapValueForBaseBenefit, maximumCapValueForBaseBenefit, benefits2, 
				varientType2, percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, 
				minimumCapValueForInbuildRider, maximumCapValueForInbuildRider, benefits3, varientType3, 
				retirementAgeValueForAdditionalRider, maxSumAssuredValueForAdditionalRider, freeCoverLimitValueForAdditionalRider, 
				minimumCapValueForAdditionalRider, maximumCapValueForAdditionalRider, benefits4, varientType4, retirementAgeValue4, 
				maxSumAssuredValue4, freeCoverLimitValue4, minimumCapValue4, maximumCapValue4, benefits5, varientType5, 
				percentageofBaseBenefitValue5, freeCoverLimitValue5, minimumCapValue5, maximumCapValue5);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
