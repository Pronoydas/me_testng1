package testcaseswithouttestng;

import pages.LoginPage;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	@Test(description ="Verify Login with valid detais" , priority = 1 , groups="P1")
	public void verifyValidCrds() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin");
		loginPage.enterPassword("admin123");
		loginPage.clickBtnLogin();
	}
    @Test(description =  "Verify Login details with invaild detais",priority = 2,groups = "P2",dependsOnMethods = "verifyValidCrds")
	public void verifyInValidCrds() {
		LoginPage loginPage = new LoginPage();
		loginPage.enterUserName("admin123");
		loginPage.enterPassword("admin123");
		loginPage.clickBtnLogin();
	}
}
