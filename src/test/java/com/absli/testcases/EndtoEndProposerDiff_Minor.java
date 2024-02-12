package com.absli.testcases;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;

import Utils.All_Product;
import Utils.EndToEndProMinorJourney;
import Utils.GoToPMSpage_Major_Minor_Journey;

public class EndtoEndProposerDiff_Minor extends TestBase {
	public EndtoEndProposerDiff_Minor() {
		super();
	}

	// ===================Minor==========================

	// ---------------------------------------------------------------------------------------------------------------------------------------//
	@Test(groups = {
			"web" }, dataProvider = "EndtoEndMinorDataProvider", dataProviderClass = DataProviders.class, description = "Proposer Same GMS Scenario")

	public void CompleteminorGMStestA(HashMap<String, String> testData) throws Exception {

		new GoToPMSpage_Major_Minor_Journey().gotoPSM_Major_Minor_page(getDriver(), testData);
		new All_Product().Select_ProductTestFactory(getDriver(), testData);
		new EndToEndProMinorJourney().gotoEndToEndMinorJourney(getDriver(), testData);

	}
}
