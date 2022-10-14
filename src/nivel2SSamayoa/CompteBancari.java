package nivel2SSamayoa;

public class CompteBancari {
	private PagamentBotiga payment;
	private boolean PaymentMethod;
	
	public CompteBancari(PagamentBotiga p) {
		super();
		payment = p;
	}
	
	public void process() {
		PaymentMethod = true;
		
		if (PaymentMethod) {
			System.out.println ("Su pago sera con cargo en su cuenta bancaria");
			payment.pagament();
		}
		
	}
}
