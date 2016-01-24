package longFormQuestions;

public class LazySingleton {

	private static LazySingleton instance = null;
	
	private LazySingleton() {
		instance = new LazySingleton();
	}
	
	public static LazySingleton getInstance() {
		if (instance == null){
			synchronized(LazySingleton.class) {
				if (instance == null){
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
}
