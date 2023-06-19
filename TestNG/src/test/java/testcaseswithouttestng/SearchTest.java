package testcaseswithouttestng;

import pages.SearchPage;

import org.testng.annotations.Test;
public class SearchTest extends BaseTest{
	@Test(description = "Search for Product" ,priority = 2,groups = "P2")
	public void verifySearchProduct() {
		SearchPage searchPage = new SearchPage();
		searchPage.searchProduct("Iphone-13");
	}
}
