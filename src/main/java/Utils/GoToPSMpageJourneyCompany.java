package Utils;

import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
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

public class GoToPSMpageJourneyCompany {
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

    public void gotoPSMpageCompany(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

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

        // Login Page //
        loginPage.enterUserNameweb(testData.get("username"));
        loginPage.enterpasswordweb(testData.get("password"));
        loginPage.loginButtonweb();
        dashboard.waitforButtonDisappearWeb();
        dashboard.checkLoaderWeb();


        // Application List Page //
        loginPage.newapplication();


        // Sales Details Page //
        salesdetails.enterleadid(testData.get("LeadID"));
        salesdetails.ClickOnPropwithBank(testData.get("ProposerwithBank")); //Is Proposer with the bank for more than 7 months?  // UAT
        dashboard.checkLoaderWeb();
        salesdetails.salescontinuebutton();
        dashboard.checkLoaderWeb();
        salesdetails.enterCArefB(testData.get("CArefB"));
        TestUtil.scrollTillEndOfPage(getDriver());
        salesdetails.salescontinuebutton();
        dashboard.checkLoaderWeb();

        // Customer Profile Page //
        customerprofile.EnterAdvisorStateWeb(testData.get("AdvisorState"));
        customerprofile.ClickOnSelectTypeOfProposer(testData.get("proposertype"));
        customerprofile.Ispropandinsusame(testData.get("Ispropsame"));
        customerprofile.SelectPolicyTypeWeb(testData.get("CompanyPolicyType"));
        if(testData.get("CompanyPolicyType").equalsIgnoreCase("Employer-Employee")){
           // customerprofile.SelectEntityEmp_emp(testData.get("Entity"));
        }
        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();
        customerprofile.EnterCompanyPANWeb(testData.get("CompanyPAN"));
        customerprofile.companyagreecheckbox();
        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();

        //customerprofile.EnterCompanyNameWeb(testData.get("CompanyName"));
        //customerprofile.EnterCompanyDOIWeb(CompanyDOI);
        customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        dashboard.checkLoaderWeb();
        customerprofile.IsinsurerNRI(testData.get("InsuNRI"));
        customerprofile.IsinsurerNRI("NO");
        customerprofile.IsinsurerNRI(testData.get("InsuNRI"));


        customerprofile.IsinsurerNRI(testData.get("InsuNRI"));
        if(testData.get("InsuNRI").equalsIgnoreCase("YES")){
            customerprofile.selectTypeOfNRI(testData.get("insurNriType"));
            customerprofile.enterCountryOfNRIResidence(testData.get("insurNriCountryResidence"));
            dashboard.checkLoaderWeb();
        }

        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();
        customerprofile.EnterDOBInsuredweb(testData.get("InsurerDOB"));
        customerprofile.clickOnGenderBtnWeb(testData.get("InsuredGender"));
        customerprofile.SalutationTitleInsuredWeb(testData.get("InsuredTitle"));
        WaitUtils.WaitTime(2000);
        customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredFirstname"));
        customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastname"));
        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();

    }
}