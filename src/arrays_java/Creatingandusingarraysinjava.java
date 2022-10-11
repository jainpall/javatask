package arrays_java;

import java.util.Scanner;

public class Creatingandusingarraysinjava {
	public static void main(String[] args) {
		int nums[] = new int[5];
		Scanner scan = new Scanner(System.in);
//		int nums2[] = {10, 20, 30, 40, 54,78};

		
//		nums[0] = 25;
//		nums[1] = 32;
//		nums[2] = 28;
//		nums[3] = 100;
//		nums[4] = 78;
////	nums[5] = 178;
//		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
//		System.out.println(nums[4]);
		
		System.out.println("Input array elements:");
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
	
		
		for(int i=nums.length-1; i>=0; i--) {
			System.out.println(nums[i]);
		}
	}
}
