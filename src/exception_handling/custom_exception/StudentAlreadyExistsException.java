package exception_handling.custom_exception;

public class StudentAlreadyExistsException extends Exception{
	String message;
	StudentAlreadyExistsException(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return "StudentAlreadyExistsException [message=" + message + "]";
	}
}
