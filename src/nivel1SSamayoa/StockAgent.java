package nivel1SSamayoa;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements Observable {
	
	protected List<Observer> observers = new ArrayList<Observer>();
	protected String StockAgentName;
	protected String news;
	
	public StockAgent(String stockAgentName) {
		this.StockAgentName = stockAgentName;
		this.news = " From: " + StockAgentName;
	}

	public void SendNotification(String news) {
		System.out.printf("\nStockAgentName: %s, News: %s\n", StockAgentName, news);
		notify(news);
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void dettach(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notify(String email) {
		observers.forEach(observer -> observer.notification(email, news));
		
	}
	
}
