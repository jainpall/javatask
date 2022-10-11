package exception_handling.unchecked;

import java.util.Scanner;

public class MainClassExceptionIntro {
	public static void main(String[] args) {
		int num1, num2, quotient;
		Scanner s = new Scanner(System.in);
		System.out.println("Input two numbers");
		
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		try {
			quotient = num1/num2;
			System.out.println("Next line");
		}
		catch(ArithmeticException e){
			System.out.println("Unable to divide a number by zero");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
}
