package com.absli.pageObjects;

import com.absli.base.TestBase;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestUtil;

public class InsurerMedicalHistory extends TestBase {

    public InsurerMedicalHistory(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    // Insurer Medical History tab // 16/6/2023=mayur

    @FindBy(xpath = "(//button[contains(@name,'8080')])[1]") // yes button
    private WebElement AbsentBTN;
    @FindBy(xpath = "//input[contains(@name,'8087')]") // current symptoms
    private WebElement abcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8088')]") // doctor details
    private WebElement abDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8089')]") // day LC
    private WebElement ablcday;
    @FindBy(xpath = "//input[contains(@name,'month8089')]") // month LC
    private WebElement ablcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8089')]") // year LC
    private WebElement ablcyear;
    @FindBy(xpath = "//input[contains(@name,'day8090')]") // day DD
    private WebElement abddday;
    @FindBy(xpath = "//input[contains(@name,'month8090')]") // month DD
    private WebElement abddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8090')]") // year DD
    private WebElement abddyear;
    @FindBy(xpath = "//input[contains(@name,'8091')]") // DOH afw
    private WebElement abdoh;
    //------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8081')])[1]") // yes button
    private WebElement HospBTN;
    @FindBy(xpath = "//input[contains(@name,'8092')]") // current symptoms
    private WebElement hoscurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8093')]") // doctor details
    private WebElement hosDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8095')]") // day LC
    private WebElement hoslcday;
    @FindBy(xpath = "//input[contains(@name,'month8095')]") // month LC
    private WebElement hoslcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8095')]") // year LC
    private WebElement hoslcyear;
    @FindBy(xpath = "//input[contains(@name,'day8096')]") // day DD
    private WebElement hosddday;
    @FindBy(xpath = "//input[contains(@name,'month8096')]") // month DD
    private WebElement hosddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8096')]") // year DD
    private WebElement hosddyear;
    @FindBy(xpath = "//input[contains(@name,'8094')]") // DOH afw
    private WebElement hosdoh;
    //------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8083')])[1]") // yes button
    private WebElement DsdrBTN;
    @FindBy(xpath = "//input[contains(@name,'8097')]") // current symptoms
    private WebElement dsdrcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8098')]") // doctor details
    private WebElement dsdrDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8099')]") // day LC
    private WebElement dsdrlcday;
    @FindBy(xpath = "//input[contains(@name,'month8099')]") // month LC
    private WebElement dsdrlcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8099')]") // year LC
    private WebElement dsdrlcyear;
    @FindBy(xpath = "//input[contains(@name,'day8100')]") // day DD
    private WebElement dsdrddday;
    @FindBy(xpath = "//input[contains(@name,'month8100')]") // month DD
    private WebElement dsdrddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8100')]") // year DD
    private WebElement dsdrddyear;
    @FindBy(xpath = "//input[contains(@name,'8101')]") // DOH afw
    private WebElement dsdrdoh;
    //------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8084')])[1]") // yes button
    private WebElement spBTN;
    @FindBy(xpath = "//input[contains(@name,'8102')]") // current symptoms
    private WebElement spcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8103')]") // doctor details
    private WebElement spDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8104')]") // day LC
    private WebElement splcday;
    @FindBy(xpath = "//input[contains(@name,'month8104')]") // month LC
    private WebElement splcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8104')]") // year LC
    private WebElement splcyear;
    @FindBy(xpath = "//input[contains(@name,'day8105')]") // day DD
    private WebElement spddday;
    @FindBy(xpath = "//input[contains(@name,'month8105')]") // month DD
    private WebElement spddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8105')]") // year DD
    private WebElement spddyear;
    @FindBy(xpath = "//input[contains(@name,'8106')]") // DOH afw
    private WebElement spdoh;
    //-----------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8085')])[1]") // yes button
    private WebElement osBTN;
    @FindBy(xpath = "//input[contains(@name,'8107')]") // current symptoms
    private WebElement oscurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8108')]") // doctor details
    private WebElement osDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8109')]") // day LC
    private WebElement oslcday;
    @FindBy(xpath = "//input[contains(@name,'month8109')]") // month LC
    private WebElement oslcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8109')]") // year LC
    private WebElement oslcyear;
    @FindBy(xpath = "//input[contains(@name,'day8110')]") // day DD
    private WebElement osddday;
    @FindBy(xpath = "//input[contains(@name,'month8110')]") // month DD
    private WebElement osddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8110')]") // year DD
    private WebElement osddyear;
    @FindBy(xpath = "//input[contains(@name,'8111')]") // DOH afw
    private WebElement osdoh;
    @FindBy(xpath = "//input[contains(@name,'noToAll')]") // no to all
    private WebElement ntall;
    //---------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8080')])[2]") // no button
    private WebElement AbsentBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8081')])[2]") // no button
    private WebElement HospBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8083')])[2]") // no button
    private WebElement DsdrBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8084')])[2]") // no button
    private WebElement spBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8085')])[2]") // no button
    private WebElement osBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8082')])[2]") // no button
    private WebElement alignBTNno;
    //---------------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8144')])[1]") // yes button
    private WebElement AbsentBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8145')]") // current symptoms
    private WebElement abcurrentsymtomsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8146')]") // doctor details
    private WebElement abDoctorDetailsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8147')]") // day LC
    private WebElement ablcdayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8147')]") // month LC
    private WebElement ablcmonthfmp;
    @FindBy(xpath = "//input[contains(@name,'year8147')]") // year LC
    private WebElement ablcyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8148')]") // day DD
    private WebElement abdddayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8148')]") // month DD
    private WebElement abddmonthfmpa;
    @FindBy(xpath = "//input[contains(@name,'year8148')]") // year DD
    private WebElement abddyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'8149')]") // DOH afw
    private WebElement abdohfmpa;
    //---------------------------------------------------------------------------------------------------------------//

    @FindBy(xpath = "(//button[contains(@name,'8150')])[1]") // yes button
    private WebElement trtmntBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8151')]") // current symptoms
    private WebElement trtcurrentsymtomsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8152')]") // doctor details
    private WebElement trtDoctorDetailsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8153')]") // day LC
    private WebElement trtlcdayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8153')]") // month LC
    private WebElement trtlcmonthfmp;
    @FindBy(xpath = "//input[contains(@name,'year8153')]") // year LC
    private WebElement trtlcyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8154')]") // day DD
    private WebElement trtdddayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8154')]") // month DD
    private WebElement trtddmonthfmpa;
    @FindBy(xpath = "//input[contains(@name,'year8154')]") // year DD
    private WebElement trtdyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'8155')]") // DOH afw
    private WebElement trtdohfmpa;
    //-------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8084')])[1]") // yes button
    private WebElement sphltBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8102')]") // current symptoms
    private WebElement sphlcurrentsymtomsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8103')]") // doctor details
    private WebElement sphlDoctorDetailsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8104')]") // day LC
    private WebElement sphllcdayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8104')]") // month LC
    private WebElement sphllcmonthfmp;
    @FindBy(xpath = "//input[contains(@name,'year8104')]") // year LC
    private WebElement sphllcyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8105')]") // day DD
    private WebElement sphldddayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8105')]") // month DD
    private WebElement sphlddmonthfmpa;
    @FindBy(xpath = "//input[contains(@name,'year8105')]") // year DD
    private WebElement sphldyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'8106')]") // DOH afw
    private WebElement sphldohfmpa;
    //---------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8144')])[2]") // Hosp No fmp A
    private WebElement AbsentBTNfmpaNO;
    @FindBy(xpath = "(//button[contains(@name,'8150')])[2]") // Treat No fmp A
    private WebElement trtmntBTNfmpaNO;
    @FindBy(xpath = "(//button[contains(@name,'8084')])[2]") // Sp health No fmp A
    private WebElement sphltBTNfmpaNO;
    //--------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8086')])[1]") // yes button
    private WebElement pregnantBTN;
    @FindBy(xpath = "//input[contains(@name,'8133')]") // No. of weeks button
    private WebElement prgntweek;
    @FindBy(xpath = "//input[contains(@name,'8134')]") // current symptoms
    private WebElement prgntcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8135')]") // doctor details
    private WebElement prgntDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8136')]") // day LC
    private WebElement prgntlcday;
    @FindBy(xpath = "//input[contains(@name,'month8136')]") // month LC
    private WebElement prgntlcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8136')]") // year LC
    private WebElement prgntlcyear;
    @FindBy(xpath = "//input[contains(@name,'day8137')]") // day DD
    private WebElement prgntddday;
    @FindBy(xpath = "//input[contains(@name,'month8137')]") // month DD
    private WebElement prgntddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8137')]") // year DD
    private WebElement prgntddyear;
    @FindBy(xpath = "//input[contains(@name,'8138')]") // DOH afw
    private WebElement prgntdoh;
    //--------------------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8132')])[1]") // yes button
    private WebElement gynoBTN;
    @FindBy(xpath = "//input[contains(@name,'8139')]") // current symptoms
    private WebElement gytnocurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8140')]") // doctor details
    private WebElement gynoDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8141')]") // day LC
    private WebElement gynolcday;
    @FindBy(xpath = "//input[contains(@name,'month8141')]") // month LC
    private WebElement gynolcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8141')]") // year LC
    private WebElement gynolcyear;
    @FindBy(xpath = "//input[contains(@name,'day8142')]") // day DD
    private WebElement gynoddday;
    @FindBy(xpath = "//input[contains(@name,'month8142')]") // month DD
    private WebElement gynoddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8142')]") // year DD
    private WebElement gynoddyear;
    @FindBy(xpath = "//input[contains(@name,'8143')]") // DOH afw
    private WebElement gynodoh;
    //-----------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8086')])[2]") // No button
    private WebElement pregnantNOBTN;
    @FindBy(xpath = "(//button[contains(@name,'8132')])[2]") // No button
    private WebElement gynoNOBTN;

    // Absent from work //////////////////////////////////////////////////////////////////////////////////////////
    public void ClickonAbsentfromWork() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTN, 20, "Element is Not Display");
        if (AbsentBTN.isDisplayed()) {
            AbsentBTN.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptoms(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Hospitalization']")));
        wait.waitForElementToBeVisibleweb(getDriver(), abcurrentsymtomsBTN, 20, "Element is Not Display");
        if (abcurrentsymtomsBTN.isDisplayed()) {
            abcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), abDoctorDetailsBTN, 20, "Element is Not Display");
        if (abDoctorDetailsBTN.isDisplayed()) {
            abDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsult(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), ablcday, 20, "Element is Not Display");
        ablcday.click();
        ablcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcmonth, 20, "Element is Not Display");
        ablcmonth.clear();
        ablcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcyear, 20, "Element is Not Display");
        ablcyear.clear();
        ablcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosis(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), abddday, 20, "Element is Not Display");
        abddday.click();
        abddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), abddmonth, 20, "Element is Not Display");
        abddmonth.clear();
        abddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), abddyear, 20, "Element is Not Display");
        abddyear.clear();
        abddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), abdoh, 20, "Element is Not Display");
        if (abdoh.isDisplayed()) {
            abdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////// hospitalization ////////////////////////////////////////////////////////////////////////
    public void Clickonhospitalization() {
        wait.waitForElementToBeVisibleweb(getDriver(), HospBTN, 20, "Element is Not Display");
        if (HospBTN.isDisplayed()) {
            HospBTN.click();
            Allure.step("Clicked on Hospitalization as YES");
        } else {
            System.out.println("Hospitalization is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomhos(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Ailments']")));
        wait.waitForElementToBeVisibleweb(getDriver(), hoscurrentsymtomsBTN, 20, "Element is Not Display");
        if (hoscurrentsymtomsBTN.isDisplayed()) {
            hoscurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailshos(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), hosDoctorDetailsBTN, 20, "Element is Not Display");
        if (hosDoctorDetailsBTN.isDisplayed()) {
            hosDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsulthos(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), hoslcday, 20, "Element is Not Display");
        hoslcday.click();
        hoslcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), hoslcmonth, 20, "Element is Not Display");
        hoslcmonth.clear();
        hoslcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), hoslcyear, 20, "Element is Not Display");
        hoslcyear.clear();
        hoslcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosishos(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), hosddday, 20, "Element is Not Display");
        hosddday.click();
        hosddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), hosddmonth, 20, "Element is Not Display");
        hosddmonth.clear();
        hosddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), hosddyear, 20, "Element is Not Display");
        hosddyear.clear();
        hosddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalizationhos(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), hosdoh, 20, "Element is Not Display");
        if (hosdoh.isDisplayed()) {
            hosdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////// Disorder ///////////////////////////////
    public void ClickonDisorder() {
        wait.waitForElementToBeVisibleweb(getDriver(), DsdrBTN, 20, "Element is Not Display");
        if (DsdrBTN.isDisplayed()) {
            DsdrBTN.click();
            Allure.step("Clicked on Disorder as YES");
        } else {
            System.out.println("Disorder is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomdsdr(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Spouse Health']")));
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrcurrentsymtomsBTN, 20, "Element is Not Display");
        if (dsdrcurrentsymtomsBTN.isDisplayed()) {
            dsdrcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailsdsdr(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrDoctorDetailsBTN, 20, "Element is Not Display");
        if (dsdrDoctorDetailsBTN.isDisplayed()) {
            dsdrDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsultdsdr(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrlcday, 20, "Element is Not Display");
        dsdrlcday.click();
        dsdrlcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrlcmonth, 20, "Element is Not Display");
        dsdrlcmonth.clear();
        dsdrlcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrlcyear, 20, "Element is Not Display");
        dsdrlcyear.clear();
        dsdrlcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosisdsdr(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrddday, 20, "Element is Not Display");
        dsdrddday.click();
        dsdrddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrddmonth, 20, "Element is Not Display");
        dsdrddmonth.clear();
        dsdrddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrddyear, 20, "Element is Not Display");
        dsdrddyear.clear();
        dsdrddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalizationdsdr(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrdoh, 20, "Element is Not Display");
        if (dsdrdoh.isDisplayed()) {
            dsdrdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////Spouse health /////////////
    public void ClickonSpouseHealth() {
        wait.waitForElementToBeVisibleweb(getDriver(), spBTN, 20, "Element is Not Display");
        if (spBTN.isDisplayed()) {
            spBTN.click();
            Allure.step("Clicked on Spouse Health as YES");
        } else {
            System.out.println("Spouse Health is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomspouse(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Other symptoms']")));
        wait.waitForElementToBeVisibleweb(getDriver(), spcurrentsymtomsBTN, 20, "Element is Not Display");
        if (spcurrentsymtomsBTN.isDisplayed()) {
            spcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailsspouse(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), spDoctorDetailsBTN, 20, "Element is Not Display");
        if (spDoctorDetailsBTN.isDisplayed()) {
            spDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsultdspouse(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), splcday, 20, "Element is Not Display");
        splcday.click();
        splcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), splcmonth, 20, "Element is Not Display");
        splcmonth.clear();
        splcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), splcyear, 20, "Element is Not Display");
        splcyear.clear();
        splcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosisspouse(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), spddday, 20, "Element is Not Display");
        spddday.click();
        spddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), spddmonth, 20, "Element is Not Display");
        spddmonth.clear();
        spddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), spddyear, 20, "Element is Not Display");
        spddyear.clear();
        spddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalizationspouse(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), spdoh, 20, "Element is Not Display");
        if (spdoh.isDisplayed()) {
            spdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////// other sympotms //////////////////////
    public void Clickonothersymp() {
        wait.waitForElementToBeVisibleweb(getDriver(), osBTN, 20, "Element is Not Display");
        if (osBTN.isDisplayed()) {
            osBTN.click();
            Allure.step("Clicked on Other Symptoms as YES");
        } else {
            System.out.println("Other Symptoms is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomother(String AFWcurrentsymptoms) {
        TestUtil.scrollTillEndOfPage(getDriver());
        wait.waitForElementToBeVisibleweb(getDriver(), oscurrentsymtomsBTN, 20, "Element is Not Display");
        if (oscurrentsymtomsBTN.isDisplayed()) {
            oscurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailsother(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), osDoctorDetailsBTN, 20, "Element is Not Display");
        if (osDoctorDetailsBTN.isDisplayed()) {
            osDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsultdother(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), oslcday, 20, "Element is Not Display");
        oslcday.click();
        oslcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), oslcmonth, 20, "Element is Not Display");
        oslcmonth.clear();
        oslcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), oslcyear, 20, "Element is Not Display");
        oslcyear.clear();
        oslcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosisother(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), osddday, 20, "Element is Not Display");
        osddday.click();
        osddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), osddmonth, 20, "Element is Not Display");
        osddmonth.clear();
        osddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), osddyear, 20, "Element is Not Display");
        osddyear.clear();
        osddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalizationother(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), osdoh, 20, "Element is Not Display");
        if (osdoh.isDisplayed()) {
            osdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Clickononotoall() {
        wait.waitForElementToBeVisibleweb(getDriver(), ntall, 20, "Element is Not Display");
        if (ntall.isEnabled()) {
            ntall.click();
            Allure.step("Clicked on No To All check box");
        } else {
            System.out.println("No to All check box is not visible");
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ClickonAbsentfromWorkNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTNno, 20, "Element is Not Display");
        if (AbsentBTNno.isDisplayed()) {
            AbsentBTNno.click();
            Allure.step("Clicked on Absent From Work as NO");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void ClickonhospitalizationNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), HospBTNno, 20, "Element is Not Display");
        if (HospBTNno.isDisplayed()) {
            HospBTNno.click();
            Allure.step("Clicked on Hospitalization as NO");
        } else {
            System.out.println("Hospitalization is not visible");
        }
    }

    public void ClickonDisorderNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), DsdrBTNno, 20, "Element is Not Display");
        if (DsdrBTNno.isDisplayed()) {
            DsdrBTNno.click();
            Allure.step("Clicked on Disorder as NO");
        } else {
            System.out.println("Disorder is not visible");
        }
    }

    public void ClickonSpouseHealthNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), spBTNno, 20, "Element is Not Display");
        if (spBTNno.isDisplayed()) {
            spBTNno.click();
            Allure.step("Clicked on Spouse Health as NO");
        } else {
            System.out.println("Spouse Health is not visible");
        }
    }

    public void ClickonothersympNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), osBTNno, 20, "Element is Not Display");
        if (osBTNno.isDisplayed()) {
            osBTNno.click();
            Allure.step("Clicked on Other Symptoms as NO");
        } else {
            System.out.println("Other Symptoms is not visible");
        }
    }

    public void ClickonAilmentsNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), alignBTNno, 20, "Element is Not Display");
        if (alignBTNno.isDisplayed()) {
            alignBTNno.click();
            Allure.step("Clicked on Ailments as NO");
        } else {
            System.out.println("Ailments is not visible");
        }
    }

    //////////////////////////////////////// fmp A plan //////////////////
    public void ClickonHospitalizationfmpa() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTNfmpa, 20, "Element is Not Display");
        if (AbsentBTNfmpa.isDisplayed()) {
            AbsentBTNfmpa.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterHospitalizationCurrentSymptomsfmpa(String currentsymptomsA) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Hospitalization']")));
        wait.waitForElementToBeVisibleweb(getDriver(), abcurrentsymtomsBTNfmpa, 20, "Element is Not Display");
        if (abcurrentsymtomsBTNfmpa.isDisplayed()) {
            abcurrentsymtomsBTNfmpa.sendKeys(currentsymptomsA);
            Allure.step("Enter Current Symptoms  >" + currentsymptomsA);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterHospitalizationDoctorDetailsfmpa(String doctordetailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), abDoctorDetailsBTNfmpa, 20, "Element is Not Display");
        if (abDoctorDetailsBTNfmpa.isDisplayed()) {
            abDoctorDetailsBTNfmpa.sendKeys(doctordetailsA);
            Allure.step("Enter Doctor Details  >" + doctordetailsA);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterHospitalizationDateOfLastConsultfmpa(String LCdayA, String LCmonthA, String LCyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), ablcdayfmpa, 20, "Element is Not Display");
        ablcdayfmpa.click();
        ablcdayfmpa.sendKeys(LCdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcmonthfmp, 20, "Element is Not Display");
        ablcmonthfmp.clear();
        ablcmonthfmp.sendKeys(LCmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcyearfmpa, 20, "Element is Not Display");
        ablcyearfmpa.clear();
        ablcyearfmpa.sendKeys(LCyearA);
        Allure.step("Enter Date of Last Consult  >" + LCdayA + LCmonthA + LCyearA);
    }

    public void EnterHospitalizationDateOfDiagnosisfmpa(String DDdayA, String DDmonthA, String DDyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), abdddayfmpa, 20, "Element is Not Display");
        abdddayfmpa.click();
        abdddayfmpa.sendKeys(DDdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), abddmonthfmpa, 20, "Element is Not Display");
        abddmonthfmpa.clear();
        abddmonthfmpa.sendKeys(DDmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), abddyearfmpa, 20, "Element is Not Display");
        abddyearfmpa.clear();
        abddyearfmpa.sendKeys(DDyearA);
        Allure.step("Enter Date of Diagnosis  >" + DDdayA + DDmonthA + DDyearA);
    }

    public void EnterHospitalizationDetailsofHospitalizationfmpa(String detailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), abdohfmpa, 20, "Element is Not Display");
        if (abdohfmpa.isDisplayed()) {
            abdohfmpa.sendKeys(detailsA);
            Allure.step("Enter Hospitalization Details  >" + detailsA);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ClickonTreatmentfmpa() {
        wait.waitForElementToBeVisibleweb(getDriver(), trtmntBTNfmpa, 20, "Element is Not Display");
        if (trtmntBTNfmpa.isDisplayed()) {
            trtmntBTNfmpa.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterTreatmentCurrentSymptomsfmpa(String currentsymptomsA) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Hospitalization']")));
        wait.waitForElementToBeVisibleweb(getDriver(), trtcurrentsymtomsBTNfmpa, 20, "Element is Not Display");
        if (trtcurrentsymtomsBTNfmpa.isDisplayed()) {
            trtcurrentsymtomsBTNfmpa.sendKeys(currentsymptomsA);
            Allure.step("Enter Current Symptoms  >" + currentsymptomsA);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterTreatmentDoctorDetailsfmpa(String doctordetailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), trtDoctorDetailsBTNfmpa, 20, "Element is Not Display");
        if (trtDoctorDetailsBTNfmpa.isDisplayed()) {
            trtDoctorDetailsBTNfmpa.sendKeys(doctordetailsA);
            Allure.step("Enter Doctor Details  >" + doctordetailsA);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterTreatmentDateOfLastConsultfmpa(String LCdayA, String LCmonthA, String LCyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), trtlcdayfmpa, 20, "Element is Not Display");
        trtlcdayfmpa.click();
        trtlcdayfmpa.sendKeys(LCdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), trtlcmonthfmp, 20, "Element is Not Display");
        trtlcmonthfmp.clear();
        trtlcmonthfmp.sendKeys(LCmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), trtlcyearfmpa, 20, "Element is Not Display");
        trtlcyearfmpa.clear();
        trtlcyearfmpa.sendKeys(LCyearA);
        Allure.step("Enter Date of Last Consult  >" + LCdayA + LCmonthA + LCyearA);
    }

    public void EnterTreatmentDateOfDiagnosisfmpa(String DDdayA, String DDmonthA, String DDyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), trtdddayfmpa, 20, "Element is Not Display");
        trtdddayfmpa.click();
        trtdddayfmpa.sendKeys(DDdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), trtddmonthfmpa, 20, "Element is Not Display");
        trtddmonthfmpa.clear();
        trtddmonthfmpa.sendKeys(DDmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), trtdyearfmpa, 20, "Element is Not Display");
        trtdyearfmpa.clear();
        trtdyearfmpa.sendKeys(DDyearA);
        Allure.step("Enter Date of Diagnosis  >" + DDdayA + DDmonthA + DDyearA);
    }

    public void EnterTreatmentDetailsofHospitalizationfmpa(String detailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), trtdohfmpa, 20, "Element is Not Display");
        if (trtdohfmpa.isDisplayed()) {
            trtdohfmpa.sendKeys(detailsA);
            Allure.step("Enter Hospitalization Details  >" + detailsA);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ClickonSphealthmentfmpa() {
        wait.waitForElementToBeVisibleweb(getDriver(), sphltBTNfmpa, 20, "Element is Not Display");
        if (sphltBTNfmpa.isDisplayed()) {
            sphltBTNfmpa.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterSphealthCurrentSymptomsfmpa(String currentsymptomsA) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Hospitalization']")));
        wait.waitForElementToBeVisibleweb(getDriver(), sphlcurrentsymtomsBTNfmpa, 20, "Element is Not Display");
        if (sphlcurrentsymtomsBTNfmpa.isDisplayed()) {
            sphlcurrentsymtomsBTNfmpa.sendKeys(currentsymptomsA);
            Allure.step("Enter Current Symptoms  >" + currentsymptomsA);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterSphealthDoctorDetailsfmpa(String doctordetailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), sphlDoctorDetailsBTNfmpa, 20, "Element is Not Display");
        if (sphlDoctorDetailsBTNfmpa.isDisplayed()) {
            sphlDoctorDetailsBTNfmpa.sendKeys(doctordetailsA);
            Allure.step("Enter Doctor Details  >" + doctordetailsA);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterSphealthDateOfLastConsultfmpa(String LCdayA, String LCmonthA, String LCyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), sphllcdayfmpa, 20, "Element is Not Display");
        sphllcdayfmpa.click();
        sphllcdayfmpa.sendKeys(LCdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), sphllcmonthfmp, 20, "Element is Not Display");
        sphllcmonthfmp.clear();
        sphllcmonthfmp.sendKeys(LCmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), sphllcyearfmpa, 20, "Element is Not Display");
        sphllcyearfmpa.clear();
        sphllcyearfmpa.sendKeys(LCyearA);
        Allure.step("Enter Date of Last Consult  >" + LCdayA + LCmonthA + LCyearA);
    }

    public void EnterSphealthDateOfDiagnosisfmpa(String DDdayA, String DDmonthA, String DDyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), sphldddayfmpa, 20, "Element is Not Display");
        sphldddayfmpa.click();
        sphldddayfmpa.sendKeys(DDdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), sphlddmonthfmpa, 20, "Element is Not Display");
        sphlddmonthfmpa.clear();
        sphlddmonthfmpa.sendKeys(DDmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), sphldyearfmpa, 20, "Element is Not Display");
        sphldyearfmpa.clear();
        sphldyearfmpa.sendKeys(DDyearA);
        Allure.step("Enter Date of Diagnosis  >" + DDdayA + DDmonthA + DDyearA);
    }

    public void EnterSphealthDetailsofHospitalizationfmpa(String detailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), sphldohfmpa, 20, "Element is Not Display");
        if (sphldohfmpa.isDisplayed()) {
            sphldohfmpa.sendKeys(detailsA);
            Allure.step("Enter Hospitalization Details  >" + detailsA);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////


    public void ClickonHospitalizationfmpaNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTNfmpaNO, 20, "Element is Not Display");
        if (AbsentBTNfmpaNO.isDisplayed()) {
            AbsentBTNfmpaNO.click();
            Allure.step("Clicked on Absent From Work as NO");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void ClickonTreatmentfmpaNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), trtmntBTNfmpaNO, 20, "Element is Not Display");
        if (trtmntBTNfmpaNO.isDisplayed()) {
            trtmntBTNfmpaNO.click();
            Allure.step("Clicked on Treatment as NO");
        } else {
            System.out.println("Treatment is not visible");
        }
    }

    public void ClickonSphealthmentfmpaNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), sphltBTNfmpaNO, 20, "Element is Not Display");
        if (sphltBTNfmpaNO.isDisplayed()) {
            sphltBTNfmpaNO.click();
            Allure.step("Clicked on Spouse Health as NO");
        } else {
            System.out.println("Spouse Health is not visible");
        }
    }
//////////////////////////////////////////// for female lives only ////////////////////////////////////////////

    public void ClickonAreyoupregnant() {
        wait.waitForElementToBeVisibleweb(getDriver(), pregnantBTN, 20, "Element is Not Display");
        if (pregnantBTN.isDisplayed()) {
            pregnantBTN.click();
            Allure.step("Clicked on Are you pregnant? as YES");
        } else {
            System.out.println("Are you pregnant? is not visible");
        }
    }
    public void EnterAreyoupregnantnumberofweeks(String NoofWeeeks) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntweek, 20, "Element is Not Display");
        if (prgntweek.isDisplayed()) {
            prgntweek.sendKeys(NoofWeeeks);
            Allure.step("Enter No. of Weeks  >" + NoofWeeeks);
        } else {
            System.out.println("No. of Weeks details input box is not visible");
        }
    }

    public void EnterAreyoupregnantCurrentSymptoms(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='For Females lives only']")));
        wait.waitForElementToBeVisibleweb(getDriver(), prgntcurrentsymtomsBTN, 20, "Element is Not Display");
        if (prgntcurrentsymtomsBTN.isDisplayed()) {
            prgntcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAreyoupregnantDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntDoctorDetailsBTN, 20, "Element is Not Display");
        if (prgntDoctorDetailsBTN.isDisplayed()) {
            prgntDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAreyoupregnantDateOfLastConsult(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntlcday, 20, "Element is Not Display");
        prgntlcday.click();
        prgntlcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), prgntlcmonth, 20, "Element is Not Display");
        prgntlcmonth.clear();
        prgntlcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), prgntlcyear, 20, "Element is Not Display");
        prgntlcyear.clear();
        prgntlcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAreyoupregnantDateOfDiagnosis(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntddday, 20, "Element is Not Display");
        prgntddday.click();
        prgntddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), prgntddmonth, 20, "Element is Not Display");
        prgntddmonth.clear();
        prgntddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), prgntddyear, 20, "Element is Not Display");
        prgntddyear.clear();
        prgntddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAreyoupregnantDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntdoh, 20, "Element is Not Display");
        if (prgntdoh.isDisplayed()) {
            prgntdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

///////////////////////////////////////////////////////gyno////////////////////////////////////////////////////////

    public void Clickongynaecological() {
        wait.waitForElementToBeVisibleweb(getDriver(), gynoBTN, 20, "Element is Not Display");
        if (gynoBTN.isDisplayed()) {
            gynoBTN.click();
            Allure.step("Clicked on Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? as YES");
        } else {
            System.out.println("Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? is not visible");
        }
    }
    public void EntergynaecologicalCurrentSymptoms(String AFWcurrentsymptoms) {
        TestUtil.scrollTillEndOfPage(getDriver());
        wait.waitForElementToBeVisibleweb(getDriver(), gytnocurrentsymtomsBTN, 20, "Element is Not Display");
        if (gytnocurrentsymtomsBTN.isDisplayed()) {
            gytnocurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EntergynaecologicalDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), gynoDoctorDetailsBTN, 20, "Element is Not Display");
        if (gynoDoctorDetailsBTN.isDisplayed()) {
            gynoDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EntergynaecologicalDateOfLastConsult(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), gynolcday, 20, "Element is Not Display");
        gynolcday.click();
        gynolcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), gynolcmonth, 20, "Element is Not Display");
        gynolcmonth.clear();
        gynolcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), gynolcyear, 20, "Element is Not Display");
        gynolcyear.clear();
        gynolcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EntergynaecologicalDateOfDiagnosis(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), gynoddday, 20, "Element is Not Display");
        gynoddday.click();
        gynoddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), gynoddmonth, 20, "Element is Not Display");
        gynoddmonth.clear();
        gynoddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), gynoddyear, 20, "Element is Not Display");
        gynoddyear.clear();
        gynoddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EntergynaecologicalDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), gynodoh, 20, "Element is Not Display");
        if (gynodoh.isDisplayed()) {
            gynodoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

//////////////////////////////////////////////////////////////////////////////

    public void ClickonAreyoupregnantNo() {
        wait.waitForElementToBeVisibleweb(getDriver(), pregnantNOBTN, 20, "Element is Not Display");
        if (pregnantNOBTN.isDisplayed()) {
            pregnantNOBTN.click();
            Allure.step("Clicked on Are you pregnant? as NO");
        } else {
            System.out.println("Are you pregnant? is not visible");
        }
    }
    public void ClickongynaecologicalNo() {
        wait.waitForElementToBeVisibleweb(getDriver(), gynoNOBTN, 20, "Element is Not Display");
        if (gynoNOBTN.isDisplayed()) {
            gynoNOBTN.click();
            Allure.step("Clicked on Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? as NO");
        } else {
            System.out.println("Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? is not visible");
        }
    }







}

