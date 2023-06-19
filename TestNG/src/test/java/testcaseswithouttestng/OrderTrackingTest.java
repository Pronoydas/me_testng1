package testcaseswithouttestng;

import pages.OrderTrackingPage;

import org.testng.annotations.Test;

public class OrderTrackingTest extends BaseTest{
    @Test(description = "verify Order Tracking feature",priority = 1,groups = "P1")
	public void verifyOrderTracking() {
		OrderTrackingPage orderTrackingPage = new OrderTrackingPage();
		orderTrackingPage.trackOrder("order_987684");
	}
}
