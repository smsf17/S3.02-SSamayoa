package nivel3SSamayoa;

public class CalculoCorrector {
	private CanviDivisa CanviDivisa;

	public CalculoCorrector(nivel3SSamayoa.CanviDivisa canviDivisa) {
		this.CanviDivisa = canviDivisa;
	}

	@Override
	public String toString() {
		return "El precio convertido a la divisa es: " + CanviDivisa + "]";
	}
	
}
