package Problem_on_OOPs_with_Abstraction;

public class CreditCardPayment extends Payment {
	static double discount;
	static double payableAmount;
	static double transactionFee;
	public CreditCardPayment(String transactionId, double amount) {
		super(transactionId, amount);
	}
	@Override
	public void processPayment() {
		System.out.println("Processing Credit Card Payment...");
		System.out.println("Transaction Id:" + this.gettransactionId());
		System.out.println("Original Amount:" + this.getAmount());
		if(this.getAmount() > 500.00f) {
			discount = (this.getAmount() * 10) / 100;
			transactionFee = ((this.getAmount() - discount) * 2) / 100;
			payableAmount = (this.getAmount() - discount) + transactionFee;
			
		}
		else {
			discount = 0.0;
			transactionFee = (this.getAmount() * 2) / 100;
			payableAmount = (this.getAmount() - discount) + transactionFee;
			
		}
		System.out.println("Discount Applied:" + discount);
		System.out.println("Transaction Fee:" + transactionFee);
		System.out.println("Final Payable Amount:" + payableAmount);
		System.out.println("Credit Card Payment Successfull");
		
		
	}

}
