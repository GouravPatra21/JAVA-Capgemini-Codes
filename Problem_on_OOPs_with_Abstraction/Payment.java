package Problem_on_OOPs_with_Abstraction;

public abstract class Payment {
	
	private String transactionId;
	private  double amount;
	public abstract void processPayment();
	public Payment(String transactionId, double amount) {
		this.transactionId = transactionId;
		this.amount = amount;
		
	}
	public double getAmount() {
		return amount;
	}
	public String gettransactionId() {
		return transactionId;
	}
	 

}
