package com.absli.testcases;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;

import Utils.All_Product;
import Utils.EndToEndProMajorJourney;
import Utils.GoToPMSpage_Major_Minor_Journey;
import Utils.ViewQuoteFactoryAIP;
import Utils.ViewQuoteFactoryASK;
import Utils.ViewQuoteFactoryASP;
import Utils.ViewQuoteFactoryAkshaya;
import Utils.ViewQuoteFactoryCancershield;
import Utils.ViewQuoteFactoryChild_future;
import Utils.ViewQuoteFactoryFMP;
import Utils.ViewQuoteFactoryFortune;
import Utils.ViewQuoteFactoryGMS;
import Utils.ViewQuoteFactoryN_Ayush;
import Utils.ViewQuoteFactoryN_Laabh;
import Utils.ViewQuoteFactoryN_Pension;
import Utils.ViewQuoteFactoryPSK;
import Utils.ViewQuoteFactorySalaried;
import Utils.ViewQuoteFactoryVision_Endo;
import Utils.ViewQuoteFactoryVision_lifeincome;
import Utils.ViewQuoteFactoryVision_lifeincomeplus;
import Utils.ViewQuoteFactoryVision_star;

public class EndtoEndProposerDiff_Major extends TestBase {

	public EndtoEndProposerDiff_Major() {
		super();
	}

	// ===================Major==========================

	
	@Test(groups = {
			"web" }, dataProvider = "EndtoEndMajorDataProvider", dataProviderClass = DataProviders.class, description = "Proposer Same GMS Scenario")

	public void CompleteMajorDifferentGMSA(HashMap<String, String> testData) throws Exception {

		new GoToPMSpage_Major_Minor_Journey().gotoPSM_Major_Minor_page(getDriver(), testData);
		new All_Product().Select_ProductTestFactory(getDriver(), testData);
		new EndToEndProMajorJourney().gotoEndToEndMajorJourney(getDriver(), testData);

	}

	

}
