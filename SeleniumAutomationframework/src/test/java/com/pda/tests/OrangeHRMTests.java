package com.pda.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pda.reports.ExtentReport;

import comp.pda.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest{

	private OrangeHRMTests() {
		
	}
	
	@Test (dataProvider="LoginTestDataProvider")
	public void LoginLogoutTest(String username, String password) {
		
		ExtentReport.createTest("LoginLogoutTest");
		
		String sTitle = new OrangeHRMLoginPage()
				.enterUserName(username).enterPassword(password).clickLogin()
				.clickDropdown().clickLogout().getTitle();
		
		Assertions.assertThat(sTitle).isEqualTo("OrangeHRM");
	}
	
	@DataProvider(name="LoginTestDataProvider", parallel=true)
	public Object[][] getData(){
		
		return new Object[][] {
			{"Admin","admin123"},
			{"Admin","admin123"}
			/*{"Admin","admin123"}, {"admin123","admin123"}*/
		};
	}
}