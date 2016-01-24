package longFormQuestions;

public class LazySingleton {

	private LazySingleton instance = null;
	
	private LazySingleton() {
		instance = new LazySingleton();
	}
	
	public LazySingleton getInstance() {
		
	}
}
