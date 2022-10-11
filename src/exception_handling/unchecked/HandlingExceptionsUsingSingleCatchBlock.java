package exception_handling.unchecked;

public class HandlingExceptionsUsingSingleCatchBlock {
	
	public static void multipleOperations(String message) {
		Integer[] numsArr = {21, 0, 23, 32};
		
		try {
			System.out.println(numsArr[2]);
			System.out.println(message.length());
			System.out.println(numsArr[0] / numsArr[1]);
			System.out.println("All the codes executed successfully... Next line reached");
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			// Code to closing the resources must be given here
			System.out.println("Finally executed...");
		}
	}
	
	public static void main(String[] args) {
		multipleOperations("");
	}
}
