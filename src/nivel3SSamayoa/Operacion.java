package nivel3SSamayoa;

public class Operacion implements CanviDivisa {

	public double CorreccionPreu(double divisa, double preu) {
		double PrecioConvertido = divisa*preu;
		return PrecioConvertido;
	}

}
