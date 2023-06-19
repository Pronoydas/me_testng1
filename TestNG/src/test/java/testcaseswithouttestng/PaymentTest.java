package testcaseswithouttestng;

import pages.PaymentPage;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class PaymentTest extends BaseTest{
    @Test(description = "Verify payment by credit card ", priority = 1,groups = "P1") 
	public void verifyPaymentByCreditCart() {
		PaymentPage paymentPage = new PaymentPage();
		Map<String,String> creditCartDetails = new HashMap<>();
		creditCartDetails.put("cardNumber","8797898389838982");
		creditCartDetails.put("cardExpire", "07/32");
		creditCartDetails.put("cvv", "324");
		creditCartDetails.put("amount", "1200");
		paymentPage.payByCreditCard(creditCartDetails);
	}
	@Test(description="Verify payment by debit Card", priority=1,groups = "P1")
	public void verifyPaymentByDebitCart() {
		PaymentPage paymentPage = new PaymentPage();
		Map<String,String> debitCartDetails = new HashMap<>();
		debitCartDetails.put("cardNumber","8797898389838982");
		debitCartDetails.put("cardExpire", "07/32");
		debitCartDetails.put("cvv", "324");
		debitCartDetails.put("amount", "1200");
		paymentPage.payByCreditCard(debitCartDetails);
	}
	@Test(description = "verify payment by Amazon Pay",priority = 1,groups = "P1")
	public void verifyPaymentByAmazonPay() {
		PaymentPage paymentPage = new PaymentPage();
		paymentPage.payByAmazonPayLater("1800");
	}
	
}
