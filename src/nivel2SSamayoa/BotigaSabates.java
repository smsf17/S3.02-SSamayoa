package nivel2SSamayoa;

public class BotigaSabates {

	public static void main(String[] args) {
		class Total implements PagamentBotiga{
			public void pagament() {
				System.out.println("Importe pagado, gracias por su compra!");
				System.out.println(" ");
			}
		}
		Total TotalPayment = new Total();
		
		TargetaCredit tc = new TargetaCredit(TotalPayment);
		Paypal pp = new Paypal(TotalPayment);
		CompteBancari cb = new CompteBancari(TotalPayment);
		
		tc.process();
		pp.process();
		cb.process();
	}

}
