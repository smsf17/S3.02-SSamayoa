package nivel1SSamayoa;

public interface Observable {
	public void attach (Observer observer);
	public void dettach(Observer observer);
	public void notify(String email);

}
