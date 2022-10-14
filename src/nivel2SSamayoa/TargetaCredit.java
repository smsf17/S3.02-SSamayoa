package nivel2SSamayoa;

public class TargetaCredit {
	private PagamentBotiga payment;
	private boolean PaymentMethod;
	
	public TargetaCredit(PagamentBotiga p) {
		super();
		payment = p;
	}
	
	public void process() {
		PaymentMethod = true;
		
		if (PaymentMethod) {
			System.out.println ("Su pago sera con Tarjeta de credito");
			payment.pagament();
		}
		
	}
	
}
