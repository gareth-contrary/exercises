package longFormQuestions;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {

	private List<Observer> observers;
	private String subject;
	private String desc;
	
	public CommentaryObject(List<Observer> observers, String subject) {
		this.observers = observers;
		this.subject = subject;
	}

	@Override
	public void subscribeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unSubscribeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(desc);
		}
	}

	@Override
	public String subjectDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDesc(String desc) {
		this.desc = desc;
		notifyObservers();
	}

}
