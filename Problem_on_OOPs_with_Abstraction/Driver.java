package Problem_on_OOPs_with_Abstraction;

public class Driver {
	public static void main(String[] args) {
		Payment p = new CreditCardPayment("TXN12345", 600);
		p.processPayment();
		System.out.println();
		Payment e = new PayPalPayment("TXN67890", 300);
		e.processPayment();
	}

}
