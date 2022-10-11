package arrays_java;

import java.util.Scanner;

public class TwoDArraysJava {

	public static void main(String[] args) {
		int rows, cols;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input no of rows and columns: ");
		rows = scan.nextInt();
		cols = scan.nextInt();

		int nums[][] = new int[rows][cols];
		
		System.out.println("Input the 2d array elements");
		for(int i=0; i< rows; i++) {
			for(int j=0; j < cols; j++) {
				nums[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i< rows; i++) {
			for(int j=0; j < cols; j++) {
				System.out.print(nums[i][j]);
			}
			System.out.println();
		}
	}
}

