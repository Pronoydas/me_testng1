package testcaseswithouttestng;
import pages.AddressPage;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddressTest extends BaseTest{
	@Test (description = "Adding new Address ",priority = 1, groups = "P1")
	public void verifyAddingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.addAddress("Pune");
		Assert.assertTrue(false);
		
	}
    @Test(description = "Editing Already Address ",priority = 2, groups = "P2",dependsOnMethods = "verifyAddingAddress")
	public void verifyEditingAddress() {
		AddressPage addressPage = new AddressPage();
		addressPage.editAddress("Mumbai");
	}
	
}