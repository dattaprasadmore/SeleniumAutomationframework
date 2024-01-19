package com.pda.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import comp.pda.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest{

	private OrangeHRMTests() {
		
	}
	
	@Test
	public void LoginLogoutTest() {
		String sTitle = new OrangeHRMLoginPage()
				.enterUserName("Admin").enterPassword("admin123").clickLogin()
				.clickDropdown().clickLogout().getTitle();
		
		Assertions.assertThat(sTitle).isEqualTo("OrangeHRM");
	}
}