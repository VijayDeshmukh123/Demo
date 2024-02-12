package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurerFamilyMedical extends TestBase {


    public InsurerFamilyMedical(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    // Insurer Family Medical Details tab // 13/6/2023=mayur

    @FindBy(xpath = "//span[text()= 'Mellitus/High blood sugar']")
    private WebElement Mellituscheckbox;
    @FindBy(xpath = "//span[text()= 'Hereditary disorder']")
    private WebElement HereditarydisorderCheckBtn;
    @FindBy(xpath = "//span[text()= 'Chronic disorder']")
    private WebElement ChronicdisorderCheckBtn;
    @FindBy(xpath = "//span[text()= 'Heart ailment']")
    private WebElement HeartailmentCheckBtn;
    @FindBy(xpath = "//span[text()= 'Stroke']")
    private WebElement StrokeCheckBtn;
    @FindBy(xpath = "//span[text()= 'High blood pressure']")
    private WebElement HighbloodpressureCheckBtn;
    @FindBy(xpath = "//span[text()= 'Cancer']")
    private WebElement CancerCheckBtn;
    @FindBy(xpath = "//span[text()= 'Diabetes']")
    private WebElement DiabetesCheckBtn;
    @FindBy(xpath = "//span[text()= 'Kidney disease']")
    private WebElement KidneydiseaseCheckBtn;
    @FindBy(xpath = "//span[text()= 'Paralysis']")
    private WebElement ParalysisCheckBtn;
    @FindBy(xpath = "//input[@id='details']")
    private WebElement ProvideDetailsText;
    @FindBy(xpath = "(//div[text()='Living'])[1]")
    private WebElement Fatherlvgbtn;
    @FindBy(xpath = "//input[@name='59']")
    private WebElement Fatherlivingage;
    @FindBy(xpath = "//div[@id='mui-component-select-60']")
    private WebElement Fatherhealthstate;
    @FindBy(xpath = "(//div[text()='Deceased'])[1]")
    private WebElement Fatherdecbtn;
    @FindBy(xpath = "(//label[text()='Age At Death']//parent::div//input)[1]")
    private WebElement Fatherdeathage;
    @FindBy(xpath = "//div[@id='mui-component-select-71']")
    private WebElement Fatherdthcause;
    @FindBy(xpath = "(//div[text()='Living'])[2]")
    private WebElement Motherlvgbtn;
    @FindBy(xpath = "//input[@name='62']")
    private WebElement Motherlivingage;
    @FindBy(xpath = "//div[@id='mui-component-select-63']")
    private WebElement Motherhealthstate;
    @FindBy(xpath = "(//div[text()='Deceased'])[2]")
    private WebElement Motherdecbtn;
    @FindBy(xpath = "(//label[text()='Age At Death']//parent::div//input)[2]")
    private WebElement Motherdeathage;
    @FindBy(xpath = "//div[@id='mui-component-select-72']")
    private WebElement Motherdthcause;
    @FindBy(xpath = "(//div[text()='Living'])[3]")
    private WebElement Brotherlvgbtn;
    @FindBy(xpath = "//input[@name='age']")
    private WebElement Brotherlivingage;
    @FindBy(xpath = "(//div[@role='button'])[3]")
    private WebElement Brotherhealthstate;
    @FindBy(xpath = "(//div[text()='Deceased'])[3]")
    private WebElement Brotherdecbtn;
    @FindBy(xpath = "(//input[@id='ageAtDeath'])[1]")
    private WebElement Brotherdeathage;
    @FindBy(xpath = "(//div[@role='button'])[3]")
    private WebElement Brotherdthcause;
    @FindBy(xpath = "(//div[text()='Living'])[3]")
    private WebElement Sisterlvgbtn;
    @FindBy(xpath = "//input[@name='age']")
    private WebElement Sisterlivingage;
    @FindBy(xpath = "(//div[@role='button'])[3]")
    private WebElement Sisterhealthstate;
    @FindBy(xpath = "(//div[text()='Deceased'])[3]")
    private WebElement Sisterdecbtn;
    @FindBy(xpath = "(//input[@id='ageAtDeath'])[1]")
    private WebElement Sisterdeathage;
    @FindBy(xpath = "(//div[@role='button'])[3]")
    private WebElement Sisterdthcause;
    @FindBy(xpath = "(//button[@name='+ ADD'])[1]")
    private WebElement broaddbtn;
    @FindBy(xpath = "(//button[@name='+ ADD'])[1]")
    private WebElement sisaddbtn;
    @FindBy(xpath = "(//button[@name='SAVE'])[1]")
    private WebElement brosavebtn;
    @FindBy(xpath = "(//button[@name='SAVE'])[1]")
    private WebElement sissavebtn;
//====================vijay=======================
    
    @FindBy(xpath = "(//label[text()='Age']//parent::div//input)[1]")
    private WebElement Fatherage;
   
    @FindBy(xpath = "//div[@id='mui-component-select-60']")
    private WebElement Fathesateofhealth;
	
    @FindBy(xpath = "(//label[text()='Age At Death']//parent::div//input)[1]")
    private WebElement ageOfdeath;
	
    @FindBy(xpath = "(//label[text()='Age']//parent::div//input)[2]")
    private WebElement Motherage;
    
    @FindBy(xpath = "//div[@id='mui-component-select-71']")
    private WebElement causeOfDeath;
   
   
    @FindBy(xpath = "//div[@id='mui-component-select-63']")
    private WebElement Mothersateofhealth;

    @FindBy(xpath = "(//label[text()='Age At Death']//parent::div//input)[2]")
    private WebElement ageOfdeath1;
    
    
    @FindBy(xpath = "//div[@id='mui-component-select-72']")
    private WebElement causeOfDeathMom;
   
    @FindBy(xpath = "(//input[@name='age'])[1]")
    private WebElement Brotherage;
   
    @FindBy(xpath = "(//div[@role='button'])[3]")
    private WebElement Brothersateofhealth;
   
    
    @FindBy(xpath = "//input[@id='ageAtDeath']")
    private WebElement BroageOfdeath;
   
    @FindBy(xpath = "(//div[@role='button'])[3]")
    private WebElement BrotherCauseODeath;
   
    @FindBy(xpath = "(//input[@name='age'])[1]")
    private WebElement Sisterage;
   

    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[3]")
    private WebElement Sistersateofhealth;
    
    @FindBy(xpath = "//input[@id='ageAtDeath']")
    private WebElement sisageOfdeath;
    
    
    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[3]")
    private WebElement sisterCauseODeath;
    
    @FindBy(xpath = "//input[@name='70']")
    private WebElement Ele1;
    
    @FindBy(xpath = "//input[@name='61']")
    private WebElement Ele2;
    
    @FindBy(xpath = "//input[@name='reason']")
    private WebElement Elereason;
    
    @FindBy(xpath = "//input[@name='64']")
    private WebElement EleNmae;
  
    @FindBy(xpath = "//input[@name='deathReason']")
    private WebElement deathReasonEle;
   
    @FindBy(xpath = "(//span[text()='+ ADD'])[1]")
    private WebElement AddBTN;
    @FindBy(xpath = "(//span[text()='SAVE'])[1]")
    private WebElement SaveBTN;
    @FindBy(xpath = "(//span[text()='+ ADD'])[2]")
    private WebElement AddbTN;

    public void ClickOnMellitusCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Mellituscheckbox, 10, "Element is Not Display");
        if (Mellituscheckbox.isEnabled()) {
            Mellituscheckbox.click();
            Allure.step( " Clicked On Mellitus Checkbox");
        } else {
            System.out.println("Mellitus is not Clickable");
        }
    }
    public void ClickOnHereditarydisorderCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), HereditarydisorderCheckBtn, 10, "Element is Not Display");
        if (HereditarydisorderCheckBtn.isEnabled()) {
            HereditarydisorderCheckBtn.click();
            Allure.step( " Clicked On Hereditary disorder Checkbox");
        } else {
            System.out.println("Mellitus is not Clickable");
        }
    }
    public void ClickOnChronicdisorderCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), ChronicdisorderCheckBtn, 10, "Element is Not Display");
        if (ChronicdisorderCheckBtn.isEnabled()) {
            ChronicdisorderCheckBtn.click();
            Allure.step( " Clicked On Chronic disorder Checkbox");
        } else {
            System.out.println("Chronic disorder Checkbox is not Clickable");
        }
    }
    public void ClickOnHeartailmentCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), HeartailmentCheckBtn, 10, "Element is Not Display");
        if (HeartailmentCheckBtn.isEnabled()) {
            HeartailmentCheckBtn.click();
            Allure.step( " Clicked On Heart ailment Checkbox");
        } else {
            System.out.println("Heart ailment Checkbox is not Clickable");
        }
    }
    public void ClickOnStrokeCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), StrokeCheckBtn, 10, "Element is Not Display");
        if (StrokeCheckBtn.isEnabled()) {
            StrokeCheckBtn.click();
            Allure.step( " Clicked On Stroke Checkbox");
        } else {
            System.out.println("Stroke Checkbox is not Clickable");
        }
    }
    public void ClickOnHighbloodpressureCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), HighbloodpressureCheckBtn, 10, "Element is Not Display");
        if (HighbloodpressureCheckBtn.isEnabled()) {
            HighbloodpressureCheckBtn.click();
            Allure.step( "Clicked On High blood pressure Checkbox");
        } else {
            System.out.println("High blood pressure Checkbox is not Clickable");
        }
    }
    public void ClickOnCancerCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), CancerCheckBtn, 10, "Element is Not Display");
        if (CancerCheckBtn.isEnabled()) {
            CancerCheckBtn.click();
            Allure.step( "Clicked On Cancer Checkbox ");
        } else {
            System.out.println("Cancer Checkbox is not Clickable");
        }
    }
    public void ClickOnDiabetesCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), DiabetesCheckBtn, 10, "Element is Not Display");
        if (DiabetesCheckBtn.isEnabled()) {
            DiabetesCheckBtn.click();
            Allure.step( "Clicked On Diabetes Checkbox");
        } else {
            System.out.println("Diabetes Checkbox is not Clickable");
        }
    }

    public void ClickOnKidneydiseaseCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), KidneydiseaseCheckBtn, 10, "Element is Not Display");
        if (KidneydiseaseCheckBtn.isEnabled()) {
            KidneydiseaseCheckBtn.click();
            Allure.step( "Clicked On Kidney disease Checkbox");
        } else {
            System.out.println("Kidney disease Checkbox is not Clickable");
        }
    }
    public void ClickOnParalysisCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), ParalysisCheckBtn, 10, "Element is Not Display");
        if (ParalysisCheckBtn.isEnabled()) {
            ParalysisCheckBtn.click();
            Allure.step( "Clicked On Paralysis Checkbox");
        } else {
            System.out.println("Paralysis Checkbox is not Clickable");
        }
    }
    public void EnterProvideDetailsCommonWeb(String Providemeddetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ProvideDetailsText, 20, "Element is Not Display");
        if (ProvideDetailsText.isDisplayed()) {
            ProvideDetailsText.sendKeys(Providemeddetails);
            Allure.step( "Clicked On Provide Details Common   >"   + Providemeddetails);
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
   






//============================Vijay====================================
    


public void ClickonAddSisterBTNWeb1(String args) {

	if (args.equalsIgnoreCase("YES")) {
		{
			  wait.waitForElementToBeVisibleweb(getDriver(), AddBTN, 10, "Element is Not Display");
			
			if (AddBTN.isDisplayed()) {
				AddBTN.click();
				 Allure.step(" Click  Sister Add Button");
			} else {
				 Allure.step("Failed Click Add BTN ON  Sister option on Health Details  family Medical");
			}
		}
	}

	else if (args.equalsIgnoreCase("NO")) {
		  wait.waitForElementToBeVisibleweb(getDriver(), AddbTN, 10, "Element is Not Display");
	
		if (AddbTN.isDisplayed()) {
			AddbTN.click();
			 Allure.step (" Click  Sister Add Button");
		} else {
			 Allure.step("Failed Click Add BTN ON  Sister option on Health Details  family Medical");
		}

	}

}



public void ClickonSaveBrotherAndSisterBTNWeb() {
	  wait.waitForElementToBeVisibleweb(getDriver(), SaveBTN, 10, "Element is Not Display");
if (SaveBTN.isDisplayed()) {
	SaveBTN.click();
	 Allure.step( " Click  Brother And Sister Save BTN ");
} else {
	 Allure.step("Failed Click  Save BTN  Brother And Sister  Option Of Health Deatails family Medical");
}
}


public void ClickonAddBrotherBTNWeb() {
	wait.waitForElementToBeVisibleweb(getDriver(), AddBTN, 10, "Element is Not Display");
if (AddBTN.isDisplayed()) {
	AddBTN.click();
	 Allure.step(" Click Brother Add Button ");
} else {
	 Allure.step ("Failed Click BTN ON Add Brother on Health Details family Medical");
}

}

	public void ValidationsOfFatherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {
		

		WebElement fatherlivinganddemise = getDriver().findElement(By.xpath("(//div[text()='" +FMBSLivingDemise+ "'])[1]"));
		
		  wait.waitForElementToBeVisibleweb(getDriver(), fatherlivinganddemise, 10, "Element is Not Display");
		if (fatherlivinganddemise.isDisplayed()) {
			fatherlivinganddemise.click();
			//Thread.sleep(4000);
			//TestUtil.verifybgColor(fatherlivinganddemise, driver);
			 Allure.step ("Click on Father Living And Demise  button As >>>>>" + FMBSLivingDemise);
		}
	
		if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
			
			  wait.waitForElementToBeVisibleweb(getDriver(), Fatherage, 10, "Element is Not Display");
			if (Fatherage.isDisplayed()) {
				Fatherage.click();
				Fatherage.sendKeys(FMBSAgeDeath);
				
				 Allure.step ("Enter Father Age  As=====>"+FMBSAgeDeath);
			} else {
				 Allure.step ("Father Age is Not Display On Family Medical");
			}
           
		
			  wait.waitForElementToBeVisibleweb(getDriver(), Fathesateofhealth, 10, "Element is Not Display");
			if (Fathesateofhealth.isDisplayed()) {
				Fathesateofhealth.click();
				Thread.sleep(1000);
				 Allure.step ("Successfully Display  Father  State Of Health on family Medical");
				WebElement selectdropdwon = getDriver().findElement(By.xpath("//ul//div/span[text()='"+FMBSStateAndCause+"']"));
				 // wait.waitForElementToBeVisibleweb(getDriver(), Sisterdthcause, 20, "Element is Not Display");
			      selectdropdwon.click();
			      Allure.step(" Select Father State Of Health  As=====>"+FMBSStateAndCause);	
			} else {
				 Allure.step ("Father State Of Health is Not Display On Family Medical");
			}
		
		}
			else if (FMBSLivingDemise.equalsIgnoreCase("Deceased")) {
				
			
				  wait.waitForElementToBeVisibleweb(getDriver(), ageOfdeath, 10, "Element is Not Display");
				if (ageOfdeath.isDisplayed()) {
					ageOfdeath.click();
					ageOfdeath.sendKeys(FMBSAgeDeath);
					
					 Allure.step("Enter Father Age Of Death  As=====>"+FMBSAgeDeath);
				} else {
					 Allure.step("Father Age Of Death is Not Display On Family Medical");
				}

				
				  wait.waitForElementToBeVisibleweb(getDriver(), causeOfDeath, 20, "Element is Not Display");
				if (causeOfDeath.isDisplayed()) {
					causeOfDeath.click();
					Thread.sleep(1000);
					ExtentFactory.getInstance().getExtent().log(Status.INFO, "Successfully Display  Father  Cause Of Death on family Medical");
					WebElement selectdropdwon =getDriver().findElement(By.xpath("//ul//div/span[text()='"+FMBSStateAndCause+"']"));
					 // wait.waitForElementToBeVisibleweb(getDriver(), Sisterdthcause, 20, "Element is Not Display");
				      selectdropdwon.click();
				      Allure.step("Select Father Cause Of Death  As=====>"+FMBSStateAndCause);	
				} else {
					 Allure.step("Father Cause is Not Display On Family Medical");
				}

			} else {
				 Allure.step ("Failed to Option Living And Demise");
			}

	}





public void ValidationsOfMotherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {
	//WebElement SelectMother = WebDriverFactoryStaticThreadLocal.getDriver().findElement(By.xpath("//div[text()='Mother']"));
	

	WebElement motherlivinganddemise = getDriver().findElement(By.xpath("(//div[text()='"+FMBSLivingDemise+"'])[2]"));
	  wait.waitForElementToBeVisibleweb(getDriver(), motherlivinganddemise, 10, "Element is Not Display");
	if (motherlivinganddemise.isDisplayed()) {
		motherlivinganddemise.click();
		//Thread.sleep(4000);
		//TestUtil.verifybgColor(fatherlivinganddemise, driver);
		 Allure.step ("Successfully Display Select Mother Option Is>>>>>>" + FMBSLivingDemise);
	}

	if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
		
		  wait.waitForElementToBeVisibleweb(getDriver(), Motherage, 10, "Element is Not Display");
		if (Motherage.isDisplayed()) {
			Motherage.click();
			Motherage.sendKeys(FMBSAgeDeath);
			
			 Allure.step ("Enter Mother Age As=====>"+FMBSAgeDeath);
		} else {
			 Allure.step ("Mother Age is Not Display On Family Medical");
		}
		 
		
		  wait.waitForElementToBeVisibleweb(getDriver(), Mothersateofhealth, 10, "Element is Not Display");
		if (Mothersateofhealth.isDisplayed()) {
			Mothersateofhealth.click();
			Thread.sleep(1000);
			WebElement selectdropdwon = getDriver().findElement(By.xpath("//ul//div/span[text()='"+FMBSStateAndCause+"']"));
			  wait.waitForElementToBeVisibleweb(getDriver(), selectdropdwon, 10, "Element is Not Display");
		      selectdropdwon.click();
		      Allure.step("Select  Mother State of Health  As=====>"+FMBSStateAndCause);	
		} else {
			 Allure.step ("Mother State Of Health is Not Display On Family Medical");
		}
		}
			
		else if (FMBSLivingDemise.equalsIgnoreCase("Deceased")) {
			
			  wait.waitForElementToBeVisibleweb(getDriver(), ageOfdeath1, 10, "Element is Not Display");
			if (ageOfdeath1.isDisplayed()) {
				ageOfdeath1.click();
				ageOfdeath1.sendKeys(FMBSAgeDeath);
				 Allure.step("Enter Mother Age Of Death  As=====>"+FMBSAgeDeath);
			} else {
				 Allure.step("Mother Age Of Death is Not Display On Family Medical");
			}

			
			  wait.waitForElementToBeVisibleweb(getDriver(), causeOfDeathMom, 10, "Element is Not Display");
			if (causeOfDeathMom.isDisplayed()) {
				causeOfDeathMom.click();
				Thread.sleep(1000);
				 Allure.step ("Successfully Display  Mother  Cause Of Death on family Medical");
				WebElement selectdropdwon = getDriver().findElement(By.xpath("//ul//div/span[text()='"+FMBSStateAndCause+"']"));
				  wait.waitForElementToBeVisibleweb(getDriver(), selectdropdwon, 10, "Element is Not Display");
			      selectdropdwon.click();
			      Allure.step ("Select Mother Cause Of Death  As=====>"+FMBSStateAndCause);	
			} else {
				 Allure.step ("Mother Cause of death is Not Display On Family Medical");
			}

		}
	}


public void EnterOtherFilesOnFamilyMedical(String val) {
      
	wait.waitForElementToBeVisibleweb(getDriver(), Ele1, 10, "Element is Not Display");
       if(Ele1.isDisplayed()) {
       	Ele1.sendKeys(val);
        Allure.step ("Enter Provide Other Files Reason Of Death TextField As=====> "+val);
       }else {
    	   Allure.step("Provide Details TextField is not display ");
       }
   }



public void EnterOtherFilesOnFamilyMedicalliving(String val) {
      
       wait.waitForElementToBeVisibleweb(getDriver(), Ele2, 2, "Element is Not Display");
       if(Ele2.isDisplayed()) {
       	Ele2.sendKeys(val);
        Allure.step ("Enter Provide Other Files Reason Of Death TextField As=====> "+val);
       }else {
    	   Allure.step("Provide Details TextField is not display ");
       }
   }


public void EnterOtherFilesOnFamilyMedicallivingBro(String val) {
      
       wait.waitForElementToBeVisibleweb(getDriver(), Elereason, 2, "Element is Not Display");
       if(Elereason.isDisplayed()) {
    	   Elereason.sendKeys(val);
        Allure.step ("Enter Provide Other Files Reason Of Death TextField As=====> "+val);
       }else {
    	   Allure.step ("Provide Details TextField is not display ");
       }
   }

public void EnterOtherFilesOnFamilyMedicallivingMother(String val) {
     
       wait.waitForElementToBeVisibleweb(getDriver(), EleNmae, 2, "Element is Not Display");
       if(EleNmae.isDisplayed()) {
    	   EleNmae.sendKeys(val);
        Allure.step ("Enter Provide Other Files Reason Of Death TextField As=====> "+val);
       }else {
    	   Allure.step ("Provide Details TextField is not display ");
       }
   }





public void EnterOtherFilesOnFamilyMedicalother(String val) {
       WebElement Ele4= getDriver().findElement(By.xpath("//input[@name='68']"));
       wait.waitForElementToBeVisibleweb(getDriver(), Ele4, 20, "Element is Not Display");
       if(Ele4.isDisplayed()) {
       	Ele4.sendKeys(val);
        Allure.step ("Enter Provide Other Files Reason Of Death TextField As=====> "+val);
       }else {
    	   Allure.step ("Provide Details TextField is not display ");
       }
   }



public void EnterOtherFilesOnFamilyMedicalBro(String val) {
       
       wait.waitForElementToBeVisibleweb(getDriver(), deathReasonEle, 20, "Element is Not Display");
       if(deathReasonEle.isDisplayed()) {
    	   deathReasonEle.sendKeys(val);
        Allure.step ("Enter Provide Other Files Reason Of Death TextField As=====> "+val);
       }else {
    	   Allure.step ("Provide Details TextField is not display ");
       }
   }


public void ValidationsOfBrotherOnFamilyMedicalWeb(String FMBSLivingDemise,String FMBSAgeDeath,String FMBSStateAndCause) throws InterruptedException {

WebElement Brotherlivinganddemise = getDriver().findElement(By.xpath("(//div[text()='"+FMBSLivingDemise+"'])[3]"));

if (Brotherlivinganddemise.isDisplayed()) {
	Brotherlivinganddemise.click();
	 Allure.step ("Select Brother Option Is>>>>>>" + FMBSLivingDemise);
}

if (FMBSLivingDemise.equalsIgnoreCase("Living")) {
	
	 wait.waitForElementToBeVisibleweb(getDriver(), Brotherage, 5, "Element is Not Display");
	if (Brotherage.isDisplayed()) {
		Brotherage.click();
		Brotherage.sendKeys(FMBSAgeDeath);
		 Allure.step("Enter Brother Age  As=====>"+FMBSAgeDeath);
	} else {
		 Allure.step ("Brother Age is Not Display On Health Details Family Medical");
	}

	
	 wait.waitForElementToBeVisibleweb(getDriver(), Brothersateofhealth, 5, "Element is Not Display");
	if (Brothersateofhealth.isDisplayed()) {
		Brothersateofhealth.click();
		WebElement selectdropdwon = getDriver().findElement(By.xpath("//ul//li//span[text()='"+FMBSStateAndCause+"']"));
		 wait.waitForElementToBeVisibleweb(getDriver(), selectdropdwon, 5, "Element is Not Display");
	      selectdropdwon.click();
	      Allure.step ("Select  Brother State Of Health  As=====>"+FMBSStateAndCause);	
	} else {
		 Allure.step ("Brother State Of Health is Not Display On Family Medical");
	}

} else if (FMBSLivingDemise.equalsIgnoreCase("Deceased")) {

	 wait.waitForElementToBeVisibleweb(getDriver(), BroageOfdeath, 5, "Element is Not Display");
	if (BroageOfdeath.isDisplayed()) {
		BroageOfdeath.click();
		BroageOfdeath.sendKeys(FMBSAgeDeath);
		 Allure.step ("Enter Brother  Age Of Death  As=====>"+FMBSAgeDeath);
		
		
		 wait.waitForElementToBeVisibleweb(getDriver(), BrotherCauseODeath, 5, "Element is Not Display");
		if (BrotherCauseODeath.isDisplayed()) {
			BrotherCauseODeath.click();
			Thread.sleep(2000);
			WebElement selectdropdwon = getDriver().findElement(By.xpath("//ul//li//span[text()='"+FMBSStateAndCause+"']"));
			 wait.waitForElementToBeVisibleweb(getDriver(), selectdropdwon, 5, "Element is Not Display");
		      selectdropdwon.click();
		      Allure.step ("Select  Brother Cause Of Death As=====>"+FMBSStateAndCause);
		
	} else {
		 Allure.step ("Brother Age Of Death is Not Display On Family Medical");
	}


} else {
	 Allure.step ("Failed to Option Living And Demise");
}
}
}



public void ValidationsOfSisterOnFamilyMedicalWeb(String BrotherLivingDemise,String BrotherAgeDeath,String BrotherStateAndCause) throws InterruptedException {

WebElement sisterlivinganddemise = getDriver().findElement(By.xpath("(//div[text()='"+BrotherLivingDemise+"'])[3]"));
wait.waitForElementToBeVisibleweb(getDriver(), sisterlivinganddemise, 5, "Element is Not Display");
if (sisterlivinganddemise.isDisplayed()) {
	sisterlivinganddemise.click();
	// Thread.sleep(4000);
	// TestUtil.verifybgColor(fatherlivinganddemise, driver);
	 Allure.step ("Successfully Display Sister Option Is>>>>>>" + BrotherLivingDemise);
}

if (BrotherLivingDemise.equalsIgnoreCase("Living")) {
	
	 wait.waitForElementToBeVisibleweb(getDriver(), Sisterage, 5, "Element is Not Display");
	if (Sisterage.isDisplayed()) {
		Sisterage.click();
		Thread.sleep(1000);
		Sisterage.sendKeys(BrotherAgeDeath);
	

		 Allure.step ("Enter Sister  Age As====>"+BrotherAgeDeath);
	} else {
		 Allure.step ("Sister Age is Not Display On Health Details Family Medical");
	}

	
	 wait.waitForElementToBeVisibleweb(getDriver(), Sistersateofhealth, 5, "Element is Not Display");
	if (Sistersateofhealth.isDisplayed()) {
		Sistersateofhealth.click();
		Thread.sleep(1000);
		ExtentFactory.getInstance().getExtent().log(Status.INFO, "Successfully Display  Sister  State Of Health on Health Details  family Medical");
		WebElement selectdropdwon =getDriver().findElement(By.xpath("//ul//li//span[text()='"+BrotherStateAndCause+"']"));
		 wait.waitForElementToBeVisibleweb(getDriver(), selectdropdwon, 5, "Element is Not Display");
	      selectdropdwon.click();
	      Allure.step ("Successfully Select Sister State Of Health Value As=====>"+BrotherStateAndCause);	
	} else {
		 Allure.step ("Sister State Of Health is Not Display On Family Medical");
	}

} else if (BrotherLivingDemise.equalsIgnoreCase("Deceased")) {
	
	 wait.waitForElementToBeVisibleweb(getDriver(), sisageOfdeath, 5, "Element is Not Display");
	if (sisageOfdeath.isDisplayed()) {
		sisageOfdeath.click();
		Thread.sleep(1000);
		sisageOfdeath.sendKeys(BrotherAgeDeath);
		 Allure.step ("Enter Sister  Age Of Death As ====>"+BrotherAgeDeath);
		

		
		 wait.waitForElementToBeVisibleweb(getDriver(), sisterCauseODeath, 5, "Element is Not Display");
		if (sisterCauseODeath.isDisplayed()) {
			sisterCauseODeath.click();
			Thread.sleep(1000);
			 Allure.step( "Successfully Display  Sister  Cause Of Death on Health Details  family Medical");
			WebElement selectdropdwon = getDriver().findElement(By.xpath("//ul//li//span[text()='"+BrotherStateAndCause+"']"));
			 wait.waitForElementToBeVisibleweb(getDriver(), selectdropdwon, 5, "Element is Not Display");
		      selectdropdwon.click();
		      Allure.step ("Successfully Select Sister Cause Of Death Of Health Value As=====>"+BrotherStateAndCause);
		
	} else {
		 Allure.step ("Sister Age Of Death is Not Display On Family Medical");
	}


} else {
	 Allure.step ("Failed to Option Living And Demise");
}
}
}

}
