package Utils;

import static com.absli.base.BasePage.getDriver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.absli.base.TestBase;
import com.absli.pageObjects.AddressDetalis;
import com.absli.pageObjects.BankDetails;
import com.absli.pageObjects.CommunicationDetails;
import com.absli.pageObjects.CompanyProfessionalDetails;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.DocumentsPage;
import com.absli.pageObjects.ECCDPage;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.InsuProfessionalDetails;
import com.absli.pageObjects.InsurabilityDeclaration;
import com.absli.pageObjects.InsurerCovidDetails;
import com.absli.pageObjects.InsurerFamilyMedical;
import com.absli.pageObjects.InsurerLifestyle;
import com.absli.pageObjects.InsurerMedicalHistory;
import com.absli.pageObjects.InsurerNRIMandate;
import com.absli.pageObjects.InsurerPersonalHealth;
import com.absli.pageObjects.InsurerPersonalInfo;
import com.absli.pageObjects.JointlifePage;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.MinorCovidDetails;
import com.absli.pageObjects.MinorPersonalHealth;
import com.absli.pageObjects.MinorPersonalInfo;
import com.absli.pageObjects.Nominee;
import com.absli.pageObjects.PaymentPage;
import com.absli.pageObjects.ProposerNRIMandate;
import com.absli.pageObjects.ProposerPersonalInfo;
import com.absli.pageObjects.ProposerProfessionalDetails;
import com.absli.pageObjects.RandAPage;
import com.absli.pageObjects.SalesDetails;
import com.absli.pageObjects.SpouseCovidDetails;
import com.absli.pageObjects.SpouseLifestyle;
import com.absli.pageObjects.SpouseMedicalHistory;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import static util.CommonUtils.*;
import util.*;
import util.TestUtil;

public class GoToPSMpageJourney extends TestBase{
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
	CompanyProfessionalDetails companyprofdetails;
	InsurerPersonalInfo insurerpersonalinfo;
	InsuProfessionalDetails insuprofdetails;
	InsurerPersonalHealth insupersonalhealth;
	InsurerLifestyle insurerlifestyle;
	InsurerFamilyMedical insurerfamilymedical;
	InsurerCovidDetails insurercoviddetails;
	InsurerMedicalHistory insurermedicalhistory;
	ProposerPersonalInfo proposerpersonalinfo;
	ProposerProfessionalDetails proposerprofdetails;
	MinorPersonalInfo minorpersonalinfo;
	MinorPersonalHealth minorpersonalhealth;
	MinorCovidDetails minorcoviddetails;
	InsurabilityDeclaration insudecleration;
	ECCDPage eccd;
	ProposerNRIMandate nriMandate;
	InsurerNRIMandate insurerNriMandate;
	RandAPage rna;
	PaymentPage paymentpage;
	DocumentsPage documentpage;
	JointlifePage jointlife;
	SpouseLifestyle spouselifestyle;
	SpouseCovidDetails spousecovid;
	SpouseMedicalHistory spousemedicalhistory;
	public static PropertiesUtils prop;
	SoftAssert softassert;
	HealthAndPureTermsPage healthandpuretermspage;
	//CommonUtils commonUtils;
	// ------------------------------------------------------Same
	// GMS------------------------------------------------------------------//

	public void gotoPSMpage(WebDriver driver, HashMap<String, String> testData) throws Exception {

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
		
		new SelectChannel_TestFactory().Select_Channel(getDriver(), testData);
		
		
		dashboard.checkLoaderWeb();
		TestUtil.scrollTillEndOfPage(getDriver());
		if (testData.get("ProposerInsuredSame").equalsIgnoreCase("YES")) {
			clickButton(getDriver(), customerprofile.ClickOnIsproposerInsuredSameYESButton());
			// customerprofile.ClickOnIsproposerInsuredSameYESButton();

		} else {
			customerprofile.ClickOnIsproposerInsuredSameNOButton();
			// customerprofile.ClickOnIsproposerInsuredSameNOButton();
			customerprofile.SelectRelationWithInsured(testData.get("RelationWithInsured"));
		}
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();

		if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
			customerprofile.ClickOnYesBtnWeb();
			wait.WaitTime2();
			customerprofile.selectTypeOfNRIWeb(testData.get("TypeOfNRI"));
			wait.WaitTime2();
			customerprofile.SelectNRICountryWeb(testData.get("NRICountry"));
			wait.WaitTime2();
			customerprofile.IspropNRIgstwavier(testData.get("propNRIGSTwavier"));
		}

		if (testData.get("IsPanAvailabel").equalsIgnoreCase("YES")) {

			commonUtils.EnterText(getDriver(), customerprofile.enterpanNumberQAWeb(),
					testData.get("ProposerPanNumber")); // QA
			wait.WaitTime2();
			customerprofile.clickOnProposerIAgreeCheckboxWeb();

			wait.WaitTime2();
			customerprofile.cpnextbutton(); // customer profile Next Button(QA)
			dashboard.checkLoaderWeb();
			wait.WaitTime2();

			try {
				customerprofile.IsElementPresent();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				if (testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnEditButton();

					customerprofile.ClickOnEditAlerPopUp();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
					customerprofile.ClearEditPanNameWeb();
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();
					TestUtil.scrollTillEndOfPage(getDriver());
					customerprofile.ClickOnConfirmButton();// this is bug
					dashboard.checkLoaderWeb();
					

				} else if (testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnEditButton();
					wait.WaitTime2();
					customerprofile.ClickOnEditAlerPopUp();
					dashboard.checkLoaderWeb();

					customerprofile.ClearEditProposerDOBWeb("10101985");
					TestUtil.scrollTillEndOfPage(getDriver());
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();
					TestUtil.scrollTillEndOfPage(getDriver());
					customerprofile.ClickOnConfirmButton();// this is bug
					dashboard.checkLoaderWeb();
//					TestUtil.scrollTillEndOfPage(getDriver());
//					customerprofile.ClickOnConfirmButton();// this is bug
//					dashboard.checkLoaderWeb();

				} else {
					customerprofile.ClickOnConfirmButton();
					dashboard.checkLoaderWeb();
					customerprofile.ClickOnConfirmButton();// this is bug
					dashboard.checkLoaderWeb();

				}

			} catch (Exception e) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnAadharCardButton();
					customerprofile.EnterProposerAadharCardNoWeb(testData.get("AadharCardNo"));
					// customerprofile.EnterProposerOTPWeb("");
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();

				} else if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnEnterManualButton();
					dashboard.checkLoaderWeb();
					customerprofile.enterProposerDOBWeb(testData.get("ProposerDOB"));
					dashboard.checkLoaderWeb();
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();

					TestUtil.scrollTillEndOfPage(getDriver());
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();

				}
			}
		} else {
			customerprofile.ClickOnProposerCheckBox();

			if (testData.get("IsNRI").equalsIgnoreCase("NO")) {
				customerprofile.ClickOnAlerPopUp();
			}

			customerprofile.clickOnProposerIAgreeCheckboxWeb();
			customerprofile.cpnextbutton();
			dashboard.checkLoaderWeb();

			if (testData.get("IsAadhaarCard").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnAadharCardButton();
				customerprofile.EnterProposerAadharCardNoWeb(testData.get("AadharCardNo"));

				// customerProfile.EnterProposerOTPWeb("");
				// customerprofile.ClickonGetOTPButton();
				dashboard.checkLoaderWeb();
				TestUtil.scrollTillEndOfPage(getDriver());

				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();

				TestUtil.scrollTillEndOfPage(getDriver());

				if (testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnEditButton();

					customerprofile.ClickOnEditAlerPopUp();
					dashboard.checkLoaderWeb();

					customerprofile.ClearEditPanNameWeb();
					TestUtil.scrollTillEndOfPage(getDriver());
					Thread.sleep(2000);
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();

				} else if (testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnEditButton();

					customerprofile.ClickOnEditAlerPopUp();
					dashboard.checkLoaderWeb();

					customerprofile.ClearEditProposerDOBWeb("10101985");
					TestUtil.scrollTillEndOfPage(getDriver());
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();

				} else {
					customerprofile.ClickOnConfirmButton();
					dashboard.checkLoaderWeb();

				}

			} else if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEnterManualButton();

				customerprofile.enterProposerDOBWeb(testData.get("ProposerDOB"));

				customerprofile.EnterFirstNameInsuredweb(testData.get("ProposerName"));
				customerprofile.EnterMiddleNameInsuredweb(testData.get("ProposerMiddleName"));
				customerprofile.EnterLastNameInsuredweb(testData.get("ProposerLastName"));

				customerprofile.clickOnGenderBtnWeb(testData.get("ProposerGender"));

				customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("ProposerSalutation"));
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
//				customerprofile.ClickOnConfirmButton();// PLZ COMFIRM THIS IS BUG
//				dashboard.checkLoaderWeb();

			}

		}

	}



}