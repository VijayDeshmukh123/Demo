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
import java.util.HashMap;
import java.util.List;

import static com.absli.base.BasePage.getDriver;

public class EndToEndProCompanyJourney {

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

    public void gotoEndToEndCompany(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

        dashboard = new Dashboard(getDriver());
        loginPage = new LoginPage(getDriver());
        salesdetails = new SalesDetails(getDriver());
        customerprofile = new CustomerProfile(getDriver());
        viewquote = new ViewQuote(getDriver());
        communicationdetails = new CommunicationDetails(getDriver());
        bankdetails = new BankDetails(getDriver());
        nominee=new Nominee(getDriver());
        address = new AddressDetalis(getDriver());
        companyprofdetails = new CompanyProfessionalDetails(getDriver());
        proposerpersonalinfo = new ProposerPersonalInfo(getDriver());
        proposerprofdetails = new ProposerProfessionalDetails(getDriver());
        minorpersonalinfo = new MinorPersonalInfo(getDriver());
        insurerpersonalinfo = new InsurerPersonalInfo(getDriver());
        insuprofdetails = new InsuProfessionalDetails(getDriver());
        insupersonalhealth = new InsurerPersonalHealth((getDriver()));
        insurerlifestyle = new InsurerLifestyle(getDriver());
        insurerfamilymedical = new InsurerFamilyMedical((getDriver()));
        insurercoviddetails = new InsurerCovidDetails(getDriver());
        insurermedicalhistory = new InsurerMedicalHistory(getDriver());
        nriMandate = new ProposerNRIMandate(getDriver());
        insurerNriMandate = new InsurerNRIMandate(getDriver());
        rna = new RandAPage(getDriver());
        eccd = new ECCDPage(getDriver());
        paymentpage = new PaymentPage(getDriver());
        documentpage = new DocumentsPage(getDriver());
        prop = new PropertiesUtils();
        softassert = new SoftAssert();


        String SumAssuredValue = getDriver().findElement(By.xpath("(//p[@id='Initial-premium-amount'])[3]")).getText();
        customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        dashboard.checkLoaderWeb();


        // Plan Info Page //
        // Assertion for policy tab , all riders and ABG //
        loginPage.Applicationnumber(); // printing of application number in report //

        WebElement PayMode = getDriver().findElement(By.xpath("//div[contains(@class,'payment-cycle-text')]"));
        String PayModeValue = PayMode.getText();
        TestUtil.verifybgColor(PayMode, driver);
        String[] PayModeValueupdate = PayModeValue.split(": ");
        softassert.assertEquals(PayModeValueupdate[1], testData.get("paymode"));

        WebElement PlanOption = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[1]"));
        String PlanOptionValue = PlanOption.getText();
        TestUtil.verifybgColor(PlanOption, driver);
        softassert.assertEquals(PlanOptionValue, testData.get("benefitotion"));

        WebElement PT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[2]"));
        String PTValue = PT.getText();
        TestUtil.verifybgColor(PT, driver);
        String[] PTValueupdate = PTValue.split(" ");
        softassert.assertEquals(PTValueupdate[0], testData.get("policyterm"));

        WebElement PPT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[4]"));
        String PPTValue = PPT.getText();
        TestUtil.verifybgColor(PPT, driver);
        softassert.assertEquals(PPTValue, testData.get("ppt"));

        TestUtil.scrollTillEndOfPage(getDriver());
        viewquote.clickConfirmPlanBtn(); // Confirm Plan button QA
        dashboard.checkLoaderWeb();


        // Proposer and Insurer Communication Details Page //
        communicationdetails.SelectpreflangWeb(testData.get("PreferredLang"));
        communicationdetails.enteraltnumber(testData.get("AlternateNumber"));
        communicationdetails.enterresnumber(testData.get("ResidenceNumber"));
        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();
        WaitUtils.WaitTime(2000);
        communicationdetails.EnterInsuredMobileNoweb(testData.get("InsuredMobno"));
        communicationdetails.EnterInsuredEmailIdweb(testData.get("Insuemail"));
        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();


        //new milestone customer photo (LA-12416)
        if (prop.getProperties("customerPhotoSelection").equalsIgnoreCase("Upload")) {
//            address.uploadCustomerPhoto();
//            dashboard.checkLoaderWeb();
//            wait.WaitTime2();
//            address.clickCustomerPhotoNext();
            wait.WaitTime2();
        } else if (prop.getProperties("customerPhotoSelection").equalsIgnoreCase("Do It later")) {
           // address.clickDoItLaterCustomerPhoto();
            wait.WaitTime2();
        }



        // Bank Details Page //
        bankdetails.clicksubmitBtn();

        bankdetails.ClickPaymentMethodweb(testData.get("paymentmethod"));

        if (testData.get("paymentmethod").equalsIgnoreCase("Direct Bill")) {
            bankdetails.Clicksourcefundweb(testData.get("sourceFund"));
            customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        }
        if (testData.get("paymentmethod").equalsIgnoreCase("e-SI") ) {
            bankdetails.Clicksourcefundweb(testData.get("sourceFund"));
            customerprofile.cdnextbutton(); // customer details NEXT button(QA)
            TestUtil.scrollTillEndOfPage(getDriver());
            customerprofile.cdnextbutton(); // customer details NEXT button(QA)
            bankdetails.EnterIFSCforesiWeb(testData.get("IFSCcode"));
            bankdetails.EnterACCnoforesiWeb(testData.get("AccountNumber"));
            bankdetails.ClickAccTypeesiweb(testData.get("AccountType"));
            customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        }
        if (testData.get("paymentmethod").equalsIgnoreCase("NACH/Direct Debit") ) {
            bankdetails.Clicksourcefundweb(testData.get("sourceFund"));
            TestUtil.scrollTillEndOfPage(getDriver());
            customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        }
        dashboard.checkLoaderWeb();

        // Nominee Details Page //
        nominee.enternomineefname(testData.get("nomineeFirstName"));
        nominee.enternomineelname(testData.get("nomineeLastName"));
        nominee.fillDOBdetailsNomineeWeb(testData.get("day"), testData.get("month"), testData.get("year"));
        nominee.Clicknomineegenderweb(testData.get("nomineegender"));
        nominee.SelectRelationshipwithProposerdropdownWeb(testData.get("relationship"));
        nominee.enternomineeshare(testData.get("nomineeshare"));
        TestUtil.scrollTillEndOfPage(getDriver());
        customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        dashboard.checkLoaderWeb();




        // Company Professional Details //
        companyprofdetails.entercompanyNOBweb(testData.get("CompanyNatureofbuss"));
        companyprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Orgtypecompany"));
        if (testData.get("IsGSTregistered").equalsIgnoreCase("YES")) {
            companyprofdetails.Isgstrehisterdcompany(testData.get("IsGSTregistered"));
            companyprofdetails.ClickOnAreYouRegisterPersonaUnderGSTcompweb(testData.get("CompanyGSTnumber"));
        } else if (testData.get("IsGSTregistered").equalsIgnoreCase("NO")) {
            companyprofdetails.Isgstrehisterdcompany(testData.get("IsGSTregistered"));
        }
        customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        dashboard.checkLoaderWeb();


        // Insurer Personal Info //
        proposerpersonalinfo.SelectMaritalStatusweb(testData.get("Propmarital"));
        proposerpersonalinfo.EnterFatherSpaouseNamecompanyweb(testData.get("fatherSpouse"));
        proposerpersonalinfo.EnterMotherNamecompanyweb(testData.get("mothername"));
        if (testData.get("IsPropPolitical").equalsIgnoreCase("Yes")) {
            proposerpersonalinfo.IsaProppolitical(testData.get("PoliticalDetails"));
        }

        // Insurer Professional Details tab // (Company scenario)
        proposerprofdetails.SelectQualificationweb(testData.get("Propqualification"));
        proposerprofdetails.SelectOccupationweb(testData.get("PropoccupationOption"));
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Professional")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Business Owner")) {
            proposerprofdetails.EnterOccupationNameofbusinessweb(testData.get("Propnameofbusiness"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Service")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));

        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Driver")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Armed Forces")) {
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Army/Navy/Police")) {
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Skilled Worker")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Jeweller")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Builder")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Scrap Dealer")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Doctor")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Lawyer")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Architect")) {
            proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        if (testData.get("PropoccupationOption").equalsIgnoreCase("Others")) {
            proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
            proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
            proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
            proposerprofdetails.InsurerAnnualincomecompanyweb(testData.get("AnnualIncome"));
        }
        customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        dashboard.checkLoaderWeb();


        // Existing Policy and Refused Policy Tab //
        if (testData.get("AddexistingPolicy").equalsIgnoreCase("Existing Policy")) {
            insurerpersonalinfo.IsAddexistingPolicy(testData.get("AddexistingPolicy"), testData.get("InsurerName"), testData.get("SumAssured"));
        }
        if (testData.get("AddrefusedPolicy").equalsIgnoreCase("Refused Policy")) {
            insurerpersonalinfo.IsAddrefusedPolicy(testData.get("AddrefusedPolicy"),testData.get("PolicyType"),testData.get("InsurerNameRef"),testData.get("SumAssuredref"),testData.get("ReasonRef"));
        }
        customerprofile.cdnextbutton(); // customer details NEXT button(QA)

        // Address Details page //
        //address.SelectcommaddtypeWeb(testData.get(CommAddressType));
        //address.entercommadd3(testData.get(CommAddress3));
        //address.entercommlandmark(testData.get(CommLandmark));
        TestUtil.scrollTillEndOfPage(getDriver());
        address.clickConfirmcapital();  // CONFIRM button QA //
        dashboard.checkLoaderWeb();


        // Insurer Personal Health Details Tab //
        insupersonalhealth.EnterHeightFeet(testData.get("HeightFeet"));
        insupersonalhealth.EnterHeightInch(testData.get("HeightInch"));
        insupersonalhealth.EnterWeight(testData.get("weight"));
        if (testData.get("Isweightgainlost").equalsIgnoreCase("Yes")) {
            insupersonalhealth.ClickOnIsThereAnyWeightChangesYESBtnWeb(testData.get("Weightgainlost"));
        }
        insupersonalhealth.ClickSaveContinuecapitalBtn(); //SAVE & CONTINUE button QA//


        // Insurer Lifestyle Details Tab //
        if (testData.get("IsLifeStyleDetails").equalsIgnoreCase("Yes")) {
            if (testData.get("LifeStyleDetailsN").equalsIgnoreCase("Narcotics")) {
                insurerlifestyle.selectNarcoticsYESButton();
                insurerlifestyle.EnterReasonForNarcotics(testData.get("ProvideDetails"));
            }
            TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Alcohol Consumption']")));
            if (testData.get("LifeStyleDetailsA").equalsIgnoreCase("Alcohol Consumption")) {
                insurerlifestyle.selectAlcohalConsumptionYESButton();
               // insurerlifestyle.EnterReasonForAlcohol("ProvideDetails");
                insurerlifestyle.TypeofAlcoholConsume(testData.get("TypeOfAlcohal"), testData.get("Quantity"), testData.get("Frequency"));
            }
            if (testData.get("AlcoholAdvise").equalsIgnoreCase("Yes")) {
                insurerlifestyle.selectAdvicealcoholYESButton(testData.get("Hospital"), testData.get("Reason"), testData.get("VisitDate"), testData.get("VisitMonth"), testData.get("VisitYear"));
            }
            if (testData.get("AlcoholAddicts").equalsIgnoreCase("Yes")) {
                insurerlifestyle.selectAlcohalAddictsYESButton();
            }
            if (testData.get("AlcoholAddinfo").equalsIgnoreCase("Yes")) {
                insurerlifestyle.selectAlcohalAddinfoYESButton(testData.get("Addinfo"));
            }
            TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Tobacco / Nicotine ']")));
            if (testData.get("LifeStyleDetailsTN").equalsIgnoreCase("Tobacco/Nicotine")) {
                insurerlifestyle.selectTobacconicotinYESButton();
                insurerlifestyle.Clickdurationmonthweb(testData.get("MonthDuration"));
                insurerlifestyle.TypeofTobacco(testData.get("Tobaccotype"), testData.get("quantity"), testData.get("noofyear"));
            }
            if (testData.get("Advicetostop").equalsIgnoreCase("Yes")) {
                insurerlifestyle.selectAdvisetostopYESButton(testData.get("SpecifyReason"));
            }
            TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Hazardous Activities']")));
            if (testData.get("LifeStyleDetailsHZ").equalsIgnoreCase("Hazardous Activities")) {
                insurerlifestyle.selectHazardousActivityYESButton();
                insurerlifestyle.HazardousSelectOption1(testData.get("Hazardactivity"));
                insurerlifestyle.enteryerashazard(testData.get("MentionYears"));
                insurerlifestyle.HazardousSelectOption2(testData.get("HazardActivityBy"));
            }
            TestUtil.scrollTillEndOfPage(getDriver());
            if (testData.get("LifeStyleDetailsTrv").equalsIgnoreCase("Travel")) {
                insurerlifestyle.selectTraveloutsideYESButton();
                insurerlifestyle.TravelDetailstwelvemonth(testData.get("Country"), testData.get("City"), testData.get("DateofDept"), testData.get("DateofArrvl"), testData.get("Visatype"));
            }
            insurerlifestyle.ClickSaveContinueBtn(); //Save & Continue Button QA//
            dashboard.checkLoaderWeb();

        }
        // Insurer Medical History Tab //
        if (testData.get("IsFamilyMedical").equalsIgnoreCase("Yes")) {
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

            // Insurer family medical tab // father+mother+brother+sister
            TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Father']")));
            if (testData.get("IsFMBSstatus").equalsIgnoreCase("Yes")) {
                //insurerfamilymedical.FatherOnFamilyMedicalWeb(testData.get("FatherStatus"), testData.get("FAge"), testData.get("FHealthState"), testData.get("FDeathage"), testData.get("FDeathcause"));
                TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Mother']")));
               // insurerfamilymedical.MotherOnFamilyMedicalWeb(testData.get("MotherStatus"), testData.get("MAge"), testData.get("MHealthState"), testData.get("MDeathage"), testData.get("MDeathcause"));
            }
            TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Brother']")));
            if (testData.get("IsAddBrother").equalsIgnoreCase("Yes")) {
//                insurerfamilymedical.BrotheraddFamilyMedicalWeb();
//                insurerfamilymedical.BrotherOnFamilyMedicalWeb(testData.get("BrotherStatus"), testData.get("BAge"), testData.get("BHealthState"), testData.get("BDeathage"), testData.get("BDeathcause"));
//                insurerfamilymedical.BrothersaveFamilyMedicalWeb();
            }
            TestUtil.scrollTillEndOfPage(getDriver());
            if (testData.get("IsAddSister").equalsIgnoreCase("Yes")) {
//                insurerfamilymedical.SisteraddFamilyMedicalWeb();
//                insurerfamilymedical.SisterOnFamilyMedicalWeb(testData.get("SisterStatus"), testData.get("SAge"), testData.get("SHealthState"), testData.get("SDeathage"), testData.get("SDeathcause"));
//                insurerfamilymedical.SisterrsaveFamilyMedicalWeb();
            }
            TestUtil.scrollTillEndOfPage(getDriver());
            insupersonalhealth.ClickSaveContinuecapitalBtn(); //SAVE & CONTINUE button QA//
            dashboard.checkLoaderWeb();

        }

        //COVID 19 CODE
        // covid 19 details//
        if (testData.get("IsCoviddetails").equalsIgnoreCase("Yes")) {
            insurercoviddetails.ClickOnhaveyoutestedCOVID19Web();
            insurercoviddetails.enterdignodateweb(testData.get("DiagnosisDate"));
            insurercoviddetails.enterrecoverydateweb(testData.get("RecoveryDate"));

            if (testData.get("IsTreatmentTaken").equalsIgnoreCase("Yes")) {
                insurercoviddetails.ClickOntreatmenttakenWeb();

                if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("Yes")) {
                    insurercoviddetails.ClickOnAsymptyesWeb();
                } else if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("No")) {
                    insurercoviddetails.ClickOnAsymptnoWeb();
                }
                if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("Yes")) {
                    insurercoviddetails.ClickOnHomequryesWeb();
                } else if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("No")) {
                    insurercoviddetails.ClickOnHomequrynoWeb();
                }
                if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("Yes")) {
                    insurercoviddetails.ClickOnHospitalyesWeb();
                } else if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("No")) {
                    insurercoviddetails.ClickOnHospitalnoWeb();
                }
            } else {
                insurercoviddetails.ClickOnTretmentTakenNOBTNWeb();
            }
        }
        insurerlifestyle.ClickSaveContinueBtn();

        // Insurer Medical History Tab //
        if (testData.get("IsFamilyMedicaldetails").equalsIgnoreCase("Yes")) {
            if (testData.get("IsAbsentFromWork").equalsIgnoreCase("Absent From Work")) {
                insurermedicalhistory.ClickonAbsentfromWork();

                insurermedicalhistory.EnterAbsentfromWorkCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
                insurermedicalhistory.EnterAbsentfromWorkDoctorDetails(testData.get("AFWdoctordetails"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
                insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalization(testData.get("AFWdetails"));
            } else if (testData.get("IsAbsentFromWork").equalsIgnoreCase("No")) {
                insurermedicalhistory.ClickonAbsentfromWorkNO();
            }
            if (testData.get("IsHospitalization").equalsIgnoreCase("Hospitalization")) {
                insurermedicalhistory.Clickonhospitalization();

                insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomhos(testData.get("AFWcurrentsymptoms"));
                insurermedicalhistory.EnterAbsentfromWorkDoctorDetailshos(testData.get("AFWdoctordetails"));
                insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationhos(testData.get("AFWdetails"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsulthos(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosishos(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
            } else if (testData.get("IsHospitalization").equalsIgnoreCase("No")) {
                insurermedicalhistory.ClickonhospitalizationNO();
            }
            if (testData.get("IsAilments").equalsIgnoreCase("No")) {
                insurermedicalhistory.ClickonAilmentsNO();
            }
            if (testData.get("IsDisorder").equalsIgnoreCase("Disorder")) {
                insurermedicalhistory.ClickonDisorder();

                insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomdsdr(testData.get("AFWcurrentsymptoms"));
                insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsdsdr(testData.get("AFWdoctordetails"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdsdr(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisdsdr(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
                insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationdsdr(testData.get("AFWdetails"));
            } else if (testData.get("IsDisorder").equalsIgnoreCase("No")) {
                insurermedicalhistory.ClickonDisorderNO();
            }
            if (testData.get("IsSpouseHealth").equalsIgnoreCase("Spouse Health")) {
                insurermedicalhistory.ClickonSpouseHealth();

                insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomspouse(testData.get("AFWcurrentsymptoms"));
                insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsspouse(testData.get("AFWdoctordetails"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdspouse(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisspouse(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
                insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationspouse(testData.get("AFWdetails"));
            } else if (testData.get("IsSpouseHealth").equalsIgnoreCase("No")) {
                insurermedicalhistory.ClickonSpouseHealthNO();
            }
            if (testData.get("IsOtherSymptoms").equalsIgnoreCase("Other symptoms")) {
                insurermedicalhistory.Clickonothersymp();

                insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomother(testData.get("AFWcurrentsymptoms"));
                insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsother(testData.get("AFWdoctordetails"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdother(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
                insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisother(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
                insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationother(testData.get("AFWdetails"));
            } else if (testData.get("IsOtherSymptoms").equalsIgnoreCase("No")) {
                insurermedicalhistory.ClickonothersympNO();
            }
            if (testData.get("InsuredGender").equalsIgnoreCase("Female")) {
                if (testData.get("IsPregnant").equalsIgnoreCase("Are You Pregnant")) {
                    insurermedicalhistory.ClickonAreyoupregnant();

                    insurermedicalhistory.EnterAreyoupregnantnumberofweeks(testData.get("NoofWeeeks"));
                    insurermedicalhistory.EnterAreyoupregnantCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
                    insurermedicalhistory.EnterAreyoupregnantDoctorDetails(testData.get("AFWdoctordetails"));
                    insurermedicalhistory.EnterAreyoupregnantDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
                    insurermedicalhistory.EnterAreyoupregnantDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
                    insurermedicalhistory.EnterAreyoupregnantDetailsofHospitalization(testData.get("AFWdetails"));
                } else if (testData.get("IsPregnant").equalsIgnoreCase("No")) {
                    insurermedicalhistory.ClickonAreyoupregnantNo();
                }
                if (testData.get("IsGynaecological").equalsIgnoreCase("Gynaecological Problem")) {
                    insurermedicalhistory.Clickongynaecological();

                    insurermedicalhistory.EntergynaecologicalCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
                    insurermedicalhistory.EntergynaecologicalDoctorDetails(testData.get("AFWdoctordetails"));
                    insurermedicalhistory.EntergynaecologicalDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
                    insurermedicalhistory.EntergynaecologicalDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
                    insurermedicalhistory.EntergynaecologicalDetailsofHospitalization(testData.get("AFWdetails"));
                } else if (testData.get("IsGynaecological").equalsIgnoreCase("No")) {
                    insurermedicalhistory.ClickongynaecologicalNo();
                }
            }
        }
        insurerlifestyle.ClickSaveContinueBtn(); //Save & Continue Button QA//
        dashboard.checkLoaderWeb();


        // insurer NRI Mandate //
        if(testData.get("InsuNRI").equalsIgnoreCase("YES")){
            nriMandate.clickOnAreYouIndianOrigin(testData.get("isIndianOriginInsur"));
            nriMandate.enterCountryOfPermanentResidence(testData.get("pResidenceInsur"));
            nriMandate.enterDateFromWhichBecamePR(testData.get("datePRInsur"));
            nriMandate.enterDateLastVisitedIndia(testData.get("lastVisitedIndiaDateInsur"));
            nriMandate.enterPassportNumber(testData.get("passportNumberInsur"));
            nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplicationInsur"));

            //FNIO/PIO//
            if(testData.get("FNIOPIOButtonInsur").equalsIgnoreCase("Yes")){
               // nriMandate.clickOnFNIOPIO(testData.get("FNIOPIOButtonInsur"));
                nriMandate.durationOfStayIndiaFNIO(testData.get("durationInYrsInsur"),testData.get("durationInMonthsInsur"));
                nriMandate.selectNatureOfVisa(testData.get("natureOfVisaHeldInsur"));
                nriMandate.selectPurposeOfStayIndiaFNIO(testData.get("purposeOfStayFNIO_PIOInsur"));
                if(testData.get("purposeOfStayFNIO_PIOInsur").equalsIgnoreCase("Student")) {
                    nriMandate.enterNatureOfStayIndiaFNIO(testData.get("natureOfStayFNIO_PIOInsur"));
                }
                else if (testData.get("purposeOfStayFNIO_PIOInsur").equalsIgnoreCase("Others")) {
                    nriMandate.enterSpecificReasonFNIO_PIO(testData.get("specificReasonFNIO_PIOInsur"));
                }
                nriMandate.selectPIO_OCICard(testData.get("selectPIO_OCICardInsur"));
            }

            //Residence Address while in India//
            if(testData.get("isAddSameAsPrimary").equalsIgnoreCase("YES")){
                insurerNriMandate.addressSameASPropPrimary();
            } else if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("NO")) {
                insurerNriMandate.enterIndianAddress1(testData.get("indianAddress1"));
                insurerNriMandate.enterIndianAddress2(testData.get("indianAddress2"));
                insurerNriMandate.enterIndianAddress3(testData.get("indianAddress3"));
                insurerNriMandate.enterIndianArea(testData.get("IndianAr"));
                insurerNriMandate.enterIndianCity(testData.get("indianCity"));
                insurerNriMandate.enterIndianState(testData.get("indianState"));
                insurerNriMandate.enterIndianPinCode(testData.get("indianPincode"));
            }

            //Purpose of your stay abroad//
            nriMandate.clickOnPurposeOfStayAbroad(testData.get("purposeOfStayAbroadInsur"));
            if(testData.get("purposeOfStayAbroadInsur").equalsIgnoreCase("Student")){
                nriMandate.enterStudentNatureOfStay(testData.get("studentNatureOfStayAbroadInsur"));
            } else if (testData.get("purposeOfStayAbroadInsur").equalsIgnoreCase("Others")) {
                nriMandate.enterSpecificNatureOfStayAbroad(testData.get("stayAbroadSpecificReasonInsur"));
            }
            nriMandate.enterIntendedDurationOfStayAbroad(testData.get("intendedDurationYearInsur"),testData.get("intendedDurationMonthInsur"));

            //Residence Address while in Abroad//
            nriMandate.addTypeNri(testData.get("nriAddressTypeInsur"));
            nriMandate.enterNriAddress1(testData.get("address1NriInsur"));
            nriMandate.enterNriAddress2(testData.get("address2NriInsur"));
            nriMandate.enterNriAddress3(testData.get("address3NriInsur"));
            nriMandate.enterNriArea(testData.get("areaNriInsur"));
            nriMandate.enterNriCity(testData.get("cityNriInsur"));
            nriMandate.enterNriState(testData.get("stateNriInsur"));
            nriMandate.enterNriPinCode(testData.get("pinCodeNriInsur"));
            nriMandate.enterNrimobilenumber(testData.get("mobilenumberNri"));
            nriMandate.enterNriTeleNumberResidence(testData.get("teleNumberResidenceNriInsur"));
            nriMandate.enterNriTeleNumberOffice(testData.get("teleNumberOfficeNriInsur"));

            //Have you traveled over the last 12 months? *//
            insurerNriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12MonthsInsur"));
            if(testData.get("travelledOverLast12MonthsInsur").equalsIgnoreCase("Yes")){
                nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12MonthsInsur"));
                nriMandate.enterLast12MonthCity(testData.get("last12MonthCityInsur"));
                nriMandate.enterLast12MonthsDepartDate(testData.get("lastTravelled12MonthsDepartDateInsur"));
                nriMandate.enterLast12MonthsArrivalDate(testData.get("lastTravelled12MonthsArrivalDateInsur"));
                nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaTypeInsur"));

                nriMandate.clickSaveButton();
            }

            //Are you planning to travel in next 12 months? *//
            insurerNriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12MonthsInsur"));
            if(testData.get("travelledOverNext12MonthsInsur").equalsIgnoreCase("Yes")){
                nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12MonthsInsur"));
                nriMandate.enterNext12MonthCity(testData.get("Next12MonthCityInsur"));
                nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDateInsur"));
                nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDateInsur"));
                nriMandate.selectNext12MonthsVisaType(testData.get("nextTravelled12MonthsVisaTypeInsur"));

                nriMandate.clickSaveButton();
            }
            insurerNriMandate.clickOnInsuredContinueButton();
            dashboard.checkLoaderWeb();

        }

        // Review and accept page //
        TestUtil.scrollTillEndOfPage(getDriver());
        rna.ClickOnRandACheckboxWeb();
        rna.ClickOnAgreeButtonWeb();


        // E customer consent declaration //
        if (testData.get("IsECCD").equalsIgnoreCase("Yes")) {
            eccd.ECCDCompleteNow();
            eccd.ClickOnyestoallCheckboxWeb();
            eccd.ClickOnrecurringdepositCheckboxWeb();
            eccd.ClickOnABSLICheckboxWeb();
            eccd.ClickOnillustrationCheckboxWeb();
            eccd.SelectRelationshipweb(testData.get("SelectRelationECCD"));
            eccd.Selectmodeofpaymentweb(testData.get("ModeofPaymentECCD"));
            eccd.Acceptbutton();
            dashboard.checkLoaderWeb();
            eccd.enterProposerOTPeccdweb(testData.get("ProposerOTP"));
            bankdetails.clicksubmitBtn();
            dashboard.checkLoaderWeb();
            TestUtil.scrollTillTOPOfPage(getDriver());
            eccd.ClickGoBackbutton();


            // Insurer CCD //
            eccd.ECCDCompleteNowInsured();
            eccd.ClickOnyestoallCheckboxInsuredWeb();
            eccd.ClickOnrecurringdepositCheckboxInsuredWeb();
            eccd.ClickOnABSLICheckboxInsuredWeb();
            eccd.ClickOnillustrationCheckboxInsuredWeb();
            eccd.SelectRelationshipInsuredweb(testData.get("SelectRelationECCD"));
            eccd.SelectmodeofpaymentInsuredweb(testData.get("ModeofPaymentECCD"));
            eccd.AcceptbuttonInsured();
            dashboard.checkLoaderWeb();
            eccd.enterInsurerOTPeccdweb(testData.get("InsurerOTP"));
            bankdetails.clicksubmitBtn();
            dashboard.checkLoaderWeb();
            TestUtil.scrollTillTOPOfPage(getDriver());
            eccd.ClickGoBackbutton();

            eccd.Nextbutton();
            eccd.ClickCopylinkbutton();
            eccd.ClickContinuebutton();
        } else {
            eccd.ClickDoitLaterbutton();
            dashboard.checkLoaderWeb();

        }

        // Payment Page //
        if (testData.get("IsSelectChequeORDDPayment").equalsIgnoreCase("Yes")) {
            if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Cheque")) {
                paymentpage.ClickOnChequeAndDDModeweb();
                paymentpage.UploadChequeAndDDImgweb();
                paymentpage.EnterChequeDDNoWeb(testData.get("ChequeDDNo"));
                paymentpage.EnterDDMMYYONCDDWeb(testData.get("CDDday"), testData.get("CDDMonth"), testData.get("CDDYear"));
                paymentpage.EnterIFSCCodeOnCDDWeb(testData.get("CDDIFSCcode"));
                paymentpage.ClickCDDPaymentSubmitBTNweb();
                customerprofile.cdnextbutton(); // customer details NEXT button(QA)
                dashboard.checkLoaderWeb();


            } else if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Demand Draft")) {
                paymentpage.UploadChequeAndDDImgweb();
                paymentpage.EnterChequeDDNoWeb(testData.get("ChequeDDNo"));
                paymentpage.EnterDDMMYYONCDDWeb(testData.get("CDDday"), testData.get("CDDMonth"), testData.get("CDDYear"));
                paymentpage.EnterIFSCCodeOnCDDWeb(testData.get("CDDIFSCcode"));
                dashboard.checkLoaderWeb();
                TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
                paymentpage.UploadDECLARATIONFORMImgweb();
                dashboard.checkLoaderWeb();
                paymentpage.ClickCDDPaymentSubmitBTNweb();
                customerprofile.cdnextbutton(); // customer details NEXT button(QA)
                dashboard.checkLoaderWeb();

            }
            else if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Fund Transfer")) {
                TestUtil.scrollTillEndOfPage(getDriver());
                paymentpage.ClickOnFundTransferModeweb();
                paymentpage.UploadFundtransferImgweb();
                TestUtil.scrollTillEndOfPage(getDriver());
                paymentpage.EnterpolicyNumberFTWeb(testData.get("PolicyNumber"));
                WebElement Balamount = getDriver().findElement(By.xpath("(//div[contains(@class,'win-back-balance')])[2]"));
                String BalamountValue = Balamount.getText();
                paymentpage.EnterAmountFTWeb(BalamountValue);
                paymentpage.ClickOnFTsavebuttonweb();
                paymentpage.ClickOnFTredeembuttonweb();
                customerprofile.cdnextbutton(); // customer details NEXT button(QA)
                dashboard.checkLoaderWeb();

            }
        }
        else {
            TestUtil.scrollTillEndOfPage(getDriver());
            paymentpage.ClickpaymentDoitLaterbutton();
            dashboard.checkLoaderWeb();

        }

    }

}
