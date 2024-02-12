package com.absli.pageObjects;

import com.absli.Listner.AllureListener;
import com.absli.base.*;

import com.absli.utils.WaitUtils;

import com.aventstack.extentreports.Status;
import io.qameta.allure.Allure;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestUtil;

import java.io.IOException;


public class PaymentPage extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;

    public PaymentPage(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    //SASKHI
    @FindBy(xpath = "(//input[@type='file'])[1]")
    private WebElement uploadcheque;
    @FindBy(xpath = "(//input[@type='file'])[2]")
    private WebElement uploadFTimg;
    @FindBy(xpath = "//input[@id='chequeDDNo']")
    private WebElement cheqddno;
    @FindBy(xpath = "(//input[@id='chequeDDNo'])[1]")
    private WebElement JournalNo;
    @FindBy(xpath = "//input[@id='dd']")
    private WebElement cheqddday;
    @FindBy(xpath = "//input[@id='mm']")
    private WebElement cheddmonth;
    @FindBy(xpath = "//input[@id='yy']")
    private WebElement cheqddyear;
    @FindBy(xpath = "(//input[@id='dd'])[1]")
    private WebElement cheqddday1;
    @FindBy(xpath = "(//input[@id='mm'])[1]")
    private WebElement cheddmonth1;
    @FindBy(xpath = "(//input[@id='yy'])[1]")
    private WebElement cheqddyear1;
    @FindBy(xpath = "//input[@id='ifscCode']")
    private WebElement cheqddifsc;
    @FindBy(xpath = "(//span[text()='Submit'])[1]")
    private WebElement cheqddsubmit;
    @FindBy(xpath = "//span[contains(text(), 'Next')]")
    private WebElement nextbutton;
    @FindBy(xpath = "//div[contains(text(),'CHEQUE / DEMAND DRAFT')]")
    private WebElement cheqddtab;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement declarationdd;
    @FindBy(xpath = "//button[@name='DO IT LATER']")
    private WebElement paydoitlater;
    @FindBy(xpath = "(//div[contains(text(),'FUND TRANSFER')])[1]")
    private WebElement fundft;
    @FindBy(xpath = "//input[@name='policyDetails[0].policyNo']")
    private WebElement ftpolicy;
    @FindBy(xpath = "//input[@name='policyDetails[0].policyAmount']")
    private WebElement ftamount;
    @FindBy(xpath = "//button//span[contains(text(), 'SAVE')]")
    private WebElement fundsave;
    @FindBy(xpath = "//button//span[contains(text(), 'REDEEM')]")
    private WebElement fundredeem;
    @FindBy(xpath = "//input[@id='arBranchName']")
    private WebElement SelectBranchDropDown;
    
    //NetBanking Vijay========
    
    @FindBy(xpath = "//div[contains(text(),'Net Banking')]")
    private WebElement NetBanking;
    
    @FindBy(xpath = "//div[contains(text(),'Credit Card')]")
    private WebElement CreditCard;
    
    @FindBy(xpath = "//div[contains(text(),'Debit Card')]")
    private WebElement DebitCard;
    
    @FindBy(xpath = "//span[contains(text(),'Pay Now')]")
    private WebElement PayNowBTN;
    
    
    
    @FindBy(xpath = "//div[text()='Demand Draft']")
    private WebElement DDBTN;
    

    @FindBy(xpath = "//div[text()='Cheque']")
    private WebElement ChequeBTN;

    @FindBy(xpath = "//div[contains(text(),'RTGS/SWIFT')]")
    private WebElement RtgsButton;
    @FindBy(xpath = "//div[contains(text(),'Direct Debit')]")
    private WebElement DirectDebit;
    @FindBy(xpath = "//div[contains(text(),'OVER THE COUNTER (OTC)')]")
    private WebElement OTCBtn;

    @FindBy(xpath = "//input[contains(@id,'isRTGSChecked')]")
    private WebElement RtgsChechBox;
    @FindBy(xpath = "(//span[contains(text(),'Submit')])[1]")
    private WebElement RtgsSubmitBTN;
    
    @FindBy(xpath = "//div[text()='Yes']")
    private WebElement tpdBTN;
    
    @FindBy(xpath = "//span[text()='OK']")
    private WebElement AlertPop;
    
    @FindBy(xpath = "//input[@id='yesToAll']")
    private WebElement eCDFyesToAll;
    
    @FindBy(xpath = "//button[@name='SUBMIT']")
    private WebElement eCDFSUBMITbutton;
    
    public void clickOnSumitBTNECDFweb() throws InterruptedException {
    	 wait.waitforElementToBeClickable(getDriver(), eCDFSUBMITbutton, 10);
        if(eCDFSUBMITbutton.isDisplayed()) {
        	eCDFSUBMITbutton.click();
        	 Allure.step ("Click on Submit Button ");
        }else {
        	eCDFSUBMITbutton.click();
        	 Allure.step ("Click on Submit Button ");
        }
    }

    
    public void clickOnCheckBoxECDFweb() throws InterruptedException {
    	 wait.waitforElementToBeClickable(getDriver(), eCDFyesToAll, 100);
        if(eCDFyesToAll.isEnabled()) {
        	eCDFyesToAll.click();
        	 Allure.step ("Click On ECDF Checkbox ");
        }else {
        	eCDFyesToAll.click();
        	 Allure.step("ECDF Checkbox is not display ");
        }
    }
    
    
    
    public void UploadChequeAndDDImgweb() throws InterruptedException{



        WebElement uploadcheque1=getDriver().findElement(By.xpath("(//input[@type='file'])[1]"));
    	// wait.waitforElementToBeClickable(getDriver(), uploadcheque, 20);
       // String destination = System.getProperty("user.dir") + "//Document//download.jpg";
        String destination= "C:\\Users\\ltuser\\Downloads\\download.jpg";
        uploadcheque1.sendKeys(destination);
        Allure.step( "Failed to upload file...Upload Button is not Display");
    }

public void ClickDDBTNweb() throws InterruptedException {
	 wait.waitforElementToBeClickable(getDriver(), DDBTN, 10);
	if(DDBTN.isDisplayed()) {
	   DDBTN.click();
       ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click   On CDD Payment ");
   }else {
   	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "DD  Button  is not display ");
   }
}


public void ClickChequeBTNweb() throws InterruptedException {
	 wait.waitforElementToBeClickable(getDriver(), ChequeBTN, 10);
	if(ChequeBTN.isDisplayed()) {
		ChequeBTN.click();
       ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click   On cheque button  ");
   }else {
   	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "DD  Button  is not display ");
   }
}
    public void EnterChequeDDNoWeb(String ChequeDDNo) {
        wait.waitForElementToBeVisibleweb(getDriver(), cheqddno, 20, "Element is Not Display");
        if(cheqddno.isDisplayed()) {
            cheqddno.sendKeys(ChequeDDNo);
            Allure.step("Enter Cheque No OR DD No As=====>"+ChequeDDNo);
        }else {
            Allure.step( " Cheque Or Demand Draft No is not display ");
        }
    }
    public void EnterJounralNoWeb(String ChequeDDNo) {
        wait.waitForElementToBeVisibleweb(getDriver(), JournalNo, 20, "Element is Not Display");
        if(JournalNo.isDisplayed()) {
        	JournalNo.sendKeys(ChequeDDNo);
            Allure.step("Enter Jouranal No As=====>"+ChequeDDNo);
        }else {
            Allure.step( " Jouranal No is not display ");
        }
    }

    public void EnterDDMMYYONCDDWeb(String CDDday,String CDDMonth,String CDDYear ) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), cheqddday, 10);
        Thread.sleep(2000);
        cheqddday.click();
        cheqddday.sendKeys(CDDday);
        Allure.step( "Enter Cheque Date On(day) As=====> "+CDDday);
        Thread.sleep(2000);
        wait.waitforElementToBeClickable(getDriver(),cheddmonth,100);
        Thread.sleep(2000);
        cheddmonth.click();
        cheddmonth.sendKeys(CDDMonth);
        Allure.step( "Enter Cheque Date On (month) As=====> "+CDDMonth);
        Thread.sleep(2000);
        cheqddyear.click();
        cheqddyear.sendKeys(CDDYear);
        Allure.step("Enter Cheque Date On (year) As=====> "+CDDYear);
        Thread.sleep(2000);
    }
    public void EnterDDMMYYONjournalWeb(String CDDday,String CDDMonth,String CDDYear ) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), cheqddday1, 10);
        Thread.sleep(2000);
        cheqddday1.click();
        cheqddday1.sendKeys(CDDday);
        Allure.step( "Enter Jouranal Date on (day) As=====> "+CDDday);
        Thread.sleep(2000);
        wait.waitforElementToBeClickable(getDriver(),cheddmonth1,100);
        Thread.sleep(2000);
        cheddmonth1.click();
        cheddmonth1.sendKeys(CDDMonth);
        Allure.step( "Enter Jouranal Date On (month) As=====> "+CDDMonth);
        Thread.sleep(2000);
        cheqddyear1.click();
        cheqddyear1.sendKeys(CDDYear);
        Allure.step("Enter Jouranal Date On (year) As=====> "+CDDYear);
        Thread.sleep(2000);
    }

    public void EnterIFSCCodeOnCDDWeb(String CDDIFSCcode) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), cheqddifsc, 20, "Element is Not Display");
        if(cheqddifsc.isDisplayed()) {
            cheqddifsc.click();
            Thread.sleep(1000);
            cheqddifsc.sendKeys(CDDIFSCcode);
           Allure.step( "Enter  IFSC Code As >>>"+CDDIFSCcode);
        }else {
            Allure.step(" IFSC Filed Is Not Display");
        }
    }
    public void ClickCDDPaymentSubmitBTNweb() throws InterruptedException {
        TestUtil.scrollToElement(getDriver(),getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
        TestUtil.verifybgColor(cheqddsubmit, driver);
        if(cheqddsubmit.isDisplayed()) {
            cheqddsubmit.click();
           Allure.step("Click on Submit On CDD Payment ");
        }else {
           Allure.step( "Submit  Button On CDD Payment is not display ");
        }
    }
    public void Nextbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), nextbutton, 10, "Element is Not Display");
        if (nextbutton.isEnabled()) {
            nextbutton.click();
            Allure.step("Clicked on next button on payment");
        } else {
            System.out.println("next button not visible");
        }
    }

    public void UploadDECLARATIONFORMImgweb() throws InterruptedException{
        String destination= System.getProperty("user.dir")+"\\Document\\download.jpg";
        declarationdd.sendKeys(destination);
        Allure.step( "Failed to upload file...Upload Button is not Display");
    }

    public void ClickOnChequeAndDDModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), cheqddtab, 20, "Element is Not Display");
        if(cheqddtab.isDisplayed()) {
            cheqddtab.click();
            Allure.step("Click Or Select CHEQUE / DEMAND DRAFT  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    
    public void ClickOnBranchdepositDropDown(String val) throws InterruptedException {
//    	   wait.waitForElementToBeVisibleweb(getDriver(), SelectBranchDropDown, 10, "Element is Not Display");
//    	 if (SelectBranchDropDown.isDisplayed()) {
//    		 SelectBranchDropDown.click();
//             Allure.step("Clicked on Select Branch DropDown button on Payment");
//         } else {
//             System.out.println("do it later button not visible");
//         }
    	
    	
      //  WebElement PaymentBTN=getDriver().findElement(By.xpath("//input[contains(@value,'"+val +"')]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectBranchDropDown, 10, "Element is Not Display");
        if(SelectBranchDropDown.isDisplayed()) {
        	SelectBranchDropDown.sendKeys(val);
			 Thread.sleep(2000);
			 SelectBranchDropDown.sendKeys(Keys.ARROW_DOWN);
			 SelectBranchDropDown.sendKeys(Keys.ENTER);
        	  Allure.step ("Click Or Select deposit the cheque at other branch  As=====>"+val);
        }else {
        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Payment Mode button is not display ");
        }
    }
    public void ClickpaymentDoitLaterbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), paydoitlater, 10, "Element is Not Display");
        if (paydoitlater.isDisplayed()) {
            paydoitlater.click();
            Allure.step("Clicked on do it later button on Payment");
        } else {
            System.out.println("do it later button not visible");
        }
    }

    ///////////////////////////// Fund Transfer /////////////////////////////////////////////////////////

    public void ClickOnFundTransferModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), fundft, 20, "Element is Not Display");
        if(fundft.isDisplayed()) {
            fundft.click();
            Allure.step("Click On Fund Transfer Payment Mode ");
        }else {
            Allure.step( "Payment Mode button is not display ");
        }
    }

    public void UploadFundtransferImgweb() throws InterruptedException{
        String destination = System.getProperty("user.dir") + "//Document//download.jpg";
        wait.WaitTime(2);
        uploadFTimg.sendKeys(destination);
        Allure.step( "Failed to upload file...Upload Button is not Display");
    }

    public void EnterpolicyNumberFTWeb(String PolicyNumber) {
        wait.waitForElementToBeVisibleweb(getDriver(), ftpolicy, 20, "Element is Not Display");
        if(ftpolicy.isDisplayed()) {
            ftpolicy.click();
            ftpolicy.sendKeys(PolicyNumber);
            Allure.step( "Enter PolicyNumber As >>>"+PolicyNumber);
        }else {
            Allure.step(" Policy Number Filed Is Not Display");
        }
    }
    public void EnterAmountFTWeb(String BalamountValue) {
        wait.waitForElementToBeVisibleweb(getDriver(), ftamount, 20, "Element is Not Display");
        if(ftamount.isDisplayed()) {
            ftamount.click();
            ftamount.sendKeys(BalamountValue);
            Allure.step( "Enter Amount FT As >>>"+BalamountValue);
        }else {
            Allure.step(" Amount FT Filed Is Not Display");
        }
    }
    public void ClickOnFTsavebuttonweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), fundsave, 20, "Element is Not Display");
        if(fundsave.isDisplayed()) {
            fundsave.click();
            Allure.step("Click On Fund Transfer Save Button");
        }else {
            Allure.step( "Fund Transfer Save button is not display ");
        }
    }
    public void ClickOnFTredeembuttonweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), fundredeem, 20, "Element is Not Display");
        if(fundredeem.isDisplayed()) {
            fundredeem.click();
            Allure.step("Click On Fund Transfer REDEEM Button");
        }else {
            Allure.step( "Fund Transfer REDEEM button is not display ");
        }
    }
//======================================NetBanking Vijay=================
    public void ClickOnNetBankingModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), NetBanking, 5, "Element is Not Display");
        if(NetBanking.isDisplayed()) {
        	NetBanking.click();
            Allure.step("Click Or Select Net Banking  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }

    public void ClickOnCreditCardModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), CreditCard, 5, "Element is Not Display");
        if(CreditCard.isDisplayed()) {
        	CreditCard.click();
            Allure.step("Click Or Select Credit card Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnDebitCardModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), DebitCard, 5, "Element is Not Display");
        if(DebitCard.isDisplayed()) {
        	DebitCard.click();
            Allure.step("Click Or SelectDebit card Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnPaymentPayNowBTNweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), PayNowBTN, 5, "Element is Not Display");
        if(PayNowBTN.isDisplayed()) {
        	PayNowBTN.click();
            Allure.step("Click Or SelectDebit card Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }

    public void ClickOnRTGSModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), RtgsButton, 20, "Element is Not Display");
        if(RtgsButton.isDisplayed()) {
        	RtgsButton.click();
            Allure.step("Click Or Select RTGS  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnDirectDebitweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), DirectDebit, 20, "Element is Not Display");
        if(DirectDebit.isDisplayed()) {
        	DirectDebit.click();
            Allure.step("Click Or Select Direct Debit  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnOTCModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), OTCBtn, 20, "Element is Not Display");
        if(OTCBtn.isDisplayed()) {
        	OTCBtn.click();
            Allure.step("Click Or Select OTC  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void clickOnRTGSCheckboxWeb() {
    	
    	 wait.waitForElementToBeVisibleweb(getDriver(), RtgsChechBox, 20, "Element is Not Display");
		if (RtgsChechBox.isEnabled()) {
			RtgsChechBox.click();
			 Allure.step( "Click on RTGS Checkbox");
			// ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on Proposer I Agree Checkbox");
		} else {
			 ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Checkbox is Not Enable");
		}

	}
    public void clickOnRTGSpaymentSubmitBTNWeb() {
    	
   	 wait.waitForElementToBeVisibleweb(getDriver(), RtgsSubmitBTN, 20, "Element is Not Display");
		if (RtgsSubmitBTN.isDisplayed()) {
			RtgsSubmitBTN.click();
			 Allure.step( "Click on RTGS Submit Button");
			
		} else {
			 ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Submit BTN is Not Enable");
		}

	}
    public void ClickonChequeBelongtoThirdParty() throws InterruptedException {
       // TestUtil.scrollToElement(getDriver(),getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
    	wait.waitForElementToBeVisibleweb(getDriver(), tpdBTN, 20, "Element is Not Display");
        if(tpdBTN.isDisplayed()) {
        	tpdBTN.click();
           Allure.step("Click on TPD yes btn On CDD Payment ");
        }else {
           Allure.step( " TPD yes btn On CDD Payment is not display ");
        }
    }
    public void ClickonSubmitBtnAlertPopup() throws InterruptedException {
        // TestUtil.scrollToElement(getDriver(),getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
     	wait.waitForElementToBeVisibleweb(getDriver(), AlertPop, 20, "Element is Not Display");
         if(AlertPop.isDisplayed()) {
        	 AlertPop.click();
            Allure.step("Click on TPD yes btn On CDD Payment ");
         }else {
            Allure.step( " TPD yes btn On CDD Payment is not display ");
         }
     }
}