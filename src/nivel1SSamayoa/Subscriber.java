package nivel1SSamayoa;

public class Subscriber implements Observer{
	protected String name;
	public Subscriber (String name) {
		super();
		this.name = name;
	}
	@Override
	public void notification(String handle, String news) {
		System.out.printf("%s recibe notificación: %s '%n' \n", name, handle, news);
		
	}
	
	
}
