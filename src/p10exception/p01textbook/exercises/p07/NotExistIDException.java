package p10exception.p01textbook.exercises.p07;

public class NotExistIDException extends Exception {
	// 일반예외(checked exception)
	
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}
