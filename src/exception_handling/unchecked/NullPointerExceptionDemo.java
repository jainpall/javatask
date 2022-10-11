 package exception_handling.unchecked;

public class NullPointerExceptionDemo {

	public static void displayLength(String message) {
		
		try {
			System.out.println("message length: "+message.length());
			System.out.println("No exception, Hence moved to the next line");
		}
		catch(NullPointerExceptionDemo npe) {
			System.out.println(npe.getMessage());
		}
	}
	public static void main(String[] args) {
		displayLength(null);
	}
}
