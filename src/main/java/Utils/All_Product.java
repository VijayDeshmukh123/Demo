package Utils;


	import com.absli.pageObjects.*;
	import com.absli.utils.PropertiesUtils;
	import com.absli.utils.WaitUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.asserts.SoftAssert;
	import util.TestUtil;

	import java.io.IOException;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.HashMap;

	import static com.absli.base.BasePage.getDriver;
	import static util.CommonUtils.calculateAge;

	public class All_Product {
	    Dashboard dashboard;
	    WaitUtils wait;
	    LoginPage loginPage;
	    SalesDetails salesdetails;
	    CustomerProfile customerprofile;
	    ViewQuote viewquote;
	    CommunicationDetails communicationdetails;
	    BankDetails bankdetails;
	    Nominee nominee;
	    AddressDetalis address;
	    InsurerPersonalInfo insurerpersonalinfo;
	    InsuProfessionalDetails insuprofdetails;
	    InsurerPersonalHealth insupersonalhealth;
	    InsurerLifestyle insurerlifestyle;
	    InsurerFamilyMedical insurerfamilymedical;
	    InsurerCovidDetails insurercoviddetails;
	    InsurerMedicalHistory insurermedicalhistory;
	    ProposerPersonalInfo proposerpersonalinfo;
	    ProposerProfessionalDetails proposerprofdetails;
	    MinorPersonalHealth minorpersonalhealth;
	    ECCDPage eccd;
	    ProposerNRIMandate nriMandate;
	    InsurerNRIMandate insurerNriMandate;
	    RandAPage rna;
	    PaymentPage paymentpage;
	    DocumentsPage documentpage;
	    SpouseLifestyle spouselifestyle;
	    SpouseMedicalHistory spousemedicalhistory;
	    public static PropertiesUtils prop;
	    SoftAssert softassert;
	    HealthAndPureTermsPage healthandpuretermspage;

	    //------------------------------------------------------View Quote Page---------------------------------------//
	    public void Select_ProductTestFactory(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

	    	dashboard = new Dashboard(getDriver());
			loginPage = new LoginPage(getDriver());
			salesdetails = new SalesDetails(getDriver());
			customerprofile = new CustomerProfile(getDriver());
			viewquote = new ViewQuote(getDriver());
			communicationdetails = new CommunicationDetails(getDriver());
			bankdetails = new BankDetails(getDriver());
			nominee = new Nominee(getDriver());
			address = new AddressDetalis(getDriver());
			proposerpersonalinfo = new ProposerPersonalInfo(getDriver());
			proposerprofdetails = new ProposerProfessionalDetails(getDriver());
			insurerpersonalinfo = new InsurerPersonalInfo(getDriver());
			insuprofdetails = new InsuProfessionalDetails(getDriver());
			insupersonalhealth = new InsurerPersonalHealth((getDriver()));
			insurerlifestyle = new InsurerLifestyle(getDriver());
			insurerfamilymedical = new InsurerFamilyMedical((getDriver()));
			insurercoviddetails = new InsurerCovidDetails(getDriver());
			insurermedicalhistory = new InsurerMedicalHistory(getDriver());
			nriMandate = new ProposerNRIMandate(getDriver());
			insurerNriMandate = new InsurerNRIMandate(getDriver());
			insurerNriMandate = new InsurerNRIMandate(getDriver());
			rna = new RandAPage(getDriver());
			eccd = new ECCDPage(getDriver());
			paymentpage = new PaymentPage(getDriver());
			documentpage = new DocumentsPage(getDriver());
			prop = new PropertiesUtils();
			softassert = new SoftAssert();
			healthandpuretermspage = new HealthAndPureTermsPage(getDriver());
			//commonUtils = new CommonUtils();
			dashboard.checkLoaderWeb();
		
			
			//Select Channel
			
			 switch (testData.get("ChannelName")) {
			 
	        
	         case "BOM":
			//1)
			healthandpuretermspage.selectPlanJourneyRecommendPlansWeb(testData.get("PlanSelectionJourney"));
				 dashboard.checkLoaderWeb();

			// PSM Need Analysis //
			TestUtil.scrollTillTOPOfPage(driver);
			healthandpuretermspage.enterPremiumValueRecommendPlanWeb(testData.get("premiumValue"));
			healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanWeb(testData.get("occupationOption"));
			healthandpuretermspage.lifeStageSelectionONRecommendPlanWeb(testData.get("lifeStageValue"));
			healthandpuretermspage.investmentGoalSelectionONRecommendPlanWeb(testData.get("investmentGoalValue"));
			healthandpuretermspage.RiskprofileSelectionONRecommendPlanWeb(testData.get("riskProfileFieldValue"));
			TestUtil.scrollTillEndOfPage(driver);
			if (testData.get("AddExistingPolicies").equalsIgnoreCase("YES")) {
				healthandpuretermspage.ClickonAddExistingPoliciesWeb();
				healthandpuretermspage.EnterAllSumAssuredAmountweb(testData.get("SAAmount"));

			}
			TestUtil.scrollTillEndOfPage(driver);
			healthandpuretermspage.clickonViewPlansBtnWeb();
			dashboard.checkLoaderWeb();
			healthandpuretermspage.SelectRecommendedPlanList(testData.get("SelectPlan"));
			dashboard.checkLoaderWeb();
			String appNO = loginPage.Applicationnumber();
			 break;
			
			 }
			
			
			
			
			
			
			
			
			
			String PlanSelectionJourney=testData.get("PlanSelectionJourney");
			String SelectPlan=testData.get("SelectPlan");
			
			 switch (PlanSelectionJourney) {
			 //Non_Term Plan 
//			  1)
			 case "Recommend Plans":
			
			 switch (SelectPlan) {
			case "BSLI Guaranteed Milestone Plan":
				new ViewQuoteFactoryGMS().ViewPageGMS(getDriver(), testData);
				break;
			case "ABSLI Fixed Maturity Plan":
				new ViewQuoteFactoryFMP().ViewPageFMP(getDriver(), testData);
				break;
			case "ABSLI Assured Income Plus":
				new ViewQuoteFactoryAIP().ViewPageAIP(getDriver(), testData);
				break;
			case "ABSLI Nishchit Aayush Plan":
				new ViewQuoteFactoryN_Ayush().ViewPageNischitAyush(getDriver(), testData);
				break;
			case "ABSLI Akshaya Plan":
				new ViewQuoteFactoryAkshaya().ViewPageAkshaya(getDriver(), testData);
				break;
			case "ABSLI Nishchit Laabh Plan":
				new ViewQuoteFactoryN_Laabh().ViewPageNischitLaabh(getDriver(), testData);
				break;
			case "ABSLI Assured Savings Plan":
				new ViewQuoteFactoryASP().ViewPageASP(getDriver(), testData);
				break;
			case "BSLI Vision Endowment Plus":
				new ViewQuoteFactoryVision_Endo().ViewPageVision_Endo(getDriver(), testData);
				break;
			case "BSLI Fortune Elite":
				new ViewQuoteFactoryFortune().ViewPageFortune(getDriver(), testData);
				break;
			case "ABSLI Nishchit Pension Plan":
				new ViewQuoteFactoryN_Pension().ViewPageNischitPension(getDriver(), testData);
				break;
			case "ABSLI Poorna Suraksha Kawach":
				new ViewQuoteFactoryPSK().ViewPagePSK(getDriver(), testData);
				break;
			case "BSLI Wealth Secure Plan":
				new ViewQuoteFactoryWealth_secure().ViewPageWealth_secure(getDriver(), testData);
				break;
			case "BSLI Wealth Aspire Plan":
				new ViewQuoteFactoryWealth_aspire().ViewPageWealth_aspire(getDriver(), testData);
				break;
			case "ABSLI Anmol Suraksha Kawach":
				new ViewQuoteFactoryASK().ViewPageASK(getDriver(), testData);
				break;
			case "ABSLI Childs Future Assured Plan":
				new ViewQuoteFactoryChild_future().ViewPageChild_future(getDriver(), testData);
				break;
			case "ABSLI Digishield Plan":
				new ViewQuoteFactoryDigi().ViewPageDigi(getDriver(), testData);
				break;
			case "BSLI Cancer Shield Plan":
				new ViewQuoteFactorySalaried().ViewPageSalaried(getDriver(), testData);
				break;
			case "ABSLI Salaried Term Plan":
				new ViewQuoteFactoryAIP().ViewPageAIP(getDriver(), testData);
				break;
			case "BSLI Vision Life Income Plan":
				new ViewQuoteFactoryVision_lifeincome().ViewPageVision_lifeincome(getDriver(), testData);
				break;
			case "ABSLI Vision Life Income Plus Plan":
				new ViewQuoteFactoryVision_lifeincomeplus().ViewPageVision_lifeincomeplus(getDriver(), testData);
				break;
			case "BSLI Vision Star Plan":
				new ViewQuoteFactoryVision_star().ViewPageVision_star(getDriver(), testData);
				break;
			case "ABSLI Assured FlexiSavings Plan":
				new ViewQuoteFactoryAssured_flexi().ViewPageAssured_flexi(getDriver(), testData);
				break;
			case "BSLI CritiShield Plan":
				new ViewQuoteFactoryCriti().ViewPageCritishield(getDriver(), testData);
				break;
			case "ABSLI Platinum Gain Plan":
				new ViewQuoteFactoryPlatinum().ViewPagePlatinum_gain(getDriver(), testData);
				break;
			case "ABSLI Wealth Infinia":
				new ViewQuoteFactoryWealth_infinia().ViewPageinfinia(getDriver(), testData);
				break;
			case "BSLI Wealth Assure Plus Plan":
				new ViewQuoteFactoryAssure_Plus().ViewPageAssureplus(getDriver(), testData);
				break;
			case "BSLI Wealth Max Plan":
				new ViewQuoteFactoryWealth_Max().ViewPageWealthMax(getDriver(), testData);
				break;
			default:
                // Default case for unknown planName
                break;
				
			}
			 // Term Plan 
			 
			 case "Health & Pure Term Plans":
			 
			 
				 switch (SelectPlan) {
				 
				 case "ABSLI Anmol Suraksha Kawach":
						new ViewQuoteFactoryASK().ViewPageASK(getDriver(), testData);
						break;
						
				 }
			 
			 
			 }
	    
	    	
	    	
	    	
	    	
	    }
	    
}
