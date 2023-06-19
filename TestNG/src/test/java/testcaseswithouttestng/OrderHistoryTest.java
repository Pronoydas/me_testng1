package testcaseswithouttestng;

import pages.OrderHistoryPage;

import org.testng.annotations.Test;

public class OrderHistoryTest extends BaseTest {
    @Test(description = "Tested View Order History",priority = 1,groups = "P1")
	public void viewOrderHistory() {
		OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
		orderHistoryPage.orderHistory("12");
	}
}
