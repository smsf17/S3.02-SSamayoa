package nivel2SSamayoa;

public class Paypal {
	private PagamentBotiga payment;
	private boolean PaymentMethod;
	
	public Paypal(PagamentBotiga p) {
		super();
		payment = p;
	}
	
	public void process() {
		PaymentMethod = true;
		
		if (PaymentMethod) {
			System.out.println ("Su pago sera con Paypal");
			payment.pagament();
		}
		
	}
}
