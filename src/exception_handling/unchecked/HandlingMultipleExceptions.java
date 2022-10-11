package exception_handling.unchecked;

public class HandlingMultipleExceptions {
	
	public static void multipleOperations(String message) {
		Integer[] numsArr = {21, 10, 23, 32};
		
		try {
			System.out.println(numsArr[2]);
			System.out.println(message.length());
			System.out.println(numsArr[0] / numsArr[1]);
			System.out.println("All the codes executed successfully... Next line reached");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			// Code to closing the resources must be given here
			System.out.println("Finally executed...");
		}
	}
	
	public static void main(String[] args) {
		multipleOperations(null);
	}
}
