package Utils;

import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

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

import util.TestUtil;

public class EndToEndProMinorJourney {

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
//------------------------------------------------------Same GMS------------------------------------------------------------------//

	public void gotoEndToEndMinorJourney(WebDriver driver, HashMap<String, String> testData)
			throws InterruptedException, IOException {

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
		minorpersonalinfo = new MinorPersonalInfo(getDriver());
		minorpersonalhealth = new MinorPersonalHealth(getDriver());
		minorcoviddetails = new MinorCovidDetails(getDriver());
		insudecleration = new InsurabilityDeclaration(getDriver());





		// Communication Details Page //

		Thread.sleep(2000);
		dashboard.checkLoaderWeb();
		communicationdetails.EnterProposerMobileNoweb(testData.get("ProposerMobileNumber"));
		communicationdetails.EnterProposerEmailIdweb(testData.get("ProposerEmailId"));
		TestUtil.scrollTillEndOfPage(getDriver());
		// communicationdetails.SelectpreflangWeb(testData.get("PreferredLang"));
		communicationdetails.enteraltnumber(testData.get("AlternateNumber"));
		communicationdetails.enterresnumber(testData.get("ResidenceNumber"));
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();

		// Communication Details Insured== //

		communicationdetails.EnterInsuredMobileNoweb(testData.get("InsuredMobno"));
		// communicationdetails.EnterInsuredEmailIdweb(testData.get("Insuemail"));
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();

		// Custmer Photo page //
		communicationdetails.ClickDoitLatercapitalbutton();
		dashboard.checkLoaderWeb();
		// Custmer Photo page //
		communicationdetails.ClickDoitLatercapitalbutton();
		dashboard.checkLoaderWeb();

//    	try {
//			documentpage.UploadFileweb();
//			TestUtil.scrollTillEndOfPage(driver);
//		} catch (Exception e) {
//
//			System.out.println("Customer Photo is Not Display");
//		}
//		customerprofile.cdnextbutton(); // customer details NEXT button(QA)
//		dashboard.checkLoaderWeb();
		// Bank Details Page //
		bankdetails.InputIFSCCode(testData.get("IFSCCode"));
		dashboard.checkLoaderWeb();
		// wait.WaitTime2();
		TestUtil.scrollTillEndOfPage(driver);
		// wait.WaitTime2();
		bankdetails.EnterAccountNumberField(testData.get("AccountNo"));
		dashboard.checkLoaderWeb();

		bankdetails.ClickVerifyButtinweb();

		// bankdetails.ClickVerifyButtinweb();
		dashboard.checkLoaderWeb();
		int count = 0;

		while (count <= 5) {
			try {
				bankdetails.ClickOnProceedBtnweb();
				break;
			} catch (Exception e) {
				System.out.println(e);
			}
			count++;
		}
		dashboard.checkLoaderWeb();
		bankdetails.ClickPaymentMethodweb(testData.get("PaymentMethod"));
		bankdetails.Clickdrawdateweb(testData.get("PreferredDrawDate"));
		bankdetails.Clicksourcefundweb(testData.get("SourceOfFunds"));
		TestUtil.scrollTillEndOfPage(driver);
		// bankdetails.ClickSaveButtonweb();
		dashboard.checkLoaderWeb();

		TestUtil.scrollTillEndOfPage(driver);

		customerprofile.cdnextbutton(); // customer details NEXT button(QA)
		dashboard.checkLoaderWeb();

		try {
			

			customerprofile.cdnextbutton(); // customer details NEXT button(QA)
			dashboard.checkLoaderWeb();

		} catch (Exception e) {
			System.out.println("Bank Summary Page is Not Display");
		}

	

		// Proposer-Insured Personal info tab // (Minor Scenario)
//    Thread.sleep(2000);
//    proposerpersonalinfo.SelectMaritalStatusweb(testData.get("Propmarital"));
//    if(testData.get("Propmarital").equalsIgnoreCase("Married")){
//        if(testData.get("PropTitle").equalsIgnoreCase("Ms.")){
//            proposerpersonalinfo.EnterMaidenNameweb(testData.get("propMaidenName"));
//        } else if (testData.get("PropTitle").equalsIgnoreCase("Mrs.")) {
//            proposerpersonalinfo.EnterMaidenNameweb(testData.get("propMaidenName"));
//        }
//    }
		proposerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("PropfatherSpouse"));
		proposerpersonalinfo.EnterMotherNameweb(testData.get("Propmothername"));
		Thread.sleep(2000);
		proposerpersonalinfo.SelectBirthPlaceweb(testData.get("ProposerBirthPlace"));

//    if (testData.get("IsHaveEIA").equalsIgnoreCase("Want to Apply")) {
//        proposerpersonalinfo.EIAwanttoapply(testData.get("PreferredIR"));
//    } else if (testData.get("IsHaveEIA").equalsIgnoreCase("Yes")) {
//        proposerpersonalinfo.EIAwantyes();
//    }
		if (testData.get("IsPropPolitical").equalsIgnoreCase("Yes")) {
			proposerpersonalinfo.IsaProppolitical(testData.get("PoliticalDetails"));
		}

		// Proposer Professional Details tab //
		proposerprofdetails.SelectQualificationweb(testData.get("Propqualification"));
		//proposerprofdetails.SelectOccupationweb(testData.get("PropoccupationOption"));
		if (testData.get("occupationOption").equalsIgnoreCase("Professional")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Business Owner")) {
			proposerprofdetails.EnterOccupationNameofbusinessweb(testData.get("Propnameofbusiness"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Service")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Driver")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Armed Forces")) {
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Army/Navy/Police")) {
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Skilled Worker")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Jeweller")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Builder")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Scrap Dealer")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Doctor")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Lawyer")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Architect")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
			//insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Others")) {
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("IsAreYouRegisterPerson").equalsIgnoreCase("Yes")) {
			proposerprofdetails.ClickOnAreYouRegisterPersonaUnderGSTweb(testData.get("GSTnumber"));
		}
		proposerprofdetails.ClickonProposerAddInsuredButtonweb();

		// Minor personal info tab //
		Thread.sleep(2000);
		minorpersonalinfo.EnterMinorFatherNameweb(testData.get("MinorFatherName"));
		minorpersonalinfo.EnterMinorMotherNameweb(testData.get("MinorMotherName"));
		minorpersonalinfo.selectminorliving(testData.get("MinorLivingWith"));
		minorpersonalinfo.SelectBirthPlaceweb(testData.get("MinorBirthPlace"));
		TestUtil.scrollTillEndOfPage(getDriver());

		if (testData.get("IsInsuPolitical").equalsIgnoreCase("Yes")) {
			insurerpersonalinfo.IsMinorpolitical(testData.get("IsInsuPolitical"));
		}
		minorpersonalinfo.selectEducationStage(testData.get("Stage"), testData.get("Studying"),
				testData.get("CollegeStudy"));
		insurerlifestyle.ClickSaveContinueBtn(); // Save & Continue Button QA//
		dashboard.checkLoaderWeb();

		// family Insurance History //
		if (testData.get("IsFamilyInsuHistory").equalsIgnoreCase("Yes")) {
			dashboard.checkLoaderWeb();
			Thread.sleep(1000);
			minorpersonalinfo.familyinsuhistory();
			minorpersonalinfo.enterbrothernumber(testData.get("BrotherSibling"));
			minorpersonalinfo.entersisternumber(testData.get("SisterSibling"));
			minorpersonalinfo.selectchildreninsured(testData.get("AreChildrenInsured"),
					testData.get("childrenDetails"));
			minorpersonalinfo.selectexistingpolicyfather(testData.get("EXistingFather"), testData.get("FinurerName"),
					testData.get("Fsumassured"), testData.get("Fpolnumber"), testData.get("Fdate"),
					testData.get("Fmonth"), testData.get("Fyear"), testData.get("Fissueyear"));

			minorpersonalinfo.selectexistingpolicymother(testData.get("EXistingMother"), testData.get("MinurerName"),
					testData.get("Msumassured"), testData.get("Mpolnumber"), testData.get("Mdate"),
					testData.get("Mmonth"), testData.get("Myear"), testData.get("Missueyear"));

			minorpersonalinfo.selectexistingpolicybrother(testData.get("EXistingBrother"), testData.get("BinurerName"),
					testData.get("Bsumassured"), testData.get("Bpolnumber"), testData.get("Bdate"),
					testData.get("Bmonth"), testData.get("Byear"), testData.get("Bissueyear"));

			minorpersonalinfo.selectexistingpolicysister(testData.get("EXistingSister"), testData.get("SinurerName"),
					testData.get("Ssumassured"), testData.get("Spolnumber"), testData.get("Sdate"),
					testData.get("Smonth"), testData.get("Syear"), testData.get("Sissueyear"));

		}

		// Existing Policy and Refused Policy Tab //
		if (testData.get("AddexistingPolicy").equalsIgnoreCase("Existing Policy")) {
			insurerpersonalinfo.IsAddexistingPolicy(testData.get("AddexistingPolicy"), testData.get("InsurerName"),
					testData.get("SumAssured"));
		}
		if (testData.get("AddrefusedPolicy").equalsIgnoreCase("Refused Policy")) {
			insurerpersonalinfo.IsAddrefusedPolicy(testData.get("AddrefusedPolicy"), testData.get("PolicyType"),
					testData.get("InsurerNameRef"), testData.get("SumAssuredref"), testData.get("ReasonRef"));
		}
		customerprofile.cdnextbutton(); // customer details NEXT button(QA)
		dashboard.checkLoaderWeb();
		Thread.sleep(2000);
		// Purpose Of Insurance //
		TestUtil.scrollTillTOPOfPage(getDriver());
		insurerpersonalinfo.SelectpurposeofIns(testData.get("InsurancePurpose1"), testData.get("InsurancePurpose2"),
				testData.get("InsurancePurpose3"));
		TestUtil.scrollTillEndOfPage(getDriver());
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();

		// Address Details page //
		if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
				&& testData.get("IsAadhaarCard").equalsIgnoreCase("NO")) {
			TestUtil.scrollTillTOPOfPage(getDriver());
			if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
				if (testData.get("AddressLocation1").equalsIgnoreCase("International")) {
					address.ClickOnAddressLocationButton(testData.get("AddressLocation1"));

					address.ClearEditPinWeb(testData.get("pinCode"));

					address.validationAddressOneWeb(testData.get("addressOne"));
					address.EnterCityAddressWeb(testData.get("CityAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					// address.EnterCountryAddressWeb(NRICountry);
					// documentpage.ClickOnPermanentAddress();

					WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
					TestUtil.scrollToElement(getDriver(), ScrollEle1);

					if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
						address.ClickOnPermanentAddress();

					} else {
						address.ClickOnAddressLocation2Button(testData.get("AddressLocation2"));
						if (testData.get("AddressLocation2").equalsIgnoreCase("International")) {

							address.enterpermanentpincode(testData.get("pinCode"));

							address.enterpermanentadd1(testData.get("addressOne"));
							address.enterpermanentcity(testData.get("CityAddress"));
							address.EnterStateAddress(testData.get("StateAddress"));

						} else if (testData.get("AddressLocation2").equalsIgnoreCase("Indian")) {
							address.enterpermanentpincode(testData.get("pinCode"));
							address.enterpermanentadd1(testData.get("addressOne"));
						}

					}

				} else if (testData.get("AddressLocation1").equalsIgnoreCase("Indian")) {
					address.ClearEditPinWeb(testData.get("pinCode"));
					address.validationAddressOneWeb(testData.get("addressOne"));
					WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
					TestUtil.scrollToElement(getDriver(), ScrollEle1);
					// this is perment address
					if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
						address.ClickOnPermanentAddress();

					} else {
						address.ClickOnAddressLocation2Button(testData.get("AddressLocation2"));
						if (testData.get("AddressLocation2").equalsIgnoreCase("International")) {

							address.enterpermanentpincode(testData.get("pinCode"));

							address.enterpermanentadd1(testData.get("addressOne"));
							address.enterpermanentcity(testData.get("CityAddress"));
							address.EnterStateAddress(testData.get("StateAddress"));
						} else if (testData.get("AddressLocation2").equalsIgnoreCase("Indian")) {
							address.enterpermanentpincode(testData.get("pinCode"));
							address.enterpermanentadd1(testData.get("addressOne"));

						}
					}

				}

				TestUtil.scrollTillEndOfPage(driver);
				customerprofile.ClickOnConfirmButton();
				dashboard.checkLoaderWeb();

			} else {
				address.clickAddressDropdownWeb();

				address.selectAddressWeb(testData.get("addressType"));
				Thread.sleep(1000);
				address.enterPinWeb(testData.get("pinCode"));

				address.validationAddressOneWeb(testData.get("addressOne"));
				WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
				TestUtil.scrollToElement(getDriver(), ScrollEle1);
				if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
					address.ClickOnPermanentAddress();

				} else {
					address.EnterPinCodeWeb(testData.get("PinCodeTwo"));

					address.EnterPermanentAddressOneWeb(testData.get("AddressFour"));
				}

				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.ClickOnConfirmButton();
				dashboard.checkLoaderWeb();

			}
		} else if (testData.get("EditAddress").equalsIgnoreCase("YES")) {
			TestUtil.scrollTillEndOfPage(getDriver());
			customerprofile.ClickOnEditButton();

			address.ClickOnEditAlerOkayPopUp();
			// dashboard.checkLoaderWeb();

			TestUtil.scrollTillTOPOfPage(getDriver());
			if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
				if (testData.get("AddressLocation1").equalsIgnoreCase("International")) {
					address.ClickOnAddressLocationButton(testData.get("AddressLocation1"));

					address.ClearEditPinWeb(testData.get("pinCode"));

					address.validationAddressOneWeb(testData.get("addressOne"));
					address.EnterCityAddressWeb(testData.get("CityAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					// address.EnterCountryAddressWeb(NRICountry);
					// documentpage.ClickOnPermanentAddress();

					WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
					TestUtil.scrollToElement(getDriver(), ScrollEle1);

					if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
						address.ClickOnPermanentAddress();

					} else {
						address.ClickOnAddressLocation2Button(testData.get("AddressLocation2"));
						if (testData.get("AddressLocation2").equalsIgnoreCase("International")) {

							address.enterpermanentpincode(testData.get("pinCode"));

							address.enterpermanentadd1(testData.get("addressOne"));
							address.enterpermanentcity(testData.get("CityAddress"));
							address.EnterStateAddress(testData.get("StateAddress"));

						} else if (testData.get("AddressLocation2").equalsIgnoreCase("Indian")) {
							address.enterpermanentpincode(testData.get("pinCode"));
							address.enterpermanentadd1(testData.get("addressOne"));
						}

					}

				} else if (testData.get("AddressLocation1").equalsIgnoreCase("Indian")) {
					address.ClearEditPinWeb(testData.get("pinCode"));
					address.validationAddressOneWeb(testData.get("addressOne"));
					WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
					TestUtil.scrollToElement(getDriver(), ScrollEle1);
					// this is perment address
					if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
						address.ClickOnPermanentAddress();

					} else {
						address.ClickOnAddressLocation2Button(testData.get("AddressLocation2"));
						if (testData.get("AddressLocation2").equalsIgnoreCase("International")) {

							address.enterpermanentpincode(testData.get("pinCode"));

							address.enterpermanentadd1(testData.get("addressOne"));
							address.enterpermanentcity(testData.get("CityAddress"));
							address.EnterStateAddress(testData.get("StateAddress"));
						} else if (testData.get("AddressLocation2").equalsIgnoreCase("Indian")) {
							address.enterpermanentpincode(testData.get("pinCode"));
							address.enterpermanentadd1(testData.get("addressOne"));

						}
					}

				}

			} else {
				address.enterPinWeb(testData.get("pinCode"));

				address.validationAddressOneWeb(testData.get("addressOne"));
				WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
				TestUtil.scrollToElement(getDriver(), ScrollEle1);
				if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
					address.ClickOnPermanentAddress();

				} else {
					address.EnterPinCodeWeb(testData.get("PinCodeTwo"));

					address.EnterPermanentAddressOneWeb(testData.get("AddressFour"));
				}
			}
			TestUtil.scrollTillEndOfPage(driver);
			address.ClickAddressEditSubmitWeb();
			// customerProfile.ClickOnConfirmButton();
			dashboard.checkLoaderWeb();

		} else {
			TestUtil.scrollTillEndOfPage(driver);
			customerprofile.ClickOnConfirmButton();
			dashboard.checkLoaderWeb();

		}
		dashboard.checkLoaderWeb();
		Thread.sleep(2000);
		// Insurer Personal Health Details Tab //
		if (testData.get("IsAddRiderGMS").equalsIgnoreCase("YES")
				|| testData.get("IsAddRiderAIP").equalsIgnoreCase("YES")
				|| testData.get("IsAddRiderN_AyushPlan").equalsIgnoreCase("YES")
				|| testData.get("IsAddRiderAkshaya").equalsIgnoreCase("YES")
				|| testData.get("IsAddRiderASP").equalsIgnoreCase("YES")) {
			// Insurer Personal Health Details Tab //
			insupersonalhealth.EnterHeightFeet(testData.get("HeightFeet"));
			insupersonalhealth.EnterHeightInch(testData.get("HeightInch"));
			insupersonalhealth.EnterWeight(testData.get("weight"));
			if (testData.get("Isweightgainlost").equalsIgnoreCase("Yes")) {
				insupersonalhealth.ClickOnIsThereAnyWeightChangesYESBtnWeb(testData.get("Weightgainlost"));
			}
			insupersonalhealth.ClickSaveContinuecapitalBtn(); // SAVE & CONTINUE button QA//
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			// Insurer Lifestyle Details Tab //
			if (testData.get("IsLifeStyleDetails").equalsIgnoreCase("YES")) {

				if (testData.get("IsNarcoticsDetails").equalsIgnoreCase("YES")) {
					insurerlifestyle.selectNarcoticsYESButton();

					insurerlifestyle.EnterReasonForNarcotics(testData.get("ProvideDetails"));
				}

				TestUtil.scrollToElement(driver,
						getDriver().findElement(By.xpath("//div[text()='Alcohol Consumption']")));

				if (testData.get("IsAlcoholConsumptionDetails").equalsIgnoreCase("YES")) {
					insurerlifestyle.selectAlcohalConsumptionYESButton();

					insurerlifestyle.TypeofAlcoholConsume(testData.get("TypeOfAlcohal"), testData.get("Quantity"),
							testData.get("Frequency"));

					if (testData.get("AlcoholAdviseQ1").equalsIgnoreCase("YES")) {
						insurerlifestyle.selectAdvicealcoholYESButton(testData.get("Hospital"), testData.get("Reason"),
								testData.get("VisitDate"), testData.get("VisitMonth"), testData.get("VisitYear"));
					}
					if (testData.get("AlcoholAddictsQ2").equalsIgnoreCase("YES")) {
						insurerlifestyle.selectAlcohalAddictsYESButton();
					}
					if (testData.get("AlcoholAddinfoQ3").equalsIgnoreCase("YES")) {
						insurerlifestyle.selectAlcohalAddinfoYESButton(testData.get("Addinfo"));
					}
				}

				TestUtil.scrollToElement(driver,
						getDriver().findElement(By.xpath("//div[text()='Tobacco / Nicotine ']")));

				if (testData.get("IsTobaccoNicotine").equalsIgnoreCase("YES")) {
					insurerlifestyle.selectTobacconicotinYESButton();
					insurerlifestyle.Clickdurationmonthweb(testData.get("MonthDuration"));
					insurerlifestyle.TypeofTobacco(testData.get("Tobaccotype"), testData.get("quantity"),
							testData.get("noofyear"));

					if (testData.get("Advicetostop").equalsIgnoreCase("Yes")) {
						insurerlifestyle.selectAdvisetostopYESButton(testData.get("SpecifyReason"));
					}
				}

				TestUtil.scrollToElement(driver,
						getDriver().findElement(By.xpath("//div[text()='Hazardous Activities']")));
				if (testData.get("IsHazardousActivities").equalsIgnoreCase("YES")) {
					insurerlifestyle.selectHazardousActivityYESButton();
					insurerlifestyle.HazardousSelectOption1(testData.get("Hazardactivity"));
					insurerlifestyle.enteryerashazard(testData.get("MentionYears"));
					insurerlifestyle.HazardousSelectOption2(testData.get("HazardActivityBy"));
				}
				TestUtil.scrollTillEndOfPage(getDriver());
				if (testData.get("IsTravel").equalsIgnoreCase("YES")) {
					insurerlifestyle.selectTraveloutsideYESButton();
					insurerlifestyle.TravelDetailstwelvemonth(testData.get("Country"), testData.get("City"),
							testData.get("DateofDept"), testData.get("DateofArrvl"), testData.get("Visatype"));
				}
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			insurerlifestyle.ClickSaveContinueBtn(); // Save & Continue Button QA//
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			// Insurer Medical History Tab //

			if (testData.get("IsFamilyMedical").equalsIgnoreCase("YES")) {
				if (testData.get("IsFamilyMedicalMHBS").equalsIgnoreCase("Mellitus/High blood sugar")) {
					insurerfamilymedical.ClickOnMellitusCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalHD").equalsIgnoreCase("Hereditary disorder")) {
					insurerfamilymedical.ClickOnHereditarydisorderCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalCD").equalsIgnoreCase("Chronic disorder")) {
					insurerfamilymedical.ClickOnChronicdisorderCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalHA").equalsIgnoreCase("Heart ailment")) {
					insurerfamilymedical.ClickOnHeartailmentCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalStroke").equalsIgnoreCase("Stroke")) {
					insurerfamilymedical.ClickOnStrokeCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalHBP").equalsIgnoreCase("High blood pressure")) {
					insurerfamilymedical.ClickOnHighbloodpressureCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalCncr").equalsIgnoreCase("Cancer")) {
					insurerfamilymedical.ClickOnCancerCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalDiab").equalsIgnoreCase("Diabetes")) {
					insurerfamilymedical.ClickOnDiabetesCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalKS").equalsIgnoreCase("Kidney disease")) {
					insurerfamilymedical.ClickOnKidneydiseaseCheckboxWeb();

				}
				if (testData.get("IsFamilyMedicalPyr").equalsIgnoreCase("Paralysis")) {
					insurerfamilymedical.ClickOnParalysisCheckboxWeb();

				}
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));
			}
				TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Mother']")));
				wait.WaitTime2();
				insurerfamilymedical.ValidationsOfFatherOnFamilyMedicalWeb(testData.get("FMBSLivingDemise"),
						testData.get("FMBSAgeDeath"), testData.get("FMBSStateAndCause"));
				wait.WaitTime2();
				if (testData.get("FMBSStateAndCause").equalsIgnoreCase("Others")
						&& testData.get(" FMBSLivingDemise").equalsIgnoreCase("Deceased")) {
					insurerfamilymedical.EnterOtherFilesOnFamilyMedical(testData.get("Providemeddetails"));

				} else if (testData.get("FMBSStateAndCause").equalsIgnoreCase("Others")
						&& testData.get(" FMBSLivingDemise").equalsIgnoreCase("Living")) {
					insurerfamilymedical.EnterOtherFilesOnFamilyMedicalliving(testData.get("Providemeddetails"));
				}
				WebElement Bro = getDriver().findElement(By.xpath("//div[text()='Brother']"));
				TestUtil.scrollToElement(driver, Bro);
				wait.WaitTime2();
				insurerfamilymedical.ValidationsOfMotherOnFamilyMedicalWeb(testData.get("FMBSLivingDemise"),
						testData.get("FMBSAgeDeath"), testData.get("FMBSStateAndCause"));
				wait.WaitTime2();
				if (testData.get("FMBSStateAndCause").equalsIgnoreCase("Others")
						&& testData.get("FMBSLivingDemise").equalsIgnoreCase("Deceased")) {
					insurerfamilymedical.EnterOtherFilesOnFamilyMedicalother(testData.get("Providemeddetails"));

				} else if (testData.get("FMBSStateAndCause").equalsIgnoreCase("Others")
						&& testData.get("FMBSLivingDemise").equalsIgnoreCase("Living")) {
					insurerfamilymedical.EnterOtherFilesOnFamilyMedicallivingMother(testData.get("Providemeddetails"));
				}

				if (testData.get("IsBrother").equalsIgnoreCase("YES")) {
					TestUtil.scrollTillEndOfPage(driver);
					insurerfamilymedical.ClickonAddBrotherBTNWeb();
					wait.WaitTime2();
					insurerfamilymedical.ValidationsOfBrotherOnFamilyMedicalWeb(testData.get("BSLivingDeceased"),
							testData.get("BrotherSisAge"), testData.get("BrotherSisStateOfHealth"));
					if (testData.get("BrotherSisStateOfHealth").equalsIgnoreCase("Others")
							&& testData.get("BSLivingDeceased").equalsIgnoreCase("Deceased")) {
						insurerfamilymedical.EnterOtherFilesOnFamilyMedicalBro(testData.get("Providemeddetails"));

					} else if (testData.get("BrotherSisStateOfHealth").equalsIgnoreCase("Others")
							&& testData.get("BSLivingDeceased").equalsIgnoreCase("Living")) {
						insurerfamilymedical.EnterOtherFilesOnFamilyMedicallivingBro(testData.get("Providemeddetails"));
					}
					insurerfamilymedical.ClickonSaveBrotherAndSisterBTNWeb();
				}

				if (testData.get("IsSister").equalsIgnoreCase("YES")) {
					TestUtil.scrollTillEndOfPage(driver);
					insurerfamilymedical.ClickonAddSisterBTNWeb1(testData.get("IsBrother"));
					wait.WaitTime2();
					insurerfamilymedical.ValidationsOfSisterOnFamilyMedicalWeb(testData.get("BSLivingDeceased"),
							testData.get("BrotherSisAge"), testData.get("BrotherSisStateOfHealth"));
					if (testData.get("BrotherSisStateOfHealth").equalsIgnoreCase("Others")
							&& testData.get("BSLivingDeceased").equalsIgnoreCase("Deceased")) {
						insurerfamilymedical.EnterOtherFilesOnFamilyMedicalBro(testData.get("Providemeddetails"));

					} else if (testData.get("BrotherSisStateOfHealth").equalsIgnoreCase("Others")
							&& testData.get("BSLivingDeceased").equalsIgnoreCase("Living")) {
						insurerfamilymedical.EnterOtherFilesOnFamilyMedicallivingBro(testData.get("Providemeddetails"));
					}
					Thread.sleep(1000);
					wait.WaitTime2();
					insurerfamilymedical.ClickonSaveBrotherAndSisterBTNWeb();
				}
			

			insurerlifestyle.SAVEANDCONTINUEBTN(); // Save & Continue Button QA//
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			// covid 19 details//
			if (testData.get("IsCoviddetails").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOnhaveyoutestedCOVID19Web();
				insurercoviddetails.enterdignodateweb(testData.get("DiagnosisDate"));
				insurercoviddetails.enterrecoverydateweb(testData.get("RecoveryDate"));

				if (testData.get("IsTreatmentTaken").equalsIgnoreCase("Yes")) {
					insurercoviddetails.ClickOntreatmenttakenInsWeb();

					if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("Yes")) {
						insurercoviddetails.ClickOnAsymptyesInsWeb();
					} else if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("No")) {
						insurercoviddetails.ClickOnAsymptInsnoWeb();
					}
					if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("Yes")) {
						insurercoviddetails.ClickOnHomequrInsyesWeb();
					} else if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("No")) {
						insurercoviddetails.ClickOnHomequryInsnoWeb();
					}
					if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("Yes")) {
						insurercoviddetails.ClickOnHospitalInsyesWeb();
					} else if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("No")) {
						insurercoviddetails.ClickOnHospitalInsnoWeb();
					}
				} else {
					insurercoviddetails.ClickOnTretmentTakenNOBTNWeb();
				}
			}

			insurerlifestyle.ClickSaveContinueBtn(); // Save & Continue Button QA//
			dashboard.checkLoaderWeb();

			// Insurer Medical History Tab //
			insurermedicalhistory.Clickononotoall(); // for No To All check box //

			if (testData.get("IsFamilyMedicaldetails").equalsIgnoreCase("YES")) {
				if (testData.get("IsAbsentFromWork").equalsIgnoreCase("YES")) {
					insurermedicalhistory.ClickonAbsentfromWork();

					insurermedicalhistory.EnterAbsentfromWorkCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterAbsentfromWorkDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsult(testData.get("AFWLCday"),
							testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosis(testData.get("AFWDDday"),
							testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalization(testData.get("AFWdetails"));
				} else if (testData.get("IsAbsentFromWork").equalsIgnoreCase("NO")) {
					insurermedicalhistory.ClickonAbsentfromWorkNO();
				}
				if (testData.get("IsHospitalization").equalsIgnoreCase("YES")) {
					insurermedicalhistory.Clickonhospitalization();

					insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomhos(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterAbsentfromWorkDoctorDetailshos(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationhos(testData.get("AFWdetails"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsulthos(testData.get("AFWLCday"),
							testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosishos(testData.get("AFWDDday"),
							testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				} else if (testData.get("IsHospitalization").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonhospitalizationNO();
				}
				if (testData.get("IsAilments").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonAilmentsNO();
				}
				if (testData.get("IsDisorder").equalsIgnoreCase("YES")) {
					insurermedicalhistory.ClickonDisorder();

					insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomdsdr(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsdsdr(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdsdr(testData.get("AFWLCday"),
							testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisdsdr(testData.get("AFWDDday"),
							testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationdsdr(testData.get("AFWdetails"));
				} else if (testData.get("IsDisorder").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonDisorderNO();
				}
				if (testData.get("IsSpouseHealth").equalsIgnoreCase("YES")) {
					insurermedicalhistory.ClickonSpouseHealth();
					insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomspouse(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsspouse(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdspouse(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisspouse(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationspouse(testData.get("AFWdetails"));
				} else if (testData.get("IsSpouseHealth").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonSpouseHealthNO();
				}
				if (testData.get("IsOtherSymptoms").equalsIgnoreCase("YES")) {
					insurermedicalhistory.Clickonothersymp();

					insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomother(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsother(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdother(testData.get("AFWLCday"),
							testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisother(testData.get("AFWDDday"),
							testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationother(testData.get("AFWdetails"));
				} else if (testData.get("IsOtherSymptoms").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonothersympNO();
				}

//    	            if (testData.get("PropTitle").equalsIgnoreCase("Mrs.") || (testData.get("PropTitle").equalsIgnoreCase("Ms."))) {
//    	                if (testData.get("IsPregnant").equalsIgnoreCase("Are You Pregnant")) {
//    	                    insurermedicalhistory.ClickonAreyoupregnant();
				//
//    	                    insurermedicalhistory.EnterAreyoupregnantnumberofweeks(testData.get("NoofWeeeks"));
//    	                    insurermedicalhistory.EnterAreyoupregnantCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
//    	                    insurermedicalhistory.EnterAreyoupregnantDoctorDetails(testData.get("AFWdoctordetails"));
//    	                    insurermedicalhistory.EnterAreyoupregnantDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
//    	                    insurermedicalhistory.EnterAreyoupregnantDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
//    	                    insurermedicalhistory.EnterAreyoupregnantDetailsofHospitalization(testData.get("AFWdetails"));
//    	                } else if (testData.get("IsPregnant").equalsIgnoreCase("No")) {
//    	                    insurermedicalhistory.ClickonAreyoupregnantNo();
//    	                }
//    	                if (testData.get("IsGynaecological").equalsIgnoreCase("Gynaecological Problem")) {
//    	                    insurermedicalhistory.Clickongynaecological();
				//
//    	                    insurermedicalhistory.EntergynaecologicalCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
//    	                    insurermedicalhistory.EntergynaecologicalDoctorDetails(testData.get("AFWdoctordetails"));
//    	                    insurermedicalhistory.EntergynaecologicalDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
//    	                    insurermedicalhistory.EntergynaecologicalDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
//    	                    insurermedicalhistory.EntergynaecologicalDetailsofHospitalization(testData.get("AFWdetails"));
//    	                } else if (testData.get("IsGynaecological").equalsIgnoreCase("No")) {
//    	                    insurermedicalhistory.ClickongynaecologicalNo();
//    	                }
//    	            }
			}
			insurerlifestyle.ClickSaveContinueBtn(); // Save & Continue Button QA//
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
		}
		dashboard.checkLoaderWeb();
		Thread.sleep(2000);
		// Minor Personal Health Details Tab //
		minorpersonalhealth.EnterMinorHeightFeet(testData.get("MinorHeightFeet"));
		minorpersonalhealth.EnterMinorHeightInch(testData.get("MinorHeightInch"));
		minorpersonalhealth.EnterMinorWeight(testData.get("Minorweight"));
		if (testData.get("IsMinorweightgainlost").equalsIgnoreCase("Yes")) {
			minorpersonalhealth.ClickOnIsThereAnyWeightChangesMinorYESBtnWeb(testData.get("MinorWeightgainlost"));
		}
		TestUtil.scrollTillEndOfPage(getDriver());
		insupersonalhealth.ClickSaveContinuecapitalminorBtn(); // SAVE & CONTINUE button QA//minor
		dashboard.checkLoaderWeb();

		// minor family medical tab //
		if (testData.get("IsFamilyMedical").equalsIgnoreCase("Yes")) {
			if (testData.get("IsFamilyMedicalHD").equalsIgnoreCase("Hereditary disorder")) {
				insurerfamilymedical.ClickOnHereditarydisorderCheckboxWeb();
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));

			}
			if (testData.get("IsFamilyMedicalCD").equalsIgnoreCase("Chronic disorder")) {
				insurerfamilymedical.ClickOnChronicdisorderCheckboxWeb();

			}
			if (testData.get("IsFamilyMedicalHA").equalsIgnoreCase("Heart ailment")) {
				insurerfamilymedical.ClickOnHeartailmentCheckboxWeb();
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));

			}
			if (testData.get("IsFamilyMedicalStroke").equalsIgnoreCase("Stroke")) {
				insurerfamilymedical.ClickOnStrokeCheckboxWeb();
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));

			}
			if (testData.get("IsFamilyMedicalHBP").equalsIgnoreCase("High blood pressure")) {
				insurerfamilymedical.ClickOnHighbloodpressureCheckboxWeb();
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));

			}
			if (testData.get("IsFamilyMedicalCncr").equalsIgnoreCase("Cancer")) {
				insurerfamilymedical.ClickOnCancerCheckboxWeb();
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));

			}
			if (testData.get("IsFamilyMedicalDiab").equalsIgnoreCase("Diabetes")) {
				insurerfamilymedical.ClickOnDiabetesCheckboxWeb();
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));

			}

			TestUtil.scrollTillEndOfPage(getDriver());
			insupersonalhealth.ClickSaveContinuecapitalBtn(); // SAVE & CONTINUE button QA//
			dashboard.checkLoaderWeb();

		}
		// Minor Covid 19 Details Tab //

		if (testData.get("IsCovid19PlanMinor").equalsIgnoreCase("YES")) {

			if (testData.get("IsAddRiderGMS").equalsIgnoreCase("NO")) {
				if (testData.get("Covid19PlanMinor").equalsIgnoreCase("COVID")) {

					minorcoviddetails.ClickOnhaveyoutestedCOVID19Web();
					minorcoviddetails.enterdignodateminorweb(testData.get("DiagnosisDate"));
					minorcoviddetails.enterrecoverydateminorweb(testData.get("RecoveryDate"));

					if (testData.get("IsCovid19SymptomsMinor").equalsIgnoreCase("YES")) {
						insurercoviddetails.ClickOntreatmenttakenInsWeb();
						if (testData.get("Covid19SymtomsMinor").equalsIgnoreCase("Asymptomatic")) {
							insurercoviddetails.ClickOnAsymptyesInsWeb();
							wait.WaitTime2();
						} else {
							insurercoviddetails.ClickOnAsymptInsnoWeb();
							wait.WaitTime2();
						}

						if (testData.get("Covid19SymtomsMinor").equalsIgnoreCase("Home quarantined")) {
							insurercoviddetails.ClickOnHomequrInsyesWeb();
							wait.WaitTime2();
						} else {
							insurercoviddetails.ClickOnHomequryInsnoWeb();
							wait.WaitTime2();

						}
						if (testData.get("Covid19SymtomsMinor").equalsIgnoreCase("Hospitalized")) {
							insurercoviddetails.ClickOnHospitalInsyesWeb();
							wait.WaitTime2();
						} else {
							insurercoviddetails.ClickOnHospitalInsnoWeb();
							wait.WaitTime2();

						}
					} else {
						insurercoviddetails.ClickOnTretmentTakenNOBTNWeb();
					}
				}

			} else {

				if (testData.get("Covid19PlanMinor").equalsIgnoreCase("COVID")) {

					minorcoviddetails.ClickOnhaveyoutestedCOVID19Web();
					minorcoviddetails.enterdignodateminor(testData.get("DiagnosisDate"));
					minorcoviddetails.enterrecoverydateminor(testData.get("RecoveryDate"));

					if (testData.get("IsCovid19SymptomsMinor").equalsIgnoreCase("YES")) {
						insurercoviddetails.ClickOntreatmenttakenWeb();
						if (testData.get("Covid19SymtomsMinor").equalsIgnoreCase("Asymptomatic")) {
							insurercoviddetails.ClickOnAsymptyesWeb();
							wait.WaitTime2();
						} else {
							insurercoviddetails.ClickOnAsymptnoWeb();
							wait.WaitTime2();
						}

						if (testData.get("Covid19SymtomsMinor").equalsIgnoreCase("Home quarantined")) {
							insurercoviddetails.ClickOnHomequryesWeb();
							wait.WaitTime2();
						} else {
							insurercoviddetails.ClickOnHomequrynoWeb();
							wait.WaitTime2();

						}
						if (testData.get("Covid19SymtomsMinor").equalsIgnoreCase("Hospitalized")) {
							insurercoviddetails.ClickOnHospitalyesWeb();
							wait.WaitTime2();
						} else {
							insurercoviddetails.ClickOnHospitalnoWeb();
							wait.WaitTime2();

						}
					} else {
						insurercoviddetails.ClickOnTretmentTakenNOBTNWeb();
					}
				}

			}

		}
		insurerlifestyle.ClickSaveContinueminorBtn(); // Save & Continue Button QA//minor
		dashboard.checkLoaderWeb();

		// Minor Insurability Declaration Tab //
		if (testData.get("IsInsurabiltityDecleration").equalsIgnoreCase("Yes")) {
			if (testData.get("IsHospital").equalsIgnoreCase("Hospitalization")) {
				insudecleration.Clickonhospitalization();

				insudecleration.EnterHospCurrentSymptoms(testData.get("currentsymptoms"));
				insudecleration.EnterHospDoctorDetails(testData.get("doctordetails"));
				insudecleration.EnterHospDateOfLastConsult(testData.get("LCday"), testData.get("LCmonth"),
						testData.get("LCyear"));
				insudecleration.EnterHospDateOfDiagnosis(testData.get("DDday"), testData.get("DDmonth"),
						testData.get("DDyear"));
				insudecleration.EnterHospDetailsofHospitalization(testData.get("details"));
			}
			if (testData.get("IsDiagnosis1").equalsIgnoreCase("Diagnosis 1")) {
				insudecleration.ClickonDiagnosis1();

				insudecleration.Enterdianosis1CurrentSymptoms(testData.get("currentsymptoms"));
				insudecleration.Enterdiagnosis1DoctorDetails(testData.get("doctordetails"));
				insudecleration.Enterdiagnosis1DateOfLastConsult(testData.get("LCday"), testData.get("LCmonth"),
						testData.get("LCyear"));
				insudecleration.Enterdiagnosis1DateOfDiagnosis(testData.get("DDday"), testData.get("DDmonth"),
						testData.get("DDyear"));
				insudecleration.Enterdiagnosis1DetailsofHospitalization(testData.get("details"));
			}
			if (testData.get("IsDiagnosis2").equalsIgnoreCase("Diagnosis 2")) {
				insudecleration.ClickonDiagnosis2();

				insudecleration.Enterdianosis2CurrentSymptoms(testData.get("currentsymptoms"));
				insudecleration.Enterdiagnosis2DoctorDetails(testData.get("doctordetails"));
				insudecleration.Enterdiagnosis2DateOfLastConsult(testData.get("LCday"), testData.get("LCmonth"),
						testData.get("LCyear"));
				insudecleration.Enterdiagnosis2DateOfDiagnosis(testData.get("DDday"), testData.get("DDmonth"),
						testData.get("DDyear"));
				insudecleration.Enterdiagnosis2DetailsofHospitalization(testData.get("details"));
			}
			if (testData.get("IsOtherSympt").equalsIgnoreCase("Other symptoms")) {
				insudecleration.ClickonOthersymptoms();

				insudecleration.EnterothersCurrentSymptoms(testData.get("currentsymptoms"));
				insudecleration.EnterothersDoctorDetails(testData.get("doctordetails"));
				insudecleration.EnterothersDateOfLastConsult(testData.get("LCday"), testData.get("LCmonth"),
						testData.get("LCyear"));
				insudecleration.EnterothersDateOfDiagnosis(testData.get("DDday"), testData.get("DDmonth"),
						testData.get("DDyear"));
				insudecleration.EnterothersDetailsofHospitalization(testData.get("details"));
			}
		}
		insurerlifestyle.ClickSaveContinueBtn(); // Save & Continue Button QA//
		dashboard.checkLoaderWeb();

		// Proposer NRI Mandate //
		if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
			nriMandate.clickOnAreYouIndianOrigin(testData.get("isIndianOrigin"));
			nriMandate.enterCountryOfPermanentResidence(testData.get("pResidence"));
			nriMandate.enterDateFromWhichBecamePR(testData.get("datePR"));
			nriMandate.enterDateLastVisitedIndia(testData.get("lastVisitedIndiaDate"));
			nriMandate.enterPassportNumber(testData.get("passportNumber"));
			nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplication")); // Place For
																										// Signing
																										// Application

			// FNIO - PIO //
			if (testData.get("TypeOfNRI").equalsIgnoreCase("FNIO")
					|| testData.get("TypeOfNRI").equalsIgnoreCase("PIO")) {

				if (testData.get("DoYouStayInIndia").equalsIgnoreCase("YES")) {
					nriMandate.ClickDoYouStayInIndiaYesBtnWeb();

					nriMandate.durationOfStayIndiaFNIO(testData.get("durationInYrs"), testData.get("durationInMonths"));
					nriMandate.selectNatureOfVisa(testData.get("natureOfVisaHeld"));
					nriMandate.selectPurposeOfStayIndiaFNIO(testData.get("purposeOfStayFNIO_PIO"));
					if (testData.get("purposeOfStayFNIO_PIO").equalsIgnoreCase("Student")) {
						nriMandate.enterNatureOfStayIndiaFNIO(testData.get("natureOfStayFNIO_PIO"));
					} else if (testData.get("purposeOfStayFNIO_PIO").equalsIgnoreCase("Others")) {
						nriMandate.enterSpecificReasonFNIO_PIO(testData.get("specificReasonFNIO_PIO"));
					}
					nriMandate.selectPIO_OCICard(testData.get("selectPIO_OCICard"));
				}
			}
			if ((testData.get("IsPanAvailabel").equalsIgnoreCase("YES")
					&& (testData.get("AddressLocation1").equalsIgnoreCase("International")
							&& (testData.get("EditAddress").equalsIgnoreCase("YES")))
					|| (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
							&& (testData.get("AddressLocation1").equalsIgnoreCase("International"))))) {
				nriMandate.EnterResidantAddressOneWhileInIndiaWeb(testData.get("address1Nri"));
				nriMandate.EnterResidantAddressCityWhileInIndiaWeb(testData.get("cityNri"));
				wait.WaitTime2();
				nriMandate.EnterResidantAddressStateWhileInIndiaWeb(testData.get("stateNri"));
				wait.WaitTime2();
				nriMandate.EnterResidantAddressPinCodeWhileInIndiaWeb(testData.get("pinCodeNri"));
			}
			// Purpose of your stay abroad//
			nriMandate.clickOnPurposeOfStayAbroad(testData.get("purposeOfStayAbroad"));
			if (testData.get("purposeOfStayAbroad").equalsIgnoreCase("Student")) {
				nriMandate.enterStudentNatureOfStay(testData.get("studentNatureOfStayAbroad"));
			} else if (testData.get("purposeOfStayAbroad").equalsIgnoreCase("Others")) {
				nriMandate.enterSpecificNatureOfStayAbroad(testData.get("stayAbroadSpecificReason"));
			}
			nriMandate.enterIntendedDurationOfStayAbroad(testData.get("intendedDurationYear"),
					testData.get("intendedDurationMonth"));

			// Residence Address while in Abroad//
			if ((testData.get("IsPanAvailabel").equalsIgnoreCase("YES")
					&& (testData.get("AddressLocation1").equalsIgnoreCase("Indian")
							&& (testData.get("EditAddress").equalsIgnoreCase("YES"))
							|| (testData.get("IsPanAvailabel").equalsIgnoreCase("YES"))
							|| (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
									&& (testData.get("AddressLocation1").equalsIgnoreCase("Indian")))))) {
				nriMandate.addTypeNri(testData.get("nriAddressType"));
				nriMandate.enterNriAddress1(testData.get("address1Nri"));
				nriMandate.enterNriAddress2(testData.get("address2Nri"));
				nriMandate.enterNriAddress3(testData.get("address3Nri"));
				nriMandate.enterNriArea(testData.get("areaNri"));
				wait.WaitTime2();
				nriMandate.enterNriCity(testData.get("cityNri"));
				wait.WaitTime2();
				nriMandate.enterNriState(testData.get("stateNri"));
				wait.WaitTime2();
				nriMandate.enterNriPinCode(testData.get("pinCodeNri"));
				nriMandate.enterNriTeleNumberResidence(testData.get("teleNumberResidenceNri"));
				nriMandate.enterNriTeleNumberOffice(testData.get("teleNumberOfficeNri"));
			}
			// Have you traveled over the last 12 months?//

			if (testData.get("travelledOverLast12Months").equalsIgnoreCase("Yes")) {
				nriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12Months"));
				nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12Months"));
				nriMandate.enterLast12MonthCity(testData.get("last12MonthCity"));
				nriMandate.enterLast12MonthsDepartDate(testData.get("lastTravelled12MonthsDepartDate"));
				nriMandate.enterLast12MonthsArrivalDate(testData.get("lastTravelled12MonthsArrivalDate"));
				wait.WaitTime2();
				nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaType"));
				wait.WaitTime2();
				nriMandate.clickSaveButton();
			}

			// Are you planning to travel in next 12 months?//
			if (testData.get("IsTravel").equalsIgnoreCase("NO")) {

				if (testData.get("travelledOverNext12Months").equalsIgnoreCase("Yes")) {
					nriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12Months"));
					wait.WaitTime2();
					nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12Months"));
					wait.WaitTime2();
					nriMandate.enterNext12MonthCity(testData.get("Next12MonthCity"));
					wait.WaitTime2();
					nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDate"));
					nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDate"));
					wait.WaitTime2();
					nriMandate.selectNext12MonthsVisaType(testData.get("nextTravelled12MonthsVisaType"));

					nriMandate.clickSaveButton();
				}
			}
			// Bank Details//
			nriMandate.doYouHaveNriAccount(testData.get("haveNriAccount"));
			if (testData.get("haveNriAccount").equalsIgnoreCase("Yes")) {
				nriMandate.typeOfNriAccount(testData.get("nriAccountType"));
				nriMandate.enterNRIMicrCode(testData.get("nriMicrCode"));
			}

			// Exchange Facility availed?//
			nriMandate.clickOnExchangeFacilityButton(testData.get("exchangeFacility"));
			if (testData.get("exchangeFacility").equalsIgnoreCase("Yes")) {
				nriMandate.enterRBIPermitNumber(testData.get("rbiPermitNumber"));
				nriMandate.enterRBIPermitDetails(testData.get("rbiPermitDetail"));
				nriMandate.enterRBIOfficeName(testData.get("rbiOfficeName"));
			}

			// Payment Details//
			nriMandate.clickOnPaymentDetails(testData.get("nriPaymentDetails"));
			if (testData.get("nriPaymentDetails").equalsIgnoreCase("Others")) {
				nriMandate.enterProvideDetails(testData.get("providePaymentDetail"));
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			TestUtil.scrollTillEndOfPage(getDriver());

			if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
				nriMandate.clickOnAddInsuredDetails();
			} else if ((testData.get("IsNRI").equalsIgnoreCase("YES"))) {
				nriMandate.clickOnContinue();
			}
			dashboard.checkLoaderWeb();

		}

		// insurer NRI Mandate //
		if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
			nriMandate.clickOnAreYouIndianOrigin(testData.get("isIndianOriginInsur"));
			nriMandate.enterCountryOfPermanentResidence(testData.get("pResidenceInsur"));
			nriMandate.enterDateFromWhichBecamePR(testData.get("datePRInsur"));
			nriMandate.enterDateLastVisitedIndia(testData.get("lastVisitedIndiaDateInsur"));
			nriMandate.enterPassportNumber(testData.get("passportNumberInsur"));
			wait.WaitTime2();
			nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplicationInsur"));

			// FNIO/PIO//
			if (testData.get("TypeOfNRI").equalsIgnoreCase("FNIO")
					|| testData.get("TypeOfNRI").equalsIgnoreCase("PIO")) {
				if (testData.get("DoYouStayInIndia").equalsIgnoreCase("YES")) {
					nriMandate.clickOnFNIOPIOYESButtonInsured();
					wait.WaitTime2();
					nriMandate.durationOfStayIndiaFNIO(testData.get("durationInYrsInsur"),
							testData.get("durationInMonthsInsur"));
					nriMandate.selectNatureOfVisa(testData.get("natureOfVisaHeldInsur"));
					nriMandate.selectPurposeOfStayIndiaFNIO(testData.get("purposeOfStayFNIO_PIOInsur"));
					if (testData.get("purposeOfStayFNIO_PIOInsur").equalsIgnoreCase("Student")) {
						nriMandate.enterNatureOfStayIndiaFNIO(testData.get("natureOfStayFNIO_PIOInsur"));
					} else if (testData.get("purposeOfStayFNIO_PIOInsur").equalsIgnoreCase("Others")) {
						nriMandate.enterSpecificReasonFNIO_PIO(testData.get("specificReasonFNIO_PIOInsur"));
					}
					nriMandate.selectPIO_OCICard(testData.get("selectPIO_OCICardInsur"));
				}
			}
			// Residence Address while in India//
			if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("YES")) {
				insurerNriMandate.addressSameASPropPrimary();
			} else if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("NO")) {
				insurerNriMandate.enterIndianAddress1(testData.get("indianAddress1"));
				insurerNriMandate.enterIndianAddress2(testData.get("indianAddress2"));
				insurerNriMandate.enterIndianAddress3(testData.get("indianAddress3"));
				insurerNriMandate.enterIndianArea(testData.get("IndianAr"));
				wait.WaitTime2();
				insurerNriMandate.enterIndianCity(testData.get("indianCity"));
				wait.WaitTime2();
				insurerNriMandate.enterIndianState(testData.get("indianState"));
				wait.WaitTime2();
				insurerNriMandate.enterIndianPinCode(testData.get("indianPincode"));
			}

			// Purpose of your stay abroad//
			nriMandate.clickOnPurposeOfStayAbroad(testData.get("purposeOfStayAbroadInsur"));
			if (testData.get("purposeOfStayAbroadInsur").equalsIgnoreCase("Student")) {
				nriMandate.enterStudentNatureOfStay(testData.get("studentNatureOfStayAbroadInsur"));
			} else if (testData.get("purposeOfStayAbroadInsur").equalsIgnoreCase("Others")) {
				nriMandate.enterSpecificNatureOfStayAbroad(testData.get("stayAbroadSpecificReasonInsur"));
			}
			nriMandate.enterIntendedDurationOfStayAbroad(testData.get("intendedDurationYearInsur"),
					testData.get("intendedDurationMonthInsur"));

			// Residence Address while in Abroad//
			nriMandate.addTypeNri(testData.get("nriAddressTypeInsur"));
			nriMandate.enterNriAddress1(testData.get("address1NriInsur"));
			nriMandate.enterNriAddress2(testData.get("address2NriInsur"));
			nriMandate.enterNriAddress3(testData.get("address3NriInsur"));
			nriMandate.enterNriArea(testData.get("areaNriInsur"));
			wait.WaitTime2();
			nriMandate.enterNriCity(testData.get("cityNriInsur"));
			wait.WaitTime2();
			nriMandate.enterNriState(testData.get("stateNriInsur"));
			wait.WaitTime2();
			nriMandate.enterNriPinCode(testData.get("pinCodeNriInsur"));
			wait.WaitTime2();
			nriMandate.enterNrimobilenumber(testData.get("mobilenumberNri"));
			nriMandate.enterNriTeleNumberResidence(testData.get("teleNumberResidenceNriInsur"));
			nriMandate.enterNriTeleNumberOffice(testData.get("teleNumberOfficeNriInsur"));

			// Have you traveled over the last 12 months? *//

			if (testData.get("travelledOverLast12MonthsInsur").equalsIgnoreCase("Yes")) {
				insurerNriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12MonthsInsur"));
				nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12MonthsInsur"));
				nriMandate.enterLast12MonthCity(testData.get("last12MonthCityInsur"));
				nriMandate.enterLast12MonthsDepartDate(testData.get("lastTravelled12MonthsDepartDateInsur"));
				wait.WaitTime2();
				nriMandate.enterLast12MonthsArrivalDate(testData.get("lastTravelled12MonthsArrivalDateInsur"));
				wait.WaitTime2();
				nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaTypeInsur"));

				nriMandate.clickSaveButton();
			}

			// Are you planning to travel in next 12 months? *//

			if (testData.get("travelledOverNext12MonthsInsur").equalsIgnoreCase("Yes")) {
				insurerNriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12MonthsInsur"));
				nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12MonthsInsur"));
				nriMandate.enterNext12MonthCity(testData.get("Next12MonthCityInsur"));
				nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDateInsur"));
				wait.WaitTime2();
				nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDateInsur"));
				wait.WaitTime2();
				nriMandate.selectNext12MonthsVisaType(testData.get("nextTravelled12MonthsVisaTypeInsur"));

				nriMandate.clickSaveButton();
			}

			insurerNriMandate.clickOnInsuredContinueButton();
			dashboard.checkLoaderWeb();

		}
		// Review and accept page //
		TestUtil.scrollTillEndOfPage(getDriver());
		if (testData.get("TDSDeclaration").equalsIgnoreCase("YES")) {
			rna.ClickOnRandATDSYesBtton();
		} else {
			rna.ClickOnRandATDSNoBtton();
		}
		String appNO = loginPage.Applicationnumber();
		rna.ClickOnRandACheckboxWeb();
		dashboard.checkLoaderWeb();
		rna.SendForReviewClick();
		dashboard.checkLoaderWeb();
		Thread.sleep(3000);
		Thread.sleep(3000);
		rna.EnterOTVC();
		dashboard.checkLoaderWeb();
		Thread.sleep(3000);
		dashboard.checkLoaderWeb();
		TestUtil.scrollTillEndOfPage(getDriver());
		Thread.sleep(3000);
		rna.ClickOnProceedButtonWeb();
		dashboard.checkLoaderWeb();
		Thread.sleep(3000);

		if (testData.get("PaymentType").equalsIgnoreCase("chequeDD")) {

			paymentpage.ClickOnChequeAndDDModeweb();

			if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Cheque")) {
				paymentpage.ClickChequeBTNweb();
				wait.WaitTime2();
				wait.WaitTime2();
				// TestUtil.scrollToElement(driver,
				// WebDriverFactoryStaticThreadLocal.getDriver().findElement(By.xpath("//div[contains(text(),'CASH')]")));
				paymentpage.UploadChequeAndDDImgweb();
				wait.WaitTime2();
				TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
				paymentpage.EnterChequeDDNoWeb(testData.get("ChequeDDNo"));
				wait.WaitTime2();
				paymentpage.EnterDDMMYYONCDDWeb(testData.get("CDDday"), testData.get("CDDMonth"),
						testData.get("CDDYear"));
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(driver);
				// paymentpage.VarifyINCORRECTIFSCCodeOnCDDWeb();
				wait.WaitTime2();
				paymentpage.EnterIFSCCodeOnCDDWeb(testData.get("CDDIFSCcode"));
				TestUtil.scrollTillEndOfPage(driver);
				wait.WaitTime2();
				if (testData.get("ChequeBelongtoThirdParty").equalsIgnoreCase("YES")) {
					paymentpage.ClickonChequeBelongtoThirdParty();
					wait.WaitTime2();
					paymentpage.UploadChequeAndDDImgweb();
				}
				paymentpage.ClickCDDPaymentSubmitBTNweb();
				wait.WaitTime2();
				paymentpage.ClickonSubmitBtnAlertPopup();
				TestUtil.scrollTillEndOfPage(driver);
				wait.WaitTime2();
				customerprofile.cdnextbutton(); // customer details NEXT button(QA)
				dashboard.checkLoaderWeb();
				Thread.sleep(4000);

			} else if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Demand Draft")) {
				paymentpage.ClickDDBTNweb();
				wait.WaitTime2();
				paymentpage.UploadChequeAndDDImgweb();
				wait.WaitTime2();
				TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
				paymentpage.EnterChequeDDNoWeb(testData.get("ChequeDDNo"));
				wait.WaitTime2();
				paymentpage.EnterDDMMYYONCDDWeb(testData.get("CDDday"), testData.get(" CDDMonth"),
						testData.get(" CDDYear"));
				paymentpage.EnterIFSCCodeOnCDDWeb(testData.get("CDDIFSCcode"));
				wait.WaitTime2();
				TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
				paymentpage.UploadDECLARATIONFORMImgweb();
				wait.WaitTime2();
				paymentpage.ClickCDDPaymentSubmitBTNweb();
				wait.WaitTime2();
				paymentpage.ClickonSubmitBtnAlertPopup();
				TestUtil.scrollTillEndOfPage(driver);
				wait.WaitTime2();
				customerprofile.cdnextbutton(); // customer details NEXT button(QA)
				dashboard.checkLoaderWeb();
				Thread.sleep(4000);
			}
		}

		if (testData.get("PaymentType").equalsIgnoreCase("DirectDebit")) {

			paymentpage.ClickOnDirectDebitweb();
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			paymentpage.UploadChequeAndDDImgweb();
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			paymentpage.EnterJounralNoWeb(testData.get("ChequeDDNo"));
			wait.WaitTime2();
			paymentpage.EnterDDMMYYONjournalWeb(testData.get("CDDday"), testData.get(" CDDMonth"),
					testData.get(" CDDYear"));
			paymentpage.clickOnRTGSpaymentSubmitBTNWeb();
			Thread.sleep(5000);
			TestUtil.scrollTillEndOfPage(driver);
			customerprofile.cdnextbutton(); // customer details NEXT button(QA)
			dashboard.checkLoaderWeb();
			Thread.sleep(4000);

		}
		if (testData.get("PaymentType").equalsIgnoreCase("ONLINE")) {

//					TestUtil.scrollTillEndOfPage(driver);
//					paymentpage.ClickOnOTCModeweb();
			//
//					Thread.sleep(2000);
//					TestUtil.scrollTillEndOfPage(driver);
//					Thread.sleep(2000);
			//
//					paymentpage.ClickOnOTCSubmitBTNweb();
//					Thread.sleep(5000);
			//
//					paymentpage.ClickOnPaymentSummaryNextBTNweb();
//					Thread.sleep(4000);
		}

	
		//e-CDF
		switch (testData.get("ChannelName")) {

		case "BOM":
		
		
		if (testData.get("IsECDF").equalsIgnoreCase("YES")) {
            paymentpage.clickOnCheckBoxECDFweb();
            Thread.sleep(2000);
            TestUtil.scrollTillEndOfPage(driver);
            Thread.sleep(2000);
            paymentpage.clickOnSumitBTNECDFweb();
            dashboard.checkLoaderWeb();
            Thread.sleep(2000);
           
        } else  {
            TestUtil.scrollTillEndOfPage(driver);
            Thread.sleep(2000);
            WebElement Doitletter = getDriver().findElement(By.xpath("//button[@name='DO IT LATER']"));
            Thread.sleep(2000);
            Doitletter.click();

        }
		break;
		
		}
		List<WebElement> documentpageCount = getDriver()
				.findElements(By.xpath("(//div[@role='tablist'])[2]//button//span[1]"));
		int docSize = documentpageCount.size();
		for (int i = 0; i < docSize; i++) {
			String str = documentpageCount.get(i).getText();
//VIJAY
			if (str.equalsIgnoreCase("Identity Proof")) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("NO")
						|| testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
							|| testData.get("PanNameEdit").equalsIgnoreCase("YES")
							|| testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
						documentpage.clickOnIdentityTileweb();
						wait.WaitTime2();
						documentpage.SelectTypeOfDocumentweb(testData.get("SelectTypeOfDocument"));
						documentpage.UploadFileweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
						TestUtil.scrollTillEndOfPage(getDriver());
						Thread.sleep(2000);
						documentpage.clickOnNEXTButtonweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					} else {
						TestUtil.scrollTillEndOfPage(getDriver());
						wait.WaitTime2();
						documentpage.clickOnNEXTButtonweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					}
				} else {
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					documentpage.clickOnNEXTButtonweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();

				}
			}
			if (str.equalsIgnoreCase("Address Proof")) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("NO")
						|| testData.get("PanNameEdit").equalsIgnoreCase("YES")
						|| testData.get("EditAddress").equalsIgnoreCase("YES")) {
					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
							|| testData.get("PanNameEdit").equalsIgnoreCase("YES")
							|| testData.get("EditAddress").equalsIgnoreCase("YES")
							|| testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
						documentpage.clickOnAddressProofTileweb();
						wait.WaitTime2();
						documentpage.SelectTypeOfDocumentweb(testData.get("SelectTypeOfDocument"));
						documentpage.UploadFileweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
//pl
						if (testData.get("IsPanAvailabel").equalsIgnoreCase("YES")
								&& testData.get("IsNRI").equalsIgnoreCase("NO")
								&& testData.get("EditAddress").equalsIgnoreCase("YES")
								|| testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
										&& testData.get("IsNRI").equalsIgnoreCase("NO")
										&& testData.get("IsPermanentAddressSame").equalsIgnoreCase("NO")
								|| testData.get("IsPanAvailabel").equalsIgnoreCase("YES")
										&& testData.get("IsNRI").equalsIgnoreCase("YES")
										&& testData.get("EditAddress").equalsIgnoreCase("YES")
								|| testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
										&& testData.get("IsNRI").equalsIgnoreCase("YES")
										&& testData.get("IsPermanentAddressSame").equalsIgnoreCase("NO")) {
							documentpage.SelectTypeOfDocumentPermant(testData.get("SelectTypeOfDocument"));
							documentpage.UploadFilepermant();
							dashboard.checkLoaderWeb();
							// waitUtils.WaitTime2();
						}
						documentpage.clickOnNEXTButtonweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					} else {
						TestUtil.scrollTillEndOfPage(getDriver());
						wait.WaitTime2();
						documentpage.clickOnNEXTButtonweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					}
				} else {
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					documentpage.clickOnNEXTButtonweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();

				}

			}
			if (str.equalsIgnoreCase("Non Medical Requirement")) {
				// documentpage.clickOnNonMedicalRequirementsTileweb();
//                wait.WaitTime2();
				try {
					documentpage.UploadNonMedicalNEFTCancelChequeProposerNotInsuredweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				try {
					documentpage.UploadNonMedicalPhotograph();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				//
				try {
					documentpage.UploadNonMedicalFinacialJustcationweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				try {
				if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
					documentpage.UploadNonMedicalProposerPassportCopyProposer();
                     dashboard.checkLoaderWeb();
                     Thread.sleep(2000);
                 }
				}catch(Exception e) {
					
				}
				//INSURED
				try {
				if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
					documentpage.UploadNonMedicalProposerPassportCopyProposerInsured();
                      dashboard.checkLoaderWeb();
                      Thread.sleep(2000);
                  }
				}catch(Exception e) {
					
				}
				try {
					documentpage.UploadNonMedicalIncomeProof();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				if (testData.get("IsNRI").equalsIgnoreCase("NO")) {

					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")) {
						documentpage.UploadNonMedicalForm60ProposerNotInsuredweb();

						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					}
				}
				try {
					documentpage.UploadNonMedicalPhotograph();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
//
				try {
					documentpage.UploadNonMedicalPEPQuestionnaireweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				try {
					documentpage.BANKSTATEMENTweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				try {
					documentpage.FINANCIALTRANSACTIONFORMweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				if (testData.get("IsECDF").equalsIgnoreCase("NO")) {
					documentpage.UploadNonMedicalCustomerDeclarationFormProposerNotInsuredweb();
					dashboard.checkLoaderWeb();
					Thread.sleep(2000);

				}

				TestUtil.scrollTillEndOfPage(getDriver());
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();


			}
			if (str.equalsIgnoreCase("Medical Requirement")) {
				// documentpage.clickOnMedicalRequirementsTileweb();
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}
			if (str.equalsIgnoreCase("Income Proof")) {
				documentpage.clickOnIdentityTileweb();
				wait.WaitTime2();
				documentpage.SelectTypeOfDocumentIncomePrrofweb(testData.get("SelectTypeOfDocIncomeProof"));
				documentpage.UploadFileweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

			}
			if (str.equalsIgnoreCase("Age Proof")) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("NO")
						|| testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
							|| testData.get("PanNameEdit").equalsIgnoreCase("YES")
							|| testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
						try {
							documentpage.SelectTypeOfDocumentAgePrrofweb(testData.get("SelectTypeOfDocAgeProof"));
							documentpage.UploadFileweb();
							dashboard.checkLoaderWeb();
						} catch (Exception e) {

						}

					}
				}

				TestUtil.scrollTillEndOfPage(getDriver());

				try {
					documentpage.SelectTypeOfDocumentAgePrrofweb(testData.get("SelectTypeOfDocAgeProof"));
					documentpage.UploadFileweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}

				wait.WaitTime2();
				wait.WaitTime2();
				documentpage.clickOnSumbitweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

			}
			if (str.equalsIgnoreCase("E-NACH Registration")) {
				documentpage.clickOnENACHRegistrationTileweb();
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				wait.WaitTime2();
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

			}
			if (str.equalsIgnoreCase("PAN Card Proof")) {
				if (testData.get("PanNameEdit").equalsIgnoreCase("YES")
						|| testData.get("IsPanAvailabel").equalsIgnoreCase("NO")) {
					documentpage.SelectTypeOfDocumentweb("PAN Card");
					documentpage.UploadFileweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
					documentpage.clickOnNEXTButtonweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				} else {
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					documentpage.clickOnNEXTButtonweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				}

			}
			if (str.equalsIgnoreCase("ECS Mandate")) {
				documentpage.clickOnECSMAndateTileweb();
				wait.WaitTime2();
				documentpage.UploadFileweb();
				dashboard.checkLoaderWeb();
				TestUtil.scrollTillEndOfPage(driver);
				Thread.sleep(9000);
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}

		}
		wait.WaitTime2();
		dashboard.checkLoaderWeb();
		documentpage.ClickOnCSEAlertOKButton();
		dashboard.checkLoaderWeb();

	}
}
