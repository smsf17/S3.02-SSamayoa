package nivel3SSamayoa;

public class Main {

	public static void main(String[] args) {
		
		double priceProduct = 5.30;
		String MonedaCambio = "Dolar";
		Double priceExchange = 1.02;
		
		Operacion o1 = new Operacion();
		double a = o1.CorreccionPreu(priceProduct, priceExchange);
		System.out.println("El precio actual es de: " + priceProduct + " el precio en dolares es de: " + a); 
		

	}

}
