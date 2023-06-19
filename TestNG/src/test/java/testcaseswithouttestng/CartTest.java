package testcaseswithouttestng;

import pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CartTest extends BaseTest{
	@Test(description = "Verify Moving Product to WatchList",priority = 2, groups = "P2")
	public void verifyMovingPrdToWishList() {
		CartPage cartpage = new CartPage();
		cartpage.moveProductToWishList("IPhon 13 Pro Max");
	}



	
    @Test(description = "Verify Product Retails in cart",priority = 2, groups = "P2")
	public void verifyPrdRetainsInCart() {
		CartPage cartpage = new CartPage();
		cartpage.prdRetainsInCart();
	}
	
}
