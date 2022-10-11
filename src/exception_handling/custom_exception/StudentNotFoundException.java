package exception_handling.custom_exception;

public class StudentNotFoundException extends Exception{
	String message;
	public StudentNotFoundException(String message){
		this.message = message;
	}
	
	public StudentNotFoundException() {}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	public String toString() {
		return message;
	}
}
