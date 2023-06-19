package testcaseswithouttestng;

import pages.HelpPage;

import org.testng.annotations.Test;

public class HelpTest extends BaseTest {
    @Test (description = "Verify Contact Us Link",priority = 3, groups = "P3")
	public void verifyContactUs() {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink("Contact Us");
	}
	@Test(description = "Verify About us Button",priority = 3, groups = {"P3"})
	public void verifyAboutUs() {
		HelpPage helpPage = new HelpPage();
		helpPage.clickOnLink("About Us");
	}

}
