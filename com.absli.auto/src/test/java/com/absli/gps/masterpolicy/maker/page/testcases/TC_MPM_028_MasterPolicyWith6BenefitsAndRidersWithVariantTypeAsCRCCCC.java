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

public class TC_MPM_028_MasterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCCCC extends AbsliBase {

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
	
	@DataProvider(name="TestDataFromTC_MPM_028")
	public Object[][] getTestDataFromTestDataFromTC_MPM_028()
	{
		Object arrobj[][]=TestUtill.getDataFromExcel("C:\\Users\\Gokulnath\\git\\com.absli.auto\\com.absli.auto\\src\\main\\java\\com\\absli\\testdata\\gps\\masterpolicymaker\\Test Data For TC_MPM_028.xlsx", "TC_MPM_028");
		return arrobj;			
	}
	
	@Test(priority = 27,dataProvider = "TestDataFromTC_MPM_028", dataProviderClass = TC_MPM_028_MasterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCCCC.class)
	public void createAMasterPolicyWith4BenefitsAndRidersWithVariantTypeAsCRCCCC (String clientName, String agreementNumberStringValue, String quotationDetailsStringValue, 
			String title, String firstName, String number, String emailIDStringValue, String numberOfInsured, String totalSumAssuredStringValue, 
			String inceptionDateValue, String agentCodeValue, String brokerageUpdationValue, String varient, String conditionsValue, 
			String benefitType, String typeOfRenewal, String windowPeriodValue,	String nraLetterReceived, String retirementAgeValue, 
			String nraLetterReceivedDateValue,String typeOfClient, String frequency, String zone, String minimumAge, String maximumAge, 
			String reinsurerValue, String UnitAddress, String addressDetails, 
			String benefits1, String varientType1, String freeCoverLimitValueForBaseBenefit, 
			String benefits2, String varientType2, String percentageofBaseBenefitValueForInbuildRider, String freeCoverLimitValueForInbuildRider, String minimumCapValueForInbuildRider, String maximumCapValueForInbuildRider, 
			String benefits3, String varientType3, String freeCoverLimitValueForAdditionalRider, 
			String benefits4, String varientType4, String freeCoverLimitValue4, 
			String benefits5, String varientType5, String freeCoverLimitValue5, 
			String benefits6, String varientType6, String freeCoverLimitValue6) throws Throwable
	{
		homePage.masterPolicyMakerPage();
		masterPolicyMakerPage= new MasterPolicyMakerPage();
		masterPolicyMakerPage.masterPolicyWith6BenefitsAndRidersWithVariantTypeAsCRCCCC(clientName, 
				agreementNumberStringValue, quotationDetailsStringValue, title, firstName, number, emailIDStringValue, 
				numberOfInsured, totalSumAssuredStringValue, inceptionDateValue, agentCodeValue, brokerageUpdationValue, 
				varient, conditionsValue, benefitType, typeOfRenewal, windowPeriodValue, nraLetterReceived, 
				retirementAgeValue, nraLetterReceivedDateValue, typeOfClient, frequency, zone, minimumAge, maximumAge,
				reinsurerValue, UnitAddress, addressDetails, benefits1, varientType1, 
				freeCoverLimitValueForBaseBenefit, benefits2, varientType2, 
				percentageofBaseBenefitValueForInbuildRider, freeCoverLimitValueForInbuildRider, 
				minimumCapValueForInbuildRider, maximumCapValueForInbuildRider, benefits3, varientType3, 
				freeCoverLimitValueForAdditionalRider, benefits4, varientType4, freeCoverLimitValue4, benefits5, 
				varientType5, freeCoverLimitValue5, benefits6, varientType6, freeCoverLimitValue6);
	}
	
	@AfterMethod
	public void endUp()
	{
		homePage.logoutFunction();
		end();
	}
}
