package Arithmetic_operations;

import java.util.Scanner;

public class Arithmetic_Operations {
	public static void main(String[] args) {
			int num1;
			int num2;
			int result;
			
			
			Scanner s = new Scanner(System.in);
			System.out.println("Input Num 1:");
			num1 = s.nextInt();	
			System.out.println("Input Num 2:");
			num2 = s.nextInt();	
			
			result=num1+num2;			
			System.out.println("Sum:" +result);
			result=num1-num2;	
			System.out.println("Difference:" +result);
			result=num1*num2;	
			System.out.println("Product:" +result);
			result=num1/num2;	
			System.out.println("Quotient:" +result);
			result=num1%num2;	
			System.out.println("Reminder:" +result);
	}









