package nivel1SSamayoa;

public class NotificationSystem {

	public static void main(String[] args) {
		StockAgent st1 = new StockAgent("Juan Lopez ");
		Subscriber s1 = new Subscriber ("Empresa X, S.A.");
		Subscriber s2 = new Subscriber ("Empresa Y, S.L.");
		st1.attach(s1);
		st1.attach(s2);
		st1.SendNotification("La Borsa Puja");
		st1.dettach(s2);
		st1.SendNotification("La borsa baixa");
	}

}
