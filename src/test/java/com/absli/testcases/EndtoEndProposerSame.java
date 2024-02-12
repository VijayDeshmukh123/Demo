package com.absli.testcases;

import Utils.*;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import org.testng.annotations.Test;

import java.util.HashMap;

public class EndtoEndProposerSame extends TestBase {

	public EndtoEndProposerSame() {
		super();
	}


	// ---------------------------------------------------------------------------------------------------------------------------------------//
	
	@Test(groups = {"web" }, dataProvider = "EndtoEndProposerSame", dataProviderClass = DataProviders.class, description = "Proposer Same GMS Scenario")

	public void CompletesameGMSA(HashMap<String, String> testData) throws Exception {
		new Initialization().initialization(getDriver(), testData, testData.get("LeadID"),testData.get("Plan"),testData.get("FirstName"),testData.get("LastName"),testData.get("Gender"),testData.get("PhoneNO"),testData.get("PanNo"));
		//new GoToPSMpageJourney().gotoPSMpage(getDriver(), testData);
		//new All_Product().Select_ProductTestFactory(getDriver(), testData);
		new EndToEndProSameJourney().gotoEndToEndSameJourney(getDriver(), testData);

	}

	
	@Test(groups = {"web" }, dataProvider = "EndtoEndProposerSame", dataProviderClass = DataProviders.class, description = "Proposer Same GMS Scenario")

	public void CompletesameAIPA(HashMap<String, String> testData) throws Exception {

		new GoToPSMpageJourney().gotoPSMpage(getDriver(), testData);
		new All_Product().Select_ProductTestFactory(getDriver(), testData);
		new EndToEndProSameJourney().gotoEndToEndSameJourney(getDriver(), testData);

	}

}
