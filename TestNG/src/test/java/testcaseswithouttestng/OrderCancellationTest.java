package testcaseswithouttestng;



import pages.OrderCancellationPage;

import org.testng.annotations.Test;

public class OrderCancellationTest extends BaseTest{
	@Test(description="Verify Product Cancellation",priority = 1 , groups = "P1")
	public void verifyProductCancellation() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.orderCancellation("order_987684");
	}
    @Test(description = "Verify Order Return ",priority = 1,dependsOnMethods = {"verifyProductCancellation"}, groups = "P1")
	public void verifyOrderReturn() {
		OrderCancellationPage orderCancellationPage = new OrderCancellationPage();
		orderCancellationPage.returnOrder("order_987684");
	}

}
